package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
public abstract class y2f {
    public static void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            mka.t(window);
        } else if (i >= 30) {
            mka.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }
}
