package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class f0 extends TableLayout {
    public final b6 f4512a;
    public final g0 f4513b;

    public f0(g0 g0Var, Context context, b6 b6Var) {
        super(context);
        this.f4513b = g0Var;
        this.f4512a = b6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        g0 g0Var = this.f4513b;
        g0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        g0Var.f4521s.rewind();
        g0Var.f4521s.addRoundRect(g0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        g0Var.f4520r.setColor(i0.a.d(0.1f, f6.v0(f6.f23002d7, this.f4512a), -1));
        g0Var.f4520r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight();
        if (g0Var.f4524y.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i9 = 1; i9 <= 4; i9++) {
            float f12 = f11 * i9;
            canvas.drawLine(0.0f, f12, getWidth(), f12, g0Var.f4520r);
        }
        if (LocaleController.isRTL) {
            left = g0Var.f4517e.getRight();
        } else {
            left = g0Var.f4517e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), g0Var.f4520r);
        g0Var.f4520r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(g0Var.f4521s, g0Var.f4520r);
    }
}
