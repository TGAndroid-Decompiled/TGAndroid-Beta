package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ix5 extends FrameLayout implements vlb {
    public final lka a;
    public final hd0 b;
    public boolean c;
    public int d;
    public final jx5 e;

    public ix5(jx5 jx5Var, Context context) {
        super(context);
        this.e = jx5Var;
        int i = cmb.h6;
        this.d = cmb.w0(null, i, false);
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTextSize(16);
        lkaVar.setEllipsizeByGradient(true);
        lkaVar.setRightPadding(gm.L(68.0f));
        anb.W(lkaVar, cmb.i5, null);
        addView(lkaVar, qoe.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        hd0 hd0Var = new hd0(context, false);
        this.b = hd0Var;
        hd0Var.a.a = true;
        hd0Var.setStyle(11);
        hd0Var.setAvatarsTextSize(gm.L(22.0f));
        addView(hd0Var, qoe.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(cmb.Y(cmb.w0(null, i, false), 0, 4));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.c = true;
        lka lkaVar = this.a;
        lkaVar.setVisibility(8);
        super.onMeasure(i, i2);
        lkaVar.setVisibility(0);
        lkaVar.getLayoutParams().width = getMeasuredWidth();
        this.c = false;
        this.e.g();
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.h6, false);
            if (w0 != this.d) {
                this.d = w0;
                cmb.F1(getBackground(), w0, true);
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
