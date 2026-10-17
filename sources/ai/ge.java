package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;
public final class ge extends AnimatorListenerAdapter {
    public final int f1394a;
    public final int f1395b;
    public final float f1396c;
    public final View d;

    public ge(View view, int i10, float f7, int i11) {
        this.f1394a = i11;
        this.d = view;
        this.f1395b = i10;
        this.f1396c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f1394a) {
            case 0:
                he heVar = (he) this.d;
                heVar.f1457c0 = this.f1396c;
                if (heVar.getValue() != this.f1395b) {
                    heVar.e(heVar.getValue());
                }
                heVar.invalidate();
                return;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.f1395b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f1396c;
                }
                q00Var.b(f7, i10 + 1);
                q00Var.f29505y = 0.0f;
                q00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.f1395b, this.f1396c, false);
                return;
        }
    }

    public ge(he heVar, float f7, int i10) {
        this.f1394a = 0;
        this.d = heVar;
        this.f1396c = f7;
        this.f1395b = i10;
    }
}
