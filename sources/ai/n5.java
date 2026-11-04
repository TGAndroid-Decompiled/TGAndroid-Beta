package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.k9;
public final class n5 extends LinearLayout {
    public final TextView f842a;

    public n5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(1);
        k9 k9Var = new k9(context);
        k9Var.setImageDrawable(new ch0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        addView(k9Var, mf.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f842a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, mf.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            size = org.telegram.messenger.g0.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }

    public void set(CharSequence charSequence) {
        this.f842a.setText(charSequence);
    }
}
