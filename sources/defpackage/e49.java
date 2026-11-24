package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class e49 extends ViewGroup.MarginLayoutParams {
    public s49 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public e49(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public final int a() {
        s49 s49Var = this.a;
        if (s49Var == null) {
            return -1;
        }
        return s49Var.b();
    }

    public final int b() {
        s49 s49Var = this.a;
        if (s49Var == null) {
            return -1;
        }
        return s49Var.c();
    }

    public e49(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public e49(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public e49(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public e49(e49 e49Var) {
        super((ViewGroup.LayoutParams) e49Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
