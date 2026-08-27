package m;

import android.graphics.Path;
import android.graphics.Rect;

public final class f3 {

    public boolean f17319a;

    public boolean f17320b;

    public Object f17321c = new Path();
    public Object d = new Rect();

    public boolean a(Rect rect, boolean z10, boolean z11) {
        Rect rect2 = (Rect) this.d;
        boolean z12 = (!rect2.isEmpty() && rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.f17319a == z11 && this.f17320b == z10 && z11 && z10) ? false : true;
        this.f17319a = z11;
        this.f17320b = z10;
        rect2.set(rect);
        return z12;
    }
}
