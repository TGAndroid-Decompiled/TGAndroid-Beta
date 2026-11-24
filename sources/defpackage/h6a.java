package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class h6a extends k69 {
    public final hy1 a;

    public h6a(hy1 hy1Var) {
        this.a = hy1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        float f;
        hy1 hy1Var = this.a;
        View view = hy1Var.u;
        if (hy1Var.w.H0() != 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = hy1Var.x;
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
        hy1Var.x = Boolean.valueOf(z);
    }
}
