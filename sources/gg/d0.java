package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class d0 extends TableLayout {
    public final c6 f7294a;
    public final e0 f7295b;

    public d0(e0 e0Var, Context context, c6 c6Var) {
        super(context);
        this.f7295b = e0Var;
        this.f7294a = c6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        int left;
        e0 e0Var = this.f7295b;
        e0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        e0Var.f7305s.rewind();
        e0Var.f7305s.addRoundRect(e0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        e0Var.f7304r.setColor(i0.a.d(0.1f, g6.v0(g6.f23063d7, this.f7294a), -1));
        e0Var.f7304r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight();
        if (e0Var.f7308y.getVisibility() == 0) {
            f9 = 5.0f;
        } else {
            f9 = 4.0f;
        }
        float f10 = height / f9;
        for (int i10 = 1; i10 <= 4; i10++) {
            float f11 = f10 * i10;
            canvas.drawLine(0.0f, f11, getWidth(), f11, e0Var.f7304r);
        }
        if (LocaleController.isRTL) {
            left = e0Var.f7301e.getRight();
        } else {
            left = e0Var.f7301e.getLeft();
        }
        float f12 = left;
        canvas.drawLine(f12, 0.0f, f12, getHeight(), e0Var.f7304r);
        e0Var.f7304r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(e0Var.f7305s, e0Var.f7304r);
    }
}
