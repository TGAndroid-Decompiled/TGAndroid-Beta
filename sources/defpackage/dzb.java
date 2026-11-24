package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class dzb extends i49 {
    public final rzb a;

    public dzb(rzb rzbVar) {
        this.a = rzbVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        rzb rzbVar = this.a;
        czb czbVar = rzbVar.G1;
        if (i == 0) {
            rzbVar.F1 = false;
        } else if (i != 2) {
            return;
        }
        if (rzbVar.F0(false) > 0.0f && rzbVar.F0(false) < gl.L(96.0f) && czbVar.canScrollVertically(1) && rzbVar.I0()) {
            rzbVar.F1 = true;
            czbVar.x0(0, (int) rzbVar.F0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float f;
        rzb rzbVar = this.a;
        rzbVar.b.invalidate();
        boolean canScrollVertically = rzbVar.G1.canScrollVertically(1);
        View view = rzbVar.K1;
        Boolean bool = rzbVar.Q1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        rzbVar.Q1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ug8.t(animate.alpha(f), s33.h, 320L);
    }
}
