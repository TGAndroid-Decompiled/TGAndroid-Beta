package bi;

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
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lr;
public final class x0 extends FrameLayout {
    public final Path E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public int K;
    public float L;
    public boolean M;
    public Object N;
    public Drawable O;
    public Runnable P;
    public boolean Q;
    public boolean R;
    public r1.g S;
    public final View f4165a;
    public final org.telegram.ui.ActionBar.i6 f4166b;
    public final w0 f4167c;
    public final LinearLayout d;
    public final ScrollView f4168e;
    public int f4169f;
    public final Paint h;
    public final Paint f4170n;
    public final Paint f4171r;
    public final Paint f4172s;
    public final RectF f4173w;
    public final RectF f4174x;
    public final RectF f4175y;

    static {
        new lr(0.33d, 1.0d, 0.68d, 1.0d);
    }

    public x0(Context context, View view, org.telegram.ui.ActionBar.i6 i6Var, w0 w0Var) {
        super(context);
        boolean z10;
        float f10;
        int i7;
        this.f4169f = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f4170n = paint2;
        this.f4171r = new Paint(1);
        this.f4172s = new Paint(1);
        this.f4173w = new RectF();
        this.f4174x = new RectF();
        this.f4175y = new RectF();
        this.E = new Path();
        this.K = org.telegram.messenger.g0.L(220.0f);
        this.f4165a = view;
        this.f4166b = i6Var;
        this.f4167c = w0Var;
        setWillNotDraw(false);
        setClipChildren(false);
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, i6Var);
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.I = w03;
        if (org.telegram.messenger.g0.B(w02) < 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F = z10;
        if (Build.VERSION.SDK_INT >= 31) {
            if (z10) {
                f10 = 0.78f;
            } else {
                f10 = 0.74f;
            }
        } else {
            f10 = 0.97f;
        }
        paint.setColor(org.telegram.ui.ActionBar.n6.r1(f10, w02));
        this.G = paint.getAlpha();
        this.J = org.telegram.ui.ActionBar.n6.r1(0.06f, w03);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(0.66f));
        if (z10) {
            i7 = 620756991;
        } else {
            i7 = 385875968;
        }
        this.H = i7;
        paint2.setColor(i7);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        ScrollView scrollView = new ScrollView(context);
        this.f4168e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-2, -2));
        setOnClickListener(new ah.d(this, 5));
    }

    public final void a(FrameLayout frameLayout, int i7, Runnable runnable) {
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.08f, this.I), 2, -1));
        if (runnable != null) {
            frameLayout.setOnClickListener(new ai.v2(2, this, runnable));
        }
        this.d.addView(frameLayout, ma.o(-1, i7));
    }

    public final void b(float f10) {
        this.L = f10;
        RectF rectF = this.f4174x;
        if (!rectF.isEmpty()) {
            float width = rectF.width();
            RectF rectF2 = this.f4173w;
            float max = Math.max(0.0f, Math.min(width, rectF2.centerX() - rectF.left));
            ScrollView scrollView = this.f4168e;
            scrollView.setPivotX(max);
            scrollView.setPivotY(Math.max(0.0f, Math.min(rectF.height(), rectF2.centerY() - rectF.top)));
            float max2 = (Math.max(0.0f, f10) * 0.1f) + 0.9f;
            scrollView.setScaleX(max2);
            scrollView.setScaleY(max2);
        }
        LinearLayout linearLayout = this.d;
        int childCount = linearLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = linearLayout.getChildAt(i7);
            float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, ((f10 - 0.3f) - (i7 * 0.045f)) / 0.42f));
            float f11 = 1.0f - (max3 * max3);
            childAt.setAlpha(f11);
            childAt.setTranslationY((1.0f - f11) * (-org.telegram.messenger.g0.L(6.0f)));
            float f12 = (f11 * 0.04f) + 0.96f;
            childAt.setScaleX(f12);
            childAt.setScaleY(f12);
        }
        this.f4165a.setAlpha(1.0f - Math.max(0.0f, Math.min(1.0f, (f10 - 0.1f) / 0.45f)));
        Drawable drawable = this.O;
        if (drawable != null && !this.Q) {
            drawable.setAlpha(Math.round((1.0f - Math.max(0.0f, Math.min(1.0f, f10))) * 255.0f));
        }
        invalidate();
    }

    public final void c(Runnable runnable) {
        if (this.M) {
            return;
        }
        this.M = true;
        if (runnable != null) {
            runnable.run();
        }
        a3.f fVar = new a3.f(this, 20);
        r1.g gVar = this.S;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.L * 1000.0f));
        gVar2.f56323m = org.telegram.ui.Cells.c0.p(0.0f, 650.0f, 1.0f);
        this.S = gVar2;
        gVar2.f(1.0f);
        this.S.b(new u0(this, 1));
        this.S.a(new v0(0, this, fVar));
        this.S.h();
    }

    public final void d() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        View view = this.f4165a;
        view.getLocationInWindow(iArr);
        getLocationInWindow(iArr2);
        float scaleX = ((iArr[0] - iArr2[0]) - ((1.0f - view.getScaleX()) * view.getPivotX())) - view.getTranslationX();
        float scaleY = ((iArr[1] - iArr2[1]) - ((1.0f - view.getScaleY()) * view.getPivotY())) - view.getTranslationY();
        RectF rectF = this.f4173w;
        rectF.set(scaleX, scaleY, view.getWidth() + scaleX, view.getHeight() + scaleY);
        rectF.inset(0.0f, 0.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w0 w0Var;
        float f10;
        float f11;
        RectF rectF = this.f4173w;
        if (rectF.isEmpty() && getWidth() > 0) {
            e();
        }
        if (this.M) {
            d();
        }
        float f12 = this.L;
        float f13 = rectF.left;
        RectF rectF2 = this.f4174x;
        float T1 = org.telegram.messenger.g0.T1(f13, rectF2.left, f12);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f12);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f12);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f12);
        RectF rectF3 = this.f4175y;
        rectF3.set(T1, T12, T13, T14);
        if (rectF3.width() > 1.0f && rectF3.height() > 1.0f) {
            float max = Math.max(0.0f, Math.min(1.0f, f12));
            float T15 = org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(16.0f), max);
            Path path = this.E;
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
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.01f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.f4166b));
                Paint paint = this.f4171r;
                paint.setColor(r12);
                float L = org.telegram.messenger.g0.L(6.0f);
                float L2 = org.telegram.messenger.g0.L(1.5f);
                boolean z10 = this.F;
                if (z10) {
                    f10 = 0.3f;
                } else {
                    f10 = 0.1f;
                }
                paint.setShadowLayer(L, 0.0f, L2, org.telegram.ui.ActionBar.n6.r1(f10 * max, -16777216));
                canvas.drawRoundRect(rectF3, T15, T15, paint);
                float L3 = org.telegram.messenger.g0.L(1.0f);
                float L4 = org.telegram.messenger.g0.L(0.5f);
                if (z10) {
                    f11 = 0.25f;
                } else {
                    f11 = 0.07f;
                }
                paint.setShadowLayer(L3, 0.0f, L4, org.telegram.ui.ActionBar.n6.r1(f11 * max, -16777216));
                canvas.drawRoundRect(rectF3, T15, T15, paint);
                canvas.restore();
            }
            canvas.save();
            canvas.clipPath(path);
            if (i7 > 0) {
                int saveLayerAlpha = canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (255.0f * max));
                int ceil = (int) Math.ceil(rectF3.width());
                int ceil2 = (int) Math.ceil(rectF3.height());
                if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (w0Var = this.f4167c) != null && ceil > 0 && ceil2 > 0) {
                    RenderNode d = n2.a0.d(this.N);
                    if (d == null) {
                        d = new RenderNode("marketMorphBlur");
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.35f);
                        d.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)), RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f), Shader.TileMode.CLAMP)));
                        this.N = d;
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
                        w0Var.a(beginRecording);
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
            Paint paint2 = this.h;
            paint2.setAlpha((int) (this.G * max));
            canvas.drawRect(rectF3, paint2);
            if (this.O == null && Color.alpha(this.J) > 0) {
                int i13 = this.J;
                Paint paint3 = this.f4172s;
                paint3.setColor(i13);
                paint3.setAlpha(Math.round((1.0f - max) * Color.alpha(this.J)));
                canvas.drawRect(rectF3, paint3);
            }
            canvas.restore();
            canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            Paint paint4 = this.f4170n;
            paint4.setAlpha((int) (Color.alpha(this.H) * max));
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(rectF3.left + org.telegram.messenger.g0.L(0.33f), rectF3.top + org.telegram.messenger.g0.L(0.33f), rectF3.right - org.telegram.messenger.g0.L(0.33f), rectF3.bottom - org.telegram.messenger.g0.L(0.33f));
            canvas.drawRoundRect(rectF4, T15, T15, paint4);
        }
    }

    public final void e() {
        float f10;
        d();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.d;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int i7 = this.f4169f;
        boolean z10 = this.R;
        RectF rectF = this.f4173w;
        if (z10) {
            float f11 = rectF.top;
            if (f11 > 0.0f) {
                i7 = n10.D(16.0f, (int) f11, i7);
            }
        }
        int max = Math.max(this.K, linearLayout.getMeasuredWidth());
        int min = Math.min(linearLayout.getMeasuredHeight(), Math.max(org.telegram.messenger.g0.L(48.0f), i7));
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
        boolean z11 = this.R;
        RectF rectF2 = this.f4174x;
        if (z11) {
            float f13 = min;
            float max3 = Math.max(org.telegram.messenger.g0.L(8.0f), (rectF.top - org.telegram.messenger.g0.L(8.0f)) - f13);
            rectF2.set(max2, max3, f12 + max2, f13 + max3);
            return;
        }
        float f14 = rectF.top;
        rectF2.set(max2, f14, f12 + max2, min + f14);
    }

    public final void f() {
        this.O = this.f4165a.getBackground();
        b(this.L);
        r1.g gVar = new r1.g(new r1.f(this.L * 1000.0f));
        gVar.f56323m = org.telegram.ui.Cells.c0.p(1000.0f, 560.0f, 0.86f);
        this.S = gVar;
        gVar.b(new u0(this, 0));
        this.S.h();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        e();
        RectF rectF = this.f4174x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) rectF.width(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) rectF.height(), 1073741824);
        ScrollView scrollView = this.f4168e;
        scrollView.measure(makeMeasureSpec, makeMeasureSpec2);
        scrollView.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
