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
public final class jwb extends FrameLayout {
    public final be0 a;
    public final Paint b;
    public final RectF c;
    public final lm d;
    public iwb e;
    public String f;
    public vl h;
    public int n;
    public boolean r;
    public final lwb s;

    public jwb(lwb lwbVar, Context context) {
        super(context);
        this.s = lwbVar;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new lm(this, 0L, 260L, s33.h);
        setWillNotDraw(false);
        ote.a(this);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        addView(be0Var, nme.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwb.a(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        lwb lwbVar = this.s;
        TextPaint textPaint = lwbVar.l0;
        wjb wjbVar = lwbVar.e;
        if (this.r) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float e = this.d.e(false, f);
        int v0 = bkb.v0(bkb.sk, wjbVar);
        float width = getWidth() - gl.L(3.0f);
        int height = getHeight();
        RectF rectF = this.c;
        rectF.set(gl.L(3.0f), (getHeight() - gl.L(28.0f)) / 2.0f, width, (gl.L(28.0f) + height) / 2.0f);
        int f2 = bm2.f(e, bkb.v0(bkb.N5, wjbVar), v0);
        Paint paint = this.b;
        paint.setColor(f2);
        canvas.drawRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), paint);
        int f3 = bm2.f(e, bkb.v0(bkb.F6, wjbVar), bkb.v0(bkb.vk, wjbVar));
        vl vlVar = this.h;
        if (vlVar != null && this.n != f3) {
            this.n = f3;
            vlVar.setColorFilter(new PorterDuffColorFilter(f3, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            textPaint.setColor(f3);
            canvas.drawText(this.f, gl.L(15.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        if (this.f == null) {
            L = gl.L(44.0f);
        } else {
            L = gl.L(15.0f) + gl.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), i2);
    }
}
