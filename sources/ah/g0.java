package ah;

import ai.a2;
import ai.ad;
import ai.cd;
import ai.g7;
import ai.k6;
import ai.ka;
import ai.ld;
import ai.x3;
import ai.zc;
import android.view.View;
import ci.aa;
import ci.e9;
import ci.g6;
import ci.j9;
import ci.t9;
import ei.a9;
import ei.j6;
import ei.lb;
import ei.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.zd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mf;
public final class g0 implements View.OnClickListener {
    public final int f740a;
    public final Object f741b;

    public g0(Object obj, int i10) {
        this.f740a = i10;
        this.f741b = obj;
    }

    @Override
    public final void onClick(View view) {
        n2 R;
        Utilities.Callback callback;
        switch (this.f740a) {
            case 0:
                t0 t0Var = (t0) this.f741b;
                if (t0Var.f877k) {
                    t0Var.d();
                    return;
                }
                return;
            case 1:
                ((ai.o0) this.f741b).dismiss();
                return;
            case 2:
                ((ai.h1) this.f741b).dismiss();
                return;
            case 3:
                ai.l1 l1Var = (ai.l1) this.f741b;
                ag.c cVar = l1Var.E.f631a;
                ag.c cVar2 = ag.c.f636b;
                if (cVar == cVar2) {
                    cVar2 = ag.c.f635a;
                }
                l1Var.o(ag.a.i(0L, cVar2), true, false, true);
                l1Var.f1750c.setText("");
                return;
            case 4:
                ((a2) this.f741b).dismiss();
                return;
            case 5:
                ((x3) this.f741b).run();
                return;
            case 6:
                ((x3) this.f741b).run();
                return;
            case 7:
                k6 k6Var = (k6) this.f741b;
                k6Var.getClass();
                new cd(k6Var.f1651b, k6Var.f1654g).show();
                return;
            case 8:
                ((g7) this.f741b).dismiss();
                return;
            case 9:
                ((ka) this.f741b).run();
                return;
            case 10:
                if (((zc) ((ad) this.f741b).d).f2554f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    R.showAsSheet(new ld(), obj);
                    return;
                }
                return;
            case 11:
                ((androidx.mediarouter.app.g) this.f741b).dismiss();
                return;
            case 12:
                ci.n2 n2Var = (ci.n2) this.f741b;
                n2Var.q(!n2Var.f6140f0, true);
                return;
            case 13:
                ((aa) this.f741b).N();
                return;
            case 14:
                ((g6) this.f741b).dismiss();
                n2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.showDialog(new sg.x0(R2, 14, false));
                    return;
                }
                return;
            case 15:
                e9 e9Var = (e9) this.f741b;
                e9Var.onClick(e9Var.f5363b);
                return;
            case 16:
                j9 j9Var = (j9) this.f741b;
                j9Var.f5554b.f5222u1.animate().alpha(0.0f).setDuration(150L).setListener(new t9(j9Var, 0)).start();
                return;
            case 17:
                ((com.google.firebase.messaging.s) this.f741b).run();
                return;
            case 18:
                ei.m mVar = (ei.m) this.f741b;
                ei.g gVar = mVar.f9401f;
                gVar.d();
                gVar.k(true);
                ei.e eVar = mVar.f9398c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 19:
                ((lb) this.f741b).B();
                return;
            case 20:
                ei.u0.a((ei.u0) this.f741b);
                return;
            case 21:
                ((o) this.f741b).run();
                return;
            case 22:
                ei.k6 k6Var2 = ((j6) this.f741b).f9258x;
                if (k6Var2.f9321r && (callback = k6Var2.f9319f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 23:
                a9 a9Var = (a9) ((x8) this.f741b).h;
                if (a9Var != null) {
                    a9Var.run();
                    return;
                }
                return;
            case 24:
                ((mf) this.f741b).run();
                return;
            case 25:
                ((mf) this.f741b).run();
                return;
            case 26:
                ChatActivityEnterView.g(((zd) ((gi.n0) this.f741b).d).f32882a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 27:
                ((ai.y0) this.f741b).run();
                return;
            case 28:
                hg.m mVar2 = (hg.m) this.f741b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            default:
                ((hg.v) this.f741b).run();
                return;
        }
    }
}
