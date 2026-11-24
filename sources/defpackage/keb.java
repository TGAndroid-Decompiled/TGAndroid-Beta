package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TableLayout;
import android.widget.TextView;
public final class keb extends TableLayout {
    public final wjb a;
    public final meb b;

    public keb(meb mebVar, Context context, wjb wjbVar) {
        super(context);
        this.b = mebVar;
        this.a = wjbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int left;
        meb mebVar = this.b;
        RectF rectF = mebVar.w;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = mebVar.s;
        path.rewind();
        path.addRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        Paint paint = mebVar.r;
        paint.setColor(bm2.f(0.1f, bkb.v0(bkb.c7, this.a), -1));
        paint.setStrokeWidth(gl.L(1.0f));
        float height = getHeight();
        if (mebVar.E.getVisibility() == 0) {
            f = 5.0f;
        } else {
            f = 4.0f;
        }
        float f2 = height / f;
        for (int i = 1; i <= 4; i++) {
            float f3 = f2 * i;
            canvas.drawLine(0.0f, f3, getWidth(), f3, paint);
        }
        boolean z = k96.a0;
        TextView textView = mebVar.e;
        if (z) {
            left = textView.getRight();
        } else {
            left = textView.getLeft();
        }
        float f4 = left;
        canvas.drawLine(f4, 0.0f, f4, getHeight(), paint);
        paint.setStrokeWidth(gl.L(2.0f));
        canvas.drawPath(path, paint);
    }
}
