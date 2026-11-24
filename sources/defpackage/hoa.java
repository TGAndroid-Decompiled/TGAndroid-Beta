package defpackage;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class hoa extends TimeAnimator {
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
                hoa hoaVar = hoa.this;
                int i2 = hoaVar.a;
                if (i2 > 0 && (i = hoaVar.b) > 0) {
                    int i3 = i2 - 1;
                    hoaVar.a = i3;
                    if (hoaVar.c != null) {
                        float[] fArr = hoaVar.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = hoaVar.getInterpolator().getInterpolation(1.0f - (i3 / i));
                            float[] fArr2 = hoaVar.e;
                            float f = fArr2[0];
                            hoaVar.d = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
                            hoaVar.c.onAnimationUpdate(hoaVar);
                            return;
                        }
                        hoaVar.end();
                        return;
                    }
                    return;
                }
                hoaVar.end();
            }
        });
        int duration = (int) (((float) getDuration()) / gm.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
