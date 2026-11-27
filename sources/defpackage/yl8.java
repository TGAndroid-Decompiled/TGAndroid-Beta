package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class yl8 extends FrameLayout implements snb {
    public static final int f = 0;
    public final de0 a;
    public final xl8 b;
    public final Paint c;
    public boolean d;
    public final rb0 e;

    public yl8(Context context, float f2) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new rb0((vnb) null);
        de0 de0Var = new de0(getContext());
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(f2));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i = aob.a7;
        textPaint.setColor(aob.w0(null, i, false));
        uh9.p(textPaint, hl.L(11.5f));
        this.b = view;
        view.setAlpha(0.0f);
        addView(de0Var, tre.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, tre.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(aob.w0(null, i, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - hl.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.c.setColor(aob.w0(null, aob.a7, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
