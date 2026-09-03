package nh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.cb0;
public final class e0 implements hl0 {
    public final int f15269a;
    public final Object f15270b;
    public final Object f15271c;
    public final Object d;

    public e0(Object obj, Object obj2, Object obj3, int i10) {
        this.f15269a = i10;
        this.f15270b = obj;
        this.f15271c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        int i11 = this.f15269a;
        boolean z4 = true;
        Object obj = this.d;
        Object obj2 = this.f15271c;
        Object obj3 = this.f15270b;
        switch (i11) {
            case 0:
                g2 g2Var = (g2) obj3;
                o0 o0Var = (o0) view;
                t0 t0Var = o0Var.H;
                p70 F = p70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(t0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new lh.n2(22, (i9) obj, t0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new lh.n2(23, g2Var, o0Var), !t0Var.e);
                if (g2Var.J != UserConfig.getInstance(g2Var.K).getClientUserId() && !g2Var.f()) {
                    z4 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new lh.n2(24, g2Var, t0Var), z4);
                F.Z();
                return;
            case 1:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                cb0 cb0Var = (cb0) tVar.U2.get(i10);
                if (cb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    p2Var.showDialog(new eg.o1(p2Var, 10, true));
                    return;
                } else if (!k7.i6.a(cb0Var)) {
                    f2.j0 j0Var = new f2.j0(context);
                    j0Var.f5712a = i10;
                    tVar.V2.w0(j0Var);
                    k7.i6.b(cb0Var);
                    int i12 = org.telegram.ui.Cells.s.f21898f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, cb0Var);
                    return;
                } else {
                    return;
                }
            case 2:
                ph.l6.Q((ph.l6) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.f6) obj, view, i10);
                return;
            default:
                ph.c7.P((ph.c7) obj3, (Context) obj2, (ph.k5) obj, view, i10);
                return;
        }
    }
}
