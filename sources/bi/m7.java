package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.ra;
import org.telegram.ui.Components.lq;
public final class m7 extends TextView {
    public final lq f3887a;
    public final int f3888b;
    public final boolean f3889c;

    public m7(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f3889c = z10;
        if (z10) {
            org.telegram.ui.ActionBar.u6.U(this, org.telegram.ui.ActionBar.n6.G6, i6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.f3888b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = org.telegram.ui.ActionBar.n6.f29790y8;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
            org.telegram.ui.ActionBar.u6.U(this, i7, i6Var);
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.n6.b0(org.telegram.ui.ActionBar.n6.r1(0.08f, w02), org.telegram.ui.ActionBar.n6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.08f, i7);
            org.telegram.ui.ActionBar.q6 K2 = org.telegram.ui.ActionBar.u6.K(0.15f, i7);
            setBackground(b02);
            org.telegram.ui.ActionBar.u6.j(this, b02, K, K2, i6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.f3888b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            ra.a(this);
        }
        lq lqVar = new lq(2131230873, 0);
        this.f3887a = lqVar;
        lqVar.H = 0.8f;
        lqVar.f37198r = 0.0f;
        lqVar.f37199s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f3888b, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3889c && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setSorting(bi.u7 r7) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m7.setSorting(bi.u7):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f3887a, append.length() - 1, length, 33);
        setText(append);
    }
}
