package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.qw0;
public class i4 extends View implements p6 {
    public final qw0 f13033a;
    public final Paint f13034b;
    public float f13035c;
    public o1.j d;
    public final u6 e;

    public i4(Context context, u6 u6Var) {
        super(context);
        qw0 qw0Var = new qw0(new gh.a(14), new gh.a(15));
        qw0Var.f32059c = 100.0f;
        this.f13033a = qw0Var;
        Paint paint = new Paint(1);
        this.f13034b = paint;
        this.e = u6Var;
        paint.setColor(y6.w0(y6.Oh, u6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13035c > 0.0f) {
            Paint paint = this.f13034b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f13035c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f13033a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f18968u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f13035c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f7);
            return;
        }
        jVar.f18968u.f18974i = f7 * 100.0f;
        jVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f13034b.setColor(y6.w0(y6.Oh, this.e));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
