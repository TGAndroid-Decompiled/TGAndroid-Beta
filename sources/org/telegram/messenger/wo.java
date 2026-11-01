package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class wo extends b3 {
    public final wp e;

    public wo(wp wpVar) {
        super(3600000);
        this.e = wpVar;
    }

    @Override
    public final void e(int i10, Object obj, k20 k20Var) {
        Void r42 = (Void) obj;
        is.a0(i10).f16331a.c(new a1(i10, k20Var, 7));
    }

    @Override
    public final void f(int i10, Object obj, long j10, a3 a3Var) {
        Void r32 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j10;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new a3.b(1), new d(a3Var, 6));
    }

    @Override
    public final void g(int i10, Object obj, Object obj2) {
        Void r42 = (Void) obj;
        is.a0(i10).f16331a.c(new a1(i10, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override
    public final boolean j(Object obj) {
        Void r12 = (Void) obj;
        return false;
    }
}
