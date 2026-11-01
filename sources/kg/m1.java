package kg;

import android.content.Context;
import org.telegram.messenger.wp;
public final class m1 implements Runnable {
    public final int f11188a;
    public final v1 f11189b;

    public m1(v1 v1Var, int i10) {
        this.f11188a = i10;
        this.f11189b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f11188a) {
            case 0:
                v1 v1Var = this.f11189b;
                Context context = v1Var.getContext();
                gf.f.r(context, "https://" + wp.r1(v1Var.Q1).U2 + "/nft/" + v1Var.f11314v2.slug);
                return;
            case 1:
                v1 v1Var2 = this.f11189b;
                try {
                    v1Var2.f21590c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                v1Var2.f11299g2.c(v1Var2.C2);
                return;
            default:
                this.f11189b.G2[0].setVisibility(8);
                return;
        }
    }
}
