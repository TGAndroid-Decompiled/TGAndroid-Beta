package dg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lt0;
public final class p1 implements cg.o1 {
    public final q1 f4725a;

    public p1(q1 q1Var) {
        this.f4725a = q1Var;
    }

    @Override
    public final void a() {
        q1 q1Var = this.f4725a;
        q1Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new o1(q1Var, 0)).setInterpolator(mr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        q1 q1Var = this.f4725a;
        q1Var.f4734b.f2411a.g();
        q1Var.f4740w.setViewHidden(false);
        PhotoViewer photoViewer = ((lt0) q1Var).H;
        Drawable[] drawableArr = PhotoViewer.Q8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f4725a.f4740w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
