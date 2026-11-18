package bi;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.q9;
public final class k7 extends LinearLayout {
    public final TextView f3792a;

    public k7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setOrientation(1);
        q9 q9Var = new q9(context);
        q9Var.setImageDrawable(new mh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(q9Var, ma.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f3792a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.A6, i6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, ma.t(-1, -2, 7, 12, 12, 12, 24));
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
        this.f3792a.setText(charSequence);
    }
}
