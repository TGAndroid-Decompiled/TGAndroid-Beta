package bi;

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
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.nr;
public final class b1 extends FrameLayout {
    public static final nr f3388c0 = new nr(0.33d, 1.0d, 0.68d, 1.0d);
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
    public boolean S;
    public boolean T;
    public ValueAnimator U;
    public final RectF V;
    public final RectF W;
    public final View f3389a;
    public int f3390a0;
    public final org.telegram.ui.ActionBar.h6 f3391b;
    public r1.g f3392b0;
    public final a1 f3393c;
    public LinearLayout d;
    public LinearLayout f3394e;
    public final FrameLayout f3395f;
    public final ScrollView h;
    public int f3396n;
    public final Paint f3397r;
    public final Paint f3398s;
    public final Paint f3399w;
    public final Paint f3400x;
    public final RectF f3401y;

    public b1(Context context, View view, org.telegram.ui.ActionBar.h6 h6Var, a1 a1Var) {
        super(context);
        boolean z10;
        float f10;
        int i7;
        this.f3396n = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        this.f3397r = paint;
        Paint paint2 = new Paint(1);
        this.f3398s = paint2;
        this.f3399w = new Paint(1);
        this.f3400x = new Paint(1);
        this.f3401y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.M = org.telegram.messenger.g0.L(220.0f);
        this.V = new RectF();
        this.W = new RectF();
        this.f3389a = view;
        this.f3391b = h6Var;
        this.f3393c = a1Var;
        setWillNotDraw(false);
        setClipChildren(false);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var);
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.K = w03;
        if (org.telegram.messenger.g0.B(w02) < 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        if (Build.VERSION.SDK_INT >= 31) {
            if (z10) {
                f10 = 0.78f;
            } else {
                f10 = 0.74f;
            }
        } else {
            f10 = 0.97f;
        }
        paint.setColor(org.telegram.ui.ActionBar.m6.r1(f10, w02));
        this.I = paint.getAlpha();
        this.L = org.telegram.ui.ActionBar.m6.r1(0.06f, w03);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(0.66f));
        if (z10) {
            i7 = 620756991;
        } else {
            i7 = 385875968;
        }
        this.J = i7;
        paint2.setColor(i7);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        ScrollView scrollView = new ScrollView(context);
        this.h = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3395f = frameLayout;
        frameLayout.addView(this.d, new FrameLayout.LayoutParams(-1, -2));
        scrollView.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2));
        setOnClickListener(new x0(this, 0));
    }

    public final void a(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.08f, this.K), 2, -1));
        if (runnable != null) {
            frameLayout.setOnClickListener(new v0(this, runnable, 0));
        }
        this.d.addView(frameLayout, na.o(-1, i7));
    }

    public final void b(float f10) {
        this.N = f10;
        RectF rectF = this.E;
        if (!rectF.isEmpty()) {
            float width = rectF.width();
            RectF rectF2 = this.f3401y;
            float max = Math.max(0.0f, Math.min(width, rectF2.centerX() - rectF.left));
            ScrollView scrollView = this.h;
            scrollView.setPivotX(max);
            scrollView.setPivotY(Math.max(0.0f, Math.min(rectF.height(), rectF2.centerY() - rectF.top)));
            float max2 = (Math.max(0.0f, f10) * 0.1f) + 0.9f;
            scrollView.setScaleX(max2);
            scrollView.setScaleY(max2);
        }
        int childCount = this.d.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.d.getChildAt(i7);
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((f10 - 0.3f) - (Math.min(i7, 6) * 0.045f)) / 0.42f));
            float f11 = 1.0f - (max3 * max3);
            childAt.setAlpha(f11);
            childAt.setTranslationY((1.0f - f11) * (-org.telegram.messenger.g0.L(6.0f)));
            float f12 = (f11 * 0.04f) + 0.96f;
            childAt.setScaleX(f12);
            childAt.setScaleY(f12);
        }
        this.f3389a.setAlpha(1.0f - Math.max(0.0f, Math.min(1.0f, (f10 - 0.1f) / 0.45f)));
        Drawable drawable = this.Q;
        if (drawable != null && !this.S) {
            drawable.setAlpha(Math.round((1.0f - Math.max(0.0f, Math.min(1.0f, f10))) * 255.0f));
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
        a3.f fVar = new a3.f(this, 19);
        r1.g gVar = this.f3392b0;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.N * 1000.0f));
        gVar2.f56333m = org.telegram.ui.Cells.c0.p(0.0f, 650.0f, 1.0f);
        this.f3392b0 = gVar2;
        gVar2.f(1.0f);
        this.f3392b0.b(new w0(this, 1));
        this.f3392b0.a(new y0(0, this, fVar));
        this.f3392b0.h();
    }

    public final void d() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        View view = this.f3389a;
        view.getLocationInWindow(iArr);
        getLocationInWindow(iArr2);
        float scaleX = ((iArr[0] - iArr2[0]) - ((1.0f - view.getScaleX()) * view.getPivotX())) - view.getTranslationX();
        float scaleY = ((iArr[1] - iArr2[1]) - ((1.0f - view.getScaleY()) * view.getPivotY())) - view.getTranslationY();
        RectF rectF = this.f3401y;
        rectF.set(scaleX, scaleY, view.getWidth() + scaleX, view.getHeight() + scaleY);
        rectF.inset(0.0f, 0.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a1 a1Var;
        float f10;
        float f11;
        RectF rectF = this.f3401y;
        if (rectF.isEmpty() && getWidth() > 0) {
            e();
        }
        if (this.O) {
            d();
        }
        float f12 = this.N;
        float f13 = rectF.left;
        RectF rectF2 = this.E;
        float T1 = org.telegram.messenger.g0.T1(f13, rectF2.left, f12);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f12);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f12);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f12);
        RectF rectF3 = this.F;
        rectF3.set(T1, T12, T13, T14);
        if (rectF3.width() > 1.0f && rectF3.height() > 1.0f) {
            float max = Math.max(0.0f, Math.min(1.0f, f12));
            float T15 = org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(16.0f), max);
            Path path = this.G;
            path.rewind();
            path.addRoundRect(rectF3, T15, T15, Path.Direction.CW);
            int i7 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
            if (i7 > 0) {
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                }
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.01f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.f3391b));
                Paint paint = this.f3399w;
                paint.setColor(r12);
                float L = org.telegram.messenger.g0.L(6.0f);
                float L2 = org.telegram.messenger.g0.L(1.5f);
                boolean z10 = this.H;
                if (z10) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.1f;
                }
                paint.setShadowLayer(L, 0.0f, L2, org.telegram.ui.ActionBar.m6.r1(f10 * max, -16777216));
                canvas.drawRoundRect(rectF3, T15, T15, paint);
                float L3 = org.telegram.messenger.g0.L(1.0f);
                float L4 = org.telegram.messenger.g0.L(0.5f);
                if (z10) {
                    f11 = 0.25f;
                } else {
                    f11 = 0.07f;
                }
                paint.setShadowLayer(L3, 0.0f, L4, org.telegram.ui.ActionBar.m6.r1(f11 * max, -16777216));
                canvas.drawRoundRect(rectF3, T15, T15, paint);
                canvas.restore();
            }
            canvas.save();
            canvas.clipPath(path);
            if (i7 > 0) {
                int saveLayerAlpha = canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (255.0f * max));
                int ceil = (int) Math.ceil(rectF3.width());
                int ceil2 = (int) Math.ceil(rectF3.height());
                if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (a1Var = this.f3393c) != null && ceil > 0 && ceil2 > 0) {
                    RenderNode d = n2.a0.d(this.P);
                    if (d == null) {
                        d = new RenderNode("marketMorphBlur");
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.35f);
                        d.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)), RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f), Shader.TileMode.CLAMP)));
                        this.P = d;
                    }
                    int L5 = org.telegram.messenger.g0.L(24.0f);
                    int i10 = L5 * 2;
                    int i11 = ceil + i10;
                    int i12 = ceil2 + i10;
                    d.setPosition(0, 0, i11, i12);
                    RecordingCanvas beginRecording = d.beginRecording(i11, i12);
                    float f14 = L5;
                    try {
                        beginRecording.translate(f14 - rectF3.left, f14 - rectF3.top);
                        a1Var.a(beginRecording);
                        d.endRecording();
                        canvas.save();
                        canvas.translate(rectF3.left - f14, rectF3.top - f14);
                        canvas.drawRenderNode(d);
                        canvas.restore();
                    } catch (Throwable th2) {
                        d.endRecording();
                        throw th2;
                    }
                }
                canvas.restoreToCount(saveLayerAlpha);
            }
            Paint paint2 = this.f3397r;
            paint2.setAlpha((int) (this.I * max));
            canvas.drawRect(rectF3, paint2);
            if (this.Q == null && Color.alpha(this.L) > 0) {
                int i13 = this.L;
                Paint paint3 = this.f3400x;
                paint3.setColor(i13);
                paint3.setAlpha(Math.round((1.0f - max) * Color.alpha(this.L)));
                canvas.drawRect(rectF3, paint3);
            }
            canvas.restore();
            canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            Paint paint4 = this.f3398s;
            paint4.setAlpha((int) (Color.alpha(this.J) * max));
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(rectF3.left + org.telegram.messenger.g0.L(0.33f), rectF3.top + org.telegram.messenger.g0.L(0.33f), rectF3.right - org.telegram.messenger.g0.L(0.33f), rectF3.bottom - org.telegram.messenger.g0.L(0.33f));
            canvas.drawRoundRect(rectF4, T15, T15, paint4);
        }
    }

    public final void e() {
        float f10;
        d();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int i7 = this.f3396n;
        boolean z10 = this.T;
        RectF rectF = this.f3401y;
        if (z10) {
            float f11 = rectF.top;
            if (f11 > 0.0f) {
                i7 = o10.D(16.0f, (int) f11, i7);
            }
        }
        if (!this.T && getHeight() > 0) {
            i7 = o10.D(16.0f, getHeight(), i7);
        }
        int max = Math.max(this.M, this.d.getMeasuredWidth());
        int min = Math.min(this.d.getMeasuredHeight(), Math.max(org.telegram.messenger.g0.L(48.0f), i7));
        if (rectF.centerX() > getWidth() / 2.0f) {
            f10 = rectF.right - max;
        } else {
            f10 = rectF.left;
        }
        float f12 = max;
        if (f10 + f12 > getWidth() - org.telegram.messenger.g0.L(8.0f)) {
            f10 = org.telegram.messenger.f3.z(8.0f, getWidth(), max);
        }
        float max2 = Math.max(org.telegram.messenger.g0.L(8.0f), f10);
        boolean z11 = this.T;
        RectF rectF2 = this.E;
        if (z11) {
            float f13 = min;
            float max3 = Math.max(org.telegram.messenger.g0.L(8.0f), (rectF.top - org.telegram.messenger.g0.L(8.0f)) - f13);
            rectF2.set(max2, max3, f12 + max2, f13 + max3);
            return;
        }
        float f14 = rectF.top;
        if (getHeight() > 0 && min + f14 > getHeight() - org.telegram.messenger.g0.L(8.0f)) {
            f14 = Math.max(org.telegram.messenger.g0.L(8.0f), (getHeight() - org.telegram.messenger.g0.L(8.0f)) - min);
        }
        rectF2.set(max2, f14, f12 + max2, min + f14);
    }

    public final void f() {
        this.Q = this.f3389a.getBackground();
        b(this.N);
        r1.g gVar = new r1.g(new r1.f(this.N * 1000.0f));
        gVar.f56333m = org.telegram.ui.Cells.c0.p(1000.0f, 560.0f, 0.86f);
        this.f3392b0 = gVar;
        gVar.b(new w0(this, 0));
        this.f3392b0.h();
    }

    public final void g(ArrayList arrayList, ArrayList arrayList2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, getContext(), this.f3391b, false, false);
        y0Var.j(hd.N0(2131753753, null), 2131232059, null);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.f3391b);
        int i7 = this.K;
        y0Var.d(i7, w02);
        y0Var.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.08f, i7), 2, -1));
        y0Var.setOnClickListener(new x0(this, 1));
        linearLayout.addView(y0Var, na.o(-1, 44));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.m6.r1(0.06f, i7));
        linearLayout.addView(view, na.o(-1, 8));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view2 = (View) arrayList.get(i10);
            Runnable runnable = (Runnable) arrayList2.get(i10);
            view2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.08f, i7), 2, -1));
            if (runnable != null) {
                view2.setOnClickListener(new v0(this, runnable, 1));
            }
            linearLayout.addView(view2, na.o(-1, 44));
        }
        this.f3394e = this.d;
        h(linearLayout, true);
    }

    public final void h(final LinearLayout linearLayout, boolean z10) {
        int i7;
        float f10;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        final LinearLayout linearLayout2 = this.d;
        final int scrollY = this.h.getScrollY();
        int i10 = 0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = this.f3390a0;
        }
        if (z10) {
            this.f3390a0 = scrollY;
        }
        RectF rectF = this.V;
        RectF rectF2 = this.E;
        rectF.set(rectF2);
        this.d = linearLayout;
        if (linearLayout.getParent() == null) {
            this.f3395f.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        }
        while (true) {
            f10 = 1.0f;
            if (i10 >= linearLayout.getChildCount()) {
                break;
            }
            View childAt = linearLayout.getChildAt(i10);
            childAt.setAlpha(1.0f);
            childAt.setTranslationY(0.0f);
            childAt.setScaleX(1.0f);
            childAt.setScaleY(1.0f);
            i10++;
        }
        e();
        this.W.set(rectF2);
        rectF2.set(rectF);
        if (!z10) {
            f10 = -1.0f;
        }
        final float f11 = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.U = ofFloat;
        final int i11 = i7;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b1 b1Var = b1.this;
                b1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                RectF rectF3 = b1Var.E;
                RectF rectF4 = b1Var.V;
                float f12 = rectF4.left;
                RectF rectF5 = b1Var.W;
                rectF3.set(org.telegram.messenger.g0.T1(f12, rectF5.left, floatValue), org.telegram.messenger.g0.T1(rectF4.top, rectF5.top, floatValue), org.telegram.messenger.g0.T1(rectF4.right, rectF5.right, floatValue), org.telegram.messenger.g0.T1(rectF4.bottom, rectF5.bottom, floatValue));
                float max = Math.max(rectF4.width(), rectF5.width());
                float f13 = f11;
                LinearLayout linearLayout3 = linearLayout2;
                linearLayout3.setTranslationX((-f13) * max * floatValue);
                float f14 = 1.0f - floatValue;
                linearLayout3.setAlpha(f14);
                LinearLayout linearLayout4 = linearLayout;
                linearLayout4.setTranslationX(f13 * max * f14);
                linearLayout4.setTranslationY(scrollY - i11);
                linearLayout4.setAlpha(floatValue);
                b1Var.requestLayout();
                b1Var.invalidate();
            }
        });
        this.U.addListener(new z0(this, linearLayout2, linearLayout, i11, 0));
        this.U.setDuration(260L);
        this.U.setInterpolator(f3388c0);
        this.U.start();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        if (this.U == null) {
            e();
        }
        RectF rectF = this.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rectF.width(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) rectF.height(), 1073741824);
        ScrollView scrollView = this.h;
        scrollView.measure(makeMeasureSpec, makeMeasureSpec2);
        scrollView.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
