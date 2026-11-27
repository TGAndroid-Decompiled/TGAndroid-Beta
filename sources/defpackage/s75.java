package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.ui.LaunchActivity;
public final class s75 extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final j95 e;

    public s75(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = j95Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j95 j95Var = this.e;
        t75 t75Var = j95Var.y1;
        float y = t75Var.getY() + t75Var.getMeasuredHeight();
        t84 t84Var = j95Var.q5;
        RectF rectF = this.a;
        rectF.set(0.0f, y - t84Var.f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.b;
        rectF2.set(0.0f, t75Var.getY() + t75Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y2 = t75Var.getY() + t75Var.getMeasuredHeight();
        RectF rectF3 = this.c;
        rectF3.set(0.0f, (t75Var.getY() + t75Var.getMeasuredHeight()) - t84Var.f, getMeasuredWidth(), y2);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i >= 29 && j95Var.G4 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f = j95Var.H4;
            canvas.scale(f, f);
            canvas.drawRenderNode(j95Var.G4);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(vm2.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
