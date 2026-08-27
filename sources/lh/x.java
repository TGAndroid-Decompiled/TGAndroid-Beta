package lh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lk0;

public final class x extends f2.q0 {

    public final Context f17026c;
    public final r2 d;

    public final z f17027e;

    public x(z zVar, Context context, r2 r2Var) {
        this.f17027e = zVar;
        this.f17026c = context;
        this.d = r2Var;
    }

    @Override
    public final int h() {
        return u.a().size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        y yVar = (y) o1Var.f5789a;
        u uVar = (u) u.a().get(i10);
        boolean z10 = i10 == yVar.f17066s;
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.f17027e.f17135b), z10);
        yVar.f17066s = i10;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        y yVar = new y(this.f17026c);
        yVar.setLayoutParams(new f2.y0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        yVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        return new lk0(yVar);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        y yVar = (y) o1Var.f5789a;
        this.d.a(yVar);
        int i10 = yVar.f17066s;
        if (i10 < 0 || i10 >= u.a().size()) {
            return;
        }
        u uVar = (u) u.a().get(yVar.f17066s);
        yVar.setDrawable(new v(uVar, false));
        yVar.b(uVar.equals(this.f17027e.f17135b), false);
    }

    @Override
    public final void z(f2.o1 o1Var) {
        this.d.d.remove((y) o1Var.f5789a);
    }
}
