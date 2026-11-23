package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.pz;
public final class ic extends AnimatorListenerAdapter {
    public final int f9042a;
    public final int f9043b;
    public final float f9044c;
    public final View d;

    public ic(View view, int i7, float f10, int i10) {
        this.f9042a = i10;
        this.d = view;
        this.f9043b = i7;
        this.f9044c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f9042a) {
            case 0:
                jc jcVar = (jc) this.d;
                jcVar.f9102d0 = this.f9044c;
                if (jcVar.getValue() != this.f9043b) {
                    jcVar.e(jcVar.getValue());
                }
                jcVar.invalidate();
                return;
            case 1:
                pz pzVar = (pz) this.d;
                int i7 = this.f9043b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f9044c;
                }
                pzVar.b(f10, i7 + 1);
                pzVar.E = 0.0f;
                pzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.f9043b, this.f9044c, false);
                return;
        }
    }

    public ic(jc jcVar, float f10, int i7) {
        this.f9042a = 0;
        this.d = jcVar;
        this.f9044c = f10;
        this.f9043b = i7;
    }
}
