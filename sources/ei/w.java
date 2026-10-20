package ei;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.g0 {
    public final Context f10032c;
    public final s2 d;
    public final y e;

    public w(y yVar, Context context, s2 s2Var) {
        this.e = yVar;
        this.f10032c = context;
        this.d = s2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        x xVar = (x) b1Var.f45917a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f10058s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.f10120b), z10);
        xVar.f10058s = i10;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        hc hcVar = new hc(this.f10032c);
        hcVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        hcVar.setBackground(org.telegram.ui.ActionBar.h6.g0(553648127, 1, -1));
        return new s4.b1(hcVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        x xVar = (x) b1Var.f45917a;
        this.d.a(xVar);
        int i10 = xVar.f10058s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f10058s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.e.f10120b), false);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        this.d.d.remove((x) b1Var.f45917a);
    }
}
