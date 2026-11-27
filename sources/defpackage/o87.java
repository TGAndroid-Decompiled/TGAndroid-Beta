package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class o87 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TL_account.TL_webBrowserSettings c;

    public o87(uc7 uc7Var, TL_account.TL_webBrowserSettings tL_webBrowserSettings, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                l87 l87Var = uc7Var.m5;
                if (tL_webBrowserSettings != null) {
                    uc7Var.n5 = tL_webBrowserSettings;
                    uc7Var.getNotificationCenter().k(350, new Object[0]);
                }
                hl.r(l87Var);
                hl.d3(l87Var, 3600010L);
                return;
            default:
                if (tL_webBrowserSettings != null) {
                    uc7Var.n5 = tL_webBrowserSettings;
                    uc7Var.getNotificationCenter().k(350, new Object[0]);
                    return;
                }
                return;
        }
    }
}
