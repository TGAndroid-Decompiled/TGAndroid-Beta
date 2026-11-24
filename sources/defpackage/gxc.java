package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
public final class gxc {
    public fxc a;

    public gxc(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new exc(bc3.b(i, interpolator, j));
        } else {
            this.a = new fxc(i, interpolator, j);
        }
    }
}
