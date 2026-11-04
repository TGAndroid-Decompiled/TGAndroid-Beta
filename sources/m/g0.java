package m;

import android.view.View;
public abstract class g0 {
    public static int a(View view) {
        return view.getTextAlignment();
    }

    public static int b(View view) {
        return view.getTextDirection();
    }

    public static void c(View view, int i3) {
        view.setTextAlignment(i3);
    }

    public static void d(View view, int i3) {
        view.setTextDirection(i3);
    }
}
