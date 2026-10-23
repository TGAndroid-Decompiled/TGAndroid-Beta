package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hw0;
public class z3 extends View implements b6 {
    public final hw0 f11608a;
    public final Paint f11609b;
    public float f11610c;
    public o1.k d;
    public final g6 e;

    public z3(Context context, g6 g6Var) {
        super(context);
        hw0 hw0Var = new hw0(new fh.b(11), new fh.b(12));
        hw0Var.f27066c = 100.0f;
        this.f11608a = hw0Var;
        Paint paint = new Paint(1);
        this.f11609b = paint;
        this.e = g6Var;
        paint.setColor(k6.w0(k6.Oh, g6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11610c > 0.0f) {
            Paint paint = this.f11609b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f11610c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f11608a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f17622u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f11610c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f17622u.f17628i = f7 * 100.0f;
        kVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f11609b.setColor(k6.w0(k6.Oh, this.e));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
