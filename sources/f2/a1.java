package f2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
public class a1 extends ViewGroup.MarginLayoutParams {
    public q1 f5311a;
    public final Rect f5312b;
    public boolean f5313c;
    public boolean d;

    public a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5312b = new Rect();
        this.f5313c = true;
        this.d = false;
    }

    public final int a() {
        q1 q1Var = this.f5311a;
        if (q1Var == null) {
            return -1;
        }
        return q1Var.b();
    }

    public final int b() {
        q1 q1Var = this.f5311a;
        if (q1Var == null) {
            return -1;
        }
        return q1Var.c();
    }

    public a1(int i9, int i10) {
        super(i9, i10);
        this.f5312b = new Rect();
        this.f5313c = true;
        this.d = false;
    }

    public a1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5312b = new Rect();
        this.f5313c = true;
        this.d = false;
    }

    public a1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5312b = new Rect();
        this.f5313c = true;
        this.d = false;
    }

    public a1(a1 a1Var) {
        super((ViewGroup.LayoutParams) a1Var);
        this.f5312b = new Rect();
        this.f5313c = true;
        this.d = false;
    }
}
