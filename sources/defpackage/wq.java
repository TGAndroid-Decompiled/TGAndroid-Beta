package defpackage;

import android.view.View;
public abstract class wq {
    public static int a(View view) {
        return view.getTextAlignment();
    }

    public static int b(View view) {
        return view.getTextDirection();
    }

    public static void c(View view, int i) {
        view.setTextAlignment(i);
    }

    public static void d(View view, int i) {
        view.setTextDirection(i);
    }
}
