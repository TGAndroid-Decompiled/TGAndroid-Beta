package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.Components.eq;
public final class f5 extends TextView {
    public final eq f3521a;
    public final int f3522b;
    public final boolean f3523c;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f3523c = z10;
        if (z10) {
            org.telegram.ui.ActionBar.q6.U(this, org.telegram.ui.ActionBar.j6.G6, e6Var);
            setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
            setTextSize(1, 15.0f);
            this.f3522b = org.telegram.messenger.g0.L(40.0f);
        } else {
            int i7 = org.telegram.ui.ActionBar.j6.f29243y8;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            org.telegram.ui.ActionBar.q6.U(this, i7, e6Var);
            org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.j6.b0(org.telegram.ui.ActionBar.j6.r1(0.08f, w02), org.telegram.ui.ActionBar.j6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.08f, i7);
            org.telegram.ui.ActionBar.m6 K2 = org.telegram.ui.ActionBar.q6.K(0.15f, i7);
            setBackground(b02);
            org.telegram.ui.ActionBar.q6.j(this, b02, K, K2, e6Var);
            setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
            this.f3522b = org.telegram.messenger.g0.L(26.0f);
        }
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        if (!z10) {
            na.a(this);
        }
        eq eqVar = new eq(2131230873, 0);
        this.f3521a = eqVar;
        eqVar.H = 0.8f;
        eqVar.f34414r = 0.0f;
        eqVar.f34415s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f3522b, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3523c && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setSorting(bi.n5 r7) {
        throw new UnsupportedOperationException("Method not decompiled: bi.f5.setSorting(bi.n5):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f3521a, append.length() - 1, length, 33);
        setText(append);
    }
}
