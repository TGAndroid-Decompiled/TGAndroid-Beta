package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class ib9 extends TextView {
    public final pn2 a;
    public final int b;
    public final boolean c;

    public ib9(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.c = z;
        if (z) {
            anb.X(this, cmb.F6, ylbVar);
            setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = gm.L(40.0f);
        } else {
            int i = cmb.x8;
            int v0 = cmb.v0(i, ylbVar);
            anb.X(this, i, ylbVar);
            fg0 Z = cmb.Z(cmb.p1(0.08f, v0), cmb.p1(0.15f, v0), gm.L(13.0f), gm.L(13.0f));
            wmb K = anb.K(0.08f, i);
            wmb K2 = anb.K(0.15f, i);
            setBackground(Z);
            anb.j(this, Z, K, K2, ylbVar);
            setPadding(gm.L(11.0f), 0, gm.L(11.0f), 0);
            this.b = gm.L(26.0f);
        }
        setGravity(17);
        setTypeface(gm.o());
        if (!z) {
            rve.a(this);
        }
        pn2 pn2Var = new pn2(2131230874, 0);
        this.a = pn2Var;
        pn2Var.H = 0.8f;
        pn2Var.r = 0.0f;
        pn2Var.s = gm.L(1.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.c && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setSorting(defpackage.pb9 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib9.setSorting(pb9):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.a, append.length() - 1, length, 33);
        setText(append);
    }
}
