package c8;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class m1 {
    public static StaticLayout f5760a;

    public static li.a0 a(int i7, int i10, int i11, int i12) {
        Rect rect = new Rect(i7, i10, i11, i12);
        if (f5760a == null) {
            f5760a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new li.a0(f5760a, rect);
    }
}
