package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class f extends FrameLayout {
    public final h6 f1072a;
    public final TextView f1073b;

    public f(Context context, h6 h6Var) {
        super(context);
        int i7;
        this.f1072a = h6Var;
        t6.h(m6.f27910e7, this, h6Var);
        TextView textView = new TextView(getContext());
        this.f1073b = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        t6.U(textView, m6.f27929f7, h6Var);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, ha.d(-1, -1.0f, (id.f23161a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f1073b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        t6.U(this.f1073b, i7, this.f1072a);
    }
}
