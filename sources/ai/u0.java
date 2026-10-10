package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.jb0;
public final class u0 implements fm0 {
    public final int f1782a;
    public final Object f1783b;
    public final Object f1784c;
    public final Object d;

    public u0(Object obj, Object obj2, Object obj3, int i10) {
        this.f1782a = i10;
        this.f1783b = obj;
        this.f1784c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i10, View view) {
        int i11 = this.f1782a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f1784c;
        Object obj3 = this.f1783b;
        switch (i11) {
            case 0:
                s3 s3Var = (s3) obj3;
                h1 h1Var = (h1) view;
                m1 m1Var = h1Var.K;
                q80 F = q80.F((ViewGroup) obj2, new d(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(m1Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new a1.f(5, (kc) obj, m1Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new a1.f(6, s3Var, h1Var), !m1Var.f1383e);
                if (s3Var.M != UserConfig.getInstance(s3Var.N).getClientUserId() && !s3Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a1.f(7, s3Var, m1Var), z10);
                F.Z();
                return;
            case 1:
                ci.d8.R((ci.d8) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.e6) obj, view, i10);
                return;
            case 2:
                ci.u8.Q((ci.u8) obj3, (Context) obj2, (ci.b7) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                jb0 jb0Var = (jb0) tVar.V2.get(i10);
                if (jb0Var.f38946e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var.showDialog(new rg.y0(n2Var, 10, true));
                    return;
                } else if (!w7.e6.a(jb0Var)) {
                    s4.e0 e0Var = new s4.e0(context);
                    e0Var.f47871a = i10;
                    tVar.W2.w0(e0Var);
                    w7.e6.b(jb0Var);
                    int i12 = org.telegram.ui.Cells.s.f22740f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, jb0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
