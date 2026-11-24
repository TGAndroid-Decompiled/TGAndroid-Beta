package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class ns5 implements View.OnClickListener {
    public final byte a;
    public final TLRPC.User b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final q59 h;

    public ns5(q59 q59Var, TLRPC.User user, String str, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.h = q59Var;
        this.b = user;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override
    public final void onClick(View view) {
        int i;
        ylb ylbVar;
        byte b = this.a;
        q59 q59Var = this.h;
        switch (b) {
            case 0:
                xs5 xs5Var = ((ss5) q59Var).c;
                xhb.b(xs5Var.getContext(), xs5Var.a, -xs5Var.a2, this.b, this.c, this.d, this.e, this.f, xs5Var.J0);
                return;
            case 1:
                ProfileActivity profileActivity = ((lq8) q59Var).e;
                Activity parentActivity = profileActivity.getParentActivity();
                i = ((d) profileActivity).currentAccount;
                long a = profileActivity.a();
                ylbVar = ((d) profileActivity).resourceProvider;
                xhb.b(parentActivity, i, a, this.b, this.c, this.d, this.e, this.f, ylbVar);
                return;
            default:
                nha nhaVar = ((aga) q59Var).f;
                xhb.b(nhaVar.getContext(), nhaVar.y1.getCurrentAccount(), nhaVar.m1, this.b, this.c, this.d, this.e, this.f, nhaVar.I1);
                return;
        }
    }
}
