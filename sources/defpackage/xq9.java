package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class xq9 {
    public final wq9 a;

    public xq9(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new vq9(nestedScrollView);
        } else {
            this.a = new o5f((byte) 25);
        }
    }
}
