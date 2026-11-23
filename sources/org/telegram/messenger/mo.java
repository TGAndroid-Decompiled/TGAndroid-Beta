package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class mo extends y2 {
    public final mp f25687e;

    public mo(mp mpVar) {
        super(3600000);
        this.f25687e = mpVar;
    }

    @Override
    public final void e(int i7, Object obj, p10 p10Var) {
        Void r42 = (Void) obj;
        tr.a0(i7).f27149a.c(new x0(i7, p10Var, 7));
    }

    @Override
    public final void f(int i7, Object obj, long j3, x2 x2Var) {
        Void r32 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.f25687e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(x2Var, 6));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Void r42 = (Void) obj;
        tr.a0(i7).f27149a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override
    public final boolean j(Object obj) {
        Void r12 = (Void) obj;
        return false;
    }
}
