package di;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.g0 {
    public final Context f8026c;
    public final w2 d;
    public final y e;

    public w(y yVar, Context context, w2 w2Var) {
        this.e = yVar;
        this.f8026c = context;
        this.d = w2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        x xVar = (x) b1Var.f44838a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f8079s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.f8115b), z10);
        xVar.f8079s = i10;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        vc vcVar = new vc(this.f8026c);
        vcVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        vcVar.setBackground(org.telegram.ui.ActionBar.g6.g0(553648127, 1, -1));
        return new s4.b1(vcVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        x xVar = (x) b1Var.f44838a;
        this.d.a(xVar);
        int i10 = xVar.f8079s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f8079s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.e.f8115b), false);
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        this.d.d.remove((x) b1Var.f44838a);
    }
}
