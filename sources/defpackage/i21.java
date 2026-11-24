package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.TextView;
public class i21 extends h11 {
    public final be0 a;
    public final TextView b;
    public final TextView c;

    public i21(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i = bkb.xj;
        getThemedColor(i);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.i(29.0f, 29.0f, 8388627, 12.0f, 12.0f, 12.0f, 12.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.i(-2.0f, -2.0f, 8388627, 54.0f, 8.0f, 12.0f, 8.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setSingleLine();
        tb4.w(textView, i, wjbVar, 1, 14.0f);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setMaxLines(2);
        zkb.X(textView2, i, wjbVar);
        zkb.G(textView2, bkb.wj, wjbVar);
        textView2.setMovementMethod(new LinkMovementMethod());
        textView2.setTypeface(Typeface.SANS_SERIF);
        textView2.setTextSize(1, 13.0f);
        linearLayout.addView(textView2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.b.getText()) + ".\n" + ((Object) this.c.getText());
    }
}
