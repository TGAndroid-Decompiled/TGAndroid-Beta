package fh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;
public final class f5 extends LinearLayout {
    public final TextView f6458a;

    public f5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setOrientation(1);
        o9 o9Var = new o9(context);
        o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        addView(o9Var, g7.e6.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f6458a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.A6, b6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, g7.e6.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = AndroidUtilities.dp(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
    }

    public void set(CharSequence charSequence) {
        this.f6458a.setText(charSequence);
    }
}
