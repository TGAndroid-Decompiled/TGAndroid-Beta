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
        return getMessagesController().f25451y7;
    }

    public final sg.k0 getColorPalette() {
        return sg.k0.e(this.parentAccountInstance.f22782a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.f22782a);
    }

    public final g5 getContactsController() {
        return g5.r(this.parentAccountInstance.f22782a);
    }

    public final z5 getDownloadController() {
        return z5.q(this.parentAccountInstance.f22782a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.f22782a);
    }

    public final r8 getFileRefController() {
        return r8.n(this.parentAccountInstance.f22782a);
    }

    public final rd getLocationController() {
        return rd.f(this.parentAccountInstance.f22782a);
    }

    public final si getMediaDataController() {
        return si.b0(this.parentAccountInstance.f22782a);
    }

    public final ti getMemberRequestsController() {
        return ti.b(this.parentAccountInstance.f22782a);
    }

    public final np getMessagesController() {
        return np.s1(this.parentAccountInstance.f22782a);
    }

    public final vr getMessagesStorage() {
        return vr.a0(this.parentAccountInstance.f22782a);
    }

    public final ns getNotificationCenter() {
        return ns.f(this.parentAccountInstance.f22782a);
    }

    public final at getNotificationsController() {
        return at.t(this.parentAccountInstance.f22782a);
    }

    public final bw getSecretChatHelper() {
        return bw.i(this.parentAccountInstance.f22782a);
    }

    public final ez getSendMessagesHelper() {
        return ez.C(this.parentAccountInstance.f22782a);
    }

    public final hz getStatsController() {
        return hz.e(this.parentAccountInstance.f22782a);
    }

    public final m10 getUserConfig() {
        return m10.i(this.parentAccountInstance.f22782a);
    }
}
