package g7;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public abstract class w6 {
    public static StaticLayout f7397a;

    public static qh.z a(int i9, int i10, int i11, int i12) {
        Rect rect = new Rect(i9, i10, i11, i12);
        if (f7397a == null) {
            f7397a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new qh.z(f7397a, rect);
    }
}
