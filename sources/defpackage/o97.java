package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class o97 extends t61 {
    public final na7 e;

    public o97(na7 na7Var) {
        super(3600000);
        this.e = na7Var;
    }

    @Override
    public final void e(int i, Object obj, i8c i8cVar) {
        Void r3 = (Void) obj;
        ad7.Y(i).a.c(new sm3(i, i8cVar, (byte) 25));
    }

    @Override
    public final void f(int i, Object obj, long j, s61 s61Var) {
        Void r2 = (Void) obj;
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new hc((byte) 0), new ur4(s61Var, (byte) 20));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        Void r3 = (Void) obj;
        ad7.Y(i).a.c(new sm3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 26));
    }

    @Override
    public final boolean j(Object obj) {
        Void r1 = (Void) obj;
        return false;
    }
}
