package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public abstract class pg0 {
    protected final int currentAccount;
    private j5 parentAccountInstance;

    public pg0(int i) {
        this.parentAccountInstance = j5.a(i);
        this.currentAccount = i;
    }

    public final j5 getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final gs getAppGlobalConfig() {
        return getMessagesController().l4;
    }

    public final m58 getColorPalette() {
        return m58.e(this.parentAccountInstance.a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.a);
    }

    public final bw2 getContactsController() {
        return bw2.r(this.parentAccountInstance.a);
    }

    public final er3 getDownloadController() {
        return er3.q(this.parentAccountInstance.a);
    }

    public final bc4 getFileLoader() {
        return bc4.G(this.parentAccountInstance.a);
    }

    public final ad4 getFileRefController() {
        return ad4.n(this.parentAccountInstance.a);
    }

    public final dd6 getLocationController() {
        return dd6.f(this.parentAccountInstance.a);
    }

    public final hs6 getMediaDataController() {
        return hs6.d0(this.parentAccountInstance.a);
    }

    public final n07 getMemberRequestsController() {
        return n07.a(this.parentAccountInstance.a);
    }

    public final oc7 getMessagesController() {
        return oc7.r1(this.parentAccountInstance.a);
    }

    public final cf7 getMessagesStorage() {
        return cf7.Y(this.parentAccountInstance.a);
    }

    public final nm7 getNotificationCenter() {
        return nm7.f(this.parentAccountInstance.a);
    }

    public final lo7 getNotificationsController() {
        return lo7.n(this.parentAccountInstance.a);
    }

    public final dw9 getSecretChatHelper() {
        return dw9.i(this.parentAccountInstance.a);
    }

    public final a6a getSendMessagesHelper() {
        return a6a.B(this.parentAccountInstance.a);
    }

    public final b0b getStatsController() {
        return b0b.c(this.parentAccountInstance.a);
    }

    public final z8c getUserConfig() {
        return z8c.h(this.parentAccountInstance.a);
    }
}
