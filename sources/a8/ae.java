package a8;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class ae {
    public static StaticLayout f358a;

    public static li.a0 a(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        if (f358a == null) {
            f358a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new li.a0(f358a, rect);
    }
}
