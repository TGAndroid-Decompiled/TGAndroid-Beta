package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d0 extends TableLayout {
    public final f6 f7504a;
    public final e0 f7505b;

    public d0(e0 e0Var, Context context, f6 f6Var) {
        super(context);
        this.f7505b = e0Var;
        this.f7504a = f6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        e0 e0Var = this.f7505b;
        e0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        e0Var.f7514s.rewind();
        e0Var.f7514s.addRoundRect(e0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        e0Var.f7513r.setColor(i0.a.d(0.1f, j6.v0(j6.f19907d7, this.f7504a), -1));
        e0Var.f7513r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight();
        if (e0Var.f7517y.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i10 = 1; i10 <= 4; i10++) {
            float f12 = f11 * i10;
            canvas.drawLine(0.0f, f12, getWidth(), f12, e0Var.f7513r);
        }
        if (LocaleController.isRTL) {
            left = e0Var.e.getRight();
        } else {
            left = e0Var.e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), e0Var.f7513r);
        e0Var.f7513r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(e0Var.f7514s, e0Var.f7513r);
    }
}
