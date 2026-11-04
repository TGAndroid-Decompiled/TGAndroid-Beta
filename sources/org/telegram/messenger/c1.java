package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public abstract class c1 {
    protected final int currentAccount;
    private c parentAccountInstance;

    public c1(int i3) {
        this.parentAccountInstance = c.a(i3);
        this.currentAccount = i3;
    }

    public final c getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final p0 getAppGlobalConfig() {
        return getMessagesController().f23167x7;
    }

    public final tg.k0 getColorPalette() {
        return tg.k0.e(this.parentAccountInstance.f21919a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f21919a);
    }

    public final g5 getContactsController() {
        return g5.r(this.parentAccountInstance.f21919a);
    }

    public final z5 getDownloadController() {
        return z5.q(this.parentAccountInstance.f21919a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.f21919a);
    }

    public final r8 getFileRefController() {
        return r8.n(this.parentAccountInstance.f21919a);
    }

    public final ld getLocationController() {
        return ld.f(this.parentAccountInstance.f21919a);
    }

    public final li getMediaDataController() {
        return li.b0(this.parentAccountInstance.f21919a);
    }

    public final mi getMemberRequestsController() {
        return mi.b(this.parentAccountInstance.f21919a);
    }

    public final hp getMessagesController() {
        return hp.s1(this.parentAccountInstance.f21919a);
    }

    public final qr getMessagesStorage() {
        return qr.a0(this.parentAccountInstance.f21919a);
    }

    public final hs getNotificationCenter() {
        return hs.f(this.parentAccountInstance.f21919a);
    }

    public final us getNotificationsController() {
        return us.t(this.parentAccountInstance.f21919a);
    }

    public final vv getSecretChatHelper() {
        return vv.i(this.parentAccountInstance.f21919a);
    }

    public final yy getSendMessagesHelper() {
        return yy.C(this.parentAccountInstance.f21919a);
    }

    public final bz getStatsController() {
        return bz.e(this.parentAccountInstance.f21919a);
    }

    public final h10 getUserConfig() {
        return h10.i(this.parentAccountInstance.f21919a);
    }
}
