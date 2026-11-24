package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
public final class dj3 extends View implements tjb {
    public final fm0 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final li3 f;

    public dj3(Context context) {
        super(context);
        this.a = new fm0(380L, this, s33.h);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new li3(this, (byte) 3);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl.e3(this.f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        gl.X1(rectF, rectF2, f, rectF3);
        float U1 = gl.U1(f, gl.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, U1, U1, this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - gl.L(15.0f);
        int L2 = gl.L(12.0f);
        this.d.set(gl.L(12.0f), L, gl.L(30.0f) + L2, gl.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.b.setColor(bkb.w0(null, bkb.Xl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
