package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.ta0;

public final class d0 implements pk0 {

    public final int f13171a;

    public final Object f13172b;

    public final Object f13173c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f13171a = i10;
        this.f13172b = obj;
        this.f13173c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        int i11 = this.f13171a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f13173c;
        Object obj3 = this.f13172b;
        switch (i11) {
            case 0:
                g2 g2Var = (g2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.G;
                b70 b70VarF = b70.F((ViewGroup) obj2, new b(), view);
                b70VarF.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(s0Var.d, true)));
                b70VarF.k();
                b70VarF.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new hh.m5(16, (i9) obj, s0Var), false);
                b70VarF.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new hh.m5(17, g2Var, n0Var), !s0Var.f13932e);
                if (g2Var.I != UserConfig.getInstance(g2Var.J).getClientUserId() && !g2Var.f()) {
                    z10 = false;
                }
                b70VarF.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new hh.m5(18, g2Var, s0Var), z10);
                b70VarF.Z();
                break;
            case 1:
                lh.r7.Q((lh.r7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.c6) obj, view, i10);
                break;
            case 2:
                lh.j8.P((lh.j8) obj3, (Context) obj2, (lh.q6) obj, view, i10);
                break;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                ta0 ta0Var = (ta0) tVar.T2.get(i10);
                if (ta0Var.f42845e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var.showDialog(new ag.g2(n2Var, 10, true));
                    break;
                } else if (!h7.g6.a(ta0Var)) {
                    org.telegram.ui.Cells.p pVar = new org.telegram.ui.Cells.p(context);
                    pVar.f5731a = i10;
                    tVar.U2.w0(pVar);
                    h7.g6.b(ta0Var);
                    int i12 = org.telegram.ui.Cells.s.f25246f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, ta0Var);
                    break;
                }
                break;
        }
    }
}
