package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public abstract class f1 {
    protected final int currentAccount;
    private c parentAccountInstance;

    public f1(int i10) {
        this.parentAccountInstance = c.a(i10);
        this.currentAccount = i10;
    }

    public final c getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final s0 getAppGlobalConfig() {
        return getMessagesController().f18957y7;
    }

    public final ig.s0 getColorPalette() {
        return ig.s0.e(this.parentAccountInstance.f14863a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f14863a);
    }

    public final i5 getContactsController() {
        return i5.r(this.parentAccountInstance.f14863a);
    }

    public final b6 getDownloadController() {
        return b6.q(this.parentAccountInstance.f14863a);
    }

    public final b8 getFileLoader() {
        return b8.G(this.parentAccountInstance.f14863a);
    }

    public final w8 getFileRefController() {
        return w8.n(this.parentAccountInstance.f14863a);
    }

    public final nd getLocationController() {
        return nd.f(this.parentAccountInstance.f14863a);
    }

    public final ui getMediaDataController() {
        return ui.b0(this.parentAccountInstance.f14863a);
    }

    public final vi getMemberRequestsController() {
        return vi.b(this.parentAccountInstance.f14863a);
    }

    public final vp getMessagesController() {
        return vp.r1(this.parentAccountInstance.f14863a);
    }

    public final hs getMessagesStorage() {
        return hs.a0(this.parentAccountInstance.f14863a);
    }

    public final zs getNotificationCenter() {
        return zs.f(this.parentAccountInstance.f14863a);
    }

    public final ot getNotificationsController() {
        return ot.t(this.parentAccountInstance.f14863a);
    }

    public final ow getSecretChatHelper() {
        return ow.i(this.parentAccountInstance.f14863a);
    }

    public final qz getSendMessagesHelper() {
        return qz.C(this.parentAccountInstance.f14863a);
    }

    public final uz getStatsController() {
        return uz.e(this.parentAccountInstance.f14863a);
    }

    public final d20 getUserConfig() {
        return d20.i(this.parentAccountInstance.f14863a);
    }
}
