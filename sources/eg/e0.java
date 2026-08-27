package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class e0 extends TableLayout {

    public final c6 f5403a;

    public final f0 f5404b;

    public e0(f0 f0Var, Context context, c6 c6Var) {
        super(context);
        this.f5404b = f0Var;
        this.f5403a = c6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f0 f0Var = this.f5404b;
        f0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        f0Var.f5412s.rewind();
        f0Var.f5412s.addRoundRect(f0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        f0Var.f5411r.setColor(i0.b.d(0.1f, g6.v0(g6.f23054d7, this.f5403a), -1));
        f0Var.f5411r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight() / (f0Var.f5415y.getVisibility() == 0 ? 5.0f : 4.0f);
        for (int i10 = 1; i10 <= 4; i10++) {
            float f10 = height * i10;
            canvas.drawLine(0.0f, f10, getWidth(), f10, f0Var.f5411r);
        }
        float right = LocaleController.isRTL ? f0Var.f5408e.getRight() : f0Var.f5408e.getLeft();
        canvas.drawLine(right, 0.0f, right, getHeight(), f0Var.f5411r);
        f0Var.f5411r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(f0Var.f5412s, f0Var.f5411r);
    }
}
