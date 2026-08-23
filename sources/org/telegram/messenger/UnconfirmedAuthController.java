package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Business.BusinessChatbotController;

public class UnconfirmedAuthController {
    private final int currentAccount;
    private boolean fetchedCache;
    private boolean fetchingCache;
    private boolean saveAfterFetch;
    private boolean savingCache;
    public final ArrayList<UnconfirmedAuth> auths = new ArrayList<>();
    private final Runnable checkExpiration = new Runnable() {
        @Override
        public final void run() {
            UnconfirmedAuthController.$r8$lambda$VOSenAh9Se4YOekIG255ZSGCQy8(this.f$0);
        }
    };
    private boolean debug = false;

    public UnconfirmedAuthController(int i) {
        this.currentAccount = i;
        readCache();
    }

    public void readCache() {
        if (this.fetchedCache || this.fetchingCache) {
            return;
        }
        this.fetchingCache = true;
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                UnconfirmedAuthController.m1089$r8$lambda$sVywaiWUyML0vTM9FoXGs8X4N8(this.f$0);
            }
        });
    }

    public static void m1089$r8$lambda$sVywaiWUyML0vTM9FoXGs8X4N8(final UnconfirmedAuthController unconfirmedAuthController) {
        unconfirmedAuthController.getClass();
        final ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        final HashSet hashSet = new HashSet();
        final ArrayList arrayList3 = new ArrayList();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = MessagesStorage.getInstance(unconfirmedAuthController.currentAccount).getDatabase().queryFinalized(String.format(Locale.US, "SELECT data FROM unconfirmed_auth", new Object[0]), new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        try {
                            UnconfirmedAuth unconfirmedAuth = unconfirmedAuthController.new UnconfirmedAuth(nativeByteBufferByteBufferValue);
                            arrayList3.add(unconfirmedAuth);
                            hashSet.add(Long.valueOf(unconfirmedAuth.hash));
                            if (unconfirmedAuth.bot && !arrayList2.contains(Long.valueOf(unconfirmedAuth.bot_id))) {
                                arrayList2.add(Long.valueOf(unconfirmedAuth.bot_id));
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
                MessagesStorage.getInstance(unconfirmedAuthController.currentAccount).getUsersInternal(arrayList2, arrayList);
            } catch (Exception e2) {
                FileLog.e(e2);
                if (sQLiteCursorQueryFinalized != null) {
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        UnconfirmedAuthController.m1085$r8$lambda$AYxuHLoFiguf5DKG73A5YvY6ME(this.f$0, arrayList, hashSet, arrayList3);
                    }
                });
            }
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UnconfirmedAuthController.m1085$r8$lambda$AYxuHLoFiguf5DKG73A5YvY6ME(this.f$0, arrayList, hashSet, arrayList3);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public static void m1085$r8$lambda$AYxuHLoFiguf5DKG73A5YvY6ME(UnconfirmedAuthController unconfirmedAuthController, ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        MessagesController.getInstance(unconfirmedAuthController.currentAccount).putUsers(arrayList, true);
        boolean zIsEmpty = unconfirmedAuthController.auths.isEmpty();
        int i = 0;
        while (i < unconfirmedAuthController.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = unconfirmedAuthController.auths.get(i);
            if (unconfirmedAuth == null || unconfirmedAuth.expired() || hashSet.contains(Long.valueOf(unconfirmedAuth.hash))) {
                unconfirmedAuthController.auths.remove(i);
                i--;
            }
            i++;
        }
        unconfirmedAuthController.auths.addAll(arrayList2);
        boolean zIsEmpty2 = unconfirmedAuthController.auths.isEmpty();
        unconfirmedAuthController.fetchedCache = true;
        unconfirmedAuthController.fetchingCache = false;
        if (zIsEmpty != zIsEmpty2) {
            NotificationCenter.getInstance(unconfirmedAuthController.currentAccount).postNotificationName(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        }
        unconfirmedAuthController.scheduleAuthExpireCheck();
        if (unconfirmedAuthController.saveAfterFetch) {
            unconfirmedAuthController.saveAfterFetch = false;
            unconfirmedAuthController.saveCache();
        }
    }

    private void scheduleAuthExpireCheck() {
        AndroidUtilities.cancelRunOnUIThread(this.checkExpiration);
        if (this.auths.isEmpty()) {
            return;
        }
        ArrayList<UnconfirmedAuth> arrayList = this.auths;
        int size = arrayList.size();
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (i < size) {
            UnconfirmedAuth unconfirmedAuth = arrayList.get(i);
            i++;
            jMin = Math.min(jMin, unconfirmedAuth.expiresAfter());
        }
        if (jMin == Long.MAX_VALUE) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.checkExpiration, Math.max(0L, jMin * 1000));
    }

    public static void $r8$lambda$VOSenAh9Se4YOekIG255ZSGCQy8(UnconfirmedAuthController unconfirmedAuthController) {
        int i = 0;
        while (i < unconfirmedAuthController.auths.size()) {
            if (unconfirmedAuthController.auths.get(i).expired()) {
                unconfirmedAuthController.auths.remove(i);
                i--;
            }
            i++;
        }
        unconfirmedAuthController.saveCache();
    }

    public void putDebug() {
        this.debug = true;
        TL_update.TL_updateNewAuthorization tL_updateNewAuthorization = new TL_update.TL_updateNewAuthorization();
        tL_updateNewAuthorization.unconfirmed = true;
        tL_updateNewAuthorization.device = "device";
        tL_updateNewAuthorization.location = "location";
        tL_updateNewAuthorization.hash = 123L;
        processUpdate(tL_updateNewAuthorization);
    }

    public void processUpdate(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
        int i = 0;
        while (i < this.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = this.auths.get(i);
            if (unconfirmedAuth != null && !unconfirmedAuth.bot && unconfirmedAuth.hash == tL_updateNewAuthorization.hash) {
                this.auths.remove(i);
                i--;
            }
            i++;
        }
        if (tL_updateNewAuthorization.unconfirmed) {
            this.auths.add(new UnconfirmedAuth(tL_updateNewAuthorization));
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        scheduleAuthExpireCheck();
        saveCache();
    }

    public void processUpdate(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i = 0;
        while (i < this.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = this.auths.get(i);
            if (unconfirmedAuth != null && unconfirmedAuth.bot && unconfirmedAuth.bot_id == tL_updateNewBotConnection.bot_id) {
                this.auths.remove(i);
                i--;
            }
            i++;
        }
        this.auths.add(new UnconfirmedAuth(tL_updateNewBotConnection));
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        scheduleAuthExpireCheck();
        saveCache();
    }

    public void saveCache() {
        if (this.savingCache) {
            return;
        }
        if (this.fetchingCache) {
            this.saveAfterFetch = true;
        } else {
            this.savingCache = true;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    UnconfirmedAuthController.m1087$r8$lambda$hE7pNnSoML3GYVuT1bXHnfsKUE(this.f$0);
                }
            });
        }
    }

    public static void m1087$r8$lambda$hE7pNnSoML3GYVuT1bXHnfsKUE(final UnconfirmedAuthController unconfirmedAuthController) {
        SQLiteDatabase database = MessagesStorage.getInstance(unconfirmedAuthController.currentAccount).getDatabase();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                database.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                ArrayList<UnconfirmedAuth> arrayList = unconfirmedAuthController.auths;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    UnconfirmedAuth unconfirmedAuth = arrayList.get(i);
                    i++;
                    UnconfirmedAuth unconfirmedAuth2 = unconfirmedAuth;
                    sQLitePreparedStatementExecuteFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(unconfirmedAuth2.getObjectSize());
                    unconfirmedAuth2.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.step();
                }
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast != null) {
                    sQLitePreparedStatementExecuteFast.dispose();
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.savingCache = false;
                }
            });
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public void cleanup() {
        this.auths.clear();
        saveCache();
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        scheduleAuthExpireCheck();
    }

    private void updateList(final boolean z, ArrayList<UnconfirmedAuth> arrayList, final Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        Utilities.Callback[] callbackArr = new Utilities.Callback[arrayList2.size()];
        for (final int i = 0; i < arrayList2.size(); i++) {
            final UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuth) arrayList2.get(i);
            callbackArr[i] = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UnconfirmedAuthController.m1088$r8$lambda$s03l1nRxgy6Lr_3nNXQXlCZPK0(zArr, i, z, unconfirmedAuth, (Runnable) obj);
                }
            };
        }
        Utilities.raceCallbacks(new Runnable() {
            @Override
            public final void run() {
                UnconfirmedAuthController.$r8$lambda$bTJFj6HrX17YQ_lnJ9FIZ47g5q8(this.f$0, zArr, arrayList2, z, callback);
            }
        }, callbackArr);
        if (z) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                hashSet.add(Long.valueOf(((UnconfirmedAuth) arrayList2.get(i2)).hash));
            }
            int i3 = 0;
            while (i3 < this.auths.size()) {
                if (hashSet.contains(Long.valueOf(this.auths.get(i3).hash))) {
                    this.auths.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (hashSet.isEmpty()) {
                return;
            }
            saveCache();
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
            scheduleAuthExpireCheck();
        }
    }

    public static void m1086$r8$lambda$NJhReUHqCliAHaxOC3AKA_h2IU(boolean[] zArr, int i, Runnable runnable, Boolean bool) {
        zArr[i] = bool.booleanValue();
        runnable.run();
    }

    public static void m1088$r8$lambda$s03l1nRxgy6Lr_3nNXQXlCZPK0(final boolean[] zArr, final int i, boolean z, UnconfirmedAuth unconfirmedAuth, final Runnable runnable) {
        Utilities.Callback<Boolean> callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UnconfirmedAuthController.m1086$r8$lambda$NJhReUHqCliAHaxOC3AKA_h2IU(zArr, i, runnable, (Boolean) obj);
            }
        };
        if (z) {
            unconfirmedAuth.confirm(callback);
        } else {
            unconfirmedAuth.deny(callback);
        }
    }

    public static void $r8$lambda$bTJFj6HrX17YQ_lnJ9FIZ47g5q8(UnconfirmedAuthController unconfirmedAuthController, boolean[] zArr, ArrayList arrayList, boolean z, Utilities.Callback callback) {
        unconfirmedAuthController.getClass();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuth) arrayList.get(i);
                arrayList2.add(unconfirmedAuth);
                hashSet.add(Long.valueOf(unconfirmedAuth.hash));
            }
        }
        if (!z) {
            int i2 = 0;
            while (i2 < unconfirmedAuthController.auths.size()) {
                if (hashSet.contains(Long.valueOf(unconfirmedAuthController.auths.get(i2).hash))) {
                    unconfirmedAuthController.auths.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!hashSet.isEmpty()) {
                unconfirmedAuthController.saveCache();
                NotificationCenter.getInstance(unconfirmedAuthController.currentAccount).postNotificationName(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
                unconfirmedAuthController.scheduleAuthExpireCheck();
            }
        }
        callback.run(arrayList2);
    }

    public void confirm(ArrayList<UnconfirmedAuth> arrayList, Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        updateList(true, arrayList, callback);
    }

    public void deny(ArrayList<UnconfirmedAuth> arrayList, Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        updateList(false, arrayList, callback);
    }

    public class UnconfirmedAuth extends TLObject {
        public boolean bot;
        public long bot_id;
        public int date;
        public String device;
        public long hash;
        public String location;

        public UnconfirmedAuth(AbstractSerializedData abstractSerializedData) {
            int int32 = abstractSerializedData.readInt32(true);
            if (int32 == 2058772876) {
                this.hash = abstractSerializedData.readInt64(true);
                this.date = abstractSerializedData.readInt32(true);
                this.device = abstractSerializedData.readString(true);
                this.location = abstractSerializedData.readString(true);
                return;
            }
            if (int32 == 2058772877) {
                this.bot_id = abstractSerializedData.readInt64(true);
                this.date = abstractSerializedData.readInt32(true);
                this.device = abstractSerializedData.readString(true);
                this.location = abstractSerializedData.readString(true);
                return;
            }
            TLParseException.doThrowOrLog(abstractSerializedData, "UnconfirmedAuth", int32, true);
        }

        public UnconfirmedAuth(TL_update.TL_updateNewAuthorization tL_updateNewAuthorization) {
            this.hash = tL_updateNewAuthorization.hash;
            this.date = tL_updateNewAuthorization.date;
            this.device = tL_updateNewAuthorization.device;
            this.location = tL_updateNewAuthorization.location;
        }

        public UnconfirmedAuth(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
            this.bot = true;
            long j = tL_updateNewBotConnection.bot_id;
            this.bot_id = j;
            this.hash = j;
            this.date = tL_updateNewBotConnection.date;
            this.device = tL_updateNewBotConnection.device;
            this.location = tL_updateNewBotConnection.location;
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            if (this.bot) {
                outputSerializedData.writeInt32(2058772877);
                outputSerializedData.writeInt64(this.bot_id);
                outputSerializedData.writeInt32(this.date);
                outputSerializedData.writeString(this.device);
                outputSerializedData.writeString(this.location);
                return;
            }
            outputSerializedData.writeInt32(2058772876);
            outputSerializedData.writeInt64(this.hash);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.device);
            outputSerializedData.writeString(this.location);
        }

        public long expiresAfter() {
            return (ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).getCurrentTime() + MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).authorizationAutoconfirmPeriod) - this.date;
        }

        public boolean expired() {
            return expiresAfter() <= 0;
        }

        public void confirm(final Utilities.Callback<Boolean> callback) {
            if (this.bot) {
                TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                confirmbotconnection.bot_id = MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).getInputUser(this.bot_id);
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequestTyped(confirmbotconnection, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        UnconfirmedAuthController.UnconfirmedAuth.m1092$r8$lambda$SFYpSZ1e2YH5OWljaueQlfLrkc(this.f$0, callback, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                    }
                });
            } else {
                TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                changeauthorizationsettings.hash = this.hash;
                changeauthorizationsettings.confirmed = true;
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(changeauthorizationsettings, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        UnconfirmedAuthController.UnconfirmedAuth.$r8$lambda$6Kg4x6Mm87hLBiNswYaiq8meGyw(this.f$0, callback, tLObject, tL_error);
                    }
                });
            }
        }

        public static void m1092$r8$lambda$SFYpSZ1e2YH5OWljaueQlfLrkc(UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            unconfirmedAuth.getClass();
            if (callback != null) {
                callback.run(Boolean.valueOf(((bool instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public static void $r8$lambda$6Kg4x6Mm87hLBiNswYaiq8meGyw(final UnconfirmedAuth unconfirmedAuth, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            unconfirmedAuth.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UnconfirmedAuthController.UnconfirmedAuth.m1090$r8$lambda$7YVefWwACBZcsKyjhfmbWjrFpg(this.f$0, callback, tLObject, tL_error);
                }
            });
        }

        public static void m1090$r8$lambda$7YVefWwACBZcsKyjhfmbWjrFpg(UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            unconfirmedAuth.getClass();
            if (callback != null) {
                callback.run(Boolean.valueOf(((tLObject instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void deny(final Utilities.Callback<Boolean> callback) {
            if (this.bot) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).getInputUser(this.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(updateconnectedbot, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        UnconfirmedAuthController.UnconfirmedAuth.m1093$r8$lambda$UtQCVywGIkVj_bkEomRVvvkxI(this.f$0, callback, tLObject, tL_error);
                    }
                });
                return;
            }
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = this.hash;
            ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(resetauthorization, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    UnconfirmedAuthController.UnconfirmedAuth.$r8$lambda$5YZipc16KGim4xO5wur1HYwv1FE(this.f$0, callback, tLObject, tL_error);
                }
            });
        }

        public static void m1093$r8$lambda$UtQCVywGIkVj_bkEomRVvvkxI(final UnconfirmedAuth unconfirmedAuth, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            unconfirmedAuth.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws InterruptedException {
                    UnconfirmedAuthController.UnconfirmedAuth.$r8$lambda$iJBf5pjJS0KPbwQ7GQUuKOHk98I(this.f$0, tLObject, callback, tL_error);
                }
            });
        }

        public static void $r8$lambda$iJBf5pjJS0KPbwQ7GQUuKOHk98I(UnconfirmedAuth unconfirmedAuth, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) throws InterruptedException {
            unconfirmedAuth.getClass();
            boolean z = tLObject instanceof TLRPC.Updates;
            if (z) {
                MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
            boolean z2 = true;
            BusinessChatbotController.getInstance(UnconfirmedAuthController.this.currentAccount).invalidate(true);
            if (callback != null) {
                if ((!z || tL_error != null) && !UnconfirmedAuthController.this.debug) {
                    z2 = false;
                }
                callback.run(Boolean.valueOf(z2));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public static void $r8$lambda$5YZipc16KGim4xO5wur1HYwv1FE(final UnconfirmedAuth unconfirmedAuth, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            unconfirmedAuth.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UnconfirmedAuthController.UnconfirmedAuth.m1091$r8$lambda$9FjW0bKm0mL90Dv2RomJVmkNnI(this.f$0, callback, tLObject, tL_error);
                }
            });
        }

        public static void m1091$r8$lambda$9FjW0bKm0mL90Dv2RomJVmkNnI(UnconfirmedAuth unconfirmedAuth, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            unconfirmedAuth.getClass();
            if (callback != null) {
                callback.run(Boolean.valueOf(((tLObject instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }
    }
}
