package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.j70;
import org.telegram.ui.nd0;
import org.telegram.ui.w50;
import org.telegram.ui.x50;
import org.telegram.ui.y50;
public final class d4 extends View {
    public final int f2944a = 4;
    public final Object f2945b;
    public Object f2946c;
    public Object d;

    public d4(Context context) {
        super(context);
        this.f2945b = new re.b();
        this.f2946c = new vf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f2944a) {
            case 3:
                t31 t31Var = (t31) this.d;
                org.telegram.ui.Components.r6 r6Var = t31Var.e;
                float i10 = r6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), r6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f2945b;
                    k6Var.setColor(k6Var.f26590b.a(org.telegram.ui.ActionBar.g6.w0(t31Var.I, k6Var.f26589a), false));
                    k6Var.setColor(i0.a.d(t31Var.F, k6Var.getColor(), t31.a(t31Var)));
                    k6Var.setAlpha((int) (k6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), k6Var);
                    r6Var.p(rectF);
                    r6Var.B = (int) (i10 * 255.0f);
                    r6Var.u(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W8, (org.telegram.ui.ActionBar.c6) this.f2946c));
                    r6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f2945b;
                x50 x50Var = (x50) this.f2946c;
                w50 w50Var = (w50) this.d;
                if (w50Var.h > 0.0f && w50Var.d != null) {
                    w50Var.f41157f.reset();
                    float width = getWidth() / w50Var.f41156c.getWidth();
                    w50Var.f41157f.postScale(width, width);
                    w50Var.e.setLocalMatrix(w50Var.f41157f);
                    w50Var.d.setAlpha((int) (w50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), w50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (x50Var != null) {
                    if (x50Var.isAttachedToWindow() && x50Var.getAlpha() > 0.5f) {
                        x50Var.getLocationInWindow(iArr);
                    } else {
                        w50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - x50Var.getScaleX()) * x50Var.getMeasuredWidth()), iArr[1] - ((1.0f - x50Var.getScaleY()) * x50Var.getMeasuredHeight()));
                    if (((y50) x50Var.f41751b).a(canvas2, x50Var.getMeasuredWidth(), w50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                j70 j70Var = (j70) this.d;
                int i11 = dp + ((int) j70Var.f37271b.e);
                Paint paint = (Paint) this.f2946c;
                paint.setColor(j70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20180s8));
                RectF rectF2 = (RectF) this.f2945b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), j70.b0(j70Var).getMeasuredHeight() + i11);
                j70.a0(j70Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f2944a) {
            case 9:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((vf.a) this.f2946c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2944a) {
            case 9:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((vf.a) this.f2946c);
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
        qg0 qg0Var;
        int dp;
        switch (this.f2944a) {
            case 0:
                ha0 ha0Var = (ha0) this.f2945b;
                super.onDraw(canvas);
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f2946c;
                g6Var.f25188a = this;
                ((q5) this.d).getClass();
                g6Var.d(0.0f, false);
                float f7 = g6Var.f25190c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (g6Var.f25190c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    ha0Var.e(rectF);
                    ha0Var.k(24.0f);
                    ha0Var.g(i0.a.k(-1, 20), i0.a.k(-1, 50), i0.a.k(-1, 50), i0.a.k(-1, 70));
                    ha0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f2946c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f2945b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.l8) this.d).f37874f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                fh0 fh0Var = (fh0) this.d;
                if (!fh0Var.f25052n || ((qg0Var = fh0Var.f25053r) != null && qg0Var.f28599x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (fh0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = fh0Var.f25037a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f2946c);
                    }
                    canvas.drawLine(dp2, height, i11, height, (Paint) this.f2945b);
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
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) this.f2945b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + r6Var.c());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                dh.d dVar = (dh.d) this.f2946c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((dh.d) this.f2946c).draw(canvas);
                }
                r6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f2945b;
                nd0 nd0Var = (nd0) this.d;
                Drawable drawable2 = nd0Var.f38670s;
                Rect rect = (Rect) this.f2946c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                nd0Var.f38670s.draw(canvas);
                int i13 = nd0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.g6.f20191t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f20191t0);
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
                Path path = (Path) this.f2946c;
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
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f2945b);
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
                    Iterator it = ((re.b) this.f2945b).iterator();
                    while (it.hasNext()) {
                        ((ni.a) it.next()).a();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f2944a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((t31) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f2944a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.r6) this.f2945b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f2944a) {
            case 8:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f32243g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f2944a) {
            case 3:
                if (((t31) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.r6) this.f2945b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d4(org.telegram.ui.l8 l8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = l8Var;
        this.f2945b = strArr;
        this.f2946c = drawable;
    }

    public d4(j70 j70Var, Context context) {
        super(context);
        this.d = j70Var;
        this.f2945b = new RectF();
        this.f2946c = new Paint(1);
    }

    public d4(fh0 fh0Var, Context context) {
        super(context);
        this.d = fh0Var;
        Paint paint = new Paint();
        this.f2945b = paint;
        Paint paint2 = new Paint();
        this.f2946c = paint2;
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

    public d4(nd0 nd0Var, Context context, Rect rect) {
        super(context);
        this.d = nd0Var;
        this.f2946c = rect;
        this.f2945b = new RectF();
    }

    public d4(t31 t31Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = t31Var;
        this.f2946c = c6Var;
        this.f2945b = new org.telegram.ui.Components.k6(this, c6Var);
        t31Var.e.setCallback(this);
    }

    public d4(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, false, false);
        this.f2945b = r6Var;
        r6Var.u(-1);
        r6Var.f28748b = 17;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.setCallback(this);
    }

    public d4(q5 q5Var, Context context) {
        super(context);
        this.d = q5Var;
        this.f2945b = new ha0();
        this.f2946c = new org.telegram.ui.Components.g6(250L, es.f24771f);
    }

    public d4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f2945b = paint;
        this.f2946c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public d4(w50 w50Var, Context context, x50 x50Var) {
        super(context);
        this.d = w50Var;
        this.f2946c = x50Var;
        this.f2945b = new int[2];
    }
}
