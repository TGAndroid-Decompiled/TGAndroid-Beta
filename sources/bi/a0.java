package bi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class a0 extends s4.h0 {
    public final Context f2298c;
    public final m3 d;
    public final c0 e;

    public a0(c0 c0Var, Context context, m3 m3Var) {
        this.e = c0Var;
        this.f2298c = context;
        this.d = m3Var;
    }

    @Override
    public final int h() {
        return x.a().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        b0 b0Var = (b0) c1Var.f41610a;
        x xVar = (x) x.a().get(i10);
        if (i10 == b0Var.f2351s) {
            z10 = true;
        } else {
            z10 = false;
        }
        b0Var.setDrawable(new y(xVar, false));
        b0Var.b(xVar.equals(this.e.f2393b), z10);
        b0Var.f2351s = i10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ne neVar = new ne(this.f2298c);
        neVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        neVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        return new s4.c1(neVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        b0 b0Var = (b0) c1Var.f41610a;
        this.d.a(b0Var);
        int i10 = b0Var.f2351s;
        if (i10 >= 0 && i10 < x.a().size()) {
            x xVar = (x) x.a().get(b0Var.f2351s);
            b0Var.setDrawable(new y(xVar, false));
            b0Var.b(xVar.equals(this.e.f2393b), false);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        this.d.d.remove((b0) c1Var.f41610a);
    }
}
