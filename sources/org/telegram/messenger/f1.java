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
        return getMessagesController().f19300y7;
    }

    public final ig.s0 getColorPalette() {
        return ig.s0.e(this.parentAccountInstance.f15043a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f15043a);
    }

    public final i5 getContactsController() {
        return i5.r(this.parentAccountInstance.f15043a);
    }

    public final b6 getDownloadController() {
        return b6.q(this.parentAccountInstance.f15043a);
    }

    public final b8 getFileLoader() {
        return b8.G(this.parentAccountInstance.f15043a);
    }

    public final w8 getFileRefController() {
        return w8.n(this.parentAccountInstance.f15043a);
    }

    public final od getLocationController() {
        return od.f(this.parentAccountInstance.f15043a);
    }

    public final vi getMediaDataController() {
        return vi.b0(this.parentAccountInstance.f15043a);
    }

    public final wi getMemberRequestsController() {
        return wi.b(this.parentAccountInstance.f15043a);
    }

    public final wp getMessagesController() {
        return wp.r1(this.parentAccountInstance.f15043a);
    }

    public final is getMessagesStorage() {
        return is.a0(this.parentAccountInstance.f15043a);
    }

    public final at getNotificationCenter() {
        return at.f(this.parentAccountInstance.f15043a);
    }

    public final pt getNotificationsController() {
        return pt.t(this.parentAccountInstance.f15043a);
    }

    public final pw getSecretChatHelper() {
        return pw.i(this.parentAccountInstance.f15043a);
    }

    public final rz getSendMessagesHelper() {
        return rz.C(this.parentAccountInstance.f15043a);
    }

    public final vz getStatsController() {
        return vz.e(this.parentAccountInstance.f15043a);
    }

    public final e20 getUserConfig() {
        return e20.i(this.parentAccountInstance.f15043a);
    }
}
