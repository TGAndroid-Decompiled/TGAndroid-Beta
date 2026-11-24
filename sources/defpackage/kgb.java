package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TableLayout;
import android.widget.TextView;
public final class kgb extends TableLayout {
    public final ylb a;
    public final mgb b;

    public kgb(mgb mgbVar, Context context, ylb ylbVar) {
        super(context);
        this.b = mgbVar;
        this.a = ylbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int left;
        mgb mgbVar = this.b;
        RectF rectF = mgbVar.w;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = mgbVar.s;
        path.rewind();
        path.addRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        Paint paint = mgbVar.r;
        paint.setColor(on2.f(0.1f, cmb.v0(cmb.c7, this.a), -1));
        paint.setStrokeWidth(gm.L(1.0f));
        float height = getHeight();
        if (mgbVar.E.getVisibility() == 0) {
            f = 5.0f;
        } else {
            f = 4.0f;
        }
        float f2 = height / f;
        for (int i = 1; i <= 4; i++) {
            float f3 = f2 * i;
            canvas.drawLine(0.0f, f3, getWidth(), f3, paint);
        }
        boolean z = jb6.a0;
        TextView textView = mgbVar.e;
        if (z) {
            left = textView.getRight();
        } else {
            left = textView.getLeft();
        }
        float f4 = left;
        canvas.drawLine(f4, 0.0f, f4, getHeight(), paint);
        paint.setStrokeWidth(gm.L(2.0f));
        canvas.drawPath(path, paint);
    }
}
