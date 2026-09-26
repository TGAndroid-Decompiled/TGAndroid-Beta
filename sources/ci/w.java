package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.h0 {
    public final Context f5694c;
    public final x2 d;
    public final y e;

    public w(y yVar, Context context, x2 x2Var) {
        this.e = yVar;
        this.f5694c = context;
        this.d = x2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        x xVar = (x) c1Var.f42960a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f5803s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.f5859b), z10);
        xVar.f5803s = i10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        xc xcVar = new xc(this.f5694c);
        xcVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xcVar.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        return new s4.c1(xcVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        x xVar = (x) c1Var.f42960a;
        this.d.a(xVar);
        int i10 = xVar.f5803s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f5803s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.e.f5859b), false);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        this.d.d.remove((x) c1Var.f42960a);
    }
}
