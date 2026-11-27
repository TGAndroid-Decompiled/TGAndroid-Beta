package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class r79 extends ViewGroup.MarginLayoutParams {
    public f89 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public r79(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        f89 f89Var = this.a;
        if (f89Var == null) {
            return -1;
        }
        return f89Var.b();
    }

    public final int b() {
        f89 f89Var = this.a;
        if (f89Var == null) {
            return -1;
        }
        return f89Var.c();
    }

    public r79(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public r79(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public r79(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public r79(r79 r79Var) {
        super((ViewGroup.LayoutParams) r79Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
