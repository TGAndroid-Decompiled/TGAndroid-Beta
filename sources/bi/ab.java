package bi;

import android.animation.ValueAnimator;
public final class ab implements ValueAnimator.AnimatorUpdateListener {
    public final int f2805a;
    public final db f2806b;

    public ab(db dbVar, int i10) {
        this.f2805a = i10;
        this.f2806b = dbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2805a) {
            case 0:
                pb pbVar = this.f2806b.I0;
                pbVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb.k(pbVar);
                return;
            default:
                pb pbVar2 = this.f2806b.I0;
                pbVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb.k(pbVar2);
                return;
        }
    }
}
