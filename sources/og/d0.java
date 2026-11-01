package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class d0 extends TableLayout {
    public final p6 f14183a;
    public final e0 f14184b;

    public d0(e0 e0Var, Context context, p6 p6Var) {
        super(context);
        this.f14184b = e0Var;
        this.f14183a = p6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int left;
        e0 e0Var = this.f14184b;
        e0Var.f14194w.set(0.0f, 0.0f, getWidth(), getHeight());
        e0Var.f14193s.rewind();
        e0Var.f14193s.addRoundRect(e0Var.f14194w, i0.L(6.0f), i0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        e0Var.f14192r.setColor(i0.b.f(0.1f, t6.w0(t6.f20931d7, this.f14183a), -1));
        e0Var.f14192r.setStrokeWidth(i0.L(1.0f));
        float height = getHeight();
        if (e0Var.D.getVisibility() == 0) {
            f7 = 5.0f;
        } else {
            f7 = 4.0f;
        }
        float f10 = height / f7;
        for (int i10 = 1; i10 <= 4; i10++) {
            float f11 = f10 * i10;
            canvas.drawLine(0.0f, f11, getWidth(), f11, e0Var.f14192r);
        }
        if (dd.X) {
            left = e0Var.e.getRight();
        } else {
            left = e0Var.e.getLeft();
        }
        float f12 = left;
        canvas.drawLine(f12, 0.0f, f12, getHeight(), e0Var.f14192r);
        e0Var.f14192r.setStrokeWidth(i0.L(2.0f));
        canvas.drawPath(e0Var.f14193s, e0Var.f14192r);
    }
}
