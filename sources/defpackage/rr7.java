package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class rr7 extends TextView {
    public final sr7 a;

    public rr7(sr7 sr7Var, Context context, int i) {
        super(context);
        this.a = sr7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        sr7 sr7Var = this.a;
        if (sr7Var.e.getAdapter() instanceof n04) {
            ((n04) sr7Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z) {
        float f;
        float f2;
        super.setSelected(z);
        Drawable background = getBackground();
        sr7 sr7Var = this.a;
        if (background != null) {
            if (z) {
                f2 = 0.1f;
            } else {
                f2 = 0.05f;
            }
            bkb.F1(background, sr7Var.b(f2), true);
        }
        if (z) {
            f = 0.8f;
        } else {
            f = 0.6f;
        }
        setTextColor(sr7Var.b(f));
    }
}
