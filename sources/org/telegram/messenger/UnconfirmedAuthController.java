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
    private final Runnable checkExpiration = new UnconfirmedAuthController$$ExternalSyntheticLambda3(this, 2);
    private boolean debug = false;

    public UnconfirmedAuthController(int i) {
        this.currentAccount = i;
        readCache();
    }

    public void lambda$new$2() {
        int i = 0;
        while (i < this.auths.size()) {
            if (this.auths.get(i).expired()) {
                this.auths.remove(i);
                i--;
            }
            i++;
        }
        saveCache();
    }

    public void lambda$readCache$0(ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        boolean zIsEmpty = this.auths.isEmpty();
        int i = 0;
        while (i < this.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = this.auths.get(i);
            if (unconfirmedAuth == null || unconfirmedAuth.expired() || hashSet.contains(Long.valueOf(unconfirmedAuth.hash))) {
                this.auths.remove(i);
                i--;
            }
            i++;
        }
        this.auths.addAll(arrayList2);
        boolean zIsEmpty2 = this.auths.isEmpty();
        this.fetchedCache = true;
        this.fetchingCache = false;
        if (zIsEmpty != zIsEmpty2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        }
        scheduleAuthExpireCheck();
        if (this.saveAfterFetch) {
            this.saveAfterFetch = false;
            saveCache();
        }
    }

    public void lambda$readCache$1() {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        SQLiteDatabase database = MessagesStorage.getInstance(this.currentAccount).getDatabase();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                Locale locale = Locale.US;
                sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    if (nativeByteBufferByteBufferValue != null) {
                        try {
                            UnconfirmedAuth unconfirmedAuth = new UnconfirmedAuth(nativeByteBufferByteBufferValue);
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
                MessagesStorage.getInstance(this.currentAccount).getUsersInternal(arrayList2, arrayList);
                sQLiteCursorQueryFinalized.dispose();
            } catch (Exception e2) {
                FileLog.e(e2);
                if (sQLiteCursorQueryFinalized != null) {
                    sQLiteCursorQueryFinalized.dispose();
                }
            }
            AndroidUtilities.runOnUIThread(new UserNameResolver$$ExternalSyntheticLambda2(5, this, arrayList, hashSet, arrayList3));
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void lambda$saveCache$3() {
        this.savingCache = false;
    }

    public void lambda$saveCache$4() {
        SQLiteDatabase database = MessagesStorage.getInstance(this.currentAccount).getDatabase();
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                database.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                ArrayList<UnconfirmedAuth> arrayList = this.auths;
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
            AndroidUtilities.runOnUIThread(new UnconfirmedAuthController$$ExternalSyntheticLambda3(this, 1));
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    public static void lambda$updateList$5(boolean[] zArr, int i, Runnable runnable, Boolean bool) {
        zArr[i] = bool.booleanValue();
        runnable.run();
    }

    public static void lambda$updateList$6(final boolean[] zArr, final int i, boolean z, UnconfirmedAuth unconfirmedAuth, final Runnable runnable) {
        Utilities.Callback<Boolean> callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UnconfirmedAuthController.lambda$updateList$5(zArr, i, runnable, (Boolean) obj);
            }
        };
        if (z) {
            unconfirmedAuth.confirm(callback);
        } else {
            unconfirmedAuth.deny(callback);
        }
    }

    public void lambda$updateList$7(boolean[] zArr, ArrayList arrayList, boolean z, Utilities.Callback callback) {
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
            while (i2 < this.auths.size()) {
                if (hashSet.contains(Long.valueOf(this.auths.get(i2).hash))) {
                    this.auths.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!hashSet.isEmpty()) {
                saveCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
                scheduleAuthExpireCheck();
            }
        }
        callback.run(arrayList2);
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

    private void updateList(final boolean z, ArrayList<UnconfirmedAuth> arrayList, Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        Utilities.Callback[] callbackArr = new Utilities.Callback[arrayList2.size()];
        for (final int i = 0; i < arrayList2.size(); i++) {
            final UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuth) arrayList2.get(i);
            callbackArr[i] = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UnconfirmedAuthController.lambda$updateList$6(zArr, i, z, unconfirmedAuth, (Runnable) obj);
                }
            };
        }
        Utilities.raceCallbacks(new MessagesStorage$$ExternalSyntheticLambda112(this, zArr, arrayList2, z, callback, 7), callbackArr);
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
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
            scheduleAuthExpireCheck();
        }
    }

    public void cleanup() {
        this.auths.clear();
        saveCache();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        scheduleAuthExpireCheck();
    }

    public void confirm(ArrayList<UnconfirmedAuth> arrayList, Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        updateList(true, arrayList, callback);
    }

    public void deny(ArrayList<UnconfirmedAuth> arrayList, Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        updateList(false, arrayList, callback);
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
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        scheduleAuthExpireCheck();
        saveCache();
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

    public void readCache() {
        if (this.fetchedCache || this.fetchingCache) {
            return;
        }
        this.fetchingCache = true;
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new UnconfirmedAuthController$$ExternalSyntheticLambda3(this, 0));
    }

    public void saveCache() {
        if (this.savingCache) {
            return;
        }
        if (this.fetchingCache) {
            this.saveAfterFetch = true;
        } else {
            this.savingCache = true;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new UnconfirmedAuthController$$ExternalSyntheticLambda3(this, 3));
        }
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
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        scheduleAuthExpireCheck();
        saveCache();
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
            if (int32 != 2058772877) {
                TLParseException.doThrowOrLog(abstractSerializedData, "UnconfirmedAuth", int32, true);
                return;
            }
            this.bot_id = abstractSerializedData.readInt64(true);
            this.date = abstractSerializedData.readInt32(true);
            this.device = abstractSerializedData.readString(true);
            this.location = abstractSerializedData.readString(true);
        }

        public void lambda$confirm$0(Utilities.Callback callback, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            if (callback != null) {
                callback.run(Boolean.valueOf(((bool instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$confirm$1(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (callback != null) {
                callback.run(Boolean.valueOf(((tLObject instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$confirm$2(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda0(this, callback, tLObject, tL_error, 0));
        }

        public void lambda$deny$3(TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
            boolean z = tLObject instanceof TLRPC.Updates;
            if (z) {
                MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
            BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(UnconfirmedAuthController.this.currentAccount);
            businessChatbotController.loaded = false;
            businessChatbotController.load(null);
            if (callback != null) {
                callback.run(Boolean.valueOf((z && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$deny$4(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda0(this, callback, tLObject, tL_error));
        }

        public void lambda$deny$5(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (callback != null) {
                callback.run(Boolean.valueOf(((tLObject instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$deny$6(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda0(this, callback, tLObject, tL_error, 2));
        }

        public void confirm(Utilities.Callback<Boolean> callback) {
            if (this.bot) {
                TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                confirmbotconnection.bot_id = MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).getInputUser(this.bot_id);
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequestTyped(confirmbotconnection, new ChatThemeController$$ExternalSyntheticLambda9(4, this, callback));
            } else {
                TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
                changeauthorizationsettings.hash = this.hash;
                changeauthorizationsettings.confirmed = true;
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(changeauthorizationsettings, new UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda1(this, callback, 2));
            }
        }

        public void deny(Utilities.Callback<Boolean> callback) {
            if (!this.bot) {
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = this.hash;
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(resetauthorization, new UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda1(this, callback, 1));
            } else {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).getInputUser(this.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(updateconnectedbot, new UnconfirmedAuthController$UnconfirmedAuth$$ExternalSyntheticLambda1(this, callback, 0));
            }
        }

        public boolean expired() {
            return expiresAfter() <= 0;
        }

        public long expiresAfter() {
            return (ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).getCurrentTime() + MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).authorizationAutoconfirmPeriod) - this.date;
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
    }
}
