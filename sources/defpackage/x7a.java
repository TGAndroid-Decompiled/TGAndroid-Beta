package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class x7a extends v79 {
    public final ix1 a;

    public x7a(ix1 ix1Var) {
        this.a = ix1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        float f;
        ix1 ix1Var = this.a;
        View view = ix1Var.u;
        if (ix1Var.w.H0() != 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = ix1Var.x;
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
        ix1Var.x = Boolean.valueOf(z);
    }
}
