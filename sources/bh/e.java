package bh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class e extends FrameLayout {
    public final e6 f3312a;
    public final TextView f3313b;

    public e(Context context, e6 e6Var) {
        super(context);
        int i3;
        this.f3312a = e6Var;
        r6.i(k6.f27899e7, this, e6Var);
        TextView textView = new TextView(getContext());
        this.f3313b = textView;
        p1.t(textView, 1, 14.0f);
        r6.V(textView, k6.f27918f7, e6Var);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        addView(textView, mf.d(-1, -1.0f, (bd.f21784a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f3313b.setText(charSequence);
    }

    public void setTextColor(int i3) {
        r6.V(this.f3313b, i3, this.f3312a);
    }
}
