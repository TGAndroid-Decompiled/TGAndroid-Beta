package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class xxb extends FrameLayout implements snb {
    public boolean a;
    public de0 b;
    public TextView c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a) {
            canvas.drawLine(hl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        de0 de0Var = this.b;
        if (de0Var != null) {
            try {
                if (de0Var.getImageReceiver() != null && (de0Var.getImageReceiver().t() instanceof qo4)) {
                    ((qo4) de0Var.getImageReceiver().t()).a(aob.w0(null, aob.c9, false));
                    de0Var.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
