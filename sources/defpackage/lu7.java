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
public class lu7 extends FrameLayout implements snb {
    public static final bma J;
    public static final bma K;
    public static final bma L;
    public boolean E;
    public boolean F;
    public boolean G;
    public final vnb H;
    public float I;
    public final RectF a;
    public String b;
    public final Paint c;
    public final TextPaint d;
    public final vpa e;
    public float f;
    public final vpa h;
    public float n;
    public final vpa r;
    public float s;
    public final float w;
    public final float x;
    public EditTextBoldCursor y;

    static {
        bma bmaVar = new bma(new hz6((byte) 25), new hz6((byte) 26));
        bmaVar.c = 100.0f;
        J = bmaVar;
        bma bmaVar2 = new bma(new hz6((byte) 27), new hz6((byte) 28));
        bmaVar2.c = 100.0f;
        K = bmaVar2;
        bma bmaVar3 = new bma(new hz6((byte) 29), new ku7((byte) 0));
        bmaVar3.c = 100.0f;
        L = bmaVar3;
    }

    public lu7(Context context, vnb vnbVar) {
        super(context);
        this.a = new RectF();
        this.b = "";
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new vpa(this, J);
        this.h = new vpa(this, K);
        this.r = new vpa(this, L);
        float max = Math.max(2, hl.L(0.5f));
        this.w = max;
        this.x = hl.L(1.6667f);
        this.H = vnbVar;
        setWillNotDraw(false);
        textPaint.setTextSize(hl.L(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(max);
        f();
        setPadding(0, hl.L(6.0f), 0, 0);
    }

    public static void d(vpa vpaVar, float f) {
        float f2 = f * 100.0f;
        wpa wpaVar = vpaVar.m;
        if (wpaVar != null && f2 == ((float) wpaVar.i)) {
            return;
        }
        vpaVar.d();
        wpa wpaVar2 = new wpa(f2);
        wpaVar2.b(500.0f);
        wpaVar2.a(1.0f);
        wpaVar2.i = f2;
        vpaVar.m = wpaVar2;
        vpaVar.h();
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
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.q7));
        hashSet.add(Integer.valueOf(aob.k6));
        hashSet.add(Integer.valueOf(aob.l6));
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
        int i = aob.H6;
        vnb vnbVar = this.H;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.I6, vnbVar);
        float f2 = 0.0f;
        if (this.E && !this.G) {
            f = 0.0f;
        } else {
            f = this.n;
        }
        int f3 = vm2.f(f, v0, v02);
        int i2 = aob.q7;
        this.d.setColor(vm2.f(this.s, f3, aob.v0(i2, vnbVar)));
        int v03 = aob.v0(aob.k6, vnbVar);
        int v04 = aob.v0(aob.l6, vnbVar);
        if (!this.E || this.G) {
            f2 = this.f;
        }
        setColor(vm2.f(this.s, vm2.f(f2, v03, v04), aob.v0(i2, vnbVar)));
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
        int i = aob.H6;
        vnb vnbVar = this.H;
        int v0 = aob.v0(i, vnbVar);
        int v02 = aob.v0(aob.I6, vnbVar);
        if (this.E && !this.G) {
            f = 0.0f;
        } else {
            f = this.n;
        }
        int f6 = vm2.f(f, v0, v02);
        int i2 = aob.q7;
        int f7 = vm2.f(this.s, f6, aob.v0(i2, vnbVar));
        TextPaint textPaint = this.d;
        textPaint.setColor(f7);
        int v03 = aob.v0(aob.k6, vnbVar);
        int v04 = aob.v0(aob.l6, vnbVar);
        if (this.E && !this.G) {
            f2 = 0.0f;
        } else {
            f2 = this.f;
        }
        int f8 = vm2.f(this.s, vm2.f(f2, v03, v04), aob.v0(i2, vnbVar));
        Paint paint = this.c;
        paint.setColor(f8);
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - hl.L(1.75f));
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
            f11 = qd4.A(1.0f, this.n, 0.25f, 0.75f);
        }
        float f12 = f11;
        float measureText = textPaint.measureText(this.b) * f12;
        canvas.save();
        RectF rectF = this.a;
        rectF.set(hl.L(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - hl.L(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, hl.L(8.0f), hl.L(8.0f), paint);
        canvas.restore();
        float L2 = hl.L(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float width = ((getWidth() - strokeWidth) - getPaddingRight()) - hl.L(6.0f);
        float f13 = (measureText / 2.0f) + L2;
        float L3 = ((L2 + measureText) + hl.L(10.0f)) - f13;
        if (z2) {
            f4 = this.n;
        } else {
            f4 = 1.0f;
        }
        canvas.drawLine((L3 * f4) + f13, paddingTop2, width, paddingTop2, paint);
        float L4 = f13 + hl.L(4.0f);
        float f14 = L2 - L4;
        if (z2) {
            f5 = this.n;
        } else {
            f5 = 1.0f;
        }
        canvas.drawLine(L2, paddingTop2, (f14 * f5) + L4, paddingTop2, paint);
        canvas.save();
        canvas.scale(f12, f12, hl.L(18.0f) + getPaddingLeft(), f10);
        canvas.drawText(this.b, hl.L(14.0f) + getPaddingLeft() + f3, f10, textPaint);
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
            cc4.g(e, true);
        }
    }
}
