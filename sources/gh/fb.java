package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.tz;
public final class fb extends AnimatorListenerAdapter {
    public final int f8086a;
    public final int f8087b;
    public final float f8088c;
    public final View d;

    public fb(View view, int i9, float f10, int i10) {
        this.f8086a = i10;
        this.d = view;
        this.f8087b = i9;
        this.f8088c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f8086a) {
            case 0:
                gb gbVar = (gb) this.d;
                gbVar.V = this.f8088c;
                if (gbVar.getValue() != this.f8087b) {
                    gbVar.e(gbVar.getValue());
                }
                gbVar.invalidate();
                return;
            case 1:
                tz tzVar = (tz) this.d;
                int i9 = this.f8087b;
                if (i9 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f8088c;
                }
                tzVar.b(f10, i9 + 1);
                tzVar.f32858y = 0.0f;
                tzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.q1) this.d).c(this.f8087b, this.f8088c, false);
                return;
        }
    }

    public fb(gb gbVar, float f10, int i9) {
        this.f8086a = 0;
        this.d = gbVar;
        this.f8088c = f10;
        this.f8087b = i9;
    }
}
