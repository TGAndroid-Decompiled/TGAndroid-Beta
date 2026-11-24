package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class wtb extends FrameLayout implements tjb {
    public boolean a;
    public be0 b;
    public TextView c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.b9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a) {
            canvas.drawLine(gl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        be0 be0Var = this.b;
        if (be0Var != null) {
            try {
                if (be0Var.getImageReceiver() != null && (be0Var.getImageReceiver().t() instanceof lm4)) {
                    ((lm4) be0Var.getImageReceiver().t()).a(bkb.w0(null, bkb.b9, false));
                    be0Var.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
