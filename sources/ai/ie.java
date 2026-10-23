package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;
public final class ie extends AnimatorListenerAdapter {
    public final int f1513a;
    public final int f1514b;
    public final float f1515c;
    public final View d;

    public ie(View view, int i10, float f7, int i11) {
        this.f1513a = i11;
        this.d = view;
        this.f1514b = i10;
        this.f1515c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f1513a) {
            case 0:
                je jeVar = (je) this.d;
                jeVar.f1578c0 = this.f1515c;
                if (jeVar.getValue() != this.f1514b) {
                    jeVar.e(jeVar.getValue());
                }
                jeVar.invalidate();
                return;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.f1514b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f1515c;
                }
                q00Var.b(f7, i10 + 1);
                q00Var.f29739y = 0.0f;
                q00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.u1) this.d).c(this.f1514b, this.f1515c, false);
                return;
        }
    }

    public ie(je jeVar, float f7, int i10) {
        this.f1513a = 0;
        this.d = jeVar;
        this.f1515c = f7;
        this.f1514b = i10;
    }
}
