package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.sa0;
public final class d0 implements zk0 {
    public final int f15450a;
    public final Object f15451b;
    public final Object f15452c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f15450a = i10;
        this.f15451b = obj;
        this.f15452c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i10, View view) {
        int i11 = this.f15450a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f15452c;
        Object obj3 = this.f15451b;
        switch (i11) {
            case 0:
                f2 f2Var = (f2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.G;
                j70 F = j70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(s0Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new jh.w2(23, (i9) obj, s0Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new jh.w2(24, f2Var, n0Var), !s0Var.f16197e);
                if (f2Var.I != UserConfig.getInstance(f2Var.J).getClientUserId() && !f2Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new jh.w2(25, f2Var, s0Var), z10);
                F.Z();
                return;
            case 1:
                nh.g7.Q((nh.g7) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.c6) obj, view, i10);
                return;
            case 2:
                nh.y7.P((nh.y7) obj3, (Context) obj2, (nh.f6) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                sa0 sa0Var = (sa0) tVar.T2.get(i10);
                if (sa0Var.f42334e && !UserConfig.hasPremiumOnAccounts()) {
                    o2Var.showDialog(new cg.p1(o2Var, 10, true));
                    return;
                } else if (!i7.m6.a(sa0Var)) {
                    f2.k0 k0Var = new f2.k0(context);
                    k0Var.f6373a = i10;
                    tVar.U2.w0(k0Var);
                    i7.m6.b(sa0Var);
                    int i12 = org.telegram.ui.Cells.s.f25258f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, sa0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
