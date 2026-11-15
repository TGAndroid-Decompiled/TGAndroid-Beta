package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.gz;
public final class ec extends AnimatorListenerAdapter {
    public final int f8521a;
    public final int f8522b;
    public final float f8523c;
    public final View d;

    public ec(View view, int i7, float f10, int i10) {
        this.f8521a = i10;
        this.d = view;
        this.f8522b = i7;
        this.f8523c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f8521a) {
            case 0:
                fc fcVar = (fc) this.d;
                fcVar.f8575d0 = this.f8523c;
                if (fcVar.getValue() != this.f8522b) {
                    fcVar.e(fcVar.getValue());
                }
                fcVar.invalidate();
                return;
            case 1:
                gz gzVar = (gz) this.d;
                int i7 = this.f8522b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f8523c;
                }
                gzVar.b(f10, i7 + 1);
                gzVar.E = 0.0f;
                gzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.f8522b, this.f8523c, false);
                return;
        }
    }

    public ec(fc fcVar, float f10, int i7) {
        this.f8521a = 0;
        this.d = fcVar;
        this.f8523c = f10;
        this.f8522b = i7;
    }
}
