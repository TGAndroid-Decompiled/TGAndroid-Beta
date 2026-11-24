package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.o;
public final class cy extends FrameLayout {
    public final dx9 a;
    public final byte b;
    public final byte c;
    public int d;
    public final TextPaint e;
    public final o f;

    public cy(o oVar, Context context) {
        super(context);
        this.f = oVar;
        this.b = (byte) 12;
        this.c = (byte) 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(gm.L(16.0f));
        dx9 dx9Var = new dx9(null, context, false);
        this.a = dx9Var;
        dx9Var.setReportChanges(true);
        dx9Var.setSeparatorsCount(19);
        dx9Var.setDelegate(new sz4(this));
        addView(dx9Var, qoe.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w0 = cmb.w0(null, cmb.H6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w0);
        canvas.drawText(String.valueOf(gda.V0), getMeasuredWidth() - gm.L(39.0f), gm.L(28.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.d != size) {
            int i3 = gda.V0;
            byte b = this.b;
            this.a.setProgress((i3 - b) / (this.c - b));
            this.d = size;
        }
    }
}
