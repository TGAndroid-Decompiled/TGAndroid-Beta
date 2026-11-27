package defpackage;

import android.content.Context;
public final class el8 implements Runnable {
    public final byte a;
    public final kl8 b;

    public el8(kl8 kl8Var, byte b) {
        this.a = b;
        this.b = kl8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kl8 kl8Var = this.b;
        switch (b) {
            case 0:
                Context context = kl8Var.getContext();
                m01.u(context, "https://" + uc7.s1(kl8Var.T1).N2 + "/nft/" + kl8Var.y2.slug);
                return;
            case 1:
                try {
                    kl8Var.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                kl8Var.j2.c(kl8Var.F2);
                return;
            default:
                kl8Var.J2[0].setVisibility(8);
                return;
        }
    }
}
