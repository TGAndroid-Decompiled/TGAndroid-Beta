package ih;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xi0;
public final class r4 extends LinearLayout {
    public final TextView f9353a;

    public r4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(1);
        t9 t9Var = new t9(context);
        t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        addView(t9Var, i7.f6.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.f9353a = textView;
        org.telegram.ui.b.m(g6.A6, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        addView(textView, i7.f6.t(-1, -2, 7, 12, 12, 12, 24));
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
        this.f9353a.setText(charSequence);
    }
}
