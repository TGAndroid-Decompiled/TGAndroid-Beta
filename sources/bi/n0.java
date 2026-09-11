package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.lb0;
public final class n0 implements zk0 {
    public final int f3347a;
    public final Object f3348b;
    public final Object f3349c;
    public final Object d;

    public n0(Object obj, Object obj2, Object obj3, int i10) {
        this.f3347a = i10;
        this.f3348b = obj;
        this.f3349c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(int i10, View view) {
        int i11 = this.f3347a;
        boolean z10 = true;
        Object obj = this.d;
        Object obj2 = this.f3349c;
        Object obj3 = this.f3348b;
        switch (i11) {
            case 0:
                e3 e3Var = (e3) obj3;
                z0 z0Var = (z0) view;
                e1 e1Var = z0Var.K;
                n70 F = n70.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(e1Var.d, true)));
                F.k();
                F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new a1.e(14, (pb) obj, e1Var), false);
                F.l(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new a1.e(15, e3Var, z0Var), !e1Var.f2901e);
                if (e3Var.M != UserConfig.getInstance(e3Var.N).getClientUserId() && !e3Var.f()) {
                    z10 = false;
                }
                F.l(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a1.e(16, e3Var, e1Var), z10);
                F.Z();
                return;
            case 1:
                di.g8.R((di.g8) obj3, (Utilities.Callback) obj2, (org.telegram.ui.ActionBar.f6) obj, view, i10);
                return;
            case 2:
                di.x8.P((di.x8) obj3, (Context) obj2, (di.d7) obj, view, i10);
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                lb0 lb0Var = (lb0) tVar.X2.get(i10);
                if (lb0Var.f38264e && !UserConfig.hasPremiumOnAccounts()) {
                    n2Var.showDialog(new sg.a1(n2Var, 10, true));
                    return;
                } else if (!w7.e6.a(lb0Var)) {
                    s4.d0 d0Var = new s4.d0(context);
                    d0Var.f45906a = i10;
                    tVar.Y2.w0(d0Var);
                    w7.e6.b(lb0Var);
                    int i12 = org.telegram.ui.Cells.s.f22700f;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, lb0Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
