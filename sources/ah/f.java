package ah;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class f extends FrameLayout {
    public final f6 f1072a;
    public final TextView f1073b;

    public f(Context context, f6 f6Var) {
        super(context);
        int i7;
        this.f1072a = f6Var;
        r6.i(k6.f27872e7, this, f6Var);
        TextView textView = new TextView(getContext());
        this.f1073b = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        r6.V(textView, k6.f27891f7, f6Var);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, ha.d(-1, -1.0f, (id.f23157a0 ? 5 : 3) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(32.0f), 1073741824));
    }

    public void setLetter(CharSequence charSequence) {
        this.f1073b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        r6.V(this.f1073b, i7, this.f1072a);
    }
}
