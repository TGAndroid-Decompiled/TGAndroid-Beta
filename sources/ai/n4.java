package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u90;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.d70;
import org.telegram.ui.gd0;
import org.telegram.ui.n20;
import org.telegram.ui.r50;
import org.telegram.ui.s50;
public final class n4 extends View {
    public final int f1399a = 0;
    public final Object f1400b;
    public Object f1401c;
    public Object d;

    public n4(Context context) {
        super(context);
        this.f1400b = new pe.b();
        this.f1401c = new tf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f1399a) {
            case 2:
                q31 q31Var = (q31) this.d;
                org.telegram.ui.Components.o6 o6Var = q31Var.f29889e;
                float g10 = o6Var.g();
                if (g10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, g10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), o6Var.d() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f1400b;
                    i6Var.setColor(i6Var.f27326b.a(org.telegram.ui.ActionBar.i6.v0(q31Var.I, i6Var.f27325a), false));
                    i6Var.setColor(i0.a.d(q31Var.F, i6Var.getColor(), q31.a(q31Var)));
                    i6Var.setAlpha((int) (i6Var.getAlpha() * g10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), i6Var);
                    o6Var.m(rectF);
                    o6Var.f29263w = (int) (g10 * 255.0f);
                    o6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W8, (org.telegram.ui.ActionBar.d6) this.f1401c));
                    o6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                int[] iArr = (int[]) this.f1400b;
                n20 n20Var = (n20) this.f1401c;
                r50 r50Var = (r50) this.d;
                if (r50Var.h > 0.0f && r50Var.d != null) {
                    r50Var.f39928f.reset();
                    float width = getWidth() / r50Var.f39926c.getWidth();
                    r50Var.f39928f.postScale(width, width);
                    r50Var.f39927e.setLocalMatrix(r50Var.f39928f);
                    r50Var.d.setAlpha((int) (r50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), r50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (n20Var != null) {
                    if (n20Var.isAttachedToWindow() && n20Var.getAlpha() > 0.5f) {
                        n20Var.getLocationInWindow(iArr);
                    } else {
                        r50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - n20Var.getScaleX()) * n20Var.getMeasuredWidth()), iArr[1] - ((1.0f - n20Var.getScaleY()) * n20Var.getMeasuredHeight()));
                    if (((s50) n20Var.f38808b).a(canvas2, n20Var.getMeasuredWidth(), r50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 5:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                d70 d70Var = (d70) this.d;
                int i10 = dp + ((int) d70Var.f35667b.f15444e);
                Paint paint = (Paint) this.f1401c;
                paint.setColor(d70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21104s8));
                RectF rectF2 = (RectF) this.f1400b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), d70.b0(d70Var).getMeasuredHeight() + i10);
                d70.Z(d70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1399a) {
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((tf.a) this.f1401c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1399a) {
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((tf.a) this.f1401c);
                }
                this.d = null;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        dg0 dg0Var;
        int dp;
        switch (this.f1399a) {
            case 0:
                u90 u90Var = (u90) this.f1400b;
                super.onDraw(canvas);
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.f1401c;
                e6Var.f25937a = this;
                ((e6) this.d).getClass();
                e6Var.d(0.0f, false);
                float f7 = e6Var.f25939c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (e6Var.f25939c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    u90Var.d(rectF);
                    u90Var.j(24.0f);
                    u90Var.f(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    u90Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                rg0 rg0Var = (rg0) this.d;
                if (!rg0Var.f30402n || ((dg0Var = rg0Var.f30403r) != null && dg0Var.f25729x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i10 = dp2 + ((int) (rg0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = rg0Var.f30386a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f1401c);
                    }
                    canvas.drawLine(dp2, height, i10, height, (Paint) this.f1400b);
                    return;
                }
                return;
            case 2:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f1400b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + o6Var.d());
                int width2 = (getWidth() - dpf2) / 2;
                int i11 = dpf2 + width2;
                ch.d dVar = (ch.d) this.f1401c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i11, getHeight());
                    ((ch.d) this.f1401c).draw(canvas);
                }
                o6Var.draw(canvas);
                return;
            case 6:
                RectF rectF2 = (RectF) this.f1400b;
                gd0 gd0Var = (gd0) this.d;
                Drawable drawable = gd0Var.f36591s;
                Rect rect = (Rect) this.f1401c;
                drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                gd0Var.f36591s.draw(canvas);
                int i12 = gd0Var.G0;
                if (i12 == 0 || i12 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = gd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.i6.f21115t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21115t0);
                    return;
                }
                return;
            case 7:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f13 = dp4 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = dp4 + measuredWidth;
                rectF3.set(dp4, dp4, f14, f14);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f15 = measuredWidth / 7.0f;
                Path path = (Path) this.f1401c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width3 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width3; i14++) {
                        int i15 = i14 % 2;
                        if ((i15 == 0 && i13 % 2 == 0) || (i15 != 0 && i13 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f1400b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((pe.b) this.f1400b).iterator();
                    while (it.hasNext()) {
                        ((li.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1399a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((q31) this.d).f29889e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1399a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.o6) this.f1400b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1399a) {
            case 7:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f33918g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1399a) {
            case 2:
                if (((q31) this.d).f29889e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 3:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.o6) this.f1400b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n4(d70 d70Var, Context context) {
        super(context);
        this.d = d70Var;
        this.f1400b = new RectF();
        this.f1401c = new Paint(1);
    }

    public n4(rg0 rg0Var, Context context) {
        super(context);
        this.d = rg0Var;
        Paint paint = new Paint();
        this.f1400b = paint;
        Paint paint2 = new Paint();
        this.f1401c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    public n4(gd0 gd0Var, Context context, Rect rect) {
        super(context);
        this.d = gd0Var;
        this.f1401c = rect;
        this.f1400b = new RectF();
    }

    public n4(q31 q31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = q31Var;
        this.f1401c = d6Var;
        this.f1400b = new org.telegram.ui.Components.i6(this, d6Var);
        q31Var.f29889e.setCallback(this);
    }

    public n4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, false, false, false);
        this.f1400b = o6Var;
        o6Var.r(-1);
        o6Var.f29245b = 17;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.setCallback(this);
    }

    public n4(e6 e6Var, Context context) {
        super(context);
        this.d = e6Var;
        this.f1400b = new u90();
        this.f1401c = new org.telegram.ui.Components.e6(250L, tr.f31147f);
    }

    public n4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f1400b = paint;
        this.f1401c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public n4(r50 r50Var, Context context, n20 n20Var) {
        super(context);
        this.d = r50Var;
        this.f1401c = n20Var;
        this.f1400b = new int[2];
    }
}
