package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
public final class xu7 extends TextView {
    public final yu7 a;

    public xu7(yu7 yu7Var, Context context, int i) {
        super(context);
        this.a = yu7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu7 yu7Var = this.a;
        if (yu7Var.e.getAdapter() instanceof i14) {
            ((i14) yu7Var.e.getAdapter()).getClass();
        }
    }

    @Override
    public final void setSelected(boolean z) {
        float f;
        float f2;
        super.setSelected(z);
        Drawable background = getBackground();
        yu7 yu7Var = this.a;
        if (background != null) {
            if (z) {
                f2 = 0.1f;
            } else {
                f2 = 0.05f;
            }
            aob.F1(background, yu7Var.b(f2), true);
        }
        if (z) {
            f = 0.8f;
        } else {
            f = 0.6f;
        }
        setTextColor(yu7Var.b(f));
    }
}
