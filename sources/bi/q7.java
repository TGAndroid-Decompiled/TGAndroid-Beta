package bi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.q9;
public final class q7 extends LinearLayout {
    public final TextView f4006a;

    public q7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(1);
        q9 q9Var = new q9(context);
        q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(q9Var, na.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f4006a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A6, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, na.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }

    public void set(CharSequence charSequence) {
        this.f4006a.setText(charSequence);
    }
}
