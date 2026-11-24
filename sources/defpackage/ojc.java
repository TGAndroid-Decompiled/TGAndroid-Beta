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
public final class ojc extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public final RectF H;
    public boolean I;
    public String J;
    public final TextPaint K;
    public final wjb a;
    public final iw1 b;
    public final l7 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final TextPaint h;
    public final gn n;
    public final xb8 r;
    public LinearGradient s;
    public final Matrix w;
    public final lm x;
    public final lm y;

    public ojc(Context context, wjb wjbVar, iw1 iw1Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.w = new Matrix();
        s33 s33Var = s33.h;
        this.x = new lm(this, 0L, 420L, s33Var);
        this.y = new lm(this, 0L, 200L, s33Var);
        this.F = -1.0f;
        this.G = 1.0f;
        this.H = new RectF();
        this.J = "0:01";
        this.K = new TextPaint(1);
        this.a = wjbVar;
        this.b = iw1Var;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        gn gnVar = new gn(false, false, false);
        this.n = gnVar;
        gnVar.n(0.35f, 260L, s33Var);
        gnVar.setCallback(this);
        gnVar.w(gl.L(14.0f));
        gnVar.x(gl.n1("fonts/rmedium.ttf"));
        gnVar.N = gl.q.x;
        xb8 xb8Var = new xb8(10);
        this.r = xb8Var;
        xb8Var.f = this;
        xb8Var.setCallback(this);
        xb8Var.h = 260.0f;
        textPaint.setTextSize(gl.L(15.0f));
        l7 l7Var = new l7((byte) 10, context, this);
        this.c = l7Var;
        l7Var.setBackground(null);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setTextSize(1, gba.T0);
        l7Var.setMaxLines(6);
        l7Var.setGravity(51);
        l7Var.setImeOptions(268435456);
        l7Var.setInputType(147457);
        l7Var.setCursorSize(gl.L(20.0f));
        l7Var.setCursorWidth(1.5f);
        l7Var.setHint("Nothing recognised — type here");
        l7Var.setVisibility(8);
        l7Var.setAlpha(0.0f);
        addView(l7Var, nme.d(-1, -2.0f, 51, 10.0f, 40.0f, 6.0f, 11.0f));
        int v0 = bkb.v0(bkb.Tf, wjbVar);
        int i = bkb.Ke;
        l7Var.setTextColor(bkb.v0(i, wjbVar));
        l7Var.setHintTextColor(bkb.v0(bkb.Le, wjbVar));
        l7Var.setCursorColor(v0);
        l7Var.setHandlesColor(v0);
        l7Var.setHighlightColor(bkb.p1(0.25f, v0));
        textPaint.setColor(bkb.p1(0.5f, bkb.v0(i, wjbVar)));
        this.s = null;
        invalidate();
        setMinimumHeight(gl.L(44.0f));
    }

    public final float a() {
        iw1 iw1Var = this.b;
        if (iw1Var != null) {
            float Z0 = iw1Var.b.Z0(this);
            if (!Float.isNaN(Z0)) {
                return Z0;
            }
        }
        if (this.F <= 0.0f) {
            return 0.0f;
        }
        return getHeight() - this.F;
    }

    public final boolean b(MotionEvent motionEvent) {
        RectF rectF = gl.P;
        rectF.set(this.H);
        rectF.inset(-gl.L(6.0f), -gl.L(8.0f));
        return rectF.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final void c(int i) {
        this.J = gl.g0(Math.max(1, i), false, false);
        TextPaint textPaint = this.K;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setTypeface(gl.n1("fonts/rmedium.ttf"));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f;
        boolean z;
        i29 i29Var;
        int i = bkb.Tf;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i, wjbVar);
        lm lmVar = this.x;
        lmVar.getClass();
        float e = lmVar.e(false, 0.0f);
        float a = a();
        float d = this.y.d(this.I);
        l7 l7Var = this.c;
        l7Var.setTranslationY(a);
        if (l7Var.getVisibility() == 0) {
            L = gl.L(11.0f) + l7Var.getBottom();
        } else {
            L = gl.L(44.0f);
        }
        if (L > gl.L(44.0f) + 1) {
            f = Math.max(0.0f, Math.min(1.0f, ((getHeight() - a) - gl.L(44.0f)) / (L - gl.L(44.0f))));
        } else {
            f = 1.0f;
        }
        boolean z2 = this.E;
        float f2 = this.G;
        if (z2) {
            f2 *= f2 * f2;
        }
        l7Var.setAlpha(Math.min(e, f * f) * f2);
        String str = this.J;
        Paint paint = this.K;
        float measureText = paint.measureText(str) + gl.L(36.0f);
        float L2 = gl.L(8.0f);
        float L3 = gl.L(26.0f) / 2.0f;
        float R1 = gl.R1(gl.L(22.0f), gl.L(8.0f) + L3, e) + a;
        float f3 = measureText + L2;
        RectF rectF = this.H;
        rectF.set(L2, R1 - L3, f3, R1 + L3);
        float R12 = (1.0f - (d * 0.06f)) * gl.R1(0.7f, 1.0f, this.G);
        canvas.save();
        canvas.scale(R12, R12, rectF.left, rectF.centerY());
        boolean z3 = this.E;
        float f4 = this.G;
        if (z3) {
            f4 *= f4;
        }
        int p1 = bkb.p1(0.12f * f4, v0);
        Paint paint2 = this.d;
        paint2.setColor(p1);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        int L4 = gl.L(10.0f);
        iw1 iw1Var = this.b;
        if (iw1Var != null && (i29Var = iw1Var.b.i1) != null && i29Var.g()) {
            z = true;
        } else {
            z = false;
        }
        xb8 xb8Var = this.r;
        xb8Var.a(z, true);
        xb8Var.a.setColor(v0);
        xb8Var.g = (int) (f4 * 255.0f);
        float f5 = L4 / 2.0f;
        xb8Var.setBounds((int) (rectF.left + gl.L(10.0f)), (int) (R1 - f5), ((int) (rectF.left + gl.L(10.0f))) + L4, (int) (f5 + R1));
        xb8Var.draw(canvas);
        paint.setColor(bkb.p1(f4, v0));
        canvas.drawText(this.J, rectF.left + gl.L(26.0f), R1 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restore();
        float f6 = (1.0f - e) * this.G;
        if (f6 > 0.0f) {
            float L5 = f3 + gl.L(12.0f);
            float width = getWidth() - gl.L(12.0f);
            float f7 = (-gl.L(6.0f)) * e;
            Paint paint3 = this.h;
            paint3.setAlpha((int) (127.5f * f6));
            int i2 = bkb.Ke;
            paint3.setColor(bkb.p1(0.5f * f6, bkb.v0(i2, wjbVar)));
            canvas.drawText("Transcribing…", L5, gl.L(19.0f) + a + f7, paint3);
            float L6 = a + gl.L(28.0f) + f7;
            int v02 = bkb.v0(i2, wjbVar);
            int p12 = bkb.p1(0.08f * f6, v02);
            Paint paint4 = this.e;
            paint4.setColor(p12);
            RectF rectF2 = gl.P;
            rectF2.set(L5, L6, width, gl.L(6.0f) + L6);
            canvas.drawRoundRect(rectF2, gl.L(3.0f), gl.L(3.0f), paint4);
            float f8 = width - L5;
            if (f8 > 0.0f) {
                LinearGradient linearGradient = this.s;
                Paint paint5 = this.f;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gl.L(90.0f), 0.0f, new int[]{0, bkb.p1(0.14f, v02), 0}, (float[]) null, Shader.TileMode.CLAMP);
                    this.s = linearGradient2;
                    paint5.setShader(linearGradient2);
                }
                float L7 = f8 + gl.L(90.0f);
                s33 s33Var = s33.j;
                Matrix matrix = this.w;
                matrix.setTranslate((s33Var.getInterpolation(((float) (SystemClock.elapsedRealtime() % 1300)) / 1300.0f) * L7) + (L5 - gl.L(90.0f)), 0.0f);
                this.s.setLocalMatrix(matrix);
                paint5.setAlpha((int) (f6 * 255.0f));
                canvas.drawRoundRect(rectF2, gl.L(3.0f), gl.L(3.0f), paint5);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    public String getText() {
        l7 l7Var = this.c;
        if (l7Var.getText() == null) {
            return "";
        }
        return l7Var.getText().toString();
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
        setMeasuredDimension(getMeasuredWidth(), gl.L(44.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iw1 iw1Var;
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
            if (actionMasked == 1 && (iw1Var = this.b) != null) {
                ChatActivityEnterView chatActivityEnterView = iw1Var.b;
                i29 i29Var = chatActivityEnterView.i1;
                if (i29Var != null) {
                    i29Var.setPlaying(!i29Var.g());
                }
                ojc ojcVar = chatActivityEnterView.T1;
                if (ojcVar != null) {
                    ojcVar.invalidate();
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
