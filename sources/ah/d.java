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
import di.g2;
import di.i9;
import di.p9;
import di.s7;
import di.t8;
import di.w5;
import di.y8;
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
import org.telegram.ui.Components.m20;
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
                ((m20) this.f1066b).dismiss();
                return;
            case 4:
                ((e1) this.f1066b).dismiss();
                return;
            case 5:
                h1 h1Var = (h1) this.f1066b;
                cg.b bVar = h1Var.f3984v1.f6160a;
                cg.b bVar2 = cg.b.f6163b;
                if (bVar == bVar2) {
                    bVar2 = cg.b.f6162a;
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
                if (((sc) ((a) this.f1066b).f1058c).f4724f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f27424a = true;
                    Q.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            case 13:
                b0 b0Var = (b0) this.f1066b;
                if (b0Var.f6191k) {
                    b0Var.d();
                    return;
                }
                return;
            case 14:
                g2 g2Var = (g2) this.f1066b;
                g2Var.q(!g2Var.f9819f0, true);
                return;
            case 15:
                ((p9) this.f1066b).T();
                return;
            case 16:
                ((w5) this.f1066b).dismiss();
                f2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new w0(Q2, 14, false));
                    return;
                }
                return;
            case 17:
                t8 t8Var = (t8) this.f1066b;
                t8Var.onClick(t8Var.f9795b);
                return;
            case 18:
                y8 y8Var = (y8) this.f1066b;
                y8Var.f9992b.f9573t1.animate().alpha(0.0f).setDuration(150L).setListener(new i9(y8Var, 0)).start();
                return;
            case 19:
                ((s7) this.f1066b).run();
                return;
            case 20:
                fi.m mVar = (fi.m) this.f1066b;
                fi.g gVar = mVar.f12365f;
                gVar.d();
                gVar.k(true);
                fi.e eVar = mVar.f12361c0;
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
                s5 s5Var = ((r5) this.f1066b).f12742y;
                if (s5Var.f12796r && (c20Var = s5Var.f12794f) != null) {
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
                ChatActivityEnterView.e(((jd) ((k0) this.f1066b).d).f34955a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            default:
                ((d0) this.f1066b).run();
                return;
        }
    }
}
