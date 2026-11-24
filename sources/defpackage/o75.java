package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class o75 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final g95 e;

    public o75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = g95Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g95 g95Var = this.e;
        p75 p75Var = g95Var.y1;
        float y = p75Var.getY() + p75Var.getMeasuredHeight();
        h94 h94Var = g95Var.q5;
        RectF rectF = this.a;
        rectF.set(0.0f, y - h94Var.f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.b;
        rectF2.set(0.0f, p75Var.getY() + p75Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y2 = p75Var.getY() + p75Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, (p75Var.getY() + p75Var.getMeasuredHeight()) - h94Var.f, getMeasuredWidth(), y2);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i >= 29 && g95Var.G4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f = g95Var.H4;
            canvas.scale(f, f);
            canvas.drawRenderNode(g95Var.G4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(on2.l(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
