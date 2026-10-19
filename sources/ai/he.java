package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;
public final class he extends AnimatorListenerAdapter {
    public final int f1442a;
    public final int f1443b;
    public final float f1444c;
    public final View d;

    public he(View view, int i10, float f7, int i11) {
        this.f1442a = i11;
        this.d = view;
        this.f1443b = i10;
        this.f1444c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f1442a) {
            case 0:
                ie ieVar = (ie) this.d;
                ieVar.f1512c0 = this.f1444c;
                if (ieVar.getValue() != this.f1443b) {
                    ieVar.e(ieVar.getValue());
                }
                ieVar.invalidate();
                return;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.f1443b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f1444c;
                }
                q00Var.b(f7, i10 + 1);
                q00Var.f29479y = 0.0f;
                q00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.f1443b, this.f1444c, false);
                return;
        }
    }

    public he(ie ieVar, float f7, int i10) {
        this.f1442a = 0;
        this.d = ieVar;
        this.f1444c = f7;
        this.f1443b = i10;
    }
}
