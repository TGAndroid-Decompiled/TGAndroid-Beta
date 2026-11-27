package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class rx0 extends View implements snb {
    public final tx0 a;

    public rx0(tx0 tx0Var, Context context) {
        super(context);
        this.a = tx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.n);
        setTranslationY(hl.n);
    }

    @Override
    public final void updateColors() {
        tx0 tx0Var = this.a;
        Paint paint = tx0Var.d;
        try {
            dy0 dy0Var = tx0Var.a;
            if (dy0Var != null) {
                boolean z = false;
                int e = dy0Var.e(aob.w0(null, aob.a7, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    hl.o3(tx0Var, e, true, null);
                    if (hl.B(e) >= 0.721f) {
                        z = true;
                    }
                    hl.i3(tx0Var, z);
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
