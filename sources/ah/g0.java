package ah;

import ai.a2;
import ai.bd;
import ai.cd;
import ai.ed;
import ai.h7;
import ai.l6;
import ai.ma;
import ai.nd;
import ai.s3;
import android.view.View;
import ci.d9;
import ci.f6;
import ci.i9;
import ci.m2;
import ci.s9;
import ci.z9;
import ei.a9;
import ei.j6;
import ei.k6;
import ei.lb;
import ei.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.xd;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kf;
public final class g0 implements View.OnClickListener {
    public final int f739a;
    public final Object f740b;

    public g0(Object obj, int i10) {
        this.f739a = i10;
        this.f740b = obj;
    }

    @Override
    public final void onClick(View view) {
        o2 R;
        Utilities.Callback callback;
        switch (this.f739a) {
            case 0:
                t0 t0Var = (t0) this.f740b;
                if (t0Var.f876k) {
                    t0Var.d();
                    return;
                }
                return;
            case 1:
                ((ai.o0) this.f740b).dismiss();
                return;
            case 2:
                ((ai.h1) this.f740b).dismiss();
                return;
            case 3:
                ai.l1 l1Var = (ai.l1) this.f740b;
                ag.b bVar = l1Var.E.f631a;
                ag.b bVar2 = ag.b.f634b;
                if (bVar == bVar2) {
                    bVar2 = ag.b.f633a;
                }
                l1Var.n(ag.a.i(0L, bVar2), true, false, true);
                l1Var.f1668c.setText("");
                return;
            case 4:
                ((a2) this.f740b).dismiss();
                return;
            case 5:
                ((s3) this.f740b).run();
                return;
            case 6:
                ((s3) this.f740b).run();
                return;
            case 7:
                l6 l6Var = (l6) this.f740b;
                l6Var.getClass();
                new ed(l6Var.f1696b, l6Var.f1699g).show();
                return;
            case 8:
                ((h7) this.f740b).dismiss();
                return;
            case 9:
                ((ma) this.f740b).run();
                return;
            case 10:
                if (((bd) ((cd) this.f740b).d).f1055f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21637a = true;
                    R.showAsSheet(new nd(), obj);
                    return;
                }
                return;
            case 11:
                ((androidx.mediarouter.app.g) this.f740b).dismiss();
                return;
            case 12:
                m2 m2Var = (m2) this.f740b;
                m2Var.q(!m2Var.f6088f0, true);
                return;
            case 13:
                ((z9) this.f740b).N();
                return;
            case 14:
                ((f6) this.f740b).dismiss();
                o2 R2 = LaunchActivity.R();
                if (R2 != null) {
                    R2.showDialog(new sg.y0(R2, 14, false));
                    return;
                }
                return;
            case 15:
                d9 d9Var = (d9) this.f740b;
                d9Var.onClick(d9Var.f5262b);
                return;
            case 16:
                i9 i9Var = (i9) this.f740b;
                i9Var.f5460b.f6266u1.animate().alpha(0.0f).setDuration(150L).setListener(new s9(i9Var, 0)).start();
                return;
            case 17:
                ((com.google.firebase.messaging.s) this.f740b).run();
                return;
            case 18:
                ei.m mVar = (ei.m) this.f740b;
                ei.g gVar = mVar.f9410f;
                gVar.d();
                gVar.k(true);
                ei.e eVar = mVar.f9407c0;
                AndroidUtilities.cancelRunOnUIThread(eVar);
                eVar.run();
                return;
            case 19:
                ((lb) this.f740b).B();
                return;
            case 20:
                ei.u0.a((ei.u0) this.f740b);
                return;
            case 21:
                ((o) this.f740b).run();
                return;
            case 22:
                k6 k6Var = ((j6) this.f740b).f9267x;
                if (k6Var.f9330r && (callback = k6Var.f9328f) != null) {
                    callback.run(5);
                    return;
                }
                return;
            case 23:
                a9 a9Var = (a9) ((x8) this.f740b).h;
                if (a9Var != null) {
                    a9Var.run();
                    return;
                }
                return;
            case 24:
                ((kf) this.f740b).run();
                return;
            case 25:
                ((kf) this.f740b).run();
                return;
            case 26:
                ChatActivityEnterView.f(((xd) ((gi.n0) this.f740b).d).f32562a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 27:
                ((ai.y0) this.f740b).run();
                return;
            case 28:
                hg.m mVar2 = (hg.m) this.f740b;
                MessagesController.getInstance(mVar2.F).hintDialogs.clear();
                MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
                mVar2.l();
                return;
            default:
                ((hg.v) this.f740b).run();
                return;
        }
    }
}
