package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class d0 extends TableLayout {
    public final g6 f10024a;
    public final e0 f10025b;

    public d0(e0 e0Var, Context context, g6 g6Var) {
        super(context);
        this.f10025b = e0Var;
        this.f10024a = g6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        e0 e0Var = this.f10025b;
        e0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        e0Var.f10035s.rewind();
        e0Var.f10035s.addRoundRect(e0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        e0Var.f10034r.setColor(i0.a.d(0.1f, k6.v0(k6.f21662d7, this.f10024a), -1));
        e0Var.f10034r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight();
        if (e0Var.f10038y.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i10 = 1; i10 <= 4; i10++) {
            float f12 = f11 * i10;
            canvas.drawLine(0.0f, f12, getWidth(), f12, e0Var.f10034r);
        }
        if (LocaleController.isRTL) {
            left = e0Var.f10031e.getRight();
        } else {
            left = e0Var.f10031e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), e0Var.f10034r);
        e0Var.f10034r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(e0Var.f10035s, e0Var.f10034r);
    }
}
