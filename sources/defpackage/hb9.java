package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class hb9 extends LinearLayout {
    public final TextView a;

    public hb9(Context context, ylb ylbVar) {
        super(context);
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageDrawable(new p09(2131624315, gm.L(130.0f), gm.L(130.0f)));
        addView(bf0Var, qoe.t(64, 64, 17, 0, 32, 0, 0));
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.z6, ylbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        addView(textView, qoe.t(-1, -2, 7, 12, 12, 12, 24));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = gm.L(250.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public void set(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
