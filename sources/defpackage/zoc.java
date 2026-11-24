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
public final class zoc extends FrameLayout {
    public boolean E;
    public boolean F;
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final wjb d;
    public final tkc e;
    public final tkc f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float w;
    public float x;
    public il0 y;

    public zoc(Context context, View view, wjb wjbVar, tkc tkcVar, tkc tkcVar2, tkc tkcVar3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.x = 1.0f;
        this.a = view;
        this.d = wjbVar;
        this.e = tkcVar;
        this.f = tkcVar3;
        setWillNotDraw(false);
        addView(view, nme.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i = bkb.F6;
        zkb.X(editTextBoldCursor, i, wjbVar);
        zkb.D(editTextBoldCursor, bkb.G6, wjbVar);
        zkb.l(editTextBoldCursor, 30, i, wjbVar);
        editTextBoldCursor.setHint(k96.M0(2131742763, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 29));
        editTextBoldCursor.addTextChangedListener(new jf6(tkcVar2, (byte) 24));
        addView(editTextBoldCursor, nme.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(k96.M0(2131745644, null));
        int i2 = bkb.h6;
        Drawable f0 = bkb.f0(bkb.v0(i2, wjbVar), 1, -1);
        vkb M = zkb.M(i2);
        view2.setBackground(f0);
        zkb.j(view2, f0, null, M, wjbVar);
        view2.setOnClickListener(new bna(this, (byte) 28));
        addView(view2, nme.e(40, 40, 53));
    }

    public static float c(float f, float f2, float f3) {
        float max = Math.max(0.0f, Math.min(1.0f, (f3 - f) / (f2 - f)));
        return yjb.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.E) {
            return;
        }
        this.F = true;
        EditTextBoldCursor editTextBoldCursor = this.b;
        gl.t1(editTextBoldCursor);
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
            i = 2131752029;
        } else {
            i = 2131745644;
        }
        this.c.setContentDescription(k96.M0(i, null));
        if (!z) {
            gl.t1(editTextBoldCursor);
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
        this.s.setInterpolator(s33.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new uwb(this, (byte) 15));
        this.s.addListener(new yoc(this, (byte) 0));
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
                float L = gl.L(40.0f) / 2.0f;
                canvas.scale(f, f, getWidth() - L, L);
            }
            float L2 = gl.L(40.0f);
            float f2 = L2 / 2.0f;
            float width = getWidth() - f2;
            float f3 = 1.0f - this.w;
            RectF rectF = this.r;
            rectF.set(f3 * (getWidth() - L2), 0.0f, getWidth(), L2);
            il0 il0Var = this.y;
            wjb wjbVar = this.d;
            Paint paint = this.h;
            if (il0Var != null) {
                il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.y.draw(canvas);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(bkb.v0(bkb.c6, wjbVar));
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
            paint.setColor(bkb.v0(bkb.F6, wjbVar));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gl.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c = c(0.08f, 0.85f, this.w);
            float f4 = 1.0f - c;
            float L3 = gl.L(6.0f) * f4;
            if (L3 > 0.3f) {
                canvas.drawCircle(width - (gl.L(1.5f) * f4), f2 - (gl.L(1.5f) * f4), L3, paint);
            }
            float L4 = (gl.L(2.6f) * f4) - (gl.L(5.0f) * c);
            float L5 = (gl.L(5.0f) * c) + (gl.L(6.5f) * f4);
            canvas.drawLine(width + L4, L4 + f2, width + L5, L5 + f2, paint);
            float L6 = gl.L(5.0f) * c;
            if (L6 > 0.3f) {
                canvas.drawLine(width + L6, f2 - L6, width - L6, f2 + L6, paint);
            }
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.w) * 255.0f));
            float c2 = ((1.0f - this.w) * b00.c(80.0f, getWidth(), 0)) + gl.L(22.0f);
            canvas.drawCircle(c2 - gl.L(1.0f), f2 - gl.L(1.0f), gl.L(5.0f), paint);
            canvas.drawLine(gl.L(3.0f) + c2, gl.L(3.0f) + f2, c2 + gl.L(7.0f), f2 + gl.L(7.0f), paint);
            paint.setAlpha(255);
            if (i < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.n;
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setTypeface(gl.o());
        int L = gl.L(62.0f) + ((int) Math.ceil(textPaint.measureText(k96.M0(2131742719, null)))) + ((int) Math.ceil(textPaint.measureText(k96.M0(2131742927, null))));
        int size = View.MeasureSpec.getSize(i);
        int min = Math.min(L, Math.max(0, size - gl.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - gl.L(48.0f)) - min));
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
