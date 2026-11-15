package c8;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class da {
    public static StaticLayout f4257a;

    public static oi.y a(int i7, int i10, int i11, int i12) {
        Rect rect = new Rect(i7, i10, i11, i12);
        if (f4257a == null) {
            f4257a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new oi.y(f4257a, rect);
    }
}
