package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
public class y11 extends h11 {
    public final be0 a;
    public final TextView b;

    public y11(Context context, wjb wjbVar) {
        super(context, wjbVar);
        be0 be0Var = new be0(getContext());
        this.a = be0Var;
        TextView textView = new TextView(getContext());
        this.b = textView;
        addView(be0Var, nme.i(30.0f, 30.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        textView.setGravity(8388611);
        textView.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        zkb.X(textView, bkb.xj, wjbVar);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(Typeface.SANS_SERIF);
        addView(textView, nme.i(-1.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
