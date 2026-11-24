package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class pb7 extends a81 {
    public final oc7 e;

    public pb7(oc7 oc7Var) {
        super(3600000);
        this.e = oc7Var;
    }

    @Override
    public final void e(int i, Object obj, jac jacVar) {
        Void r3 = (Void) obj;
        cf7.Y(i).a.c(new bm3(i, jacVar, (byte) 27));
    }

    @Override
    public final void f(int i, Object obj, long j, z71 z71Var) {
        Void r2 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new kc((byte) 0), new vt4(z71Var, (byte) 20));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Void r3 = (Void) obj;
        cf7.Y(i).a.c(new bm3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 28));
    }

    @Override
    public final boolean j(Object obj) {
        Void r1 = (Void) obj;
        return false;
    }
}
