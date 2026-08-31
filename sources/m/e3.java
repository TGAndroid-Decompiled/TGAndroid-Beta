package m;

import android.graphics.Path;
import android.graphics.Rect;
public final class e3 {
    public boolean f13182a;
    public boolean f13183b;
    public Object f13184c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z4, boolean z10) {
        boolean z11;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f13182a == z10 && this.f13183b == z4 && z10 && z4) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f13182a = z10;
        this.f13183b = z4;
        rect2.set(rect);
        return z11;
    }
}
