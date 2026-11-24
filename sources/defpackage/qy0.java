package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class qy0 extends View implements vlb {
    public final sy0 a;

    public qy0(sy0 sy0Var, Context context) {
        super(context);
        this.a = sy0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.n);
        setTranslationY(gm.n);
    }

    @Override
    public final void updateColors() {
        sy0 sy0Var = this.a;
        Paint paint = sy0Var.d;
        try {
            cz0 cz0Var = sy0Var.a;
            if (cz0Var != null) {
                boolean z = false;
                int e = cz0Var.e(cmb.w0(null, cmb.Z6, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    gm.o3(sy0Var, e, true, null);
                    if (gm.B(e) >= 0.721f) {
                        z = true;
                    }
                    gm.i3(sy0Var, z);
                }
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
