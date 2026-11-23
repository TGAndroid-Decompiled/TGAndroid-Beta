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

    public final sg.k0 getColorPalette() {
        return sg.k0.e(this.parentAccountInstance.f23202a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f23202a);
    }

    public final i5 getContactsController() {
        return i5.r(this.parentAccountInstance.f23202a);
    }

    public final a6 getDownloadController() {
        return a6.q(this.parentAccountInstance.f23202a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.f23202a);
    }

    public final r8 getFileRefController() {
        return r8.n(this.parentAccountInstance.f23202a);
    }

    public final rd getLocationController() {
        return rd.f(this.parentAccountInstance.f23202a);
    }

    public final si getMediaDataController() {
        return si.d0(this.parentAccountInstance.f23202a);
    }

    public final ti getMemberRequestsController() {
        return ti.b(this.parentAccountInstance.f23202a);
    }

    public final np getMessagesController() {
        return np.u1(this.parentAccountInstance.f23202a);
    }

    public final ur getMessagesStorage() {
        return ur.a0(this.parentAccountInstance.f23202a);
    }

    public final ls getNotificationCenter() {
        return ls.f(this.parentAccountInstance.f23202a);
    }

    public final ys getNotificationsController() {
        return ys.t(this.parentAccountInstance.f23202a);
    }

    public final yv getSecretChatHelper() {
        return yv.i(this.parentAccountInstance.f23202a);
    }

    public final az getSendMessagesHelper() {
        return az.C(this.parentAccountInstance.f23202a);
    }

    public final dz getStatsController() {
        return dz.e(this.parentAccountInstance.f23202a);
    }

    public final k10 getUserConfig() {
        return k10.i(this.parentAccountInstance.f23202a);
    }
}
