package di;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.h0 {
    public final Context f8308c;
    public final y2 d;
    public final y f8309e;

    public w(y yVar, Context context, y2 y2Var) {
        this.f8309e = yVar;
        this.f8308c = context;
        this.d = y2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        x xVar = (x) c1Var.f45738a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f8357s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.f8309e.f8441b), z10);
        xVar.f8357s = i10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ad adVar = new ad(this.f8308c);
        adVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        adVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        return new s4.c1(adVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        x xVar = (x) c1Var.f45738a;
        this.d.a(xVar);
        int i10 = xVar.f8357s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f8357s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.f8309e.f8441b), false);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        this.d.d.remove((x) c1Var.f45738a);
    }
}
