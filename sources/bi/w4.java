package bi;

import android.view.View;
import android.widget.TextView;
import di.i9;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.ui.Components.y60;
public final class w4 implements View.OnClickListener {
    public final int f4182a;
    public final a5 f4183b;

    public w4(a5 a5Var, int i7) {
        this.f4182a = i7;
        this.f4183b = a5Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f4182a;
        a5 a5Var = this.f4183b;
        switch (i7) {
            case 0:
                TextView textView = a5Var.f3410v1;
                y60 G = y60.G(a5Var.f30195c, a5Var.J0, textView);
                int[] iArr = a5.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    if (i11 == a5Var.f3413y1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G.i(new ai.w0(a5Var, i11, 3), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), z10);
                }
                G.W(5);
                a5Var.I0(textView, G, true);
                return;
            case 1:
                a5 a5Var2 = this.f4183b;
                hi.d dVar = a5Var2.f3411w1;
                if (dVar.f14342e0 && !dVar.R) {
                    if (mp.u1(a5Var2.f30189a).A2()) {
                        org.telegram.ui.b.b(a5Var2.f30189a);
                        return;
                    }
                    org.telegram.messenger.g0.v1(a5Var2.f3407s1);
                    long j3 = a5Var2.f3412x1;
                    int i12 = a5Var2.f3413y1;
                    dVar.setLoading(true);
                    int i13 = a5Var2.f30189a;
                    String str = a5Var2.f3402m1.slug;
                    y4 y4Var = new y4(a5Var2, j3, i12, 0);
                    HashMap hashMap = f4.f3607a;
                    zy.C(i13);
                    long E = zy.E();
                    tr a02 = tr.a0(i13);
                    a02.f27054a.c(new i9(a02, E, str, j3, i12, y4Var));
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6.N0(a5Var.f30189a, a5Var.getContext(), a5Var.J0);
                return;
        }
    }
}
