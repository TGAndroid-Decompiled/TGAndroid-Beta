package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.cz;
public final class yd extends AnimatorListenerAdapter {
    public final int f5108a;
    public final int f5109b;
    public final float f5110c;
    public final View d;

    public yd(View view, int i7, float f10, int i10) {
        this.f5108a = i10;
        this.d = view;
        this.f5109b = i7;
        this.f5110c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f5108a) {
            case 0:
                zd zdVar = (zd) this.d;
                zdVar.f5201c0 = this.f5110c;
                if (zdVar.getValue() != this.f5109b) {
                    zdVar.e(zdVar.getValue());
                }
                zdVar.invalidate();
                return;
            case 1:
                cz czVar = (cz) this.d;
                int i7 = this.f5109b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f5110c;
                }
                czVar.b(f10, i7 + 1);
                czVar.D = 0.0f;
                czVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.k1) this.d).c(this.f5109b, this.f5110c, false);
                return;
        }
    }

    public yd(zd zdVar, float f10, int i7) {
        this.f5108a = 0;
        this.d = zdVar;
        this.f5110c = f10;
        this.f5109b = i7;
    }
}
