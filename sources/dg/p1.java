package dg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.et0;
public final class p1 implements cg.o1 {
    public final q1 f4719a;

    public p1(q1 q1Var) {
        this.f4719a = q1Var;
    }

    @Override
    public final void a() {
        q1 q1Var = this.f4719a;
        q1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new o1(q1Var, 0)).setInterpolator(nr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        q1 q1Var = this.f4719a;
        q1Var.f4728b.f2428a.e();
        q1Var.f4734w.setViewHidden(false);
        PhotoViewer photoViewer = ((et0) q1Var).H;
        Drawable[] drawableArr = PhotoViewer.Q8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f4719a.f4734w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
