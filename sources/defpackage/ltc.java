package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ltc extends FrameLayout {
    public boolean E;
    public boolean F;
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final vnb d;
    public final fpc e;
    public final fpc f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float w;
    public float x;
    public jl0 y;

    public ltc(Context context, View view, vnb vnbVar, fpc fpcVar, fpc fpcVar2, fpc fpcVar3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.x = 1.0f;
        this.a = view;
        this.d = vnbVar;
        this.e = fpcVar;
        this.f = fpcVar3;
        setWillNotDraw(false);
        addView(view, tre.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i = aob.G6;
        yob.X(editTextBoldCursor, i, vnbVar);
        yob.D(editTextBoldCursor, aob.H6, vnbVar);
        yob.l(editTextBoldCursor, 30, i, vnbVar);
        editTextBoldCursor.setHint(ob6.M0(2131742657, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 29));
        editTextBoldCursor.addTextChangedListener(new nh6(fpcVar2, (byte) 25));
        addView(editTextBoldCursor, tre.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(ob6.M0(2131745564, null));
        int i2 = aob.i6;
        Drawable f0 = aob.f0(aob.v0(i2, vnbVar), 1, -1);
        uob M = yob.M(i2);
        view2.setBackground(f0);
        yob.j(view2, f0, null, M, vnbVar);
        view2.setOnClickListener(new kla(this, (byte) 29));
        addView(view2, tre.e(40, 40, 53));
    }

    public static float c(float f, float f2, float f3) {
        float max = Math.max(0.0f, Math.min(1.0f, (f3 - f) / (f2 - f)));
        return xnb.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.E) {
            return;
        }
        this.F = true;
        EditTextBoldCursor editTextBoldCursor = this.b;
        hl.t1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    public final void b(boolean z) {
        int i;
        float f;
        long j;
        if (this.E == z) {
            return;
        }
        this.E = z;
        this.F = false;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setEnabled(z);
        editTextBoldCursor.setVisibility(0);
        if (z) {
            i = 2131752006;
        } else {
            i = 2131745564;
        }
        this.c.setContentDescription(ob6.M0(i, null));
        if (!z) {
            hl.t1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.a(Boolean.valueOf(z));
        float f2 = this.w;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.s = ofFloat;
        if (z) {
            j = 380;
        } else {
            j = 300;
        }
        ofFloat.setDuration(j);
        this.s.setInterpolator(k43.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new pzb(this, (byte) 17));
        this.s.addListener(new omb(this, (byte) 29));
        this.s.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        float f;
        float f2;
        float f3;
        int i;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        float f4 = 1.0f;
        if (this.E) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.w = f;
        this.f.a(Float.valueOf(f));
        if (this.E) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        View view = this.a;
        view.setAlpha(f2);
        if (this.E) {
            f3 = 0.94f;
        } else {
            f3 = 1.0f;
        }
        view.setScaleX(f3);
        int i2 = 0;
        if (this.E) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!this.E) {
            f4 = 0.0f;
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setAlpha(f4);
        editTextBoldCursor.setTranslationX(0.0f);
        if (!this.E) {
            i2 = 4;
        }
        editTextBoldCursor.setVisibility(i2);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float max = Math.max(this.x, this.w);
        if (max > 0.0f) {
            int i = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
            if (i < 0) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
                float f = (max * 0.2f) + 0.8f;
                float L = hl.L(40.0f) / 2.0f;
                canvas.scale(f, f, getWidth() - L, L);
            }
            float L2 = hl.L(40.0f);
            float f2 = L2 / 2.0f;
            float width = getWidth() - f2;
            float f3 = 1.0f - this.w;
            RectF rectF = this.r;
            rectF.set(f3 * (getWidth() - L2), 0.0f, getWidth(), L2);
            jl0 jl0Var = this.y;
            vnb vnbVar = this.d;
            Paint paint = this.h;
            if (jl0Var != null) {
                jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.y.draw(canvas);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(aob.v0(aob.d6, vnbVar));
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
            paint.setColor(aob.v0(aob.G6, vnbVar));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c = c(0.08f, 0.85f, this.w);
            float f4 = 1.0f - c;
            float L3 = hl.L(6.0f) * f4;
            if (L3 > 0.3f) {
                canvas.drawCircle(width - (hl.L(1.5f) * f4), f2 - (hl.L(1.5f) * f4), L3, paint);
            }
            float L4 = (hl.L(2.6f) * f4) - (hl.L(5.0f) * c);
            float L5 = (hl.L(5.0f) * c) + (hl.L(6.5f) * f4);
            canvas.drawLine(width + L4, L4 + f2, width + L5, L5 + f2, paint);
            float L6 = hl.L(5.0f) * c;
            if (L6 > 0.3f) {
                canvas.drawLine(width + L6, f2 - L6, width - L6, f2 + L6, paint);
            }
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.w) * 255.0f));
            float d = ((1.0f - this.w) * c00.d(80.0f, getWidth(), 0)) + hl.L(22.0f);
            canvas.drawCircle(d - hl.L(1.0f), f2 - hl.L(1.0f), hl.L(5.0f), paint);
            canvas.drawLine(hl.L(3.0f) + d, hl.L(3.0f) + f2, d + hl.L(7.0f), f2 + hl.L(7.0f), paint);
            paint.setAlpha(255);
            if (i < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.n;
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setTypeface(hl.o());
        int L = hl.L(62.0f) + ((int) Math.ceil(textPaint.measureText(ob6.M0(2131742613, null)))) + ((int) Math.ceil(textPaint.measureText(ob6.M0(2131742821, null))));
        int size = View.MeasureSpec.getSize(i);
        int min = Math.min(L, Math.max(0, size - hl.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - hl.L(48.0f)) - min));
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
