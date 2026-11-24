package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class f4a extends i49 {
    public final uw1 a;

    public f4a(uw1 uw1Var) {
        this.a = uw1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        float f;
        uw1 uw1Var = this.a;
        View view = uw1Var.u;
        if (uw1Var.w.H0() != 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = uw1Var.x;
        if (bool != null && z == bool.booleanValue()) {
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).setDuration(150L).start();
        uw1Var.x = Boolean.valueOf(z);
    }
}
