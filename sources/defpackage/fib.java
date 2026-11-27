package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.TableLayout;
import android.widget.TextView;
public final class fib extends TableLayout {
    public final vnb a;
    public final hib b;

    public fib(hib hibVar, Context context, vnb vnbVar) {
        super(context);
        this.b = hibVar;
        this.a = vnbVar;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int left;
        hib hibVar = this.b;
        RectF rectF = hibVar.w;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = hibVar.s;
        path.rewind();
        path.addRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        Paint paint = hibVar.r;
        paint.setColor(vm2.f(0.1f, aob.v0(aob.d7, this.a), -1));
        paint.setStrokeWidth(hl.L(1.0f));
        float height = getHeight();
        if (hibVar.E.getVisibility() == 0) {
            f = 5.0f;
        } else {
            f = 4.0f;
        }
        float f2 = height / f;
        for (int i = 1; i <= 4; i++) {
            float f3 = f2 * i;
            canvas.drawLine(0.0f, f3, getWidth(), f3, paint);
        }
        boolean z = ob6.a0;
        TextView textView = hibVar.e;
        if (z) {
            left = textView.getRight();
        } else {
            left = textView.getLeft();
        }
        float f4 = left;
        canvas.drawLine(f4, 0.0f, f4, getHeight(), paint);
        paint.setStrokeWidth(hl.L(2.0f));
        canvas.drawPath(path, paint);
    }
}
