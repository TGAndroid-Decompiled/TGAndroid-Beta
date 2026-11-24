package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class st7 extends TextView {
    public final tt7 a;

    public st7(tt7 tt7Var, Context context, int i) {
        super(context);
        this.a = tt7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        tt7 tt7Var = this.a;
        if (tt7Var.e.getAdapter() instanceof y14) {
            ((y14) tt7Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z) {
        float f;
        float f2;
        super.setSelected(z);
        Drawable background = getBackground();
        tt7 tt7Var = this.a;
        if (background != null) {
            if (z) {
                f2 = 0.1f;
            } else {
                f2 = 0.05f;
            }
            cmb.F1(background, tt7Var.b(f2), true);
        }
        if (z) {
            f = 0.8f;
        } else {
            f = 0.6f;
        }
        setTextColor(tt7Var.b(f));
    }
}
