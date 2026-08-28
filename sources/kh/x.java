package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class x extends f2.r0 {
    public final Context f16332c;
    public final s2 d;
    public final z f16333e;

    public x(z zVar, Context context, s2 s2Var) {
        this.f16333e = zVar;
        this.f16332c = context;
        this.d = s2Var;
    }

    @Override
    public final int h() {
        return u.a().size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        y yVar = (y) q1Var.f5501a;
        u uVar = (u) u.a().get(i9);
        if (i9 == yVar.f16389s) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.f16333e.f16416b), z10);
        yVar.f16389s = i9;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        hc hcVar = new hc(this.f16332c);
        hcVar.setLayoutParams(new f2.a1(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        hcVar.setBackground(org.telegram.ui.ActionBar.f6.f0(553648127, 1, -1));
        return new f2.q1(hcVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        y yVar = (y) q1Var.f5501a;
        this.d.a(yVar);
        int i9 = yVar.f16389s;
        if (i9 >= 0 && i9 < u.a().size()) {
            u uVar = (u) u.a().get(yVar.f16389s);
            yVar.setDrawable(new v(uVar, false));
            yVar.b(uVar.equals(this.f16333e.f16416b), false);
        }
    }

    @Override
    public final void z(f2.q1 q1Var) {
        this.d.d.remove((y) q1Var.f5501a);
    }
}
