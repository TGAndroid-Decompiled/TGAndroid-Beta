package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.dz;
public final class yd extends AnimatorListenerAdapter {
    public final int f5103a;
    public final int f5104b;
    public final float f5105c;
    public final View d;

    public yd(View view, int i7, float f10, int i10) {
        this.f5103a = i10;
        this.d = view;
        this.f5104b = i7;
        this.f5105c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f5103a) {
            case 0:
                zd zdVar = (zd) this.d;
                zdVar.f5196c0 = this.f5105c;
                if (zdVar.getValue() != this.f5104b) {
                    zdVar.e(zdVar.getValue());
                }
                zdVar.invalidate();
                return;
            case 1:
                dz dzVar = (dz) this.d;
                int i7 = this.f5104b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f5105c;
                }
                dzVar.b(f10, i7 + 1);
                dzVar.D = 0.0f;
                dzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.k1) this.d).c(this.f5104b, this.f5105c, false);
                return;
        }
    }

    public yd(zd zdVar, float f10, int i7) {
        this.f5103a = 0;
        this.d = zdVar;
        this.f5105c = f10;
        this.f5104b = i7;
    }
}
