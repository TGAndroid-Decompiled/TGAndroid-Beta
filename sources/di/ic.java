package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.nz;
public final class ic extends AnimatorListenerAdapter {
    public final int f9054a;
    public final int f9055b;
    public final float f9056c;
    public final View d;

    public ic(View view, int i7, float f10, int i10) {
        this.f9054a = i10;
        this.d = view;
        this.f9055b = i7;
        this.f9056c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f9054a) {
            case 0:
                jc jcVar = (jc) this.d;
                jcVar.f9114d0 = this.f9056c;
                if (jcVar.getValue() != this.f9055b) {
                    jcVar.e(jcVar.getValue());
                }
                jcVar.invalidate();
                return;
            case 1:
                nz nzVar = (nz) this.d;
                int i7 = this.f9055b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f9056c;
                }
                nzVar.b(f10, i7 + 1);
                nzVar.E = 0.0f;
                nzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.f9055b, this.f9056c, false);
                return;
        }
    }

    public ic(jc jcVar, float f10, int i7) {
        this.f9054a = 0;
        this.d = jcVar;
        this.f9056c = f10;
        this.f9055b = i7;
    }
}
