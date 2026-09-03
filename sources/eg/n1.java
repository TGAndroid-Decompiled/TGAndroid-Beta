package eg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lt0;
public final class n1 implements dg.n1 {
    public final o1 f5378a;

    public n1(o1 o1Var) {
        this.f5378a = o1Var;
    }

    @Override
    public final void a() {
        o1 o1Var = this.f5378a;
        o1Var.f5391e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new m1(o1Var, 0)).setInterpolator(pr.h);
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        o1 o1Var = this.f5378a;
        o1Var.f5389b.f4556a.e();
        o1Var.f5396w.setViewHidden(false);
        PhotoViewer photoViewer = ((lt0) o1Var).H;
        Drawable[] drawableArr = PhotoViewer.Q8;
        photoViewer.X2(true, true);
    }

    @Override
    public final void f() {
        this.f5378a.f5396w.setViewHidden(true);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
    }
}
