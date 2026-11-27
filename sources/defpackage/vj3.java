package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
public final class vj3 extends View implements snb {
    public final fm0 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final zg3 f;

    public vj3(Context context) {
        super(context);
        this.a = new fm0(380L, this, k43.h);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new zg3(this, (byte) 9);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hl.d3(this.f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.r(this.f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        hl.X1(rectF, rectF2, f, rectF3);
        float U1 = hl.U1(f, hl.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, U1, U1, this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - hl.L(15.0f);
        int L2 = hl.L(12.0f);
        this.d.set(hl.L(12.0f), L, hl.L(30.0f) + L2, hl.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.b.setColor(aob.w0(null, aob.Yl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
