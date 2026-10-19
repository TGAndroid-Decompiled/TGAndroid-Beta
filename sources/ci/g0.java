package ci;

import ai.pa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.oa0;
public final class g0 implements wl0 {
    public final int f5411a;
    public final Object f5412b;
    public final Object f5413c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f5411a = i10;
        this.f5412b = obj;
        this.f5413c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        int i11 = this.f5411a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f5413c;
        Object obj3 = this.f5412b;
        switch (i11) {
            case 0:
                n2 n2Var = (n2) obj3;
                q0 q0Var = (q0) view;
                v0 v0Var = q0Var.K;
                i80 F = i80.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(v0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new pa(9, (aa) obj, v0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new pa(10, n2Var, q0Var), !v0Var.e);
                if (n2Var.M != UserConfig.getInstance(n2Var.N).getClientUserId() && !n2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new pa(11, n2Var, v0Var), z10);
                F.Z();
                return;
            case 1:
                ei.s7.R((ei.s7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.d6) obj, view, i10);
                return;
            case 2:
                ei.j8.Q((ei.j8) obj3, (Context) obj2, (ei.r6) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                oa0 oa0Var = (oa0) tVar.V2.get(i10);
                if (oa0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var2.showDialog(new sg.y0(n2Var2, 10, true));
                    return;
                } else if (!w7.g6.a(oa0Var)) {
                    s4.c0 c0Var = new s4.c0(context);
                    c0Var.f46051a = i10;
                    tVar.W2.w0(c0Var);
                    w7.g6.b(oa0Var);
                    int i12 = org.telegram.ui.Cells.s.f22961f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, oa0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
