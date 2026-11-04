package b8;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class oe {
    public static StaticLayout f2996a;

    public static mi.z a(int i3, int i10, int i11, int i12) {
        Rect rect = new Rect(i3, i10, i11, i12);
        if (f2996a == null) {
            f2996a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new mi.z(f2996a, rect);
    }
}
