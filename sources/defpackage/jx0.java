package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class jx0 extends View implements tjb {
    public final lx0 a;

    public jx0(lx0 lx0Var, Context context) {
        super(context);
        this.a = lx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.n);
        setTranslationY(gl.n);
    }

    @Override
    public final void updateColors() {
        lx0 lx0Var = this.a;
        Paint paint = lx0Var.d;
        try {
            vx0 vx0Var = lx0Var.a;
            if (vx0Var != null) {
                boolean z = false;
                int e = vx0Var.e(bkb.w0(null, bkb.Z6, false));
                if (paint.getColor() != e) {
                    paint.setColor(e);
                    invalidate();
                    gl.o3(lx0Var, e, true, null);
                    if (gl.B(e) >= 0.721f) {
                        z = true;
                    }
                    gl.i3(lx0Var, z);
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
