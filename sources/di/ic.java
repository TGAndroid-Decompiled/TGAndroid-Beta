package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.mz;
public final class ic extends AnimatorListenerAdapter {
    public final int f9039a;
    public final int f9040b;
    public final float f9041c;
    public final View d;

    public ic(View view, int i7, float f10, int i10) {
        this.f9039a = i10;
        this.d = view;
        this.f9040b = i7;
        this.f9041c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f9039a) {
            case 0:
                jc jcVar = (jc) this.d;
                jcVar.f9098d0 = this.f9041c;
                if (jcVar.getValue() != this.f9040b) {
                    jcVar.e(jcVar.getValue());
                }
                jcVar.invalidate();
                return;
            case 1:
                mz mzVar = (mz) this.d;
                int i7 = this.f9040b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f9041c;
                }
                mzVar.b(f10, i7 + 1);
                mzVar.E = 0.0f;
                mzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.f9040b, this.f9041c, false);
                return;
        }
    }

    public ic(jc jcVar, float f10, int i7) {
        this.f9039a = 0;
        this.d = jcVar;
        this.f9041c = f10;
        this.f9040b = i7;
    }
}
