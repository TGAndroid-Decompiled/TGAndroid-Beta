package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.i0 {
    public final Context f6178c;
    public final w2 d;
    public final y f6179e;

    public w(y yVar, Context context, w2 w2Var) {
        this.f6179e = yVar;
        this.f6178c = context;
        this.d = w2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        x xVar = (x) d1Var.f47702a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f6288s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.f6179e.f6334b), z10);
        xVar.f6288s = i10;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        xc xcVar = new xc(this.f6178c);
        xcVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xcVar.setBackground(org.telegram.ui.ActionBar.i6.g0(553648127, 1, -1));
        return new s4.d1(xcVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        x xVar = (x) d1Var.f47702a;
        this.d.a(xVar);
        int i10 = xVar.f6288s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f6288s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.f6179e.f6334b), false);
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        this.d.d.remove((x) d1Var.f47702a);
    }
}
