package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.o;
public final class cx extends FrameLayout {
    public final uy9 a;
    public final byte b;
    public final byte c;
    public int d;
    public final TextPaint e;
    public final o f;

    public cx(o oVar, Context context) {
        super(context);
        this.f = oVar;
        this.b = (byte) 12;
        this.c = (byte) 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(hl.L(16.0f));
        uy9 uy9Var = new uy9(null, context, false);
        this.a = uy9Var;
        uy9Var.setReportChanges(true);
        uy9Var.setSeparatorsCount(19);
        uy9Var.setDelegate(new wz4(this));
        addView(uy9Var, tre.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = aob.w0(null, aob.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(xea.V0), getMeasuredWidth() - hl.L(39.0f), hl.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.d != size) {
            int i3 = xea.V0;
            byte b = this.b;
            this.a.setProgress((i3 - b) / (this.c - b));
            this.d = size;
        }
    }
}
