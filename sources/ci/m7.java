package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5572a;
    public final float f5573b;
    public final float f5574c;
    public final float d;
    public final float f5575e;
    public final Object f5576f;

    public m7(Object obj, float f7, float f10, float f11, float f12, int i10) {
        this.f5572a = i10;
        this.f5576f = obj;
        this.f5573b = f7;
        this.f5574c = f10;
        this.d = f11;
        this.f5575e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5572a) {
            case 0:
                p pVar = (p) this.f5576f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7 n7Var = pVar.f5656a;
                float f7 = this.f5573b;
                float f10 = this.f5574c;
                n7Var.setScaleX(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setScaleY(AndroidUtilities.lerp(f7, f10, floatValue));
                n7Var.setTranslationX(this.d * floatValue);
                n7Var.setTranslationY(this.f5575e * floatValue);
                float f11 = 1.0f - floatValue;
                n7Var.setAlpha(f11);
                pVar.f5663s = f11;
                pVar.invalidate();
                return;
            default:
                ig.j jVar = (ig.j) this.f5576f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = this.f5574c;
                float f13 = this.f5573b;
                jVar.f12169k = com.google.android.gms.internal.vision.e2.z(f12, f13, floatValue2, f13);
                float f14 = this.f5575e;
                float f15 = this.d;
                jVar.f12170l = com.google.android.gms.internal.vision.e2.z(f14, f15, floatValue2, f15);
                jVar.f12161a.a(f12, f14, false);
                return;
        }
    }
}
