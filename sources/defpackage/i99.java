package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class i99 extends TextView {
    public final cm2 a;
    public final int b;
    public final boolean c;

    public i99(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.c = z;
        if (z) {
            zkb.X(this, bkb.F6, wjbVar);
            setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = gl.L(40.0f);
        } else {
            int i = bkb.x8;
            int v0 = bkb.v0(i, wjbVar);
            zkb.X(this, i, wjbVar);
            ff0 Z = bkb.Z(bkb.p1(0.08f, v0), bkb.p1(0.15f, v0), gl.L(13.0f), gl.L(13.0f));
            vkb K = zkb.K(0.08f, i);
            vkb K2 = zkb.K(0.15f, i);
            setBackground(Z);
            zkb.j(this, Z, K, K2, wjbVar);
            setPadding(gl.L(11.0f), 0, gl.L(11.0f), 0);
            this.b = gl.L(26.0f);
        }
        setGravity(17);
        setTypeface(gl.o());
        if (!z) {
            ote.a(this);
        }
        cm2 cm2Var = new cm2(2131230873, 0);
        this.a = cm2Var;
        cm2Var.H = 0.8f;
        cm2Var.r = 0.0f;
        cm2Var.s = gl.L(1.0f);
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

    public void setSorting(defpackage.p99 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i99.setSorting(p99):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.a, append.length() - 1, length, 33);
        setText(append);
    }
}
