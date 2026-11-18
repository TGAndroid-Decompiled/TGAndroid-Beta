package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import hi.f9;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ut0;
public class o3 extends View implements c6 {
    public final ut0 f18820a;
    public final Paint f18821b;
    public float f18822c;
    public r1.g d;
    public final i6 f18823e;

    public o3(Context context, i6 i6Var) {
        super(context);
        ut0 ut0Var = new ut0(new f9(18), new f9(19));
        ut0Var.f40416c = 100.0f;
        this.f18820a = ut0Var;
        Paint paint = new Paint(1);
        this.f18821b = paint;
        this.f18823e = i6Var;
        paint.setColor(n6.w0(n6.Fi, i6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18822c > 0.0f) {
            Paint paint = this.f18821b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f18822c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r1.g gVar = new r1.g(this, this.f18820a);
        r1.h hVar = new r1.h();
        hVar.b(400.0f);
        hVar.a(1.0f);
        gVar.f56323m = hVar;
        this.d = gVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f18822c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        r1.g gVar = this.d;
        if (gVar == null) {
            setLoadProgress(f10);
            return;
        }
        gVar.f56323m.f56331i = f10 * 100.0f;
        gVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f18821b.setColor(n6.w0(n6.Fi, this.f18823e));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
