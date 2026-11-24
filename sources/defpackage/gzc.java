package defpackage;

import android.view.animation.Interpolator;
public abstract class gzc {
    public final int a;
    public float b;
    public final Interpolator c;
    public final short d;

    public gzc(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = (int) j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        float f = this.b;
        Interpolator interpolator = this.c;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return f;
    }

    public int c() {
        return this.a;
    }

    public void d(float f) {
        this.b = f;
    }
}
