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
public final class l0c extends FrameLayout {
    public final de0 a;
    public final Paint b;
    public final RectF c;
    public final mm d;
    public k0c e;
    public String f;
    public wl h;
    public int n;
    public boolean r;
    public final n0c s;

    public l0c(n0c n0cVar, Context context) {
        super(context);
        this.s = n0cVar;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new mm(this, 0L, 260L, k43.h);
        setWillNotDraw(false);
        iye.a(this);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0c.a(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        n0c n0cVar = this.s;
        TextPaint textPaint = n0cVar.l0;
        vnb vnbVar = n0cVar.e;
        if (this.r) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.d.e(false, f);
        int v0 = aob.v0(aob.tk, vnbVar);
        float width = getWidth() - hl.L(3.0f);
        int height = getHeight();
        RectF rectF = this.c;
        rectF.set(hl.L(3.0f), (getHeight() - hl.L(28.0f)) / 2.0f, width, (hl.L(28.0f) + height) / 2.0f);
        int f2 = vm2.f(e, aob.v0(aob.O5, vnbVar), v0);
        Paint paint = this.b;
        paint.setColor(f2);
        canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
        int f3 = vm2.f(e, aob.v0(aob.G6, vnbVar), aob.v0(aob.wk, vnbVar));
        wl wlVar = this.h;
        if (wlVar != null && this.n != f3) {
            this.n = f3;
            wlVar.setColorFilter(new PorterDuffColorFilter(f3, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            textPaint.setColor(f3);
            canvas.drawText(this.f, hl.L(15.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        if (this.f == null) {
            L = hl.L(44.0f);
        } else {
            L = hl.L(15.0f) + hl.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), i2);
    }
}
