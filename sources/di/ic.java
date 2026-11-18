package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.nz;
public final class ic extends AnimatorListenerAdapter {
    public final int f9051a;
    public final int f9052b;
    public final float f9053c;
    public final View d;

    public ic(View view, int i7, float f10, int i10) {
        this.f9051a = i10;
        this.d = view;
        this.f9052b = i7;
        this.f9053c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f9051a) {
            case 0:
                jc jcVar = (jc) this.d;
                jcVar.f9111d0 = this.f9053c;
                if (jcVar.getValue() != this.f9052b) {
                    jcVar.e(jcVar.getValue());
                }
                jcVar.invalidate();
                return;
            case 1:
                nz nzVar = (nz) this.d;
                int i7 = this.f9052b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f9053c;
                }
                nzVar.b(f10, i7 + 1);
                nzVar.E = 0.0f;
                nzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.f9052b, this.f9053c, false);
                return;
        }
    }

    public ic(jc jcVar, float f10, int i7) {
        this.f9051a = 0;
        this.d = jcVar;
        this.f9053c = f10;
        this.f9052b = i7;
    }
}
