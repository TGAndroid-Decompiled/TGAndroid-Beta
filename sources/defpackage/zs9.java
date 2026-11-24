package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class zs9 {
    public final ys9 a;

    public zs9(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new xs9(nestedScrollView);
        } else {
            this.a = new q7f((byte) 25);
        }
    }
}
