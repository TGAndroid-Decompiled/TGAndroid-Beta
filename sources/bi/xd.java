package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.q00;
public final class xd extends AnimatorListenerAdapter {
    public final int f5711a;
    public final int f5712b;
    public final float f5713c;
    public final View d;

    public xd(View view, int i10, float f7, int i11) {
        this.f5711a = i11;
        this.d = view;
        this.f5712b = i10;
        this.f5713c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f5711a) {
            case 0:
                yd ydVar = (yd) this.d;
                ydVar.f5796c0 = this.f5713c;
                if (ydVar.getValue() != this.f5712b) {
                    ydVar.e(ydVar.getValue());
                }
                ydVar.invalidate();
                return;
            case 1:
                q00 q00Var = (q00) this.d;
                int i10 = this.f5712b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f5713c;
                }
                q00Var.b(f7, i10 + 1);
                q00Var.f31775y = 0.0f;
                q00Var.invalidate();
                return;
            default:
                ((org.telegram.ui.web.u1) this.d).c(this.f5712b, this.f5713c, false);
                return;
        }
    }

    public xd(yd ydVar, float f7, int i10) {
        this.f5711a = 0;
        this.d = ydVar;
        this.f5713c = f7;
        this.f5712b = i10;
    }
}
