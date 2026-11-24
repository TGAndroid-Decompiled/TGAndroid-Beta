package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class xvb extends FrameLayout implements vlb {
    public boolean a;
    public bf0 b;
    public TextView c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.b9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a) {
            canvas.drawLine(gm.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        bf0 bf0Var = this.b;
        if (bf0Var != null) {
            try {
                if (bf0Var.getImageReceiver() != null && (bf0Var.getImageReceiver().t() instanceof mo4)) {
                    ((mo4) bf0Var.getImageReceiver().t()).a(cmb.w0(null, cmb.b9, false));
                    bf0Var.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
