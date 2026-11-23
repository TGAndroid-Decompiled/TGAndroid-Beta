package ah;

import ai.r2;
import ai.u0;
import android.view.View;
import android.widget.TextView;
import bi.f2;
import bi.o7;
import bi.r7;
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
import fi.a2;
import fi.f9;
import fi.j8;
import fi.n5;
import fi.o8;
import fi.y8;
import hi.d1;
import hi.db;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.x60;
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
                r2 r2Var = (r2) this.f1063b;
                r2Var.getClass();
                DictationAsr.b0(!DictationAsr.z());
                r2Var.e0();
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
                f2 f2Var = (f2) this.f1063b;
                LinkedHashMap linkedHashMap = f2Var.f3528a2;
                if (!linkedHashMap.isEmpty()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.values());
                    f2Var.dismiss();
                    f2Var.V1.f3404c.a(arrayList);
                    return;
                }
                return;
            case 6:
                if (((o7) this.f1063b).f3915n > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28948a = true;
                    Q.showAsSheet(new pb(), obj);
                    return;
                }
                return;
            case 7:
                ((r7) this.f1063b).performClick();
                return;
            case 8:
                b0 b0Var = (b0) this.f1063b;
                if (b0Var.f5297k) {
                    b0Var.d();
                    return;
                }
                return;
            case 9:
                ((ci.n) this.f1063b).f5717c.f5753b.f5660a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 10:
                ((x20) this.f1063b).dismiss();
                return;
            case 11:
                o0 o0Var = (o0) this.f1063b;
                TextView textView = o0Var.f9399u1;
                x60 G = x60.G(o0Var.f30229c, o0Var.J0, textView);
                int[] iArr = o0.H1;
                int i7 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i7 < 6) {
                        int i10 = iArr[i7];
                        if (i10 != o0Var.C1) {
                            z10 = false;
                        }
                        G.i(new u0(o0Var, i10, 6), gd.G(i10 / 3600, "GiftOfferHours", new Object[0]), z10);
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
                di.u0 u0Var = (di.u0) this.f1063b;
                cg.b bVar = u0Var.f9840z1.f5266a;
                cg.b bVar2 = cg.b.f5269b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.f5268a;
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
                new gb(h5Var.f8917b, h5Var.f8921g).show();
                return;
            case 18:
                ((b6) this.f1063b).dismiss();
                return;
            case 19:
                ((h9) this.f1063b).run();
                return;
            case 20:
                if (((eb) ((a) this.f1063b).f1055c).f8715e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28948a = true;
                    Q2.showAsSheet(new pb(), obj2);
                    return;
                }
                return;
            case 21:
                ((a2) this.f1063b).q(!a2Var.f12571g0, true);
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
                j8Var.onClick(j8Var.f12164b);
                return;
            case 25:
                o8 o8Var = (o8) this.f1063b;
                o8Var.f12352b.f12004u1.animate().alpha(0.0f).setDuration(150L).setListener(new y8(o8Var, 0)).start();
                return;
            case 26:
                ((f2.a) this.f1063b).run();
                return;
            case 27:
                hi.n nVar = (hi.n) this.f1063b;
                hi.h hVar = nVar.f14936f;
                hVar.d();
                hVar.k(true);
                hi.f fVar = nVar.f14933d0;
                g0.r(fVar);
                fVar.run();
                return;
            case 28:
                ((db) this.f1063b).B();
                return;
            default:
                d1.a((d1) this.f1063b);
                return;
        }
    }
}
