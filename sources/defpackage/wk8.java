package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class wk8 extends LinearLayout {
    public int a;
    public final TextView b;
    public final p66 c;
    public LinearLayout d;
    public final wu7 e;
    public final ViewGroup f;
    public boolean h;
    public final xk8 n;

    public wk8(xk8 xk8Var, Context context, int i) {
        super(context);
        int i2;
        m94 m94Var;
        this.n = xk8Var;
        setOrientation(1);
        sl8 sl8Var = (sl8) xk8Var.n1.get(i);
        byte b = sl8Var.a;
        if (b == 0) {
            ?? lg0Var = new lg0(context, xk8Var.J0);
            lg0Var.b.setOnScrollListener(new qk8(xk8Var, (byte) 1));
            m94Var = lg0Var;
        } else if (b != 14 && b != 28) {
            if (b == 5) {
                m94Var = new dm8(context, xk8Var.a);
            } else if (b == 10) {
                m94Var = new lk8(context, xk8Var.J0);
            } else {
                m94Var = new yfc(context, xk8Var.w1, xk8Var.a, sl8Var.a, xk8Var.J0);
            }
        } else {
            if (b == 28) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            m94 m94Var2 = new m94(i2, xk8Var.J0, context);
            m94Var2.b.setOnScrollListener(new qk8(xk8Var, (byte) 0));
            m94Var = m94Var2;
        }
        this.f = m94Var;
        addView(m94Var);
        this.e = m94Var;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i3 = aob.j5;
        qd4.w(textView, i3, xk8Var.J0, 1, 20.0f);
        addView(textView, tre.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        p66 p66Var = new p66(context, null);
        this.c = p66Var;
        p66Var.setGravity(1);
        p66Var.setTextSize(1, 15.0f);
        yob.X(p66Var, i3, xk8Var.J0);
        if (!xk8Var.y1) {
            p66Var.setLines(2);
        }
        addView(p66Var, tre.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.f) {
            if (view instanceof lg0) {
                setTranslationY(0.0f);
                return super.drawChild(canvas, view, j);
            }
            setTranslationY(this.n.F1);
            canvas.save();
            canvas.clipRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        textView.setVisibility(0);
        ViewGroup viewGroup = this.f;
        boolean z = viewGroup instanceof lg0;
        xk8 xk8Var = this.n;
        if (z) {
            ((lg0) viewGroup).setTopOffset(xk8Var.F1);
        }
        viewGroup.getLayoutParams().height = xk8Var.t1;
        p66 p66Var = this.c;
        p66Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - hl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = hl.L(16.0f);
            textView.setVisibility(8);
            p66Var.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
