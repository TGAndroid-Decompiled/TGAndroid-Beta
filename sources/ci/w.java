package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends s4.h0 {
    public final Context f6195c;
    public final x2 d;
    public final y f6196e;

    public w(y yVar, Context context, x2 x2Var) {
        this.f6196e = yVar;
        this.f6195c = context;
        this.d = x2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        x xVar = (x) c1Var.f46524a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f6260s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.f6196e.f6324b), z10);
        xVar.f6260s = i10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        wc wcVar = new wc(this.f6195c);
        wcVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        wcVar.setBackground(org.telegram.ui.ActionBar.i6.f0(553648127, 1, -1));
        return new s4.c1(wcVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        x xVar = (x) c1Var.f46524a;
        this.d.a(xVar);
        int i10 = xVar.f6260s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f6260s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.f6196e.f6324b), false);
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        this.d.d.remove((x) c1Var.f46524a);
    }
}
