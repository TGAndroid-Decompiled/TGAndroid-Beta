package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public abstract class pf0 {
    protected final int currentAccount;
    private j5 parentAccountInstance;

    public pf0(int i) {
        this.parentAccountInstance = j5.a(i);
        this.currentAccount = i;
    }

    public final j5 getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final gr getAppGlobalConfig() {
        return getMessagesController().k4;
    }

    public final k38 getColorPalette() {
        return k38.e(this.parentAccountInstance.a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.a);
    }

    public final qu2 getContactsController() {
        return qu2.r(this.parentAccountInstance.a);
    }

    public final up3 getDownloadController() {
        return up3.q(this.parentAccountInstance.a);
    }

    public final ba4 getFileLoader() {
        return ba4.G(this.parentAccountInstance.a);
    }

    public final ab4 getFileRefController() {
        return ab4.n(this.parentAccountInstance.a);
    }

    public final eb6 getLocationController() {
        return eb6.f(this.parentAccountInstance.a);
    }

    public final hq6 getMediaDataController() {
        return hq6.d0(this.parentAccountInstance.a);
    }

    public final ny6 getMemberRequestsController() {
        return ny6.a(this.parentAccountInstance.a);
    }

    public final na7 getMessagesController() {
        return na7.q1(this.parentAccountInstance.a);
    }

    public final ad7 getMessagesStorage() {
        return ad7.Y(this.parentAccountInstance.a);
    }

    public final kk7 getNotificationCenter() {
        return kk7.f(this.parentAccountInstance.a);
    }

    public final im7 getNotificationsController() {
        return im7.n(this.parentAccountInstance.a);
    }

    public final bu9 getSecretChatHelper() {
        return bu9.i(this.parentAccountInstance.a);
    }

    public final z3a getSendMessagesHelper() {
        return z3a.B(this.parentAccountInstance.a);
    }

    public final yxa getStatsController() {
        return yxa.c(this.parentAccountInstance.a);
    }

    public final y6c getUserConfig() {
        return y6c.h(this.parentAccountInstance.a);
    }
}
