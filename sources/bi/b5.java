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
public final class b5 implements View.OnClickListener {
    public final int f3412a;
    public final f5 f3413b;

    public b5(f5 f5Var, int i7) {
        this.f3412a = i7;
        this.f3413b = f5Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f3412a;
        f5 f5Var = this.f3413b;
        switch (i7) {
            case 0:
                TextView textView = f5Var.f3565v1;
                a70 G = a70.G(f5Var.f30145c, f5Var.J0, textView);
                int[] iArr = f5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    if (i11 == f5Var.f3568y1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G.i(new ai.t0(f5Var, i11, 4), hd.G(i11 / 3600, "GiftOfferHours", new Object[0]), z10);
                }
                G.W(5);
                f5Var.I0(textView, G, true);
                return;
            case 1:
                f5 f5Var2 = this.f3413b;
                hi.d dVar = f5Var2.f3566w1;
                if (dVar.f14303e0 && !dVar.R) {
                    if (np.u1(f5Var2.f30139a).A2()) {
                        org.telegram.ui.b.b(f5Var2.f30139a);
                        return;
                    }
                    org.telegram.messenger.g0.v1(f5Var2.f3562s1);
                    long j3 = f5Var2.f3567x1;
                    int i12 = f5Var2.f3568y1;
                    dVar.setLoading(true);
                    int i13 = f5Var2.f30139a;
                    String str = f5Var2.f3557m1.slug;
                    d5 d5Var = new d5(f5Var2, j3, i12, 0);
                    HashMap hashMap = l4.f3801a;
                    az.C(i13);
                    long E = az.E();
                    ur a02 = ur.a0(i13);
                    a02.f27214a.c(new j9(a02, E, str, j3, i12, d5Var));
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6.N0(f5Var.f30139a, f5Var.getContext(), f5Var.J0);
                return;
        }
    }
}
