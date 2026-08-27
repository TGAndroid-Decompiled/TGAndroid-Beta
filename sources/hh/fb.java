package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.wz;

public final class fb extends AnimatorListenerAdapter {

    public final int f9287a;

    public final int f9288b;

    public final float f9289c;
    public final View d;

    public fb(View view, int i10, float f10, int i11) {
        this.f9287a = i11;
        this.d = view;
        this.f9288b = i10;
        this.f9289c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9287a) {
            case 0:
                gb gbVar = (gb) this.d;
                gbVar.V = this.f9289c;
                if (gbVar.getValue() != this.f9288b) {
                    gbVar.e(gbVar.getValue());
                }
                gbVar.invalidate();
                break;
            case 1:
                wz wzVar = (wz) this.d;
                int i10 = this.f9288b;
                wzVar.b(i10 == 5 ? 0.0f : -this.f9289c, i10 + 1);
                wzVar.f34397y = 0.0f;
                wzVar.invalidate();
                break;
            default:
                ((org.telegram.ui.web.r1) this.d).c(this.f9288b, this.f9289c, false);
                break;
        }
    }

    public fb(gb gbVar, float f10, int i10) {
        this.f9287a = 0;
        this.d = gbVar;
        this.f9289c = f10;
        this.f9288b = i10;
    }
}
