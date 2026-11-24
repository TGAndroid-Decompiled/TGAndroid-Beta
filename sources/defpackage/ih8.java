package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ih8 extends LinearLayout {
    public int a;
    public final TextView b;
    public final l46 c;
    public LinearLayout d;
    public final qr7 e;
    public final ViewGroup f;
    public boolean h;
    public final jh8 n;

    public ih8(jh8 jh8Var, Context context, int i) {
        super(context);
        int i2;
        r84 r84Var;
        this.n = jh8Var;
        setOrientation(1);
        fi8 fi8Var = (fi8) jh8Var.n1.get(i);
        byte b = fi8Var.a;
        if (b == 0) {
            ?? kg0Var = new kg0(context, jh8Var.J0);
            kg0Var.b.setOnScrollListener(new ch8(jh8Var, (byte) 1));
            r84Var = kg0Var;
        } else if (b != 14 && b != 28) {
            if (b == 5) {
                r84Var = new qi8(context, jh8Var.a);
            } else if (b == 10) {
                r84Var = new xg8(context, jh8Var.J0);
            } else {
                r84Var = new acc(context, jh8Var.w1, jh8Var.a, fi8Var.a, jh8Var.J0);
            }
        } else {
            if (b == 28) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            r84 r84Var2 = new r84(i2, jh8Var.J0, context);
            r84Var2.b.setOnScrollListener(new ch8(jh8Var, (byte) 0));
            r84Var = r84Var2;
        }
        this.f = r84Var;
        addView(r84Var);
        this.e = r84Var;
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setGravity(1);
        int i3 = bkb.i5;
        tb4.w(textView, i3, jh8Var.J0, 1, 20.0f);
        addView(textView, nme.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
        l46 l46Var = new l46(context, null);
        this.c = l46Var;
        l46Var.setGravity(1);
        l46Var.setTextSize(1, 15.0f);
        zkb.X(l46Var, i3, jh8Var.J0);
        if (!jh8Var.y1) {
            l46Var.setLines(2);
        }
        addView(l46Var, nme.t(-1, -2, 1, 21, 10, 21, 16));
        setImportantForAccessibility(2);
        setClipChildren(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.f) {
            if (view instanceof kg0) {
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
        boolean z = viewGroup instanceof kg0;
        jh8 jh8Var = this.n;
        if (z) {
            ((kg0) viewGroup).setTopOffset(jh8Var.F1);
        }
        viewGroup.getLayoutParams().height = jh8Var.t1;
        l46 l46Var = this.c;
        l46Var.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
        if (this.h) {
            viewGroup.getLayoutParams().height = getMeasuredHeight() - gl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = gl.L(16.0f);
            textView.setVisibility(8);
            l46Var.setVisibility(8);
            super.onMeasure(i, i2);
        }
    }
}
