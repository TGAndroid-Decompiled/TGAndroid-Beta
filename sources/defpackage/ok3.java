package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
public final class ok3 extends View implements vlb {
    public final fn0 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final bi3 f;

    public ok3(Context context) {
        super(context);
        this.a = new fn0(380L, this, d53.h);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new bi3(this, (byte) 8);
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.d3(this.f, 3000L);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        gm.X1(rectF, rectF2, f, rectF3);
        float U1 = gm.U1(f, gm.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, U1, U1, this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, 1073741824));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        int L = ((currentActionBarHeight / 2) + paddingTop) - gm.L(15.0f);
        int L2 = gm.L(12.0f);
        this.d.set(gm.L(12.0f), L, gm.L(30.0f) + L2, gm.L(30.0f) + L);
    }

    @Override
    public final void updateColors() {
        this.b.setColor(cmb.w0(null, cmb.Xl, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
