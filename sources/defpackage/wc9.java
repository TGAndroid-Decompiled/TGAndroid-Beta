package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
public final class wc9 extends TextView {
    public final wm2 a;
    public final int b;
    public final boolean c;

    public wc9(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.c = z;
        if (z) {
            yob.X(this, aob.G6, vnbVar);
            setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.b = hl.L(40.0f);
        } else {
            int i = aob.y8;
            int v0 = aob.v0(i, vnbVar);
            yob.X(this, i, vnbVar);
            hf0 Z = aob.Z(aob.p1(0.08f, v0), aob.p1(0.15f, v0), hl.L(13.0f), hl.L(13.0f));
            uob K = yob.K(0.08f, i);
            uob K2 = yob.K(0.15f, i);
            setBackground(Z);
            yob.j(this, Z, K, K2, vnbVar);
            setPadding(hl.L(11.0f), 0, hl.L(11.0f), 0);
            this.b = hl.L(26.0f);
        }
        setGravity(17);
        setTypeface(hl.o());
        if (!z) {
            iye.a(this);
        }
        wm2 wm2Var = new wm2(2131230873, 0);
        this.a = wm2Var;
        wm2Var.H = 0.8f;
        wm2Var.r = 0.0f;
        wm2Var.s = hl.L(1.0f);
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

    public void setSorting(defpackage.dd9 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc9.setSorting(dd9):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.a, append.length() - 1, length, 33);
        setText(append);
    }
}
