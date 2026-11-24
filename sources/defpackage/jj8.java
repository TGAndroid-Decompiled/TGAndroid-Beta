package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class jj8 extends LinearLayout {
    public int a;
    public final TextView b;
    public final l66 c;
    public LinearLayout d;
    public final rt7 e;
    public final ViewGroup f;
    public boolean h;
    public final kj8 n;

    public jj8(kj8 kj8Var, Context context, int i) {
        super(context);
        int i2;
        aa4 aa4Var;
        this.n = kj8Var;
        setOrientation(1);
        hk8 hk8Var = (hk8) kj8Var.n1.get(i);
        byte b = hk8Var.a;
        if (b == 0) {
            ?? lh0Var = new lh0(context, kj8Var.J0);
            lh0Var.b.setOnScrollListener(new ej8(kj8Var, (byte) 1));
            aa4Var = lh0Var;
        } else if (b != 14 && b != 28) {
            if (b == 5) {
                aa4Var = new sk8(context, kj8Var.a);
            } else if (b == 10) {
                aa4Var = new zi8(context, kj8Var.J0);
            } else {
                aa4Var = new bec(context, kj8Var.w1, kj8Var.a, hk8Var.a, kj8Var.J0);
            }
        } else {
            if (b == 28) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            aa4 aa4Var2 = new aa4(i2, kj8Var.J0, context);
            aa4Var2.b.setOnScrollListener(new ej8(kj8Var, (byte) 0));
            aa4Var = aa4Var2;
        }
        this.f = aa4Var;
        addView(aa4Var);
        this.e = aa4Var;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i3 = cmb.i5;
        td4.x(textView, i3, kj8Var.J0, 1, 20.0f);
        addView(textView, qoe.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l66 l66Var = new l66(context, null);
        this.c = l66Var;
        l66Var.setGravity(1);
        l66Var.setTextSize(1, 15.0f);
        anb.X(l66Var, i3, kj8Var.J0);
        if (!kj8Var.y1) {
            l66Var.setLines(2);
        }
        addView(l66Var, qoe.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.f) {
            if (view instanceof lh0) {
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
        boolean z = viewGroup instanceof lh0;
        kj8 kj8Var = this.n;
        if (z) {
            ((lh0) viewGroup).setTopOffset(kj8Var.F1);
        }
        viewGroup.getLayoutParams().height = kj8Var.t1;
        l66 l66Var = this.c;
        l66Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - gm.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = gm.L(16.0f);
            textView.setVisibility(8);
            l66Var.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
