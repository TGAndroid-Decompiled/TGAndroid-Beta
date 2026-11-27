package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class boc extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public final RectF H;
    public boolean I;
    public String J;
    public final TextPaint K;
    public final vnb a;
    public final gx1 b;
    public final m7 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final TextPaint h;
    public final hn n;
    public final mf8 r;
    public LinearGradient s;
    public final Matrix w;
    public final mm x;
    public final mm y;

    public boc(Context context, vnb vnbVar, gx1 gx1Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.w = new Matrix();
        k43 k43Var = k43.h;
        this.x = new mm(this, 0L, 420L, k43Var);
        this.y = new mm(this, 0L, 200L, k43Var);
        this.F = -1.0f;
        this.G = 1.0f;
        this.H = new RectF();
        this.J = "0:01";
        this.K = new TextPaint(1);
        this.a = vnbVar;
        this.b = gx1Var;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        hn hnVar = new hn(false, false, false);
        this.n = hnVar;
        hnVar.n(0.35f, 260L, k43Var);
        hnVar.setCallback(this);
        hnVar.w(hl.L(14.0f));
        hnVar.x(hl.n1("fonts/rmedium.ttf"));
        hnVar.N = hl.q.x;
        mf8 mf8Var = new mf8(10);
        this.r = mf8Var;
        mf8Var.f = this;
        mf8Var.setCallback(this);
        mf8Var.h = 260.0f;
        textPaint.setTextSize(hl.L(15.0f));
        m7 m7Var = new m7((byte) 11, context, this);
        this.c = m7Var;
        m7Var.setBackground(null);
        m7Var.setPadding(0, 0, 0, 0);
        m7Var.setTextSize(1, xea.S0);
        m7Var.setMaxLines(6);
        m7Var.setGravity(51);
        m7Var.setImeOptions(268435456);
        m7Var.setInputType(147457);
        m7Var.setCursorSize(hl.L(20.0f));
        m7Var.setCursorWidth(1.5f);
        m7Var.setHint("Nothing recognised — type here");
        m7Var.setVisibility(8);
        m7Var.setAlpha(0.0f);
        addView(m7Var, tre.d(-1, -2.0f, 51, 10.0f, 40.0f, 6.0f, 11.0f));
        int v0 = aob.v0(aob.Pe, vnbVar);
        int i = aob.Le;
        m7Var.setTextColor(aob.v0(i, vnbVar));
        m7Var.setHintTextColor(aob.v0(aob.Me, vnbVar));
        m7Var.setCursorColor(v0);
        m7Var.setHandlesColor(v0);
        m7Var.setHighlightColor(aob.p1(0.25f, v0));
        textPaint.setColor(aob.p1(0.5f, aob.v0(i, vnbVar)));
        this.s = null;
        invalidate();
        setMinimumHeight(hl.L(44.0f));
    }

    public final float a() {
        gx1 gx1Var = this.b;
        if (gx1Var != null) {
            float e1 = gx1Var.a.e1(this);
            if (!Float.isNaN(e1)) {
                return e1;
            }
        }
        if (this.F <= 0.0f) {
            return 0.0f;
        }
        return getHeight() - this.F;
    }

    public final boolean b(MotionEvent motionEvent) {
        RectF rectF = hl.P;
        rectF.set(this.H);
        rectF.inset(-hl.L(6.0f), -hl.L(8.0f));
        return rectF.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final void c(int i) {
        this.J = hl.g0(Math.max(1, i), false, false);
        TextPaint textPaint = this.K;
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setTypeface(hl.n1("fonts/rmedium.ttf"));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f;
        boolean z;
        x59 x59Var;
        int i = aob.Pe;
        vnb vnbVar = this.a;
        int v0 = aob.v0(i, vnbVar);
        mm mmVar = this.x;
        mmVar.getClass();
        float e = mmVar.e(false, 0.0f);
        float a = a();
        float d = this.y.d(this.I);
        m7 m7Var = this.c;
        m7Var.setTranslationY(a);
        if (m7Var.getVisibility() == 0) {
            L = hl.L(11.0f) + m7Var.getBottom();
        } else {
            L = hl.L(44.0f);
        }
        if (L > hl.L(44.0f) + 1) {
            f = Math.max(0.0f, Math.min(1.0f, ((getHeight() - a) - hl.L(44.0f)) / (L - hl.L(44.0f))));
        } else {
            f = 1.0f;
        }
        boolean z2 = this.E;
        float f2 = this.G;
        if (z2) {
            f2 *= f2 * f2;
        }
        m7Var.setAlpha(Math.min(e, f * f) * f2);
        String str = this.J;
        Paint paint = this.K;
        float measureText = paint.measureText(str) + hl.L(36.0f);
        float L2 = hl.L(8.0f);
        float L3 = hl.L(26.0f) / 2.0f;
        float R1 = hl.R1(hl.L(22.0f), hl.L(8.0f) + L3, e) + a;
        float f3 = measureText + L2;
        RectF rectF = this.H;
        rectF.set(L2, R1 - L3, f3, R1 + L3);
        float R12 = (1.0f - (d * 0.06f)) * hl.R1(0.7f, 1.0f, this.G);
        canvas.save();
        canvas.scale(R12, R12, rectF.left, rectF.centerY());
        boolean z3 = this.E;
        float f4 = this.G;
        if (z3) {
            f4 *= f4;
        }
        int p1 = aob.p1(0.12f * f4, v0);
        Paint paint2 = this.d;
        paint2.setColor(p1);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        int L4 = hl.L(10.0f);
        gx1 gx1Var = this.b;
        if (gx1Var != null && (x59Var = gx1Var.a.i1) != null && x59Var.g()) {
            z = true;
        } else {
            z = false;
        }
        mf8 mf8Var = this.r;
        mf8Var.a(z, true);
        mf8Var.a.setColor(v0);
        mf8Var.g = (int) (f4 * 255.0f);
        float f5 = L4 / 2.0f;
        mf8Var.setBounds((int) (rectF.left + hl.L(10.0f)), (int) (R1 - f5), ((int) (rectF.left + hl.L(10.0f))) + L4, (int) (f5 + R1));
        mf8Var.draw(canvas);
        paint.setColor(aob.p1(f4, v0));
        canvas.drawText(this.J, rectF.left + hl.L(26.0f), R1 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restore();
        float f6 = (1.0f - e) * this.G;
        if (f6 > 0.0f) {
            float L5 = f3 + hl.L(12.0f);
            float width = getWidth() - hl.L(12.0f);
            float f7 = (-hl.L(6.0f)) * e;
            Paint paint3 = this.h;
            paint3.setAlpha((int) (127.5f * f6));
            int i2 = aob.Le;
            paint3.setColor(aob.p1(0.5f * f6, aob.v0(i2, vnbVar)));
            canvas.drawText("Transcribing…", L5, hl.L(19.0f) + a + f7, paint3);
            float L6 = a + hl.L(28.0f) + f7;
            int v02 = aob.v0(i2, vnbVar);
            int p12 = aob.p1(0.08f * f6, v02);
            Paint paint4 = this.e;
            paint4.setColor(p12);
            RectF rectF2 = hl.P;
            rectF2.set(L5, L6, width, hl.L(6.0f) + L6);
            canvas.drawRoundRect(rectF2, hl.L(3.0f), hl.L(3.0f), paint4);
            float f8 = width - L5;
            if (f8 > 0.0f) {
                LinearGradient linearGradient = this.s;
                Paint paint5 = this.f;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, hl.L(90.0f), 0.0f, new int[]{0, aob.p1(0.14f, v02), 0}, (float[]) null, Shader.TileMode.CLAMP);
                    this.s = linearGradient2;
                    paint5.setShader(linearGradient2);
                }
                float L7 = f8 + hl.L(90.0f);
                k43 k43Var = k43.j;
                Matrix matrix = this.w;
                matrix.setTranslate((k43Var.getInterpolation(((float) (SystemClock.elapsedRealtime() % 1300)) / 1300.0f) * L7) + (L5 - hl.L(90.0f)), 0.0f);
                this.s.setLocalMatrix(matrix);
                paint5.setAlpha((int) (f6 * 255.0f));
                canvas.drawRoundRect(rectF2, hl.L(3.0f), hl.L(3.0f), paint5);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    public String getText() {
        m7 m7Var = this.c;
        if (m7Var.getText() == null) {
            return "";
        }
        return m7Var.getText().toString();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && b(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.setTranslationY(a());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), hl.L(44.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gx1 gx1Var;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!b(motionEvent)) {
                return false;
            }
            this.I = true;
            invalidate();
            return true;
        } else if ((actionMasked == 1 || actionMasked == 3) && this.I) {
            this.I = false;
            if (actionMasked == 1 && (gx1Var = this.b) != null) {
                ChatActivityEnterView chatActivityEnterView = gx1Var.a;
                x59 x59Var = chatActivityEnterView.i1;
                if (x59Var != null) {
                    x59Var.setPlaying(!x59Var.g());
                }
                boc bocVar = chatActivityEnterView.S1;
                if (bocVar != null) {
                    bocVar.invalidate();
                }
            }
            invalidate();
            return true;
        } else {
            return this.I;
        }
    }

    public void setCollapsing(boolean z) {
        if (this.E != z) {
            this.E = z;
            requestLayout();
        }
    }

    public void setModeProgress(float f) {
        this.G = f;
        invalidate();
    }

    public void setVisibleHeight(float f) {
        if (this.F != f) {
            this.F = f;
            this.c.setTranslationY(a());
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.n && drawable != this.r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
