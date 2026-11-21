package bi;

import android.view.View;
import android.widget.TextView;
import di.j9;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.ui.Components.a70;
public final class z4 implements View.OnClickListener {
    public final int f4333a;
    public final d5 f4334b;

    public z4(d5 d5Var, int i7) {
        this.f4333a = i7;
        this.f4334b = d5Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f4333a;
        d5 d5Var = this.f4334b;
        switch (i7) {
            case 0:
                TextView textView = d5Var.f3518v1;
                a70 G = a70.G(d5Var.f30176c, d5Var.J0, textView);
                int[] iArr = d5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    if (i11 == d5Var.f3521y1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G.i(new ai.y0(d5Var, i11, 3), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), z10);
                }
                G.W(5);
                d5Var.I0(textView, G, true);
                return;
            case 1:
                d5 d5Var2 = this.f4334b;
                hi.e eVar = d5Var2.f3519w1;
                if (eVar.f14564e0 && !eVar.R) {
                    if (mp.u1(d5Var2.f30170a).A2()) {
                        org.telegram.ui.b.b(d5Var2.f30170a);
                        return;
                    }
                    org.telegram.messenger.g0.v1(d5Var2.f3515s1);
                    long j3 = d5Var2.f3520x1;
                    int i12 = d5Var2.f3521y1;
                    eVar.setLoading(true);
                    int i13 = d5Var2.f30170a;
                    String str = d5Var2.f3510m1.slug;
                    b5 b5Var = new b5(d5Var2, j3, i12, 0);
                    HashMap hashMap = i4.f3720a;
                    zy.C(i13);
                    long E = zy.E();
                    tr a02 = tr.a0(i13);
                    a02.f27080a.c(new j9(a02, E, str, j3, i12, b5Var));
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6.N0(d5Var.f30170a, d5Var.getContext(), d5Var.J0);
                return;
        }
    }
}
