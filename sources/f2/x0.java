package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class x0 extends ViewGroup.MarginLayoutParams {
    public m1 f5952a;
    public final Rect f5953b;
    public boolean f5954c;
    public boolean d;

    public x0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5953b = new Rect();
        this.f5954c = true;
        this.d = false;
    }

    public final int a() {
        m1 m1Var = this.f5952a;
        if (m1Var == null) {
            return -1;
        }
        return m1Var.b();
    }

    public final int b() {
        m1 m1Var = this.f5952a;
        if (m1Var == null) {
            return -1;
        }
        return m1Var.c();
    }

    public x0(int i10, int i11) {
        super(i10, i11);
        this.f5953b = new Rect();
        this.f5954c = true;
        this.d = false;
    }

    public x0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5953b = new Rect();
        this.f5954c = true;
        this.d = false;
    }

    public x0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5953b = new Rect();
        this.f5954c = true;
        this.d = false;
    }

    public x0(x0 x0Var) {
        super((ViewGroup.LayoutParams) x0Var);
        this.f5953b = new Rect();
        this.f5954c = true;
        this.d = false;
    }
}
