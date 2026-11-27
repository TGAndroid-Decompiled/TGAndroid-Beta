package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class vb7 extends b71 {
    public final uc7 e;

    public vb7(uc7 uc7Var) {
        super(3600000);
        this.e = uc7Var;
    }

    @Override
    public final void e(int i, Object obj, icc iccVar) {
        Void r3 = (Void) obj;
        kf7.a0(i).a.c(new hl3(i, iccVar, (byte) 27));
    }

    @Override
    public final void f(int i, Object obj, long j, a71 a71Var) {
        Void r2 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new ic((byte) 0), new yt4(a71Var, (byte) 20));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Void r3 = (Void) obj;
        kf7.a0(i).a.c(new hl3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 28));
    }

    @Override
    public final boolean j(Object obj) {
        Void r1 = (Void) obj;
        return false;
    }
}
