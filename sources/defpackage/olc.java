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
public final class olc extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public final RectF H;
    public boolean I;
    public String J;
    public final TextPaint K;
    public final ylb a;
    public final vx1 b;
    public final l7 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final TextPaint h;
    public final ho n;
    public final ae8 r;
    public LinearGradient s;
    public final Matrix w;
    public final ln x;
    public final ln y;

    public olc(Context context, ylb ylbVar, vx1 vx1Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.w = new Matrix();
        d53 d53Var = d53.h;
        this.x = new ln(this, 0L, 420L, d53Var);
        this.y = new ln(this, 0L, 200L, d53Var);
        this.F = -1.0f;
        this.G = 1.0f;
        this.H = new RectF();
        this.J = "0:01";
        this.K = new TextPaint(1);
        this.a = ylbVar;
        this.b = vx1Var;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        ho hoVar = new ho(false, false, false);
        this.n = hoVar;
        hoVar.n(0.35f, 260L, d53Var);
        hoVar.setCallback(this);
        hoVar.w(gm.L(14.0f));
        hoVar.x(gm.n1("fonts/rmedium.ttf"));
        hoVar.N = gm.q.x;
        ae8 ae8Var = new ae8(10);
        this.r = ae8Var;
        ae8Var.f = this;
        ae8Var.setCallback(this);
        ae8Var.h = 260.0f;
        textPaint.setTextSize(gm.L(15.0f));
        l7 l7Var = new l7((byte) 10, context, this);
        this.c = l7Var;
        l7Var.setBackground(null);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setTextSize(1, gda.S0);
        l7Var.setMaxLines(6);
        l7Var.setGravity(51);
        l7Var.setImeOptions(268435456);
        l7Var.setInputType(147457);
        l7Var.setCursorSize(gm.L(20.0f));
        l7Var.setCursorWidth(1.5f);
        l7Var.setHint("Nothing recognised — type here");
        l7Var.setVisibility(8);
        l7Var.setAlpha(0.0f);
        addView(l7Var, qoe.d(-1, -2.0f, 51, 10.0f, 40.0f, 6.0f, 11.0f));
        int v0 = cmb.v0(cmb.Tf, ylbVar);
        int i = cmb.Ke;
        l7Var.setTextColor(cmb.v0(i, ylbVar));
        l7Var.setHintTextColor(cmb.v0(cmb.Le, ylbVar));
        l7Var.setCursorColor(v0);
        l7Var.setHandlesColor(v0);
        l7Var.setHighlightColor(cmb.p1(0.25f, v0));
        textPaint.setColor(cmb.p1(0.5f, cmb.v0(i, ylbVar)));
        this.s = null;
        invalidate();
        setMinimumHeight(gm.L(44.0f));
    }

    public final float a() {
        vx1 vx1Var = this.b;
        if (vx1Var != null) {
            float b1 = vx1Var.b.b1(this);
            if (!Float.isNaN(b1)) {
                return b1;
            }
        }
        if (this.F <= 0.0f) {
            return 0.0f;
        }
        return getHeight() - this.F;
    }

    public final boolean b(MotionEvent motionEvent) {
        RectF rectF = gm.P;
        rectF.set(this.H);
        rectF.inset(-gm.L(6.0f), -gm.L(8.0f));
        return rectF.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final void c(int i) {
        this.J = gm.g0(Math.max(1, i), false, false);
        TextPaint textPaint = this.K;
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setTypeface(gm.n1("fonts/rmedium.ttf"));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f;
        boolean z;
        l49 l49Var;
        int i = cmb.Tf;
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i, ylbVar);
        ln lnVar = this.x;
        lnVar.getClass();
        float e = lnVar.e(false, 0.0f);
        float a = a();
        float d = this.y.d(this.I);
        l7 l7Var = this.c;
        l7Var.setTranslationY(a);
        if (l7Var.getVisibility() == 0) {
            L = gm.L(11.0f) + l7Var.getBottom();
        } else {
            L = gm.L(44.0f);
        }
        if (L > gm.L(44.0f) + 1) {
            f = Math.max(0.0f, Math.min(1.0f, ((getHeight() - a) - gm.L(44.0f)) / (L - gm.L(44.0f))));
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
        float measureText = paint.measureText(str) + gm.L(36.0f);
        float L2 = gm.L(8.0f);
        float L3 = gm.L(26.0f) / 2.0f;
        float R1 = gm.R1(gm.L(22.0f), gm.L(8.0f) + L3, e) + a;
        float f3 = measureText + L2;
        RectF rectF = this.H;
        rectF.set(L2, R1 - L3, f3, R1 + L3);
        float R12 = (1.0f - (d * 0.06f)) * gm.R1(0.7f, 1.0f, this.G);
        canvas.save();
        canvas.scale(R12, R12, rectF.left, rectF.centerY());
        boolean z3 = this.E;
        float f4 = this.G;
        if (z3) {
            f4 *= f4;
        }
        int p1 = cmb.p1(0.12f * f4, v0);
        Paint paint2 = this.d;
        paint2.setColor(p1);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        int L4 = gm.L(10.0f);
        vx1 vx1Var = this.b;
        if (vx1Var != null && (l49Var = vx1Var.b.i1) != null && l49Var.g()) {
            z = true;
        } else {
            z = false;
        }
        ae8 ae8Var = this.r;
        ae8Var.a(z, true);
        ae8Var.a.setColor(v0);
        ae8Var.g = (int) (f4 * 255.0f);
        float f5 = L4 / 2.0f;
        ae8Var.setBounds((int) (rectF.left + gm.L(10.0f)), (int) (R1 - f5), ((int) (rectF.left + gm.L(10.0f))) + L4, (int) (f5 + R1));
        ae8Var.draw(canvas);
        paint.setColor(cmb.p1(f4, v0));
        canvas.drawText(this.J, rectF.left + gm.L(26.0f), R1 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restore();
        float f6 = (1.0f - e) * this.G;
        if (f6 > 0.0f) {
            float L5 = f3 + gm.L(12.0f);
            float width = getWidth() - gm.L(12.0f);
            float f7 = (-gm.L(6.0f)) * e;
            Paint paint3 = this.h;
            paint3.setAlpha((int) (127.5f * f6));
            int i2 = cmb.Ke;
            paint3.setColor(cmb.p1(0.5f * f6, cmb.v0(i2, ylbVar)));
            canvas.drawText("Transcribing…", L5, gm.L(19.0f) + a + f7, paint3);
            float L6 = a + gm.L(28.0f) + f7;
            int v02 = cmb.v0(i2, ylbVar);
            int p12 = cmb.p1(0.08f * f6, v02);
            Paint paint4 = this.e;
            paint4.setColor(p12);
            RectF rectF2 = gm.P;
            rectF2.set(L5, L6, width, gm.L(6.0f) + L6);
            canvas.drawRoundRect(rectF2, gm.L(3.0f), gm.L(3.0f), paint4);
            float f8 = width - L5;
            if (f8 > 0.0f) {
                LinearGradient linearGradient = this.s;
                Paint paint5 = this.f;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gm.L(90.0f), 0.0f, new int[]{0, cmb.p1(0.14f, v02), 0}, (float[]) null, Shader.TileMode.CLAMP);
                    this.s = linearGradient2;
                    paint5.setShader(linearGradient2);
                }
                float L7 = f8 + gm.L(90.0f);
                d53 d53Var = d53.j;
                Matrix matrix = this.w;
                matrix.setTranslate((d53Var.getInterpolation(((float) (SystemClock.elapsedRealtime() % 1300)) / 1300.0f) * L7) + (L5 - gm.L(90.0f)), 0.0f);
                this.s.setLocalMatrix(matrix);
                paint5.setAlpha((int) (f6 * 255.0f));
                canvas.drawRoundRect(rectF2, gm.L(3.0f), gm.L(3.0f), paint5);
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
        setMeasuredDimension(getMeasuredWidth(), gm.L(44.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vx1 vx1Var;
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
            if (actionMasked == 1 && (vx1Var = this.b) != null) {
                ChatActivityEnterView chatActivityEnterView = vx1Var.b;
                l49 l49Var = chatActivityEnterView.i1;
                if (l49Var != null) {
                    l49Var.setPlaying(!l49Var.g());
                }
                olc olcVar = chatActivityEnterView.T1;
                if (olcVar != null) {
                    olcVar.invalidate();
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
