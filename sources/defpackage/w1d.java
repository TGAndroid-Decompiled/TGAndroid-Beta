package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
public final class w1d {
    public v1d a;

    public w1d(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new u1d(uc3.b(i, interpolator, j));
        } else {
            this.a = new v1d(i, interpolator, j);
        }
    }
}
