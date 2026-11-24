package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
public final class hzc {
    public gzc a;

    public hzc(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new fzc(nd3.b(i, interpolator, j));
        } else {
            this.a = new gzc(i, interpolator, j);
        }
    }
}
