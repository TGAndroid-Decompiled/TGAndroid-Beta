package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class n21 extends q11 {
    public final ImageView a;
    public final p66 b;

    public n21(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i = aob.yj;
        getThemedColor(i);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setDisablePaddingsOffsetY(true);
        p66Var.setSingleLine();
        yob.X(p66Var, i, vnbVar);
        p66Var.setTypeface(Typeface.SANS_SERIF);
        p66Var.setTextSize(1, 15.0f);
        addView(p66Var, tre.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
