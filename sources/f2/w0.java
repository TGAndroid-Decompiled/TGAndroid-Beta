package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class w0 extends ViewGroup.MarginLayoutParams {
    public l1 f5858a;
    public final Rect f5859b;
    public boolean f5860c;
    public boolean d;

    public w0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5859b = new Rect();
        this.f5860c = true;
        this.d = false;
    }

    public final int a() {
        l1 l1Var = this.f5858a;
        if (l1Var == null) {
            return -1;
        }
        return l1Var.b();
    }

    public final int b() {
        l1 l1Var = this.f5858a;
        if (l1Var == null) {
            return -1;
        }
        return l1Var.c();
    }

    public w0(int i10, int i11) {
        super(i10, i11);
        this.f5859b = new Rect();
        this.f5860c = true;
        this.d = false;
    }

    public w0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5859b = new Rect();
        this.f5860c = true;
        this.d = false;
    }

    public w0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5859b = new Rect();
        this.f5860c = true;
        this.d = false;
    }

    public w0(w0 w0Var) {
        super((ViewGroup.LayoutParams) w0Var);
        this.f5859b = new Rect();
        this.f5860c = true;
        this.d = false;
    }
}
