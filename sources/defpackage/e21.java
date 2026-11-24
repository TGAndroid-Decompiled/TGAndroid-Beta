package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class e21 extends h11 {
    public final ImageView a;
    public final l46 b;

    public e21(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i = bkb.xj;
        getThemedColor(i);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        l46 l46Var = new l46(context, null);
        this.b = l46Var;
        l46Var.setDisablePaddingsOffsetY(true);
        l46Var.setSingleLine();
        zkb.X(l46Var, i, wjbVar);
        l46Var.setTypeface(Typeface.SANS_SERIF);
        l46Var.setTextSize(1, 15.0f);
        addView(l46Var, nme.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }
}
