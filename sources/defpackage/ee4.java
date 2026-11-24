package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ee4 extends FrameLayout implements vlb {
    public Paint a;
    public float[] b;
    public Path c;
    public float d;

    public final void a(float f, float f2) {
        float[] fArr = this.b;
        fArr[7] = f;
        fArr[6] = f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[5] = f2;
        fArr[4] = f2;
        fArr[3] = f2;
        fArr[2] = f2;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        Path path = this.c;
        path.rewind();
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, measuredWidth - gm.U1(this.d, 0, gm.L(4.0f)), getMeasuredHeight());
        a(gm.L(8.0f), gm.U1(this.d, 0, gm.L(8.0f)));
        float[] fArr = this.b;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint = this.a;
        canvas.drawPath(path, paint);
        path.rewind();
        rectF.set(measuredWidth + gm.U1(this.d, 0, gm.L(4.0f)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a(gm.U1(this.d, 0, gm.L(8.0f)), gm.L(8.0f));
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(path, paint);
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setColor(cmb.w0(null, cmb.Ei, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
