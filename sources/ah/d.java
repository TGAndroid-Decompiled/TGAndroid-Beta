package ah;

import ai.d0;
import ai.e0;
import ai.s;
import android.view.View;
import bi.dd;
import bi.e1;
import bi.g7;
import bi.h1;
import bi.k6;
import bi.o3;
import bi.oa;
import bi.sc;
import bi.uc;
import bi.w1;
import ch.b0;
import di.f8;
import di.g2;
import di.j9;
import di.q9;
import di.u8;
import di.x5;
import di.z8;
import fi.a8;
import fi.d8;
import fi.la;
import fi.r5;
import fi.s5;
import fi.t0;
import hi.k0;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.jd;
import org.telegram.ui.Components.n20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.af;
import ug.w0;
public final class d implements View.OnClickListener {
    public final int f1065a;
    public final Object f1066b;

    public d(Object obj, int i7) {
        this.f1065a = i7;
        this.f1066b = obj;
    }

    @Override
    public final void onClick(View view) {
        f2 Q;
        c20 c20Var;
        switch (this.f1065a) {
            case 0:
                Runnable runnable = ((e) this.f1066b).f1070e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((s) this.f1066b).f1612c.f1672b.f1598a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 2:
                ((androidx.mediarouter.app.g) this.f1066b).dismiss();
                return;
            case 3:
                ((n20) this.f1066b).dismiss();
                return;
            case 4:
                ((e1) this.f1066b).dismiss();
                return;
            case 5:
                h1 h1Var = (h1) this.f1066b;
                cg.b bVar = h1Var.f3984v1.f6158a;
                cg.b bVar2 = cg.b.f6161b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.f6160a;
                }
                h1Var.J0(cg.a.i(0L, bVar2), true, false, true);
                h1Var.f3974j1.setText("");
                return;
            case 6:
                ((w1) this.f1066b).dismiss();
                return;
            case 7:
                ((o3) this.f1066b).run();
                return;
            case 8:
                ((o3) this.f1066b).run();
                return;
            case 9:
                k6 k6Var = (k6) this.f1066b;
                k6Var.getClass();
                new uc(k6Var.f4148b, k6Var.f4152g).show();
                return;
            case 10:
                ((g7) this.f1066b).dismiss();
                return;
            case 11:
                ((oa) this.f1066b).run();
                return;
            case 12:
                if (((sc) ((a) this.f1066b).f1058c).f4723e > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27408a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            case 13:
                b0 b0Var = (b0) this.f1066b;
                if (b0Var.f6189k) {
                    b0Var.d();
                    return;
                }
                return;
            case 14:
                g2 g2Var = (g2) this.f1066b;
                g2Var.q(!g2Var.f9811f0, true);
                return;
            case 15:
                ((q9) this.f1066b).T();
                return;
            case 16:
                ((x5) this.f1066b).dismiss();
                f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new w0(Q2, 14, false));
                    return;
                }
                return;
            case 17:
                u8 u8Var = (u8) this.f1066b;
                u8Var.onClick(u8Var.f9837b);
                return;
            case 18:
                z8 z8Var = (z8) this.f1066b;
                z8Var.f10019b.f9638t1.animate().alpha(0.0f).setDuration(150L).setListener(new j9(z8Var, 0)).start();
                return;
            case 19:
                ((f8) this.f1066b).run();
                return;
            case 20:
                fi.m mVar = (fi.m) this.f1066b;
                fi.g gVar = mVar.f12366f;
                gVar.d();
                gVar.k(true);
                fi.e eVar = mVar.f12362c0;
                g0.r(eVar);
                eVar.run();
                return;
            case 21:
                ((la) this.f1066b).B();
                return;
            case 22:
                t0.a((t0) this.f1066b);
                return;
            case 23:
                ((e0) this.f1066b).run();
                return;
            case 24:
                s5 s5Var = ((r5) this.f1066b).f12743y;
                if (s5Var.f12795r && (c20Var = s5Var.f12793f) != null) {
                    c20Var.a(5);
                    return;
                }
                return;
            case 25:
                d8 d8Var = (d8) ((a8) this.f1066b).h;
                if (d8Var != null) {
                    d8Var.run();
                    return;
                }
                return;
            case 26:
                ((af) this.f1066b).run();
                return;
            case 27:
                ((af) this.f1066b).run();
                return;
            case 28:
                ChatActivityEnterView.e(((jd) ((k0) this.f1066b).d).f34983a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            default:
                ((d0) this.f1066b).run();
                return;
        }
    }
}
