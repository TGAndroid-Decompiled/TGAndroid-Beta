package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class nk8 extends FrameLayout implements vlb {
    public static final int f = 0;
    public final bf0 a;
    public final mk8 b;
    public final Paint c;
    public boolean d;
    public final pc0 e;

    public nk8(Context context, float f2) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(getContext());
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(f2));
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i = cmb.Z6;
        textPaint.setColor(cmb.w0(null, i, false));
        hg9.o(textPaint, gm.L(11.5f));
        this.b = view;
        view.setAlpha(0.0f);
        addView(bf0Var, qoe.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, qoe.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(cmb.w0(null, i, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - gm.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        try {
            this.c.setColor(cmb.w0(null, cmb.Z6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
