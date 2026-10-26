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
import org.telegram.ui.Components.pw0;
public class i4 extends View implements p6 {
    public final pw0 f13034a;
    public final Paint f13035b;
    public float f13036c;
    public o1.j d;
    public final u6 e;

    public i4(Context context, u6 u6Var) {
        super(context);
        pw0 pw0Var = new pw0(new gh.a(14), new gh.a(15));
        pw0Var.f31730c = 100.0f;
        this.f13034a = pw0Var;
        Paint paint = new Paint(1);
        this.f13035b = paint;
        this.e = u6Var;
        paint.setColor(y6.w0(y6.Oh, u6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13036c > 0.0f) {
            Paint paint = this.f13035b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f13036c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f13034a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f18969u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f13036c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f7);
            return;
        }
        jVar.f18969u.f18975i = f7 * 100.0f;
        jVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f13035b.setColor(y6.w0(y6.Oh, this.e));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
