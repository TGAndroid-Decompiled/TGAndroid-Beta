package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class qu9 {
    public final pu9 a;

    public qu9(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new ou9(nestedScrollView);
        } else {
            this.a = new faf((byte) 25);
        }
    }
}
