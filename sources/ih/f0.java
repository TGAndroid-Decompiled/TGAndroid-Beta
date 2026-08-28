package ih;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.pa0;
public final class f0 implements mk0 {
    public final int f11395a;
    public final Object f11396b;
    public final Object f11397c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i9) {
        this.f11395a = i9;
        this.f11396b = obj;
        this.f11397c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i9, View view) {
        int i10 = this.f11395a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f11397c;
        Object obj3 = this.f11396b;
        switch (i10) {
            case 0:
                h2 h2Var = (h2) obj3;
                p0 p0Var = (p0) view;
                u0 u0Var = p0Var.G;
                x60 F = x60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(u0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new h3.g0(7, (m9) obj, u0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new h3.g0(8, h2Var, p0Var), !u0Var.f12177e);
                if (h2Var.I != UserConfig.getInstance(h2Var.J).getClientUserId() && !h2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new h3.g0(9, h2Var, u0Var), z10);
                F.Z();
                return;
            case 1:
                kh.s7.P((kh.s7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.b6) obj, view, i9);
                return;
            case 2:
                kh.k8.O((kh.k8) obj3, (Context) obj2, (kh.r6) obj, view, i9);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                pa0 pa0Var = (pa0) tVar.T2.get(i9);
                if (pa0Var.f41389e && !UserConfig.hasPremiumOnAccounts()) {
                    o2Var.showDialog(new zf.x0(o2Var, 10, true));
                    return;
                } else if (!g7.l6.a(pa0Var)) {
                    f2.n0 n0Var = new f2.n0(context);
                    n0Var.f5443a = i9;
                    tVar.U2.w0(n0Var);
                    g7.l6.b(pa0Var);
                    int i11 = org.telegram.ui.Cells.s.f25133f;
                    sVar.b(true, true);
                    for (int i12 = 0; i12 < tVar.getChildCount(); i12++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i12);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, pa0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
