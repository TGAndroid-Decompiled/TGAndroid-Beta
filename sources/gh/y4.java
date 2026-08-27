package gh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;

public final class y4 extends LinearLayout {

    public final TextView f7679a;

    public y4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(1);
        n9 n9Var = new n9(context);
        n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        addView(n9Var, h7.z5.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f7679a = textView;
        rl.l(org.telegram.ui.ActionBar.g6.A6, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, h7.z5.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
    }

    public void set(CharSequence charSequence) {
        this.f7679a.setText(charSequence);
    }
}
