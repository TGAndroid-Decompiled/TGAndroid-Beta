package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.ra;
import org.telegram.ui.Components.nq;
public final class p7 extends TextView {
    public final nq f4005a;
    public final int f4006b;
    public final boolean f4007c;

    public p7(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.f4007c = z10;
        if (z10) {
            org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.G6, h6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.f4006b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = org.telegram.ui.ActionBar.m6.f29772y8;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            org.telegram.ui.ActionBar.t6.U(this, i7, h6Var);
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.m6.b0(org.telegram.ui.ActionBar.m6.r1(0.08f, w02), org.telegram.ui.ActionBar.m6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.08f, i7);
            org.telegram.ui.ActionBar.p6 K2 = org.telegram.ui.ActionBar.t6.K(0.15f, i7);
            setBackground(b02);
            org.telegram.ui.ActionBar.t6.j(this, b02, K, K2, h6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.f4006b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            ra.a(this);
        }
        nq nqVar = new nq(2131230873, 0);
        this.f4005a = nqVar;
        nqVar.H = 0.8f;
        nqVar.f37946r = 0.0f;
        nqVar.f37947s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f4006b, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4007c && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setSorting(bi.x7 r7) {
        throw new UnsupportedOperationException("Method not decompiled: bi.p7.setSorting(bi.x7):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f4005a, append.length() - 1, length, 33);
        setText(append);
    }
}
