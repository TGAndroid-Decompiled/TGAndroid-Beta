package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
public class UnconfirmedAuthController {
    private final int currentAccount;
    private boolean fetchedCache;
    private boolean fetchingCache;
    private boolean saveAfterFetch;
    private boolean savingCache;
    public final ArrayList<UnconfirmedAuth> auths = new ArrayList<>();
    private final Runnable checkExpiration = new tl(this, 2);
    private boolean debug = false;

    public UnconfirmedAuthController(int i10) {
        this.currentAccount = i10;
        readCache();
    }

    public void lambda$new$2() {
        int i10 = 0;
        while (i10 < this.auths.size()) {
            if (this.auths.get(i10).expired()) {
                this.auths.remove(i10);
                i10--;
            }
            i10++;
        }
        saveCache();
    }

    public void lambda$readCache$0(ArrayList arrayList, HashSet hashSet, ArrayList arrayList2) {
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList, true);
        boolean isEmpty = this.auths.isEmpty();
        int i10 = 0;
        while (i10 < this.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = this.auths.get(i10);
            if (unconfirmedAuth == null || unconfirmedAuth.expired() || hashSet.contains(Long.valueOf(unconfirmedAuth.hash))) {
                this.auths.remove(i10);
                i10--;
            }
            i10++;
        }
        this.auths.addAll(arrayList2);
        boolean isEmpty2 = this.auths.isEmpty();
        this.fetchedCache = true;
        this.fetchingCache = false;
        if (isEmpty != isEmpty2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
        }
        scheduleAuthExpireCheck();
        if (this.saveAfterFetch) {
            this.saveAfterFetch = false;
            saveCache();
        }
    }

    public void lambda$readCache$1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.UnconfirmedAuthController.lambda$readCache$1():void");
    }

    public void lambda$saveCache$3() {
        this.savingCache = false;
    }

    public void lambda$saveCache$4() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.UnconfirmedAuthController.lambda$saveCache$4():void");
    }

    public static void lambda$updateList$5(boolean[] zArr, int i10, Runnable runnable, Boolean bool) {
        zArr[i10] = bool.booleanValue();
        runnable.run();
    }

    public static void lambda$updateList$6(final boolean[] zArr, final int i10, boolean z4, UnconfirmedAuth unconfirmedAuth, final Runnable runnable) {
        Utilities.Callback<Boolean> callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                UnconfirmedAuthController.lambda$updateList$5(zArr, i10, runnable, (Boolean) obj);
            }
        };
        if (z4) {
            unconfirmedAuth.confirm(callback);
        } else {
            unconfirmedAuth.deny(callback);
        }
    }

    public void lambda$updateList$7(boolean[] zArr, ArrayList arrayList, boolean z4, Utilities.Callback callback) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < zArr.length; i10++) {
            if (zArr[i10]) {
                UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuth) arrayList.get(i10);
                arrayList2.add(unconfirmedAuth);
                hashSet.add(Long.valueOf(unconfirmedAuth.hash));
            }
        }
        if (!z4) {
            int i11 = 0;
            while (i11 < this.auths.size()) {
                if (hashSet.contains(Long.valueOf(this.auths.get(i11).hash))) {
                    this.auths.remove(i11);
                    i11--;
                }
                i11++;
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
        if (!this.auths.isEmpty()) {
            ArrayList<UnconfirmedAuth> arrayList = this.auths;
            int size = arrayList.size();
            int i10 = 0;
            long j10 = Long.MAX_VALUE;
            while (i10 < size) {
                UnconfirmedAuth unconfirmedAuth = arrayList.get(i10);
                i10++;
                j10 = Math.min(j10, unconfirmedAuth.expiresAfter());
            }
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            AndroidUtilities.runOnUIThread(this.checkExpiration, Math.max(0L, j10 * 1000));
        }
    }

    private void updateList(final boolean z4, ArrayList<UnconfirmedAuth> arrayList, Utilities.Callback<ArrayList<UnconfirmedAuth>> callback) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        final boolean[] zArr = new boolean[arrayList2.size()];
        Utilities.Callback[] callbackArr = new Utilities.Callback[arrayList2.size()];
        for (final int i10 = 0; i10 < arrayList2.size(); i10++) {
            final UnconfirmedAuth unconfirmedAuth = (UnconfirmedAuth) arrayList2.get(i10);
            callbackArr[i10] = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UnconfirmedAuthController.lambda$updateList$6(zArr, i10, z4, unconfirmedAuth, (Runnable) obj);
                }
            };
        }
        Utilities.raceCallbacks(new gg.j(this, zArr, arrayList2, z4, callback, 8), callbackArr);
        if (z4) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                hashSet.add(Long.valueOf(((UnconfirmedAuth) arrayList2.get(i11)).hash));
            }
            int i12 = 0;
            while (i12 < this.auths.size()) {
                if (hashSet.contains(Long.valueOf(this.auths.get(i12).hash))) {
                    this.auths.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (!hashSet.isEmpty()) {
                saveCache();
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.unconfirmedAuthUpdate, new Object[0]);
                scheduleAuthExpireCheck();
            }
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
        int i10 = 0;
        while (i10 < this.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = this.auths.get(i10);
            if (unconfirmedAuth != null && !unconfirmedAuth.bot && unconfirmedAuth.hash == tL_updateNewAuthorization.hash) {
                this.auths.remove(i10);
                i10--;
            }
            i10++;
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
        if (!this.fetchedCache && !this.fetchingCache) {
            this.fetchingCache = true;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new tl(this, 0));
        }
    }

    public void saveCache() {
        if (this.savingCache) {
            return;
        }
        if (this.fetchingCache) {
            this.saveAfterFetch = true;
            return;
        }
        this.savingCache = true;
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new tl(this, 3));
    }

    public void processUpdate(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
        int i10 = 0;
        while (i10 < this.auths.size()) {
            UnconfirmedAuth unconfirmedAuth = this.auths.get(i10);
            if (unconfirmedAuth != null && unconfirmedAuth.bot && unconfirmedAuth.bot_id == tL_updateNewBotConnection.bot_id) {
                this.auths.remove(i10);
                i10--;
            }
            i10++;
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
            UnconfirmedAuthController.this = r3;
            int readInt32 = abstractSerializedData.readInt32(true);
            if (readInt32 == 2058772876) {
                this.hash = abstractSerializedData.readInt64(true);
                this.date = abstractSerializedData.readInt32(true);
                this.device = abstractSerializedData.readString(true);
                this.location = abstractSerializedData.readString(true);
            } else if (readInt32 == 2058772877) {
                this.bot_id = abstractSerializedData.readInt64(true);
                this.date = abstractSerializedData.readInt32(true);
                this.device = abstractSerializedData.readString(true);
                this.location = abstractSerializedData.readString(true);
            } else {
                TLParseException.doThrowOrLog(abstractSerializedData, "UnconfirmedAuth", readInt32, true);
            }
        }

        public void lambda$confirm$0(Utilities.Callback callback, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
            boolean z4;
            if (callback != null) {
                if (((bool instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                callback.run(Boolean.valueOf(z4));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$confirm$1(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            boolean z4;
            if (callback != null) {
                if (((tLObject instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                callback.run(Boolean.valueOf(z4));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$confirm$2(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ul(this, callback, tLObject, tL_error, 0));
        }

        public void lambda$deny$3(TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
            boolean z4;
            boolean z10 = tLObject instanceof TLRPC.Updates;
            if (z10) {
                MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
            uf.f.a(UnconfirmedAuthController.this.currentAccount).b();
            if (callback != null) {
                if ((z10 && tL_error == null) || UnconfirmedAuthController.this.debug) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                callback.run(Boolean.valueOf(z4));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$deny$4(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ul(this, callback, tLObject, tL_error));
        }

        public void lambda$deny$5(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            boolean z4;
            if (callback != null) {
                if (((tLObject instanceof TLRPC.TL_boolTrue) && tL_error == null) || UnconfirmedAuthController.this.debug) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                callback.run(Boolean.valueOf(z4));
                UnconfirmedAuthController.this.debug = false;
            }
        }

        public void lambda$deny$6(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ul(this, callback, tLObject, tL_error, 2));
        }

        public void confirm(Utilities.Callback<Boolean> callback) {
            if (this.bot) {
                TL_account.confirmBotConnection confirmbotconnection = new TL_account.confirmBotConnection();
                confirmbotconnection.bot_id = MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).getInputUser(this.bot_id);
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequestTyped(confirmbotconnection, new d1(4, this, callback));
                return;
            }
            TL_account.changeAuthorizationSettings changeauthorizationsettings = new TL_account.changeAuthorizationSettings();
            changeauthorizationsettings.hash = this.hash;
            changeauthorizationsettings.confirmed = true;
            ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(changeauthorizationsettings, new vl(this, callback, 2));
        }

        public void deny(Utilities.Callback<Boolean> callback) {
            if (this.bot) {
                TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                updateconnectedbot.deleted = true;
                updateconnectedbot.bot = MessagesController.getInstance(UnconfirmedAuthController.this.currentAccount).getInputUser(this.bot_id);
                updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(updateconnectedbot, new vl(this, callback, 0));
                return;
            }
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = this.hash;
            ConnectionsManager.getInstance(UnconfirmedAuthController.this.currentAccount).sendRequest(resetauthorization, new vl(this, callback, 1));
        }

        public boolean expired() {
            if (expiresAfter() <= 0) {
                return true;
            }
            return false;
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
            UnconfirmedAuthController.this = r3;
            this.hash = tL_updateNewAuthorization.hash;
            this.date = tL_updateNewAuthorization.date;
            this.device = tL_updateNewAuthorization.device;
            this.location = tL_updateNewAuthorization.location;
        }

        public UnconfirmedAuth(TL_update.TL_updateNewBotConnection tL_updateNewBotConnection) {
            UnconfirmedAuthController.this = r3;
            this.bot = true;
            long j10 = tL_updateNewBotConnection.bot_id;
            this.bot_id = j10;
            this.hash = j10;
            this.date = tL_updateNewBotConnection.date;
            this.device = tL_updateNewBotConnection.device;
            this.location = tL_updateNewBotConnection.location;
        }
    }
}
