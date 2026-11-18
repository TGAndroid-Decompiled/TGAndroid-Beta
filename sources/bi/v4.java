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
public final class v4 implements View.OnClickListener {
    public final int f4124a;
    public final z4 f4125b;

    public v4(z4 z4Var, int i7) {
        this.f4124a = i7;
        this.f4125b = z4Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i7 = this.f4124a;
        z4 z4Var = this.f4125b;
        switch (i7) {
            case 0:
                TextView textView = z4Var.f4283v1;
                y60 G = y60.G(z4Var.f30193c, z4Var.J0, textView);
                int[] iArr = z4.A1;
                for (int i10 = 0; i10 < 6; i10++) {
                    int i11 = iArr[i10];
                    if (i11 == z4Var.f4286y1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    G.i(new ai.w0(z4Var, i11, 3), gd.G(i11 / 3600, "GiftOfferHours", new Object[0]), z10);
                }
                G.W(5);
                z4Var.I0(textView, G, true);
                return;
            case 1:
                z4 z4Var2 = this.f4125b;
                hi.d dVar = z4Var2.f4284w1;
                if (dVar.f14339e0 && !dVar.R) {
                    if (mp.u1(z4Var2.f30187a).A2()) {
                        org.telegram.ui.b.b(z4Var2.f30187a);
                        return;
                    }
                    org.telegram.messenger.g0.v1(z4Var2.f4280s1);
                    long j3 = z4Var2.f4285x1;
                    int i12 = z4Var2.f4286y1;
                    dVar.setLoading(true);
                    int i13 = z4Var2.f30187a;
                    String str = z4Var2.f4275m1.slug;
                    x4 x4Var = new x4(z4Var2, j3, i12, 0);
                    HashMap hashMap = e4.f3543a;
                    zy.C(i13);
                    long E = zy.E();
                    tr a02 = tr.a0(i13);
                    a02.f27052a.c(new i9(a02, E, str, j3, i12, x4Var));
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6.N0(z4Var.f30187a, z4Var.getContext(), z4Var.J0);
                return;
        }
    }
}
