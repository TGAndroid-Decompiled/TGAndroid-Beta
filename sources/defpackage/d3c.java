package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class d3c extends v79 {
    public final r3c a;

    public d3c(r3c r3cVar) {
        this.a = r3cVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        r3c r3cVar = this.a;
        c3c c3cVar = r3cVar.G1;
        if (i == 0) {
            r3cVar.F1 = false;
        } else if (i != 2) {
            return;
        }
        if (r3cVar.G0(false) > 0.0f && r3cVar.G0(false) < hl.L(96.0f) && c3cVar.canScrollVertically(1) && r3cVar.J0()) {
            r3cVar.F1 = true;
            c3cVar.y0(0, (int) r3cVar.G0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float f;
        r3c r3cVar = this.a;
        r3cVar.b.invalidate();
        boolean canScrollVertically = r3cVar.G1.canScrollVertically(1);
        View view = r3cVar.K1;
        Boolean bool = r3cVar.Q1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        r3cVar.Q1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ik8.t(animate.alpha(f), k43.h, 320L);
    }
}
