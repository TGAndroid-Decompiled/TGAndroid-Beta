package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public abstract class rf0 {
    protected final int currentAccount;
    private k5 parentAccountInstance;

    public rf0(int i) {
        this.parentAccountInstance = k5.a(i);
        this.currentAccount = i;
    }

    public final k5 getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final hr getAppGlobalConfig() {
        return getMessagesController().l4;
    }

    public final a78 getColorPalette() {
        return a78.e(this.parentAccountInstance.a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.a);
    }

    public final lv2 getContactsController() {
        return lv2.r(this.parentAccountInstance.a);
    }

    public final lq3 getDownloadController() {
        return lq3.q(this.parentAccountInstance.a);
    }

    public final xb4 getFileLoader() {
        return xb4.G(this.parentAccountInstance.a);
    }

    public final xc4 getFileRefController() {
        return xc4.n(this.parentAccountInstance.a);
    }

    public final id6 getLocationController() {
        return id6.f(this.parentAccountInstance.a);
    }

    public final ls6 getMediaDataController() {
        return ls6.d0(this.parentAccountInstance.a);
    }

    public final u07 getMemberRequestsController() {
        return u07.a(this.parentAccountInstance.a);
    }

    public final uc7 getMessagesController() {
        return uc7.s1(this.parentAccountInstance.a);
    }

    public final kf7 getMessagesStorage() {
        return kf7.a0(this.parentAccountInstance.a);
    }

    public final jn7 getNotificationCenter() {
        return jn7.f(this.parentAccountInstance.a);
    }

    public final ip7 getNotificationsController() {
        return ip7.n(this.parentAccountInstance.a);
    }

    public final wx9 getSecretChatHelper() {
        return wx9.i(this.parentAccountInstance.a);
    }

    public final r7a getSendMessagesHelper() {
        return r7a.B(this.parentAccountInstance.a);
    }

    public final a2b getStatsController() {
        return a2b.c(this.parentAccountInstance.a);
    }

    public final yac getUserConfig() {
        return yac.h(this.parentAccountInstance.a);
    }
}
