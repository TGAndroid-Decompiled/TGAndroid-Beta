package nh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class w extends f2.p0 {
    public final Context f18771c;
    public final p2 d;
    public final y f18772e;

    public w(y yVar, Context context, p2 p2Var) {
        this.f18772e = yVar;
        this.f18771c = context;
        this.d = p2Var;
    }

    @Override
    public final int h() {
        return t.a().size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        x xVar = (x) n1Var.f6432a;
        t tVar = (t) t.a().get(i10);
        if (i10 == xVar.f18811s) {
            z10 = true;
        } else {
            z10 = false;
        }
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.f18772e.f18846b), z10);
        xVar.f18811s = i10;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        rb rbVar = new rb(this.f18771c);
        rbVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        rbVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        return new f2.n1(rbVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        x xVar = (x) n1Var.f6432a;
        this.d.a(xVar);
        int i10 = xVar.f18811s;
        if (i10 >= 0 && i10 < t.a().size()) {
            t tVar = (t) t.a().get(xVar.f18811s);
            xVar.setDrawable(new u(tVar, false));
            xVar.b(tVar.equals(this.f18772e.f18846b), false);
        }
    }

    @Override
    public final void z(f2.n1 n1Var) {
        this.d.d.remove((x) n1Var.f6432a);
    }
}
