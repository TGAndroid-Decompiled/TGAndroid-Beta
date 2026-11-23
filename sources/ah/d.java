package ah;

import ai.a3;
import ai.c1;
import android.view.View;
import android.widget.TextView;
import bi.e2;
import bi.l7;
import bi.o7;
import bi.t0;
import ch.b0;
import di.b6;
import di.c3;
import di.eb;
import di.gb;
import di.h1;
import di.h5;
import di.h9;
import di.o0;
import di.pb;
import di.r0;
import di.u0;
import fi.a2;
import fi.f9;
import fi.j8;
import fi.n5;
import fi.o8;
import fi.y8;
import hi.ia;
import hi.v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import ug.y0;
public final class d implements View.OnClickListener {
    public final int f1062a;
    public final Object f1063b;

    public d(Object obj, int i7) {
        this.f1062a = i7;
        this.f1063b = obj;
    }

    @Override
    public final void onClick(View view) {
        g2 Q;
        g2 Q2;
        a2 a2Var;
        switch (this.f1062a) {
            case 0:
                Runnable runnable = ((e) this.f1063b).f1067e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                a3 a3Var = (a3) this.f1063b;
                a3Var.getClass();
                DictationAsr.Y(!DictationAsr.x());
                a3Var.e0();
                return;
            case 2:
                ((androidx.mediarouter.app.g) this.f1063b).dismiss();
                return;
            case 3:
                ((bi.e) this.f1063b).dismiss();
                return;
            case 4:
                ((t0) this.f1063b).dismiss();
                return;
            case 5:
                e2 e2Var = (e2) this.f1063b;
                LinkedHashMap linkedHashMap = e2Var.f3576a2;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.values());
                    e2Var.dismiss();
                    e2Var.V1.f3400c.a(arrayList);
                    return;
                }
                return;
            case 6:
                if (((l7) this.f1063b).f3858n > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28905a = true;
                    Q.showAsSheet(new pb(), obj);
                    return;
                }
                return;
            case 7:
                ((o7) this.f1063b).performClick();
                return;
            case 8:
                b0 b0Var = (b0) this.f1063b;
                if (b0Var.f5334k) {
                    b0Var.d();
                    return;
                }
                return;
            case 9:
                ((ci.n) this.f1063b).f5754c.f5790b.f5697a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 10:
                ((a30) this.f1063b).dismiss();
                return;
            case 11:
                o0 o0Var = (o0) this.f1063b;
                TextView textView = o0Var.f9438u1;
                a70 G = a70.G(o0Var.f30179c, o0Var.J0, textView);
                int[] iArr = o0.H1;
                int i7 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i7 < 6) {
                        int i10 = iArr[i7];
                        if (i10 != o0Var.C1) {
                            z10 = false;
                        }
                        G.i(new c1(o0Var, i10, 5), hd.G(i10 / 3600, "GiftOfferHours", new Object[0]), z10);
                        i7++;
                    } else {
                        G.W(5);
                        o0Var.I0(textView, G, true);
                        return;
                    }
                }
            case 12:
                ((r0) this.f1063b).dismiss();
                return;
            case 13:
                u0 u0Var = (u0) this.f1063b;
                cg.b bVar = u0Var.f9879z1.f5303a;
                cg.b bVar2 = cg.b.f5306b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.f5305a;
                }
                u0Var.K0(cg.a.j(0L, bVar2), true, false, true);
                u0Var.n1.setText("");
                return;
            case 14:
                ((h1) this.f1063b).dismiss();
                return;
            case 15:
                ((c3) this.f1063b).run();
                return;
            case 16:
                ((c3) this.f1063b).run();
                return;
            case 17:
                h5 h5Var = (h5) this.f1063b;
                h5Var.getClass();
                new gb(h5Var.f8956b, h5Var.f8960g).show();
                return;
            case 18:
                ((b6) this.f1063b).dismiss();
                return;
            case 19:
                ((h9) this.f1063b).run();
                return;
            case 20:
                if (((eb) ((a) this.f1063b).f1055c).f8754e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28905a = true;
                    Q2.showAsSheet(new pb(), obj2);
                    return;
                }
                return;
            case 21:
                ((a2) this.f1063b).q(!a2Var.f12609g0, true);
                return;
            case 22:
                ((f9) this.f1063b).T();
                return;
            case 23:
                ((n5) this.f1063b).dismiss();
                g2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new y0(Q3, 14, false));
                    return;
                }
                return;
            case 24:
                j8 j8Var = (j8) this.f1063b;
                j8Var.onClick(j8Var.f12202b);
                return;
            case 25:
                o8 o8Var = (o8) this.f1063b;
                o8Var.f12390b.f12042u1.animate().alpha(0.0f).setDuration(150L).setListener(new y8(o8Var, 0)).start();
                return;
            case 26:
                ((f2.a) this.f1063b).run();
                return;
            case 27:
                hi.o oVar = (hi.o) this.f1063b;
                hi.h hVar = oVar.f15151f;
                hVar.d();
                hVar.k(true);
                hi.f fVar = oVar.f15148d0;
                g0.r(fVar);
                fVar.run();
                return;
            case 28:
                ((ia) this.f1063b).B();
                return;
            default:
                v0.a((v0) this.f1063b);
                return;
        }
    }
}
