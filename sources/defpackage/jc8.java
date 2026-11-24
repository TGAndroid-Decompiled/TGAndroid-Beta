package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class jc8 extends y21 {
    public final LinearLayout a;
    public final TextView b;
    public final s09 c;
    public final RectF d;
    public final Path e;
    public final zl0 f;
    public ValueAnimator h;
    public float n;
    public float r;
    public float s;
    public float w;

    public jc8(Context context, ylb ylbVar, Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        super(context, ylbVar);
        this.d = new RectF();
        this.e = new Path();
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.w = 1.0f;
        setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        setBackground(Integer.MIN_VALUE, 24);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setGravity(16);
        linearLayout.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        ?? imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageDrawable(drawable);
        imageView.setColorFilter(-1);
        linearLayout.addView((View) imageView, qoe.o(24, 24));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(16);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(spannableStringBuilder);
        linearLayout.addView(textView, qoe.m(1.0f, 0, -1, 12, 0, 0));
        addView(linearLayout, qoe.e(-1, 48, 17));
        this.f = new zl0(new h68(this, (byte) 4));
    }

    public static float d(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public final void c(final boolean z, Runnable runnable, Runnable runnable2, final gu2 gu2Var) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.transitionRunningEnter = false;
        }
        this.f.a();
        y21.IN_OUT_OFFSET_Y.b(this, 0.0f);
        runnable.run();
        if (z) {
            f = 320.0f;
        } else {
            f = 180.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f);
        this.h = ofFloat;
        if (z) {
            j = 320;
        } else {
            j = 180;
        }
        ofFloat.setDuration(j);
        this.h.setInterpolator(null);
        this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                jc8.this.e(z, gu2Var, valueAnimator2);
            }
        });
        this.h.addListener(new ic8(this, runnable2, (byte) 0));
        if (z) {
            this.w = 0.0f;
            this.s = 0.0f;
            this.r = 0.0f;
            this.n = 0.0f;
        }
        this.h.start();
    }

    @Override
    public final x21 createTransition() {
        return new fk3(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = (getWidth() - gm.L(8.0f)) * this.n;
        float L = gm.L(48.0f) * this.r;
        RectF rectF = this.d;
        rectF.set((getWidth() - width) / 2.0f, (getHeight() - L) / 2.0f, (getWidth() + width) / 2.0f, (getHeight() + L) / 2.0f);
        this.background.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        this.background.setAlpha(Math.round(this.w * 255.0f));
        this.background.draw(canvas);
        this.background.setAlpha(255);
        if (this.s > 0.0f) {
            canvas.save();
            Path path = this.e;
            path.rewind();
            float f = L / 2.0f;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
            int i = (this.s > 1.0f ? 1 : (this.s == 1.0f ? 0 : -1));
            zl0 zl0Var = this.f;
            if (i < 0 && zl0Var.c == null) {
                zl0Var.b(getWidth(), getHeight(), 2.0f, gm.L(3.0f));
            }
            zl0Var.setBounds(0, 0, getWidth(), getHeight());
            zl0Var.i = Math.round(this.s * 255.0f);
            zl0Var.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(boolean z, gu2 gu2Var, ValueAnimator valueAnimator) {
        float d;
        RenderEffect renderEffect;
        Shader.TileMode tileMode;
        float sin;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            if (floatValue <= 200.0f) {
                float d2 = 1.0f - d(floatValue / 200.0f);
                this.n = (1.0f - (d2 * d2)) * 1.027027f;
            } else {
                float d3 = 1.0f - d((floatValue - 200.0f) / 120.0f);
                this.n = b10.w(d3, 0.027027028f, d3, 1.0f);
            }
            if (floatValue < 160.0f) {
                sin = 1.0f - ((float) Math.pow(1.0f - (floatValue / 160.0f), 3.0d));
            } else {
                sin = (((float) Math.sin(d((floatValue - 160.0f) / 160.0f) * 3.141592653589793d)) / 48.0f) + 1.0f;
            }
            this.r = sin;
            this.s = d((floatValue - 130.0f) / 70.0f);
            this.w = d(floatValue / 160.0f);
        } else {
            this.s = 1.0f - d(floatValue / 60.0f);
            float d4 = d(floatValue / 150.0f);
            this.n = 1.0f - (((float) Math.pow(d4, 0.7d)) * 0.8783784f);
            this.r = aq1.v(d4, 0.625f, d4, 1.0f);
            this.w = (1.0f - d((floatValue - 150.0f) / 30.0f)) * (1.0f - (d4 * 0.15f));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (z) {
                d = (1.0f - d(floatValue / 160.0f)) * gm.L(6.0f);
            } else {
                d = (d(floatValue / 180.0f) + 1.0f) * gm.L(3.0f);
            }
            if (d > 0.01f) {
                tileMode = Shader.TileMode.DECAL;
                renderEffect = RenderEffect.createBlurEffect(d, d, tileMode);
            } else {
                renderEffect = null;
            }
            setRenderEffect(renderEffect);
        }
        gu2Var.accept(Float.valueOf(0.0f));
        invalidate();
    }

    public final void f(Canvas canvas, int i) {
        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i);
        drawChild(canvas, this.a, getDrawingTime());
        canvas.restoreToCount(saveLayerAlpha);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        this.f.a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(304.0f), Math.max(0, View.MeasureSpec.getSize(i) - gm.L(24.0f))), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.c.d();
    }
}
