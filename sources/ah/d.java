package ah;

import ai.v2;
import ai.z0;
import android.view.View;
import bi.f5;
import bi.s2;
import bi.t0;
import bi.x0;
import ch.b0;
import di.bb;
import di.db;
import di.e5;
import di.e9;
import di.i1;
import di.mb;
import di.s0;
import di.u2;
import di.v0;
import di.y5;
import fi.b9;
import fi.c1;
import fi.c2;
import fi.i9;
import fi.m8;
import fi.o5;
import fi.r8;
import hi.ia;
import hi.u0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class d implements View.OnClickListener {
    public final int f1063a;
    public final Object f1064b;

    public d(Object obj, int i7) {
        this.f1063a = i7;
        this.f1064b = obj;
    }

    @Override
    public final void onClick(View view) {
        e2 Q;
        e2 Q2;
        switch (this.f1063a) {
            case 0:
                Runnable runnable = ((e) this.f1064b).f1068e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                v2 v2Var = (v2) this.f1064b;
                v2Var.getClass();
                DictationAsr.T(!DictationAsr.v());
                v2Var.e0();
                return;
            case 2:
                ((androidx.mediarouter.app.g) this.f1064b).dismiss();
                return;
            case 3:
                ((bi.e) this.f1064b).dismiss();
                return;
            case 4:
                ((t0) this.f1064b).dismiss();
                return;
            case 5:
                ((x0) this.f1064b).c(null);
                return;
            case 6:
                if (((s2) this.f1064b).f3842a2.f8264e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    Q.showAsSheet(new mb(), obj);
                    return;
                }
                return;
            case 7:
                ((f5) this.f1064b).performClick();
                return;
            case 8:
                b0 b0Var = (b0) this.f1064b;
                if (b0Var.f5016k) {
                    b0Var.d();
                    return;
                }
                return;
            case 9:
                ((ci.n) this.f1064b).f5438c.f5476b.f5378a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 10:
                ((p20) this.f1064b).dismiss();
                return;
            case 11:
                ((s0) this.f1064b).dismiss();
                return;
            case 12:
                v0 v0Var = (v0) this.f1064b;
                cg.b bVar = v0Var.f9565z1.f4985a;
                cg.b bVar2 = cg.b.f4988b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.f4987a;
                }
                v0Var.J0(cg.a.i(0L, bVar2), true, false, true);
                v0Var.n1.setText("");
                return;
            case 13:
                ((i1) this.f1064b).dismiss();
                return;
            case 14:
                ((u2) this.f1064b).run();
                return;
            case 15:
                ((u2) this.f1064b).run();
                return;
            case 16:
                e5 e5Var = (e5) this.f1064b;
                e5Var.getClass();
                new db(e5Var.f8454b, e5Var.f8458g).show();
                return;
            case 17:
                ((y5) this.f1064b).dismiss();
                return;
            case 18:
                ((e9) this.f1064b).run();
                return;
            case 19:
                if (((bb) ((a) this.f1064b).f1056c).f8264e > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f28476a = true;
                    Q2.showAsSheet(new mb(), obj2);
                    return;
                }
                return;
            case 20:
                c2 c2Var = (c2) this.f1064b;
                c2Var.q(!c2Var.f12386g0, true);
                return;
            case 21:
                ((i9) this.f1064b).T();
                return;
            case 22:
                ((o5) this.f1064b).dismiss();
                e2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new ug.x0(Q3, 14, false));
                    return;
                }
                return;
            case 23:
                m8 m8Var = (m8) this.f1064b;
                m8Var.onClick(m8Var.f12036b);
                return;
            case 24:
                r8 r8Var = (r8) this.f1064b;
                r8Var.f12289b.f11876u1.animate().alpha(0.0f).setDuration(150L).setListener(new b9(r8Var, 0)).start();
                return;
            case 25:
                ((c1) this.f1064b).run();
                return;
            case 26:
                hi.m mVar = (hi.m) this.f1064b;
                hi.g gVar = mVar.f14623f;
                gVar.d();
                gVar.k(true);
                hi.e eVar = mVar.f14620d0;
                g0.r(eVar);
                eVar.run();
                return;
            case 27:
                ((ia) this.f1064b).B();
                return;
            case 28:
                u0.a((u0) this.f1064b);
                return;
            default:
                ((z0) this.f1064b).run();
                return;
        }
    }
}
