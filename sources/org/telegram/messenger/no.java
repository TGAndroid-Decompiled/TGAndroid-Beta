package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class no extends y2 {
    public final np f25791e;

    public no(np npVar) {
        super(3600000);
        this.f25791e = npVar;
    }

    @Override
    public final void e(int i7, Object obj, r10 r10Var) {
        Void r42 = (Void) obj;
        ur.a0(i7).f27250a.c(new x0(i7, r10Var, 7));
    }

    @Override
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        Void r32 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.f25791e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(x2Var, 6));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Void r42 = (Void) obj;
        ur.a0(i7).f27250a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override
    public final boolean j(Object obj) {
        Void r12 = (Void) obj;
        return false;
    }
}
