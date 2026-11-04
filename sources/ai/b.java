package ai;

import android.view.View;
import ci.lb;
import ci.n9;
import ci.nb;
import ci.wb;
import ei.k9;
import ei.r9;
import ei.t8;
import ei.z8;
import gi.c8;
import gi.la;
import gi.z7;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.i20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.xe;
public final class b implements View.OnClickListener {
    public final int f498a;
    public final Object f499b;

    public b(Object obj, int i3) {
        this.f498a = i3;
        this.f499b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.d2 Q;
        org.telegram.ui.ActionBar.d2 Q2;
        u10 u10Var;
        switch (this.f498a) {
            case 0:
                ((g) this.f499b).dismiss();
                return;
            case 1:
                ((z0) this.f499b).dismiss();
                return;
            case 2:
                if (((b3) this.f499b).X1.f5510f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    Q.showAsSheet(new wb(), obj);
                    return;
                }
                return;
            case 3:
                ((androidx.mediarouter.app.g) this.f499b).dismiss();
                return;
            case 4:
                Runnable runnable = ((bh.d) this.f499b).f3310e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((bi.n) this.f499b).f3800c.f3839b.f3743a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 6:
                ((i20) this.f499b).dismiss();
                return;
            case 7:
                ((ci.x0) this.f499b).dismiss();
                return;
            case 8:
                ci.a1 a1Var = (ci.a1) this.f499b;
                dg.b bVar = a1Var.f4802w1.f8923a;
                dg.b bVar2 = dg.b.f8926b;
                if (bVar == bVar2) {
                    bVar2 = dg.b.f8925a;
                }
                a1Var.J0(dg.a.i(0L, bVar2), true, false, true);
                a1Var.k1.setText("");
                return;
            case 9:
                ((ci.p1) this.f499b).dismiss();
                return;
            case 10:
                ((ci.b3) this.f499b).run();
                return;
            case 11:
                ((ci.b3) this.f499b).run();
                return;
            case 12:
                ci.n5 n5Var = (ci.n5) this.f499b;
                n5Var.getClass();
                new nb(n5Var.f5594b, n5Var.f5598g).show();
                return;
            case 13:
                ((ci.h6) this.f499b).dismiss();
                return;
            case 14:
                ((n9) this.f499b).run();
                return;
            case 15:
                if (((lb) ((bh.a) this.f499b).f3300c).f5510f > 0 && (Q2 = LaunchActivity.Q()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f27395a = true;
                    Q2.showAsSheet(new wb(), obj2);
                    return;
                }
                return;
            case 16:
                dh.a0 a0Var = (dh.a0) this.f499b;
                if (a0Var.f8939k) {
                    a0Var.d();
                    return;
                }
                return;
            case 17:
                ei.k2 k2Var = (ei.k2) this.f499b;
                k2Var.q(!k2Var.f11157g0, true);
                return;
            case 18:
                ((r9) this.f499b).b0();
                return;
            case 19:
                ((ei.w5) this.f499b).dismiss();
                org.telegram.ui.ActionBar.d2 Q3 = LaunchActivity.Q();
                if (Q3 != null) {
                    Q3.showDialog(new vg.v0(Q3, 14, false));
                    return;
                }
                return;
            case 20:
                t8 t8Var = (t8) this.f499b;
                t8Var.onClick(t8Var.f11056b);
                return;
            case 21:
                z8 z8Var = (z8) this.f499b;
                z8Var.f11301b.f10956v1.animate().alpha(0.0f).setDuration(150L).setListener(new k9(z8Var, 0)).start();
                return;
            case 22:
                ((ei.z5) this.f499b).run();
                return;
            case 23:
                gi.m mVar = (gi.m) this.f499b;
                gi.g gVar = mVar.f13144f;
                gVar.d();
                gVar.k(true);
                gi.e eVar = mVar.f13141d0;
                org.telegram.messenger.g0.r(eVar);
                eVar.run();
                return;
            case 24:
                ((la) this.f499b).B();
                return;
            case 25:
                gi.t0.a((gi.t0) this.f499b);
                return;
            case 26:
                ((e3) this.f499b).run();
                return;
            case 27:
                gi.q5 q5Var = ((gi.p5) this.f499b).f13380y;
                if (q5Var.f13433r && (u10Var = q5Var.f13431f) != null) {
                    u10Var.a(5);
                    return;
                }
                return;
            case 28:
                c8 c8Var = (c8) ((z7) this.f499b).h;
                if (c8Var != null) {
                    c8Var.run();
                    return;
                }
                return;
            default:
                ((xe) this.f499b).run();
                return;
        }
    }
}
