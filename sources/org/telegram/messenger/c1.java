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
        return getMessagesController().f24927x7;
    }

    public final sg.l0 getColorPalette() {
        return sg.l0.e(this.parentAccountInstance.f21723a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f21723a);
    }

    public final g5 getContactsController() {
        return g5.r(this.parentAccountInstance.f21723a);
    }

    public final z5 getDownloadController() {
        return z5.q(this.parentAccountInstance.f21723a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.f21723a);
    }

    public final r8 getFileRefController() {
        return r8.n(this.parentAccountInstance.f21723a);
    }

    public final sd getLocationController() {
        return sd.f(this.parentAccountInstance.f21723a);
    }

    public final ui getMediaDataController() {
        return ui.b0(this.parentAccountInstance.f21723a);
    }

    public final vi getMemberRequestsController() {
        return vi.b(this.parentAccountInstance.f21723a);
    }

    public final qp getMessagesController() {
        return qp.s1(this.parentAccountInstance.f21723a);
    }

    public final yr getMessagesStorage() {
        return yr.a0(this.parentAccountInstance.f21723a);
    }

    public final qs getNotificationCenter() {
        return qs.f(this.parentAccountInstance.f21723a);
    }

    public final dt getNotificationsController() {
        return dt.t(this.parentAccountInstance.f21723a);
    }

    public final dw getSecretChatHelper() {
        return dw.i(this.parentAccountInstance.f21723a);
    }

    public final gz getSendMessagesHelper() {
        return gz.C(this.parentAccountInstance.f21723a);
    }

    public final jz getStatsController() {
        return jz.e(this.parentAccountInstance.f21723a);
    }

    public final p10 getUserConfig() {
        return p10.i(this.parentAccountInstance.f21723a);
    }
}
