package defpackage;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class pq5 implements View.OnClickListener {
    public final byte a;
    public final TLRPC.User b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final n39 h;

    public pq5(n39 n39Var, TLRPC.User user, String str, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.h = n39Var;
        this.b = user;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override
    public final void onClick(View view) {
        int i;
        wjb wjbVar;
        byte b = this.a;
        n39 n39Var = this.h;
        switch (b) {
            case 0:
                zq5 zq5Var = ((uq5) n39Var).c;
                wfb.b(zq5Var.getContext(), zq5Var.a, -zq5Var.a2, this.b, this.c, this.d, this.e, this.f, zq5Var.J0);
                return;
            case 1:
                ProfileActivity profileActivity = ((ko8) n39Var).e;
                Activity parentActivity = profileActivity.getParentActivity();
                i = ((d) profileActivity).currentAccount;
                long a = profileActivity.a();
                wjbVar = ((d) profileActivity).resourceProvider;
                wfb.b(parentActivity, i, a, this.b, this.c, this.d, this.e, this.f, wjbVar);
                return;
            default:
                nfa nfaVar = ((aea) n39Var).f;
                wfb.b(nfaVar.getContext(), nfaVar.y1.getCurrentAccount(), nfaVar.m1, this.b, this.c, this.d, this.e, this.f, nfaVar.I1);
                return;
        }
    }
}
