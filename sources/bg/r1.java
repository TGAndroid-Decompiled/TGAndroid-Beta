package bg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vs0;
public final class r1 implements ag.s1 {
    public final s1 f2469a;

    public r1(s1 s1Var) {
        this.f2469a = s1Var;
    }

    @Override
    public final void a() {
        s1 s1Var = this.f2469a;
        s1Var.f2502e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new q1(s1Var, 0)).setInterpolator(jr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        s1 s1Var = this.f2469a;
        s1Var.f2500b.f617a.e();
        s1Var.f2507w.setViewHidden(false);
        PhotoViewer photoViewer = ((vs0) s1Var).G;
        Drawable[] drawableArr = PhotoViewer.P8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f2469a.f2507w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
