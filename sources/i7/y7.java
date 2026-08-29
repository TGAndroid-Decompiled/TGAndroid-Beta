package i7;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class y7 {
    public static StaticLayout f8550a;

    public static th.z a(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        if (f8550a == null) {
            f8550a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new th.z(f8550a, rect);
    }
}
