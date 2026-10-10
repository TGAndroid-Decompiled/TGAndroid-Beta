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
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c70;
import org.telegram.ui.hd0;
import org.telegram.ui.p50;
import org.telegram.ui.q50;
import org.telegram.ui.r50;
public final class o4 extends View {
    public final int f1525a = 0;
    public final Object f1526b;
    public Object f1527c;
    public Object d;

    public o4(Context context) {
        super(context);
        this.f1526b = new qe.b();
        this.f1527c = new uf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f1525a) {
            case 3:
                y31 y31Var = (y31) this.d;
                org.telegram.ui.Components.q6 q6Var = y31Var.f33094e;
                float i10 = q6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), q6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f1526b;
                    k6Var.setColor(k6Var.f27911b.a(org.telegram.ui.ActionBar.i6.w0(y31Var.I, k6Var.f27910a), false));
                    k6Var.setColor(i0.a.d(y31Var.F, k6Var.getColor(), y31.a(y31Var)));
                    k6Var.setAlpha((int) (k6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), k6Var);
                    q6Var.p(rectF);
                    q6Var.B = (int) (i10 * 255.0f);
                    q6Var.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W8, (org.telegram.ui.ActionBar.e6) this.f1527c));
                    q6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f1526b;
                q50 q50Var = (q50) this.f1527c;
                p50 p50Var = (p50) this.d;
                if (p50Var.h > 0.0f && p50Var.d != null) {
                    p50Var.f40717f.reset();
                    float width = getWidth() / p50Var.f40715c.getWidth();
                    p50Var.f40717f.postScale(width, width);
                    p50Var.f40716e.setLocalMatrix(p50Var.f40717f);
                    p50Var.d.setAlpha((int) (p50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), p50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (q50Var != null) {
                    if (q50Var.isAttachedToWindow() && q50Var.getAlpha() > 0.5f) {
                        q50Var.getLocationInWindow(iArr);
                    } else {
                        p50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - q50Var.getScaleX()) * q50Var.getMeasuredWidth()), iArr[1] - ((1.0f - q50Var.getScaleY()) * q50Var.getMeasuredHeight()));
                    if (((r50) q50Var.f41061b).a(canvas2, q50Var.getMeasuredWidth(), p50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                c70 c70Var = (c70) this.d;
                int i11 = dp + ((int) c70Var.f36588b.f16349e);
                Paint paint = (Paint) this.f1527c;
                paint.setColor(c70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21079s8));
                RectF rectF2 = (RectF) this.f1526b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), c70.b0(c70Var).getMeasuredHeight() + i11);
                c70.a0(c70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1525a) {
            case 9:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((uf.a) this.f1527c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1525a) {
            case 9:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((uf.a) this.f1527c);
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
        tg0 tg0Var;
        int dp;
        switch (this.f1525a) {
            case 0:
                ja0 ja0Var = (ja0) this.f1526b;
                super.onDraw(canvas);
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f1527c;
                g6Var.f26614a = this;
                ((f6) this.d).getClass();
                g6Var.d(0.0f, false);
                float f7 = g6Var.f26616c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (g6Var.f26616c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    ja0Var.e(rectF);
                    ja0Var.k(24.0f);
                    ja0Var.g(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    ja0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f1527c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f1526b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.g8) this.d).f37966f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                hh0 hh0Var = (hh0) this.d;
                if (!hh0Var.f27029n || ((tg0Var = hh0Var.f27030r) != null && tg0Var.f31129x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (hh0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = hh0Var.f27013a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f1527c);
                    }
                    canvas.drawLine(dp2, height, i11, height, (Paint) this.f1526b);
                    return;
                }
                return;
            case 3:
            case 5:
            case 6:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f1526b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + q6Var.c());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                ch.d dVar = (ch.d) this.f1527c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((ch.d) this.f1527c).draw(canvas);
                }
                q6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f1526b;
                hd0 hd0Var = (hd0) this.d;
                Drawable drawable2 = hd0Var.f38323s;
                Rect rect = (Rect) this.f1527c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                hd0Var.f38323s.draw(canvas);
                int i13 = hd0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.i6.f21090t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21090t0);
                    return;
                }
                return;
            case 8:
                float dp4 = AndroidUtilities.dp(10.0f);
                float f13 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f14 = dp4 + measuredWidth2;
                rectF3.set(dp4, dp4, f14, f14);
                rectF3.offset(0.0f, (measuredHeight - rectF3.height()) / 2.0f);
                float f15 = measuredWidth2 / 7.0f;
                Path path = (Path) this.f1527c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width3 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i14 = 0; i14 < height2; i14++) {
                    canvas.save();
                    for (int i15 = 0; i15 < width3; i15++) {
                        int i16 = i15 % 2;
                        if ((i16 == 0 && i14 % 2 == 0) || (i16 != 0 && i14 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f1526b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((qe.b) this.f1526b).iterator();
                    while (it.hasNext()) {
                        ((li.a) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f1525a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((y31) this.d).f33094e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f1525a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.q6) this.f1526b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1525a) {
            case 8:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f33959g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f1525a) {
            case 3:
                if (((y31) this.d).f33094e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.q6) this.f1526b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public o4(org.telegram.ui.g8 g8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = g8Var;
        this.f1526b = strArr;
        this.f1527c = drawable;
    }

    public o4(c70 c70Var, Context context) {
        super(context);
        this.d = c70Var;
        this.f1526b = new RectF();
        this.f1527c = new Paint(1);
    }

    public o4(hh0 hh0Var, Context context) {
        super(context);
        this.d = hh0Var;
        Paint paint = new Paint();
        this.f1526b = paint;
        Paint paint2 = new Paint();
        this.f1527c = paint2;
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

    public o4(hd0 hd0Var, Context context, Rect rect) {
        super(context);
        this.d = hd0Var;
        this.f1527c = rect;
        this.f1526b = new RectF();
    }

    public o4(y31 y31Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = y31Var;
        this.f1527c = e6Var;
        this.f1526b = new org.telegram.ui.Components.k6(this, e6Var);
        y31Var.f33094e.setCallback(this);
    }

    public o4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, false, false);
        this.f1526b = q6Var;
        q6Var.u(-1);
        q6Var.f30031b = 17;
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.setCallback(this);
    }

    public o4(f6 f6Var, Context context) {
        super(context);
        this.d = f6Var;
        this.f1526b = new ja0();
        this.f1527c = new org.telegram.ui.Components.g6(250L, is.f27443f);
    }

    public o4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f1526b = paint;
        this.f1527c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public o4(p50 p50Var, Context context, q50 q50Var) {
        super(context);
        this.d = p50Var;
        this.f1527c = q50Var;
        this.f1526b = new int[2];
    }
}
