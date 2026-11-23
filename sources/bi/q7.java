package bi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p9;
public final class q7 extends LinearLayout {
    public final TextView f4006a;

    public q7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setOrientation(1);
        p9 p9Var = new p9(context);
        p9Var.setImageDrawable(new nh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(p9Var, na.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f4006a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
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
