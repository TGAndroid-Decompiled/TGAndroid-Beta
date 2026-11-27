package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class pz9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final n1a b;

    public pz9(n1a n1aVar, byte b) {
        this.a = b;
        this.b = n1aVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n1a n1aVar = this.b;
        switch (b) {
            case 0:
                n1aVar.getClass();
                n1aVar.E(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                h0a h0aVar = n1aVar.b0;
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1aVar.setTranslationY((1.0f - floatValue) * hl.L(8.0f));
                View view = n1aVar.n0;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                t62 t62Var = n1aVar.o0;
                if (t62Var != null) {
                    t62Var.setAlpha(floatValue * floatValue);
                }
                h0aVar.setAlpha(floatValue);
                h0aVar.invalidate();
                n1aVar.invalidate();
                return;
            case 2:
                n1aVar.l();
                return;
            default:
                View view2 = n1aVar.u0;
                if (view2 != null) {
                    view2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                int v = aob.v(aob.v0(aob.G8, n1aVar.a1), vm2.o(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
                View view3 = n1aVar.n0;
                if (view3 != null) {
                    view3.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                }
                t62 t62Var2 = n1aVar.o0;
                if (t62Var2 != null) {
                    t62Var2.getBackground().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
        }
    }
}
