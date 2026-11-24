package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class p67 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TL_account.TL_webBrowserSettings c;

    public p67(na7 na7Var, TL_account.TL_webBrowserSettings tL_webBrowserSettings, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                f67 f67Var = na7Var.l5;
                if (tL_webBrowserSettings != null) {
                    na7Var.m5 = tL_webBrowserSettings;
                    na7Var.getNotificationCenter().k(349, new Object[0]);
                }
                gl.r(f67Var);
                gl.d3(f67Var, 3600010L);
                return;
            default:
                if (tL_webBrowserSettings != null) {
                    na7Var.m5 = tL_webBrowserSettings;
                    na7Var.getNotificationCenter().k(349, new Object[0]);
                    return;
                }
                return;
        }
    }
}
