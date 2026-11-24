package defpackage;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
public final class gma extends TimeAnimator {
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
                gma gmaVar = gma.this;
                int i2 = gmaVar.a;
                if (i2 > 0 && (i = gmaVar.b) > 0) {
                    int i3 = i2 - 1;
                    gmaVar.a = i3;
                    if (gmaVar.c != null) {
                        float[] fArr = gmaVar.e;
                        if (fArr != null && fArr.length == 2) {
                            float interpolation = gmaVar.getInterpolator().getInterpolation(1.0f - (i3 / i));
                            float[] fArr2 = gmaVar.e;
                            float f = fArr2[0];
                            gmaVar.d = Float.valueOf(((fArr2[1] - f) * interpolation) + f);
                            gmaVar.c.onAnimationUpdate(gmaVar);
                            return;
                        }
                        gmaVar.end();
                        return;
                    }
                    return;
                }
                gmaVar.end();
            }
        });
        int duration = (int) (((float) getDuration()) / gl.t);
        this.a = duration;
        this.b = duration;
        super.start();
    }
}
