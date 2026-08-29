package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class x0 extends ViewGroup.MarginLayoutParams {
    public n1 f6508a;
    public final Rect f6509b;
    public boolean f6510c;
    public boolean d;

    public x0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6509b = new Rect();
        this.f6510c = true;
        this.d = false;
    }

    public final int a() {
        n1 n1Var = this.f6508a;
        if (n1Var == null) {
            return -1;
        }
        return n1Var.b();
    }

    public final int b() {
        n1 n1Var = this.f6508a;
        if (n1Var == null) {
            return -1;
        }
        return n1Var.c();
    }

    public x0(int i10, int i11) {
        super(i10, i11);
        this.f6509b = new Rect();
        this.f6510c = true;
        this.d = false;
    }

    public x0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6509b = new Rect();
        this.f6510c = true;
        this.d = false;
    }

    public x0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6509b = new Rect();
        this.f6510c = true;
        this.d = false;
    }

    public x0(x0 x0Var) {
        super((ViewGroup.LayoutParams) x0Var);
        this.f6509b = new Rect();
        this.f6510c = true;
        this.d = false;
    }
}
