package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class vc9 extends LinearLayout {
    public final TextView a;

    public vc9(Context context, vnb vnbVar) {
        super(context);
        setOrientation(1);
        de0 de0Var = new de0(context);
        de0Var.setImageDrawable(new b29(2131624315, hl.L(130.0f), hl.L(130.0f)));
        addView(de0Var, tre.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.A6, vnbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, tre.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = hl.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
