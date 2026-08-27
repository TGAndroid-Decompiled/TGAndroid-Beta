package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class y0 extends ViewGroup.MarginLayoutParams {

    public o1 f5864a;

    public final Rect f5865b;

    public boolean f5866c;
    public boolean d;

    public y0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5865b = new Rect();
        this.f5866c = true;
        this.d = false;
    }

    public final int a() {
        o1 o1Var = this.f5864a;
        if (o1Var == null) {
            return -1;
        }
        return o1Var.b();
    }

    public final int b() {
        o1 o1Var = this.f5864a;
        if (o1Var == null) {
            return -1;
        }
        return o1Var.c();
    }

    public y0(int i10, int i11) {
        super(i10, i11);
        this.f5865b = new Rect();
        this.f5866c = true;
        this.d = false;
    }

    public y0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5865b = new Rect();
        this.f5866c = true;
        this.d = false;
    }

    public y0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5865b = new Rect();
        this.f5866c = true;
        this.d = false;
    }

    public y0(y0 y0Var) {
        super((ViewGroup.LayoutParams) y0Var);
        this.f5865b = new Rect();
        this.f5866c = true;
        this.d = false;
    }
}
