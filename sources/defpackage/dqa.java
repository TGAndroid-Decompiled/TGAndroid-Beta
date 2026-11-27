package defpackage;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class dqa extends TimeAnimator {
    public int a;
    public int b;
    public ValueAnimator.AnimatorUpdateListener c;
    public Float d;
    public float[] e;

    @Override
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.c = animatorUpdateListener;
    }

    @Override
    public final void end() {
        this.c = null;
        super.end();
    }

    @Override
    public final Object getAnimatedValue() {
        return this.d;
    }

    @Override
    public final void setFloatValues(float[] fArr) {
        super.setFloatValues(fArr);
        this.e = fArr;
    }

    @Override
    public final void start() {
        setTimeListener(new TimeAnimator.TimeListener() {
            @Override
            public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                int i;
                dqa dqaVar = dqa.this;
                int i2 = dqaVar.a;
                if (i2 > 0 && (i = dqaVar.b) > 0) {
                    int i3 = i2 - 1;
                    dqaVar.a = i3;
                    if (dqaVar.c != null) {
                        float[] fArr = dqaVar.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = dqaVar.getInterpolator().getInterpolation(1.0f - (i3 / i));
                            float[] fArr2 = dqaVar.e;
                            float f = fArr2[0];
                            dqaVar.d = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
                            dqaVar.c.onAnimationUpdate(dqaVar);
                            return;
                        }
                        dqaVar.end();
                        return;
                    }
                    return;
                }
                dqaVar.end();
            }
        });
        int duration = (int) (((float) getDuration()) / hl.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
