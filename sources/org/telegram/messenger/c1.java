package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public abstract class c1 {
    protected final int currentAccount;
    private c parentAccountInstance;

    public c1(int i7) {
        this.parentAccountInstance = c.a(i7);
        this.currentAccount = i7;
    }

    public final c getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final p0 getAppGlobalConfig() {
        return getMessagesController().A7;
    }

    public final sg.j0 getColorPalette() {
        return sg.j0.e(this.parentAccountInstance.f23343a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f23343a);
    }

    public final i5 getContactsController() {
        return i5.r(this.parentAccountInstance.f23343a);
    }

    public final a6 getDownloadController() {
        return a6.q(this.parentAccountInstance.f23343a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.f23343a);
    }

    public final q8 getFileRefController() {
        return q8.n(this.parentAccountInstance.f23343a);
    }

    public final qd getLocationController() {
        return qd.f(this.parentAccountInstance.f23343a);
    }

    public final ri getMediaDataController() {
        return ri.d0(this.parentAccountInstance.f23343a);
    }

    public final si getMemberRequestsController() {
        return si.b(this.parentAccountInstance.f23343a);
    }

    public final mp getMessagesController() {
        return mp.u1(this.parentAccountInstance.f23343a);
    }

    public final tr getMessagesStorage() {
        return tr.a0(this.parentAccountInstance.f23343a);
    }

    public final ks getNotificationCenter() {
        return ks.f(this.parentAccountInstance.f23343a);
    }

    public final xs getNotificationsController() {
        return xs.t(this.parentAccountInstance.f23343a);
    }

    public final xv getSecretChatHelper() {
        return xv.i(this.parentAccountInstance.f23343a);
    }

    public final zy getSendMessagesHelper() {
        return zy.C(this.parentAccountInstance.f23343a);
    }

    public final cz getStatsController() {
        return cz.e(this.parentAccountInstance.f23343a);
    }

    public final i10 getUserConfig() {
        return i10.i(this.parentAccountInstance.f23343a);
    }
}
