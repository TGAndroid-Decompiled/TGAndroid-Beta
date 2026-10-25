package ai;

import android.view.View;
import bi.d7;
import bi.dd;
import bi.g6;
import bi.ma;
import bi.o3;
import bi.rc;
import bi.sc;
import bi.uc;
import bi.x1;
import di.c9;
import di.f6;
import di.h9;
import di.m2;
import di.r9;
import di.s8;
import di.y9;
import fi.h6;
import fi.i6;
import fi.ib;
import fi.t8;
import fi.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.kf;
public final class s implements View.OnClickListener {
    public final int f1668a;
    public final Object f1669b;

    public s(Object obj, int i10) {
        this.f1668a = i10;
        this.f1669b = obj;
    }

    @Override
    public final void onClick(View view) {
        r2 R;
        Utilities.Callback callback;
        switch (this.f1668a) {
            case 0:
                ((t) this.f1669b).f1677c.f1971b.f1963a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 1:
                ((androidx.mediarouter.app.h) this.f1669b).dismiss();
                return;
            case 2:
                bh.i0 i0Var = (bh.i0) this.f1669b;
                if (i0Var.f4054k) {
                    i0Var.d();
                    return;
                }
                return;
            case 3:
                ((bi.q0) this.f1669b).dismiss();
                return;
            case 4:
                ((bi.g1) this.f1669b).dismiss();
                return;
            case 5:
                bi.k1 k1Var = (bi.k1) this.f1669b;
                bg.b bVar = k1Var.E.f3978a;
                bg.b bVar2 = bg.b.f3981b;
                if (bVar == bVar2) {
                    bVar2 = bg.b.f3980a;
                }
                k1Var.n(bg.a.i(0L, bVar2), true, false, true);
                k1Var.f4934c.setText("");
                return;
            case 6:
                ((x1) this.f1669b).dismiss();
                return;
            case 7:
                ((o3) this.f1669b).run();
                return;
            case 8:
                ((o3) this.f1669b).run();
                return;
            case 9:
                g6 g6Var = (g6) this.f1669b;
                g6Var.getClass();
                new uc(g6Var.f4662b, g6Var.f4665g).show();
                return;
            case 10:
                ((d7) this.f1669b).dismiss();
                return;
            case 11:
                ((ma) this.f1669b).run();
                return;
            case 12:
                if (((rc) ((sc) this.f1669b).d).f5374f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f22926a = true;
                    R.showAsSheet(new dd(), obj);
                    return;
                }
                return;
            case 13:
                m2 m2Var = (m2) this.f1669b;
                m2Var.q(!m2Var.f9349f0, true);
                return;
            case 14:
                ((y9) this.f1669b).N();
                return;
            case 15:
                ((f6) this.f1669b).dismiss();
                r2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.showDialog(new tg.y0(R2, 14, false));
                    return;
                }
                return;
            case 16:
                c9 c9Var = (c9) this.f1669b;
                c9Var.onClick(c9Var.f8464b);
                return;
            case 17:
                h9 h9Var = (h9) this.f1669b;
                h9Var.f8656b.f9462u1.animate().alpha(0.0f).setDuration(150L).setListener(new r9(h9Var, 0)).start();
                return;
            case 18:
                ((s8) this.f1669b).run();
                return;
            case 19:
                fi.m mVar = (fi.m) this.f1669b;
                fi.g gVar = mVar.f11199f;
                gVar.d();
                gVar.k(true);
                fi.e eVar = mVar.f11196c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 20:
                ((ib) this.f1669b).B();
                return;
            case 21:
                fi.u0.a((fi.u0) this.f1669b);
                return;
            case 22:
                ((h0) this.f1669b).run();
                return;
            case 23:
                i6 i6Var = ((h6) this.f1669b).f10961x;
                if (i6Var.f11002r && (callback = i6Var.f11000f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 24:
                w8 w8Var = (w8) ((t8) this.f1669b).h;
                if (w8Var != null) {
                    w8Var.run();
                    return;
                }
                return;
            case 25:
                ((kf) this.f1669b).run();
                return;
            case 26:
                ((kf) this.f1669b).run();
                return;
            case 27:
                ChatActivityEnterView.f(((ae) ((hi.u0) this.f1669b).d).f26488a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 28:
                ((e0) this.f1669b).run();
                return;
            default:
                ig.n nVar = (ig.n) this.f1669b;
                MessagesController.getInstance(nVar.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                nVar.l();
                return;
        }
    }
}
