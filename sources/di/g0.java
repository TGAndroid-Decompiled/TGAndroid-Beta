package di;

import a8.ze;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.ua0;
public final class g0 implements am0 {
    public final int f8569a;
    public final Object f8570b;
    public final Object f8571c;
    public final Object d;

    public g0(Object obj, Object obj2, Object obj3, int i10) {
        this.f8569a = i10;
        this.f8570b = obj;
        this.f8571c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i10, View view) {
        int i11 = this.f8569a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f8571c;
        Object obj3 = this.f8570b;
        switch (i11) {
            case 0:
                m2 m2Var = (m2) obj3;
                q0 q0Var = (q0) view;
                v0 v0Var = q0Var.K;
                l80 F = l80.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(v0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new bi.f2(23, (y9) obj, v0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new bi.f2(24, m2Var, q0Var), !v0Var.e);
                if (m2Var.M != UserConfig.getInstance(m2Var.N).getClientUserId() && !m2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new bi.f2(25, m2Var, v0Var), z10);
                F.Z();
                return;
            case 1:
                fi.o7.Q((fi.o7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.u6) obj, view, i10);
                return;
            case 2:
                fi.f8.P((fi.f8) obj3, (Context) obj2, (fi.o6) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                ua0 ua0Var = (ua0) tVar.f25424f3.get(i10);
                if (ua0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    r2Var.showDialog(new tg.y0(r2Var, 10, true));
                    return;
                } else if (!ze.a(ua0Var)) {
                    s4.d0 d0Var = new s4.d0(context);
                    d0Var.f47715a = i10;
                    tVar.f25425g3.w0(d0Var);
                    ze.b(ua0Var);
                    int i12 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, ua0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
