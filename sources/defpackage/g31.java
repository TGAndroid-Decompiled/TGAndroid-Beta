package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class g31 extends p21 {
    public final bf0 a;
    public final TextView b;

    public g31(Context context, ylb ylbVar) {
        super(context, ylbVar);
        bf0 bf0Var = new bf0(getContext());
        this.a = bf0Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(bf0Var, qoe.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        anb.X(textView, cmb.xj, ylbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, qoe.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
