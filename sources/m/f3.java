package m;

import android.graphics.Path;
import android.graphics.Rect;
public final class f3 {
    public boolean f16543a;
    public boolean f16544b;
    public Object f16545c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        boolean z12;
        Rect rect2 = (Rect) this.d;
        if (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f16543a == z11 && this.f16544b == z10 && z11 && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f16543a = z11;
        this.f16544b = z10;
        rect2.set(rect);
        return z12;
    }
}
