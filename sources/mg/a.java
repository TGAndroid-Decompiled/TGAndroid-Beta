package mg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f13921a;
    public final b f13922b;
    public final f0 f13923c;

    public a(b bVar, f0 f0Var, int i10) {
        this.f13921a = i10;
        this.f13922b = bVar;
        this.f13923c = f0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13921a) {
            case 0:
                this.f13922b.f13930f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f13923c.invalidate();
                return;
            default:
                this.f13922b.f13930f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f13923c.invalidate();
                return;
        }
    }
}
