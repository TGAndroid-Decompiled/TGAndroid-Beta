package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.fb0;
public final class u0 implements kl0 {
    public final int f1565a;
    public final Object f1566b;
    public final Object f1567c;
    public final Object d;

    public u0(Object obj, Object obj2, Object obj3, int i10) {
        this.f1565a = i10;
        this.f1566b = obj;
        this.f1567c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        int i11 = this.f1565a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f1567c;
        Object obj3 = this.f1566b;
        switch (i11) {
            case 0:
                r3 r3Var = (r3) obj3;
                h1 h1Var = (h1) view;
                m1 m1Var = h1Var.K;
                y70 F = y70.F((ViewGroup) obj2, new d(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(m1Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new a1.e(5, (jc) obj, m1Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new a1.e(6, r3Var, h1Var), !m1Var.e);
                if (r3Var.M != UserConfig.getInstance(r3Var.N).getClientUserId() && !r3Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a1.e(7, r3Var, m1Var), z10);
                F.Z();
                return;
            case 1:
                ci.d8.Q((ci.d8) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.d6) obj, view, i10);
                return;
            case 2:
                ci.u8.P((ci.u8) obj3, (Context) obj2, (ci.b7) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                fb0 fb0Var = (fb0) tVar.X2.get(i10);
                if (fb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    m2Var.showDialog(new rg.x0(m2Var, 10, true));
                    return;
                } else if (!w7.f6.a(fb0Var)) {
                    s4.d0 d0Var = new s4.d0(context);
                    d0Var.f43110a = i10;
                    tVar.Y2.w0(d0Var);
                    w7.f6.b(fb0Var);
                    int i12 = org.telegram.ui.Cells.s.f20893f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, fb0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
