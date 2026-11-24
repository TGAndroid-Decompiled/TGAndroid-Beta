package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.ui.Components.EditTextBoldCursor;
public class gt7 extends FrameLayout implements vlb {
    public static final ika J;
    public static final ika K;
    public static final ika L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final ylb H;
    public float I;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final zna e;
    public float f;
    public final zna h;
    public float n;
    public final zna r;
    public float s;
    public final float w;
    public final float x;
    public EditTextBoldCursor y;

    static {
        ika ikaVar = new ika(new bh7((byte) 9), new bh7((byte) 10));
        ikaVar.c = 100.0f;
        J = ikaVar;
        ika ikaVar2 = new ika(new bh7((byte) 11), new bh7((byte) 12));
        ikaVar2.c = 100.0f;
        K = ikaVar2;
        ika ikaVar3 = new ika(new bh7((byte) 13), new bh7((byte) 14));
        ikaVar3.c = 100.0f;
        L = ikaVar3;
    }

    public gt7(Context context, ylb ylbVar) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new zna(this, J);
        this.h = new zna(this, K);
        this.r = new zna(this, L);
        float max = Math.max(2, gm.L(0.5f));
        this.w = max;
        this.x = gm.L(1.6667f);
        this.H = ylbVar;
        setWillNotDraw(false);
        textPaint.setTextSize(gm.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, gm.L(6.0f), 0, 0);
    }

    public static void d(zna znaVar, float f) {
        float f2 = f * 100.0f;
        aoa aoaVar = znaVar.m;
        if (aoaVar != null && f2 == ((float) aoaVar.i)) {
            return;
        }
        znaVar.d();
        aoa aoaVar2 = new aoa(f2);
        aoaVar2.b(500.0f);
        aoaVar2.a(1.0f);
        aoaVar2.i = f2;
        znaVar.m = aoaVar2;
        znaVar.h();
    }

    private void setColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public final void a(float f) {
        d(this.r, f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.p7));
        hashSet.add(Integer.valueOf(cmb.j6));
        hashSet.add(Integer.valueOf(cmb.k6));
    }

    public final void b(float f, float f2, boolean z) {
        if (!z) {
            this.f = f;
            this.n = f2;
            if (!this.E) {
                float f3 = this.x;
                float f4 = this.w;
                this.c.setStrokeWidth(((f3 - f4) * f) + f4);
            }
            f();
            return;
        }
        d(this.e, f);
        d(this.h, f2);
    }

    public final void c(boolean z, boolean z2) {
        float f;
        float f2 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2) {
            f2 = 1.0f;
        }
        b(f, f2, true);
    }

    public final void e(EditTextBoldCursor editTextBoldCursor) {
        this.y = editTextBoldCursor;
        invalidate();
    }

    public final void f() {
        float f;
        int i = cmb.G6;
        ylb ylbVar = this.H;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.H6, ylbVar);
        float f2 = 0.0f;
        if (this.E && !this.G) {
            f = 0.0f;
        } else {
            f = this.n;
        }
        int f3 = on2.f(f, v0, v02);
        int i2 = cmb.p7;
        this.d.setColor(on2.f(this.s, f3, cmb.v0(i2, ylbVar)));
        int v03 = cmb.v0(cmb.j6, ylbVar);
        int v04 = cmb.v0(cmb.k6, ylbVar);
        if (!this.E || this.G) {
            f2 = this.f;
        }
        setColor(on2.f(this.s, on2.f(f2, v03, v04), cmb.v0(i2, ylbVar)));
    }

    public EditText getAttachedEditText() {
        return this.y;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        float f3;
        float f4;
        float f5;
        super.onDraw(canvas);
        int i = cmb.G6;
        ylb ylbVar = this.H;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.H6, ylbVar);
        if (this.E && !this.G) {
            f = 0.0f;
        } else {
            f = this.n;
        }
        int f6 = on2.f(f, v0, v02);
        int i2 = cmb.p7;
        int f7 = on2.f(this.s, f6, cmb.v0(i2, ylbVar));
        TextPaint textPaint = this.d;
        textPaint.setColor(f7);
        int v03 = cmb.v0(cmb.j6, ylbVar);
        int v04 = cmb.v0(cmb.k6, ylbVar);
        if (this.E && !this.G) {
            f2 = 0.0f;
        } else {
            f2 = this.f;
        }
        int f8 = on2.f(this.s, on2.f(f2, v03, v04), cmb.v0(i2, ylbVar));
        Paint paint = this.c;
        paint.setColor(f8);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - gm.L(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditTextBoldCursor editTextBoldCursor = this.y;
        if ((editTextBoldCursor == null || editTextBoldCursor.length() != 0 || !TextUtils.isEmpty(this.y.getHint())) && !this.E && !this.F) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (z2) {
            float f9 = 1.0f - this.n;
            paddingTop += (textSize - paddingTop) * f9;
            f3 = f9 * this.I;
        } else {
            f3 = 0.0f;
        }
        float f10 = paddingTop;
        float strokeWidth = paint.getStrokeWidth();
        float f11 = 0.75f;
        if (z2) {
            f11 = td4.A(1.0f, this.n, 0.25f, 0.75f);
        }
        float f12 = f11;
        float measureText = textPaint.measureText(this.b) * f12;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(gm.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - gm.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        canvas.restore();
        float L2 = gm.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - gm.L(6.0f);
        float f13 = (measureText / 2.0f) + L2;
        float L3 = ((L2 + measureText) + gm.L(10.0f)) - f13;
        if (z2) {
            f4 = this.n;
        } else {
            f4 = 1.0f;
        }
        canvas.drawLine((L3 * f4) + f13, paddingTop2, width, paddingTop2, paint);
        float L4 = f13 + gm.L(4.0f);
        float f14 = L2 - L4;
        if (z2) {
            f5 = this.n;
        } else {
            f5 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f14 * f5) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f12, f12, gm.L(18.0f) + getPaddingLeft(), f10);
        canvas.drawText(this.b, gm.L(14.0f) + getPaddingLeft() + f3, f10, textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z) {
        this.E = z;
        this.G = z;
        invalidate();
    }

    public void setForceUseCenter(boolean z) {
        this.E = z;
        invalidate();
    }

    public void setForceUseCenter2(boolean z) {
        this.F = z;
    }

    public void setLeftPadding(float f) {
        this.I = f;
        invalidate();
    }

    public void setText(String str) {
        this.b = str;
        invalidate();
    }

    public void updateColors() {
        try {
            f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
