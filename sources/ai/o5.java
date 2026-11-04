package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import b8.pf;
import org.telegram.ui.Components.wp;
public final class o5 extends TextView {
    public final wp f867a;

    public o5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = org.telegram.ui.ActionBar.k6.f28275y8;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.V(this, i3, e6Var);
        org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.r1(0.08f, w02), org.telegram.ui.ActionBar.k6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.08f, i3);
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.15f, i3);
        setBackground(b02);
        org.telegram.ui.ActionBar.r6.k(this, b02, L, L2, e6Var);
        setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        pf.a(this);
        wp wpVar = new wp(2131230873, 0);
        this.f867a = wpVar;
        wpVar.H = 0.8f;
        wpVar.f40045r = 0.0f;
        wpVar.f40046s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }

    public void setSorting(ai.v5 r7) {
        throw new UnsupportedOperationException("Method not decompiled: ai.o5.setSorting(ai.v5):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f867a, append.length() - 1, length, 33);
        setText(append);
    }
}
