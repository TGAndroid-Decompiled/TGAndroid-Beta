package fi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.h0 {
    public final Context f11840c;
    public final q2 d;
    public final y e;

    public w(y yVar, Context context, q2 q2Var) {
        this.e = yVar;
        this.f11840c = context;
        this.d = q2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        x xVar = (x) e1Var.f47738a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f11949s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.f11978b), z10);
        xVar.f11949s = i10;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        dc dcVar = new dc(this.f11840c);
        dcVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        dcVar.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        return new s4.e1(dcVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        x xVar = (x) e1Var.f47738a;
        this.d.a(xVar);
        int i10 = xVar.f11949s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f11949s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.e.f11978b), false);
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        this.d.d.remove((x) e1Var.f47738a);
    }
}
