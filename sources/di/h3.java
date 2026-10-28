package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b20;
import org.telegram.ui.g50;
import org.telegram.ui.h50;
import org.telegram.ui.rc0;
import org.telegram.ui.t60;
public final class h3 extends View {
    public final int f8616a = 8;
    public final Object f8617b;
    public Object f8618c;
    public Object d;

    public h3(Context context) {
        super(context);
        this.f8617b = new se.b();
        this.f8618c = new ag.e0(1, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f8616a) {
            case 2:
                a41 a41Var = (a41) this.d;
                org.telegram.ui.Components.r6 r6Var = a41Var.e;
                float i10 = r6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), r6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.l6 l6Var = (org.telegram.ui.Components.l6) this.f8617b;
                    l6Var.setColor(l6Var.f30121b.a(org.telegram.ui.ActionBar.y6.w0(a41Var.I, l6Var.f30120a), false));
                    l6Var.setColor(i0.a.f(a41Var.F, l6Var.getColor(), a41.a(a41Var)));
                    l6Var.setAlpha((int) (l6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), l6Var);
                    r6Var.p(rectF);
                    r6Var.B = (int) (i10 * 255.0f);
                    r6Var.u(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W8, (org.telegram.ui.ActionBar.u6) this.f8618c));
                    r6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                int[] iArr = (int[]) this.f8617b;
                b20 b20Var = (b20) this.f8618c;
                g50 g50Var = (g50) this.d;
                if (g50Var.h > 0.0f && g50Var.d != null) {
                    g50Var.f39510f.reset();
                    float width = getWidth() / g50Var.f39509c.getWidth();
                    g50Var.f39510f.postScale(width, width);
                    g50Var.e.setLocalMatrix(g50Var.f39510f);
                    g50Var.d.setAlpha((int) (g50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), g50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (b20Var != null) {
                    if (b20Var.isAttachedToWindow() && b20Var.getAlpha() > 0.5f) {
                        b20Var.getLocationInWindow(iArr);
                    } else {
                        g50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - b20Var.getScaleX()) * b20Var.getMeasuredWidth()), iArr[1] - ((1.0f - b20Var.getScaleY()) * b20Var.getMeasuredHeight()));
                    if (((h50) b20Var.f37870b).a(canvas2, b20Var.getMeasuredWidth(), g50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 4:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                t60 t60Var = (t60) this.d;
                int i11 = dp + ((int) t60Var.f43499b.f19333f);
                Paint paint = (Paint) this.f8618c;
                paint.setColor(t60Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8));
                RectF rectF2 = (RectF) this.f8617b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), t60.c0(t60Var).getMeasuredHeight() + i11);
                t60.b0(t60Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8616a) {
            case 7:
                super.onAttachedToWindow();
                if (((ai.g) this.f8618c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    return;
                }
                return;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((ag.e0) this.f8618c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8616a) {
            case 7:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                removeCallbacks(mVar);
                mVar.run();
                return;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((ag.e0) this.f8618c);
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
        ng0 ng0Var;
        int dp;
        switch (this.f8616a) {
            case 0:
                ea0 ea0Var = (ea0) this.f8617b;
                super.onDraw(canvas);
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f8618c;
                h6Var.f28862a = this;
                ((q4) this.d).getClass();
                h6Var.d(0.0f, false);
                float f7 = h6Var.f28864c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (h6Var.f28864c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    ea0Var.e(rectF);
                    ea0Var.k(24.0f);
                    ea0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    ea0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                dh0 dh0Var = (dh0) this.d;
                if (!dh0Var.f27461n || ((ng0Var = dh0Var.f27462r) != null && ng0Var.f30914x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i10 = dp2 + ((int) (dh0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = dh0Var.f27446a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f8618c);
                    }
                    canvas.drawLine(dp2, height, i10, height, (Paint) this.f8617b);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            default:
                super.onDraw(canvas);
                return;
            case 5:
                RectF rectF2 = (RectF) this.f8617b;
                rc0 rc0Var = (rc0) this.d;
                Drawable drawable = rc0Var.f42944s;
                Rect rect = (Rect) this.f8618c;
                drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                rc0Var.f42944s.draw(canvas);
                int i11 = rc0Var.F0;
                if (i11 == 0 || i11 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = rc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.y6.f23649t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23649t0);
                    return;
                }
                return;
            case 6:
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
                Path path = (Path) this.f8618c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width2 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i12 = 0; i12 < height2; i12++) {
                    canvas.save();
                    for (int i13 = 0; i13 < width2; i13++) {
                        int i14 = i13 % 2;
                        if ((i14 == 0 && i12 % 2 == 0) || (i14 != 0 && i12 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f8617b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 7:
                ai.h hVar = (ai.h) this.f8617b;
                hVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (hVar.f1528o < 1.0f || hVar.f1525l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((se.b) this.f8617b).iterator();
                    while (it.hasNext()) {
                        ((oi.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8616a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((a41) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f8616a) {
            case 6:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f35688g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8616a) {
            case 2:
                if (((a41) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h3(t60 t60Var, Context context) {
        super(context);
        this.d = t60Var;
        this.f8617b = new RectF();
        this.f8618c = new Paint(1);
    }

    public h3(dh0 dh0Var, Context context) {
        super(context);
        this.d = dh0Var;
        Paint paint = new Paint();
        this.f8617b = paint;
        Paint paint2 = new Paint();
        this.f8618c = paint2;
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

    public h3(rc0 rc0Var, Context context, Rect rect) {
        super(context);
        this.d = rc0Var;
        this.f8618c = rect;
        this.f8617b = new RectF();
    }

    public h3(a41 a41Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = a41Var;
        this.f8618c = u6Var;
        this.f8617b = new org.telegram.ui.Components.l6(this, u6Var);
        a41Var.e.setCallback(this);
    }

    public h3(Context context, ai.g gVar) {
        super(context);
        ai.h hVar = new ai.h();
        this.f8617b = hVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (hVar.f1537y != -16777216 || hVar.f1538z == null) {
            hVar.f1537y = -16777216;
            hVar.f1538z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f8618c = gVar;
    }

    public h3(q4 q4Var, Context context) {
        super(context);
        this.d = q4Var;
        this.f8617b = new ea0();
        this.f8618c = new org.telegram.ui.Components.h6(250L, ds.f27530f);
    }

    public h3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f8617b = paint;
        this.f8618c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public h3(g50 g50Var, Context context, b20 b20Var) {
        super(context);
        this.d = g50Var;
        this.f8618c = b20Var;
        this.f8617b = new int[2];
    }
}
