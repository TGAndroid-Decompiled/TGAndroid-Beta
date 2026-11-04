package gi;

import android.animation.ValueAnimator;
import org.telegram.messenger.cs;
import org.telegram.ui.cm0;
import org.telegram.ui.l71;
import org.telegram.ui.pc;
public final class ea implements ValueAnimator.AnimatorUpdateListener {
    public final int f12671a;
    public boolean f12672b = false;
    public final cs f12673c;

    public ea(cs csVar, int i3) {
        this.f12671a = i3;
        this.f12673c = csVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12671a) {
            case 0:
                va vaVar = (va) this.f12673c;
                vaVar.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da daVar = vaVar.D2;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (!this.f12672b && vaVar.E2 > 0.5f) {
                    this.f12672b = true;
                    return;
                }
                return;
            case 1:
                pc pcVar = (pc) this.f12673c;
                pcVar.f48529o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.f48528n0.invalidate();
                if (!this.f12672b && pcVar.f48529o0 > 0.5f) {
                    this.f12672b = true;
                    return;
                }
                return;
            case 2:
                cm0 cm0Var = (cm0) this.f12673c;
                cm0Var.Z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cm0Var.Y.invalidate();
                if (!this.f12672b && cm0Var.Z > 0.5f) {
                    this.f12672b = true;
                    return;
                }
                return;
            default:
                l71 l71Var = (l71) this.f12673c;
                l71Var.f47176k2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.f47174j2.invalidate();
                if (!this.f12672b && l71Var.f47176k2 > 0.5f) {
                    this.f12672b = true;
                    return;
                }
                return;
        }
    }
}
