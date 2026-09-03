package oh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.bb0;
public final class d0 implements il0 {
    public final int f16955a;
    public final Object f16956b;
    public final Object f16957c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f16955a = i10;
        this.f16956b = obj;
        this.f16957c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i10, View view) {
        int i11 = this.f16955a;
        boolean z4 = true;
        Object obj = this.d;
        Object obj2 = this.f16957c;
        Object obj3 = this.f16956b;
        switch (i11) {
            case 0:
                h2 h2Var = (h2) obj3;
                o0 o0Var = (o0) view;
                t0 t0Var = o0Var.H;
                q70 F = q70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(t0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new mh.m2(25, (i9) obj, t0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new mh.m2(26, h2Var, o0Var), !t0Var.f17760e);
                if (h2Var.J != UserConfig.getInstance(h2Var.K).getClientUserId() && !h2Var.f()) {
                    z4 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new mh.m2(27, h2Var, t0Var), z4);
                F.Z();
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                bb0 bb0Var = (bb0) tVar.U2.get(i10);
                if (bb0Var.f35427e && !UserConfig.hasPremiumOnAccounts()) {
                    p2Var.showDialog(new fg.n1(p2Var, 10, true));
                    return;
                } else if (!k7.j6.a(bb0Var)) {
                    f2.k0 k0Var = new f2.k0(context);
                    k0Var.f5805a = i10;
                    tVar.V2.w0(k0Var);
                    k7.j6.b(bb0Var);
                    int i12 = org.telegram.ui.Cells.s.f23606f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, bb0Var);
                    return;
                } else {
                    return;
                }
            case 2:
                qh.i6.Q((qh.i6) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.g6) obj, view, i10);
                return;
            default:
                qh.a7.P((qh.a7) obj3, (Context) obj2, (qh.i5) obj, view, i10);
                return;
        }
    }
}
