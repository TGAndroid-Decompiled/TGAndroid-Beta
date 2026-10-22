package ci;

import android.app.Activity;
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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.m31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.a50;
import org.telegram.ui.b50;
import org.telegram.ui.l60;
import org.telegram.ui.nc0;
import org.telegram.ui.v10;
public final class i3 extends View {
    public final int f5484a = 4;
    public final Object f5485b;
    public Object f5486c;
    public Object d;

    public i3(Context context) {
        super(context);
        this.f5485b = new re.b();
        this.f5486c = new vf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f5484a) {
            case 3:
                m31 m31Var = (m31) this.d;
                org.telegram.ui.Components.p6 p6Var = m31Var.e;
                float i10 = p6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), p6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f5485b;
                    j6Var.setColor(j6Var.f27412b.a(org.telegram.ui.ActionBar.h6.w0(m31Var.I, j6Var.f27411a), false));
                    j6Var.setColor(i0.a.f(m31Var.F, j6Var.getColor(), m31.a(m31Var)));
                    j6Var.setAlpha((int) (j6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), j6Var);
                    p6Var.p(rectF);
                    p6Var.B = (int) (i10 * 255.0f);
                    p6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W8, (org.telegram.ui.ActionBar.d6) this.f5486c));
                    p6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                int[] iArr = (int[]) this.f5485b;
                v10 v10Var = (v10) this.f5486c;
                a50 a50Var = (a50) this.d;
                if (a50Var.h > 0.0f && a50Var.d != null) {
                    a50Var.f35280f.reset();
                    float width = getWidth() / a50Var.f35279c.getWidth();
                    a50Var.f35280f.postScale(width, width);
                    a50Var.e.setLocalMatrix(a50Var.f35280f);
                    a50Var.d.setAlpha((int) (a50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), a50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (v10Var != null) {
                    if (v10Var.isAttachedToWindow() && v10Var.getAlpha() > 0.5f) {
                        v10Var.getLocationInWindow(iArr);
                    } else {
                        a50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - v10Var.getScaleX()) * v10Var.getMeasuredWidth()), iArr[1] - ((1.0f - v10Var.getScaleY()) * v10Var.getMeasuredHeight()));
                    if (((b50) v10Var.f42098b).a(canvas2, v10Var.getMeasuredWidth(), a50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 6:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                l60 l60Var = (l60) this.d;
                int i11 = dp + ((int) l60Var.f38806b.e);
                Paint paint = (Paint) this.f5486c;
                paint.setColor(l60Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21272s8));
                RectF rectF2 = (RectF) this.f5485b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), l60.b0(l60Var).getMeasuredHeight() + i11);
                l60.a0(l60Var, canvas, rectF2, paint);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5484a) {
            case 9:
                super.onAttachedToWindow();
                if (((zh.e) this.f5486c) != null) {
                    postDelayed((org.telegram.ui.Wallet.n) this.d, 200L);
                    return;
                }
                return;
            case 10:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((vf.a) this.f5486c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5484a) {
            case 9:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.n nVar = (org.telegram.ui.Wallet.n) this.d;
                removeCallbacks(nVar);
                nVar.run();
                return;
            case 10:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((vf.a) this.f5486c);
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
        lg0 lg0Var;
        int dp;
        switch (this.f5484a) {
            case 0:
                ba0 ba0Var = (ba0) this.f5485b;
                super.onDraw(canvas);
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.f5486c;
                f6Var.f26087a = this;
                ((q4) this.d).getClass();
                f6Var.d(0.0f, false);
                float f7 = f6Var.f26089c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (f6Var.f26089c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    ba0Var.e(rectF);
                    ba0Var.k(24.0f);
                    ba0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    ba0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f5486c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f5485b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.k8) this.d).f38451f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                ah0 ah0Var = (ah0) this.d;
                if (!ah0Var.f24618n || ((lg0Var = ah0Var.f24619r) != null && lg0Var.f28162x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (ah0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = ah0Var.f24603a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f5486c);
                    }
                    canvas.drawLine(dp2, height, i11, height, (Paint) this.f5485b);
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
                org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) this.f5485b;
                int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + p6Var.c());
                int width2 = (getWidth() - dpf2) / 2;
                int i12 = dpf2 + width2;
                dh.d dVar = (dh.d) this.f5486c;
                if (dVar != null) {
                    dVar.setBounds(width2, 0, i12, getHeight());
                    ((dh.d) this.f5486c).draw(canvas);
                }
                p6Var.draw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f5485b;
                nc0 nc0Var = (nc0) this.d;
                Drawable drawable2 = nc0Var.f39524s;
                Rect rect = (Rect) this.f5486c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                nc0Var.f39524s.draw(canvas);
                int i13 = nc0Var.G0;
                if (i13 == 0 || i13 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.h6.f21283t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21283t0);
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
                Path path = (Path) this.f5486c;
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
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f5485b);
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
                zh.f fVar = (zh.f) this.f5485b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.f52003o < 1.0f || fVar.f52000l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 10:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((re.b) this.f5485b).iterator();
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
        switch (this.f5484a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((m31) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5484a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                ((org.telegram.ui.Components.p6) this.f5485b).setBounds(0, 0, i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f5484a) {
            case 8:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f33299g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5484a) {
            case 3:
                if (((m31) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 4:
                if (!super.verifyDrawable(drawable) && drawable != ((org.telegram.ui.Components.p6) this.f5485b)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i3(org.telegram.ui.k8 k8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = k8Var;
        this.f5485b = strArr;
        this.f5486c = drawable;
    }

    public i3(l60 l60Var, Context context) {
        super(context);
        this.d = l60Var;
        this.f5485b = new RectF();
        this.f5486c = new Paint(1);
    }

    public i3(ah0 ah0Var, Context context) {
        super(context);
        this.d = ah0Var;
        Paint paint = new Paint();
        this.f5485b = paint;
        Paint paint2 = new Paint();
        this.f5486c = paint2;
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

    public i3(nc0 nc0Var, Context context, Rect rect) {
        super(context);
        this.d = nc0Var;
        this.f5486c = rect;
        this.f5485b = new RectF();
    }

    public i3(m31 m31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = m31Var;
        this.f5486c = d6Var;
        this.f5485b = new org.telegram.ui.Components.j6(this, d6Var);
        m31Var.e.setCallback(this);
    }

    public i3(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, false, false);
        this.f5485b = p6Var;
        p6Var.u(-1);
        p6Var.f29229b = 17;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.setCallback(this);
    }

    public i3(Context context, zh.e eVar) {
        super(context);
        zh.f fVar = new zh.f();
        this.f5485b = fVar;
        this.d = new org.telegram.ui.Wallet.n(this, 9);
        if (fVar.f52012y != -16777216 || fVar.f52013z == null) {
            fVar.f52012y = -16777216;
            fVar.f52013z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f5486c = eVar;
    }

    public i3(q4 q4Var, Context context) {
        super(context);
        this.d = q4Var;
        this.f5485b = new ba0();
        this.f5486c = new org.telegram.ui.Components.f6(250L, bs.f25024f);
    }

    public i3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f5485b = paint;
        this.f5486c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public i3(a50 a50Var, Context context, v10 v10Var) {
        super(context);
        this.d = a50Var;
        this.f5486c = v10Var;
        this.f5485b = new int[2];
    }
}
