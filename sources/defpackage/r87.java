package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class r87 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TL_account.TL_webBrowserSettings c;

    public r87(oc7 oc7Var, TL_account.TL_webBrowserSettings tL_webBrowserSettings, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                g87 g87Var = oc7Var.n5;
                if (tL_webBrowserSettings != null) {
                    oc7Var.o5 = tL_webBrowserSettings;
                    oc7Var.getNotificationCenter().k(351, new Object[0]);
                }
                gm.r(g87Var);
                gm.d3(g87Var, 3600010L);
                return;
            default:
                if (tL_webBrowserSettings != null) {
                    oc7Var.o5 = tL_webBrowserSettings;
                    oc7Var.getNotificationCenter().k(351, new Object[0]);
                    return;
                }
                return;
        }
    }
}
