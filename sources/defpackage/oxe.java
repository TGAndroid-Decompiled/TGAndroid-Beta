package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class oxe {
    public static StaticLayout a;

    public static af9 a(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        StaticLayout staticLayout = a;
        if (staticLayout == null) {
            StaticLayout staticLayout2 = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            a = staticLayout2;
            staticLayout = staticLayout2;
        }
        return new af9(staticLayout, rect);
    }
}
