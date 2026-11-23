package bi;

import android.view.View;
import android.widget.TextView;
import di.j9;
import java.util.HashMap;
import org.telegram.messenger.az;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.ui.Components.a70;
public final class y4 implements View.OnClickListener {
    public final int f4307a;
    public final c5 f4308b;

    public y4(c5 c5Var, int i7) {
        this.f4307a = i7;
        this.f4308b = c5Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f4307a;
        c5 c5Var = this.f4308b;
        switch (i7) {
            case 0:
                TextView textView = c5Var.f3494v1;
                a70 G = a70.G(c5Var.f30179c, c5Var.J0, textView);
                int[] iArr = c5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    if (i11 == c5Var.f3497y1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G.i(new ai.c1(c5Var, i11, 3), hd.G(i11 / 3600, "GiftOfferHours", new Object[0]), z10);
                }
                G.W(5);
                c5Var.I0(textView, G, true);
                return;
            case 1:
                c5 c5Var2 = this.f4308b;
                hi.e eVar = c5Var2.f3495w1;
                if (eVar.f14567e0 && !eVar.R) {
                    if (np.u1(c5Var2.f30173a).A2()) {
                        org.telegram.ui.b.b(c5Var2.f30173a);
                        return;
                    }
                    org.telegram.messenger.g0.v1(c5Var2.f3491s1);
                    long j3 = c5Var2.f3496x1;
                    int i12 = c5Var2.f3497y1;
                    eVar.setLoading(true);
                    int i13 = c5Var2.f30173a;
                    String str = c5Var2.f3486m1.slug;
                    a5 a5Var = new a5(c5Var2, j3, i12, 0);
                    HashMap hashMap = i4.f3725a;
                    az.C(i13);
                    long E = az.E();
                    ur a02 = ur.a0(i13);
                    a02.f27250a.c(new j9(a02, E, str, j3, i12, a5Var));
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6.N0(c5Var.f30173a, c5Var.getContext(), c5Var.J0);
                return;
        }
    }
}
