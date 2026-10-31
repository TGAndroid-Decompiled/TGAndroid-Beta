package kg;

import android.content.Context;
import org.telegram.messenger.vp;
public final class m1 implements Runnable {
    public final int f11187a;
    public final v1 f11188b;

    public m1(v1 v1Var, int i10) {
        this.f11187a = i10;
        this.f11188b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f11187a) {
            case 0:
                v1 v1Var = this.f11188b;
                Context context = v1Var.getContext();
                gf.f.r(context, "https://" + vp.r1(v1Var.Q1).U2 + "/nft/" + v1Var.f11313v2.slug);
                return;
            case 1:
                v1 v1Var2 = this.f11188b;
                try {
                    v1Var2.f21589c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                v1Var2.f11298g2.c(v1Var2.C2);
                return;
            default:
                this.f11188b.G2[0].setVisibility(8);
                return;
        }
    }
}
