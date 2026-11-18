package ah;

import ai.w0;
import ai.x2;
import android.view.View;
import android.widget.TextView;
import bi.j7;
import bi.m7;
import bi.t0;
import bi.x0;
import ch.b0;
import di.b6;
import di.c3;
import di.eb;
import di.g9;
import di.gb;
import di.h1;
import di.h5;
import di.o0;
import di.pb;
import di.r0;
import di.u0;
import fi.a2;
import fi.f9;
import fi.j8;
import fi.m5;
import fi.o8;
import fi.y8;
import hi.ja;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import ug.z0;
public final class d implements View.OnClickListener {
    public final int f1062a;
    public final Object f1063b;

    public d(Object obj, int i7) {
        this.f1062a = i7;
        this.f1063b = obj;
    }

    @Override
    public final void onClick(View view) {
        h2 Q;
        h2 Q2;
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
                x2 x2Var = (x2) this.f1063b;
                x2Var.getClass();
                DictationAsr.T(!DictationAsr.v());
                x2Var.e0();
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
                ((x0) this.f1063b).c(null);
                return;
            case 6:
                bi.a2 a2Var2 = (bi.a2) this.f1063b;
                LinkedHashMap linkedHashMap = a2Var2.f3380a2;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.values());
                    a2Var2.dismiss();
                    a2Var2.V1.f4175c.a(arrayList);
                    return;
                }
                return;
            case 7:
                if (((j7) this.f1063b).f3783n > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    Q.showAsSheet(new pb(), obj);
                    return;
                }
                return;
            case 8:
                ((m7) this.f1063b).performClick();
                return;
            case 9:
                b0 b0Var = (b0) this.f1063b;
                if (b0Var.f5305k) {
                    b0Var.d();
                    return;
                }
                return;
            case 10:
                ((ci.n) this.f1063b).f5725c.f5761b.f5668a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 11:
                ((x20) this.f1063b).dismiss();
                return;
            case 12:
                o0 o0Var = (o0) this.f1063b;
                TextView textView = o0Var.f9410u1;
                y60 G = y60.G(o0Var.f30195c, o0Var.J0, textView);
                int[] iArr = o0.H1;
                int i7 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i7 < 6) {
                        int i10 = iArr[i7];
                        if (i10 != o0Var.C1) {
                            z10 = false;
                        }
                        G.i(new w0(o0Var, i10, 5), gd.G(i10 / 3600, "GiftOfferHours", new Object[0]), z10);
                        i7++;
                    } else {
                        G.W(5);
                        o0Var.I0(textView, G, true);
                        return;
                    }
                }
            case 13:
                ((r0) this.f1063b).dismiss();
                return;
            case 14:
                u0 u0Var = (u0) this.f1063b;
                cg.b bVar = u0Var.f9844z1.f5274a;
                cg.b bVar2 = cg.b.f5277b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.f5276a;
                }
                u0Var.K0(cg.a.j(0L, bVar2), true, false, true);
                u0Var.n1.setText("");
                return;
            case 15:
                ((h1) this.f1063b).dismiss();
                return;
            case 16:
                ((c3) this.f1063b).run();
                return;
            case 17:
                ((c3) this.f1063b).run();
                return;
            case 18:
                h5 h5Var = (h5) this.f1063b;
                h5Var.getClass();
                new gb(h5Var.f8925b, h5Var.f8929g).show();
                return;
            case 19:
                ((b6) this.f1063b).dismiss();
                return;
            case 20:
                ((g9) this.f1063b).run();
                return;
            case 21:
                if (((eb) ((a) this.f1063b).f1055c).f8731e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28923a = true;
                    Q2.showAsSheet(new pb(), obj2);
                    return;
                }
                return;
            case 22:
                ((a2) this.f1063b).q(!a2Var.f12568g0, true);
                return;
            case 23:
                ((f9) this.f1063b).T();
                return;
            case 24:
                ((m5) this.f1063b).dismiss();
                h2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new z0(Q3, 14, false));
                    return;
                }
                return;
            case 25:
                j8 j8Var = (j8) this.f1063b;
                j8Var.onClick(j8Var.f12163b);
                return;
            case 26:
                o8 o8Var = (o8) this.f1063b;
                o8Var.f12348b.f12001u1.animate().alpha(0.0f).setDuration(150L).setListener(new y8(o8Var, 0)).start();
                return;
            case 27:
                ((f2.a) this.f1063b).run();
                return;
            case 28:
                hi.n nVar = (hi.n) this.f1063b;
                hi.g gVar = nVar.f15051f;
                gVar.d();
                gVar.k(true);
                hi.e eVar = nVar.f15048d0;
                g0.r(eVar);
                eVar.run();
                return;
            default:
                ((ja) this.f1063b).B();
                return;
        }
    }
}
