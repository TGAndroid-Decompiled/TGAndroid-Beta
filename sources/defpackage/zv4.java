package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
public final class zv4 extends FrameLayout {
    public static final k43 i0 = new k43(0.33d, 1.0d, 0.68d, 1.0d);
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public float N;
    public boolean O;
    public Object P;
    public Drawable Q;
    public Runnable R;
    public jl0 S;
    public int T;
    public int U;
    public on1 V;
    public h01 W;
    public final View a;
    public boolean a0;
    public final vnb b;
    public boolean b0;
    public final yv4 c;
    public boolean c0;
    public LinearLayout d;
    public ValueAnimator d0;
    public LinearLayout e;
    public final RectF e0;
    public final FrameLayout f;
    public final RectF f0;
    public int g0;
    public final ScrollView h;
    public vpa h0;
    public int n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final RectF y;

    public zv4(Context context, View view, vnb vnbVar, yv4 yv4Var) {
        super(context);
        boolean z;
        float f;
        int i;
        this.n = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        this.r = paint;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.M = hl.L(220.0f);
        this.e0 = new RectF();
        this.f0 = new RectF();
        this.a = view;
        this.b = vnbVar;
        this.c = yv4Var;
        setWillNotDraw(false);
        setClipChildren(false);
        int v0 = aob.v0(aob.d6, vnbVar);
        int v02 = aob.v0(aob.G6, vnbVar);
        this.K = v02;
        if (hl.B(v0) < 0.5f) {
            z = true;
        } else {
            z = false;
        }
        this.H = z;
        if (Build.VERSION.SDK_INT >= 31) {
            if (z) {
                f = 0.78f;
            } else {
                f = 0.74f;
            }
        } else {
            f = 0.97f;
        }
        paint.setColor(aob.p1(f, v0));
        this.I = paint.getAlpha();
        this.L = aob.p1(0.06f, v02);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(0.66f));
        if (z) {
            i = 620756991;
        } else {
            i = 385875968;
        }
        this.J = i;
        paint2.setColor(i);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        ScrollView scrollView = new ScrollView(context);
        this.h = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.addView(this.d, new FrameLayout.LayoutParams(-1, -2));
        scrollView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2));
        setOnClickListener(new xv4(this, (byte) 0));
    }

    public final void a(FrameLayout frameLayout, int i, Runnable runnable) {
        frameLayout.setBackground(aob.f0(aob.p1(0.08f, this.K), 2, -1));
        if (runnable != null) {
            frameLayout.setOnClickListener(new vv4(this, runnable, (byte) 0));
        }
        this.d.addView(frameLayout, tre.o(-1, i));
    }

    public final void b(float f) {
        this.N = f;
        RectF rectF = this.E;
        if (!rectF.isEmpty()) {
            float width = rectF.width();
            RectF rectF2 = this.y;
            float max = Math.max(0.0f, Math.min(width, rectF2.centerX() - rectF.left));
            ScrollView scrollView = this.h;
            scrollView.setPivotX(max);
            scrollView.setPivotY(Math.max(0.0f, Math.min(rectF.height(), rectF2.centerY() - rectF.top)));
            float max2 = (Math.max(0.0f, f) * 0.1f) + 0.9f;
            scrollView.setScaleX(max2);
            scrollView.setScaleY(max2);
        }
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((f - 0.3f) - (Math.min(i, 6) * 0.045f)) / 0.42f));
            float f2 = 1.0f - (max3 * max3);
            childAt.setAlpha(f2);
            childAt.setTranslationY((1.0f - f2) * (-hl.L(6.0f)));
            float f3 = (f2 * 0.04f) + 0.96f;
            childAt.setScaleX(f3);
            childAt.setScaleY(f3);
        }
        this.a.setAlpha(1.0f - Math.max(0.0f, Math.min(1.0f, (f - 0.1f) / 0.45f)));
        Drawable drawable = this.Q;
        if (drawable != null && !this.b0) {
            drawable.setAlpha(Math.round((1.0f - Math.max(0.0f, Math.min(1.0f, f))) * 255.0f));
        }
        invalidate();
    }

    public final void c(Runnable runnable) {
        if (this.O) {
            return;
        }
        this.O = true;
        if (runnable != null) {
            runnable.run();
        }
        rj4 rj4Var = new rj4(this, (byte) 13);
        vpa vpaVar = this.h0;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = new vpa(new xk4(this.N * 1000.0f));
        vpaVar2.m = bp1.j(0.0f, 650.0f, 1.0f);
        this.h0 = vpaVar2;
        vpaVar2.f(1.0f);
        this.h0.b(new wv4(this, (byte) 1));
        this.h0.a(new x11(this, rj4Var, (byte) 4));
        this.h0.h();
    }

    public final boolean d() {
        LinearLayout linearLayout = this.e;
        if (linearLayout == null || this.O) {
            return false;
        }
        this.e = null;
        i(linearLayout, false);
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        yv4 yv4Var;
        int[] iArr;
        int[] iArr2;
        float f3;
        float f4;
        RectF rectF = this.y;
        if (rectF.isEmpty() && getWidth() > 0) {
            f();
        }
        if (this.O) {
            e();
        }
        float f5 = this.N;
        float f6 = rectF.left;
        RectF rectF2 = this.E;
        float R1 = hl.R1(f6, rectF2.left, f5);
        float R12 = hl.R1(rectF.top, rectF2.top, f5);
        float R13 = hl.R1(rectF.right, rectF2.right, f5);
        float R14 = hl.R1(rectF.bottom, rectF2.bottom, f5);
        RectF rectF3 = this.F;
        rectF3.set(R1, R12, R13, R14);
        if (rectF3.width() > 1.0f && rectF3.height() > 1.0f) {
            float max = Math.max(0.0f, Math.min(1.0f, f5));
            if (this.a0 && !this.O) {
                f = Math.min(1.0f, 2.5f * max);
            } else {
                f = max;
            }
            float R15 = hl.R1(rectF.height() / 2.0f, hl.L(16.0f), max);
            Path path = this.G;
            path.rewind();
            path.addRoundRect(rectF3, R15, R15, Path.Direction.CW);
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i > 0) {
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                }
                int p1 = aob.p1(0.01f, aob.v0(aob.d6, this.b));
                Paint paint = this.w;
                paint.setColor(p1);
                float L = hl.L(6.0f);
                float L2 = hl.L(1.5f);
                boolean z = this.H;
                if (z) {
                    f3 = 0.3f;
                } else {
                    f3 = 0.1f;
                }
                paint.setShadowLayer(L, 0.0f, L2, aob.p1(f3 * f, -16777216));
                canvas.drawRoundRect(rectF3, R15, R15, paint);
                float L3 = hl.L(1.0f);
                float L4 = hl.L(0.5f);
                if (z) {
                    f4 = 0.25f;
                } else {
                    f4 = 0.07f;
                }
                paint.setShadowLayer(L3, 0.0f, L4, aob.p1(f4 * f, -16777216));
                canvas.drawRoundRect(rectF3, R15, R15, paint);
                canvas.restore();
            }
            jl0 jl0Var = this.S;
            if (jl0Var != null && f < 1.0f) {
                jl0Var.r(R15);
                this.S.setBounds((int) rectF3.left, (int) rectF3.top, (int) Math.ceil(rectF3.right), (int) Math.ceil(rectF3.bottom));
                this.S.setAlpha((int) ((1.0f - f) * 255.0f));
                this.S.draw(canvas);
            }
            if (this.W != null) {
                View view = this.a;
                if (view.getAlpha() > 0.0f) {
                    canvas.save();
                    canvas.clipPath(path);
                    h01 h01Var = this.W;
                    float alpha = view.getAlpha();
                    knc kncVar = (knc) h01Var.c;
                    ((zv4) h01Var.b).getLocationInWindow(new int[2]);
                    kncVar.getLocationInWindow(new int[2]);
                    canvas.save();
                    canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                    RectF rectF4 = kncVar.O1;
                    if (!rectF4.isEmpty() && alpha > 0.0f) {
                        kncVar.h(canvas, rectF4, alpha);
                    }
                    canvas.restore();
                    canvas.restore();
                }
            }
            canvas.save();
            canvas.clipPath(path);
            if (i > 0) {
                int saveLayerAlpha = canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (255.0f * f));
                int ceil = (int) Math.ceil(rectF3.width());
                int ceil2 = (int) Math.ceil(rectF3.height());
                if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (yv4Var = this.c) != null && ceil > 0 && ceil2 > 0) {
                    RenderNode g = rm0.g(this.P);
                    if (g == null) {
                        g = new RenderNode("marketMorphBlur");
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.35f);
                        f2 = 1.0f;
                        g.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)), RenderEffect.createBlurEffect(hl.L(22.0f), hl.L(22.0f), Shader.TileMode.CLAMP)));
                        this.P = g;
                    } else {
                        f2 = 1.0f;
                    }
                    int L5 = hl.L(24.0f);
                    int i2 = L5 << 1;
                    int i3 = ceil + i2;
                    int i4 = ceil2 + i2;
                    g.setPosition(0, 0, i3, i4);
                    RecordingCanvas beginRecording = g.beginRecording(i3, i4);
                    float f7 = L5;
                    try {
                        beginRecording.translate(f7 - rectF3.left, f7 - rectF3.top);
                        yv4Var.a(beginRecording);
                        g.endRecording();
                        canvas.save();
                        canvas.translate(rectF3.left - f7, rectF3.top - f7);
                        canvas.drawRenderNode(g);
                        canvas.restore();
                    } catch (Throwable th) {
                        g.endRecording();
                        throw th;
                    }
                } else {
                    f2 = 1.0f;
                }
                canvas.restoreToCount(saveLayerAlpha);
            } else {
                f2 = 1.0f;
            }
            Paint paint2 = this.r;
            paint2.setAlpha((int) (this.I * f));
            canvas.drawRect(rectF3, paint2);
            if (this.Q == null && Color.alpha(this.L) > 0) {
                int i5 = this.L;
                Paint paint3 = this.x;
                paint3.setColor(i5);
                paint3.setAlpha(Math.round((f2 - f) * Color.alpha(this.L)));
                canvas.drawRect(rectF3, paint3);
            }
            canvas.restore();
            canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            Paint paint4 = this.s;
            paint4.setAlpha((int) (Color.alpha(this.J) * f));
            RectF rectF5 = hl.P;
            rectF5.set(rectF3.left + hl.L(0.33f), rectF3.top + hl.L(0.33f), rectF3.right - hl.L(0.33f), rectF3.bottom - hl.L(0.33f));
            canvas.drawRoundRect(rectF5, R15, R15, paint4);
        }
    }

    public final void e() {
        on1 on1Var = this.V;
        if (on1Var != null && this.O) {
            on1Var.run();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        View view = this.a;
        view.getLocationInWindow(iArr);
        getLocationInWindow(iArr2);
        float scaleX = ((iArr[0] - iArr2[0]) - ((1.0f - view.getScaleX()) * view.getPivotX())) - view.getTranslationX();
        float scaleY = ((iArr[1] - iArr2[1]) - ((1.0f - view.getScaleY()) * view.getPivotY())) - view.getTranslationY();
        RectF rectF = this.y;
        rectF.set(scaleX, scaleY, view.getWidth() + scaleX, view.getHeight() + scaleY);
        rectF.inset(0.0f, 0.0f);
    }

    public final void f() {
        float f;
        e();
        this.d.measure(0, 0);
        int i = this.n;
        boolean z = this.c0;
        RectF rectF = this.y;
        if (z) {
            int i2 = this.U;
            if (i2 > 0) {
                i = Math.min(i, i2 - this.T);
            } else {
                float f2 = rectF.top;
                if (f2 > 0.0f) {
                    i = c00.y(16.0f, (int) f2, i);
                }
            }
        }
        if (!this.c0 && getHeight() > 0) {
            i = c00.y(16.0f, getHeight(), i);
        }
        int max = Math.max(this.M, this.d.getMeasuredWidth());
        int min = Math.min(this.d.getMeasuredHeight(), Math.max(hl.L(48.0f), i));
        if (rectF.centerX() > getWidth() / 2.0f) {
            f = rectF.right - max;
        } else {
            f = rectF.left;
        }
        float f3 = max;
        if (f + f3 > getWidth() - hl.L(8.0f)) {
            f = qu6.x(8.0f, getWidth(), max);
        }
        float max2 = Math.max(hl.L(8.0f), f);
        boolean z2 = this.c0;
        RectF rectF2 = this.E;
        if (z2) {
            if (this.a0) {
                float f4 = rectF.left;
                if (f4 + f3 > getWidth() - hl.L(8.0f)) {
                    f4 = rectF.centerX() - (f3 / 2.0f);
                }
                float max3 = Math.max(hl.L(8.0f), Math.min(qu6.x(8.0f, getWidth(), max), f4));
                int i3 = this.U;
                if (i3 > 0) {
                    float f5 = rectF.bottom;
                    float f6 = min;
                    float f7 = this.T;
                    if (f5 - f6 < f7) {
                        rectF2.set(max3, f7, f3 + max3, Math.min(f6 + f7, Math.max(f5, i3)));
                        return;
                    }
                }
                rectF2.set(max3, Math.max(hl.L(8.0f), rectF.bottom - min), f3 + max3, rectF.bottom);
                return;
            }
            float f8 = min;
            float max4 = Math.max(hl.L(8.0f), (rectF.top - hl.L(8.0f)) - f8);
            rectF2.set(max2, max4, f3 + max2, f8 + max4);
            return;
        }
        float f9 = rectF.top;
        if (getHeight() > 0 && min + f9 > getHeight() - hl.L(8.0f)) {
            f9 = Math.max(hl.L(8.0f), (getHeight() - hl.L(8.0f)) - min);
        }
        rectF2.set(max2, f9, f3 + max2, min + f9);
    }

    public final void g() {
        this.Q = this.a.getBackground();
        b(this.N);
        vpa vpaVar = new vpa(new xk4(this.N * 1000.0f));
        vpaVar.m = bp1.j(1000.0f, 560.0f, 0.86f);
        this.h0 = vpaVar;
        vpaVar.b(new wv4(this, (byte) 0));
        this.h0.h();
    }

    public final void h(ArrayList arrayList, ArrayList arrayList2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
        b8 b8Var = new b8(0, this.b, getContext(), false, false);
        b8Var.j(ob6.M0(2131753749, null), 2131232062, null);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        int v0 = aob.v0(aob.F8, this.b);
        int i = this.K;
        b8Var.d(i, v0);
        b8Var.setBackground(aob.f0(aob.p1(0.08f, i), 2, -1));
        b8Var.setOnClickListener(new xv4(this, (byte) 1));
        linearLayout.addView(b8Var, tre.o(-1, 44));
        View view = new View(getContext());
        view.setBackgroundColor(aob.p1(0.06f, i));
        linearLayout.addView(view, tre.o(-1, 8));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View view2 = (View) arrayList.get(i2);
            Runnable runnable = (Runnable) arrayList2.get(i2);
            view2.setBackground(aob.f0(aob.p1(0.08f, i), 2, -1));
            if (runnable != null) {
                view2.setOnClickListener(new vv4(this, runnable, (byte) 1));
            }
            linearLayout.addView(view2, tre.o(-1, 44));
        }
        this.e = this.d;
        i(linearLayout, true);
    }

    public final void i(final LinearLayout linearLayout, boolean z) {
        int i;
        float f;
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        final LinearLayout linearLayout2 = this.d;
        final int scrollY = this.h.getScrollY();
        int i2 = 0;
        if (z) {
            this.g0 = scrollY;
            i = 0;
        } else {
            i = this.g0;
        }
        RectF rectF = this.e0;
        RectF rectF2 = this.E;
        rectF.set(rectF2);
        this.d = linearLayout;
        if (linearLayout.getParent() == null) {
            this.f.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        }
        while (true) {
            f = 1.0f;
            if (i2 >= linearLayout.getChildCount()) {
                break;
            }
            View childAt = linearLayout.getChildAt(i2);
            childAt.setAlpha(1.0f);
            childAt.setTranslationY(0.0f);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            i2++;
        }
        f();
        this.f0.set(rectF2);
        rectF2.set(rectF);
        if (!z) {
            f = -1.0f;
        }
        final float f2 = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d0 = ofFloat;
        final int i3 = i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                zv4 zv4Var = zv4.this;
                RectF rectF3 = zv4Var.E;
                RectF rectF4 = zv4Var.e0;
                float f3 = rectF4.left;
                RectF rectF5 = zv4Var.f0;
                rectF3.set(hl.R1(f3, rectF5.left, floatValue), hl.R1(rectF4.top, rectF5.top, floatValue), hl.R1(rectF4.right, rectF5.right, floatValue), hl.R1(rectF4.bottom, rectF5.bottom, floatValue));
                float max = Math.max(rectF4.width(), rectF5.width());
                float f4 = f2;
                LinearLayout linearLayout3 = linearLayout2;
                linearLayout3.setTranslationX((-f4) * max * floatValue);
                float f5 = 1.0f - floatValue;
                linearLayout3.setAlpha(f5);
                LinearLayout linearLayout4 = linearLayout;
                linearLayout4.setTranslationX(f4 * max * f5);
                linearLayout4.setTranslationY(scrollY - i3);
                linearLayout4.setAlpha(floatValue);
                zv4Var.requestLayout();
                zv4Var.invalidate();
            }
        });
        this.d0.addListener(new eq1(this, linearLayout2, linearLayout, i3, (byte) 2));
        this.d0.setDuration(260L);
        this.d0.setInterpolator(i0);
        this.d0.start();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.d0 == null) {
            f();
        }
        RectF rectF = this.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rectF.width(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) rectF.height(), 1073741824);
        ScrollView scrollView = this.h;
        scrollView.measure(makeMeasureSpec, makeMeasureSpec2);
        scrollView.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
