package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class qo extends x2 {
    public final qp f24727e;

    public qo(qp qpVar) {
        super(3600000);
        this.f24727e = qpVar;
    }

    @Override
    public final void e(int i7, Object obj, v10 v10Var) {
        Void r42 = (Void) obj;
        yr.a0(i7).f26719a.c(new x0(i7, v10Var, 7));
    }

    @Override
    public final void f(int i7, Object obj, long j3, w2 w2Var) {
        Void r32 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j3;
        this.f24727e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new d3.b(1), new d(w2Var, 6));
    }

    @Override
    public final void g(int i7, Object obj, Object obj2) {
        Void r42 = (Void) obj;
        yr.a0(i7).f26719a.c(new x0(i7, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override
    public final boolean j(Object obj) {
        Void r12 = (Void) obj;
        return false;
    }
}
