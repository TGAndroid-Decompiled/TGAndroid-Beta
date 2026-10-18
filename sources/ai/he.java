package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;
public final class he extends AnimatorListenerAdapter {
    public final int f1447a;
    public final int f1448b;
    public final float f1449c;
    public final View d;

    public he(View view, int i10, float f7, int i11) {
        this.f1447a = i11;
        this.d = view;
        this.f1448b = i10;
        this.f1449c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f1447a) {
            case 0:
                ie ieVar = (ie) this.d;
                ieVar.f1514c0 = this.f1449c;
                if (ieVar.getValue() != this.f1448b) {
                    ieVar.e(ieVar.getValue());
                }
                ieVar.invalidate();
                return;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.f1448b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f1449c;
                }
                q00Var.b(f7, i10 + 1);
                q00Var.f29512y = 0.0f;
                q00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.t1) this.d).c(this.f1448b, this.f1449c, false);
                return;
        }
    }

    public he(ie ieVar, float f7, int i10) {
        this.f1447a = 0;
        this.d = ieVar;
        this.f1449c = f7;
        this.f1448b = i10;
    }
}
