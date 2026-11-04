package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ho extends x2 {
    public final hp f22952e;

    public ho(hp hpVar) {
        super(3600000);
        this.f22952e = hpVar;
    }

    @Override
    public final void e(int i3, Object obj, n10 n10Var) {
        Void r42 = (Void) obj;
        qr.a0(i3).f24934a.c(new x0(i3, n10Var, 7));
    }

    @Override
    public final void f(int i3, Object obj, long j10, w2 w2Var) {
        Void r32 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j10;
        this.f22952e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new c3.b(1), new d(w2Var, 6));
    }

    @Override
    public final void g(int i3, Object obj, Object obj2) {
        Void r42 = (Void) obj;
        qr.a0(i3).f24934a.c(new x0(i3, (TL_account.TL_webBrowserSettings) obj2, 8));
    }

    @Override
    public final boolean j(Object obj) {
        Void r12 = (Void) obj;
        return false;
    }
}
