package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class e1c extends k69 {
    public final s1c a;

    public e1c(s1c s1cVar) {
        this.a = s1cVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        s1c s1cVar = this.a;
        d1c d1cVar = s1cVar.G1;
        if (i == 0) {
            s1cVar.F1 = false;
        } else if (i != 2) {
            return;
        }
        if (s1cVar.F0(false) > 0.0f && s1cVar.F0(false) < gm.L(96.0f) && d1cVar.canScrollVertically(1) && s1cVar.I0()) {
            s1cVar.F1 = true;
            d1cVar.x0(0, (int) s1cVar.F0(false), null);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        float f;
        s1c s1cVar = this.a;
        s1cVar.b.invalidate();
        boolean canScrollVertically = s1cVar.G1.canScrollVertically(1);
        View view = s1cVar.K1;
        Boolean bool = s1cVar.Q1;
        if (bool != null && bool.booleanValue() == canScrollVertically) {
            return;
        }
        s1cVar.Q1 = Boolean.valueOf(canScrollVertically);
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (canScrollVertically) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        wi8.t(animate.alpha(f), d53.h, 320L);
    }
}
