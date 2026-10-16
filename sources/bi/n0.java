package bi;

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
import org.telegram.ui.nb0;
public final class n0 implements am0 {
    public final int f3354a;
    public final Object f3355b;
    public final Object f3356c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f3354a = i10;
        this.f3355b = obj;
        this.f3356c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        int i11 = this.f3354a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f3356c;
        Object obj3 = this.f3355b;
        switch (i11) {
            case 0:
                h3 h3Var = (h3) obj3;
                z0 z0Var = (z0) view;
                e1 e1Var = z0Var.K;
                l80 F = l80.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(e1Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new a1.f(16, (sb) obj, e1Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new a1.f(17, h3Var, z0Var), !e1Var.e);
                if (h3Var.M != UserConfig.getInstance(h3Var.N).getClientUserId() && !h3Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a1.f(18, h3Var, e1Var), z10);
                F.Z();
                return;
            case 1:
                di.c8.R((di.c8) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.c6) obj, view, i10);
                return;
            case 2:
                di.t8.Q((di.t8) obj3, (Context) obj2, (di.a7) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                nb0 nb0Var = (nb0) tVar.V2.get(i10);
                if (nb0Var.e && !UserConfig.hasPremiumOnAccounts()) {
                    m2Var.showDialog(new sg.y0(m2Var, 10, true));
                    return;
                } else if (!w7.g6.a(nb0Var)) {
                    s4.c0 c0Var = new s4.c0(context);
                    c0Var.f44979a = i10;
                    tVar.W2.w0(c0Var);
                    w7.g6.b(nb0Var);
                    int i12 = org.telegram.ui.Cells.s.f21472f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, nb0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
