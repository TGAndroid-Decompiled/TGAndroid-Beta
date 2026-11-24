package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
public final class myb extends FrameLayout {
    public final bf0 a;
    public final Paint b;
    public final RectF c;
    public final ln d;
    public lyb e;
    public String f;
    public vm h;
    public int n;
    public boolean r;
    public final oyb s;

    public myb(oyb oybVar, Context context) {
        super(context);
        this.s = oybVar;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new ln(this, 0L, 260L, d53.h);
        setWillNotDraw(false);
        rve.a(this);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myb.a(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        oyb oybVar = this.s;
        TextPaint textPaint = oybVar.l0;
        ylb ylbVar = oybVar.e;
        if (this.r) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.d.e(false, f);
        int v0 = cmb.v0(cmb.sk, ylbVar);
        float width = getWidth() - gm.L(3.0f);
        int height = getHeight();
        RectF rectF = this.c;
        rectF.set(gm.L(3.0f), (getHeight() - gm.L(28.0f)) / 2.0f, width, (gm.L(28.0f) + height) / 2.0f);
        int f2 = on2.f(e, cmb.v0(cmb.N5, ylbVar), v0);
        Paint paint = this.b;
        paint.setColor(f2);
        canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
        int f3 = on2.f(e, cmb.v0(cmb.F6, ylbVar), cmb.v0(cmb.vk, ylbVar));
        vm vmVar = this.h;
        if (vmVar != null && this.n != f3) {
            this.n = f3;
            vmVar.setColorFilter(new PorterDuffColorFilter(f3, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            textPaint.setColor(f3);
            canvas.drawText(this.f, gm.L(15.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        if (this.f == null) {
            L = gm.L(44.0f);
        } else {
            L = gm.L(15.0f) + gm.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), i2);
    }
}
