package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class q55 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final h75 e;

    public q55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = h75Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h75 h75Var = this.e;
        r55 r55Var = h75Var.y1;
        float y = r55Var.getY() + r55Var.getMeasuredHeight();
        y74 y74Var = h75Var.q5;
        RectF rectF = this.a;
        rectF.set(0.0f, y - y74Var.f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.b;
        rectF2.set(0.0f, r55Var.getY() + r55Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y2 = r55Var.getY() + r55Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, (r55Var.getY() + r55Var.getMeasuredHeight()) - y74Var.f, getMeasuredWidth(), y2);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i >= 29 && h75Var.G4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f = h75Var.H4;
            canvas.scale(f, f);
            canvas.drawRenderNode(h75Var.G4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(bm2.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
