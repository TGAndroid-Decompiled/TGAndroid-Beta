package ci;

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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.zr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.d50;
import org.telegram.ui.e50;
import org.telegram.ui.f50;
import org.telegram.ui.p60;
import org.telegram.ui.rc0;
public final class h3 extends View {
    public final int f5392a = 9;
    public final Object f5393b;
    public Object f5394c;
    public Object d;

    public h3(Context context) {
        super(context);
        this.f5393b = new re.b();
        this.f5394c = new vf.a(0, this);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f5392a) {
            case 3:
                q31 q31Var = (q31) this.d;
                org.telegram.ui.Components.n6 n6Var = q31Var.e;
                float i10 = n6Var.i();
                if (i10 > 0.0f) {
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, i10);
                    float max = Math.max(AndroidUtilities.dp(16.66f), n6Var.c() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f5393b;
                    h6Var.setColor(h6Var.f26875b.a(org.telegram.ui.ActionBar.k6.w0(q31Var.I, h6Var.f26874a), false));
                    h6Var.setColor(i0.a.f(q31Var.F, h6Var.getColor(), q31.a(q31Var)));
                    h6Var.setAlpha((int) (h6Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), h6Var);
                    n6Var.p(rectF);
                    n6Var.B = (int) (i10 * 255.0f);
                    n6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, (org.telegram.ui.ActionBar.g6) this.f5394c));
                    n6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                int[] iArr = (int[]) this.f5393b;
                e50 e50Var = (e50) this.f5394c;
                d50 d50Var = (d50) this.d;
                if (d50Var.h > 0.0f && d50Var.d != null) {
                    d50Var.f36475f.reset();
                    float width = getWidth() / d50Var.f36474c.getWidth();
                    d50Var.f36475f.postScale(width, width);
                    d50Var.e.setLocalMatrix(d50Var.f36475f);
                    d50Var.d.setAlpha((int) (d50Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), d50Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (e50Var != null) {
                    if (e50Var.isAttachedToWindow() && e50Var.getAlpha() > 0.5f) {
                        e50Var.getLocationInWindow(iArr);
                    } else {
                        d50Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - e50Var.getScaleX()) * e50Var.getMeasuredWidth()), iArr[1] - ((1.0f - e50Var.getScaleY()) * e50Var.getMeasuredHeight()));
                    if (((f50) e50Var.f36809b).a(canvas2, e50Var.getMeasuredWidth(), d50Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 5:
                super.dispatchDraw(canvas);
                int dp = AndroidUtilities.dp(48.0f);
                p60 p60Var = (p60) this.d;
                int i11 = dp + ((int) p60Var.f40350b.e);
                Paint paint = (Paint) this.f5394c;
                paint.setColor(p60Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8));
                RectF rectF2 = (RectF) this.f5393b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), p60.b0(p60Var).getMeasuredHeight() + i11);
                p60.a0(p60Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5392a) {
            case 8:
                super.onAttachedToWindow();
                if (((zh.e) this.f5394c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    return;
                }
                return;
            case 9:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((vf.a) this.f5394c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5392a) {
            case 8:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                removeCallbacks(mVar);
                mVar.run();
                return;
            case 9:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((vf.a) this.f5394c);
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
        og0 og0Var;
        int dp;
        switch (this.f5392a) {
            case 0:
                aa0 aa0Var = (aa0) this.f5393b;
                super.onDraw(canvas);
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f5394c;
                d6Var.f25566a = this;
                ((p4) this.d).getClass();
                d6Var.d(0.0f, false);
                float f7 = d6Var.f25568c;
                if (f7 != 0.0f) {
                    if (f7 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (d6Var.f25568c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    aa0Var.e(rectF);
                    aa0Var.k(24.0f);
                    aa0Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    aa0Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                Drawable drawable = (Drawable) this.f5394c;
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 7.0f;
                for (int i10 = 0; i10 < 7; i10++) {
                    canvas.drawText(((String[]) this.f5393b)[i10], (measuredWidth / 2.0f) + (i10 * measuredWidth), ((getMeasuredHeight() - AndroidUtilities.dp(2.0f)) / 2.0f) + AndroidUtilities.dp(5.0f), ((org.telegram.ui.k8) this.d).f38823f);
                }
                drawable.setBounds(0, getMeasuredHeight() - AndroidUtilities.dp(3.0f), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                ch0 ch0Var = (ch0) this.d;
                if (!ch0Var.f25330n || ((og0Var = ch0Var.f25331r) != null && og0Var.f29277x)) {
                    int width = getWidth();
                    int dp2 = AndroidUtilities.dp(10.0f);
                    float f10 = (width - dp2) - dp2;
                    int i11 = dp2 + ((int) (ch0Var.Z * f10));
                    float height = getHeight() - AndroidUtilities.dp(8.0f);
                    float f11 = ch0Var.f25315a0;
                    if (f11 != 0.0f) {
                        float f12 = dp2;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f5394c);
                    }
                    canvas.drawLine(dp2, height, i11, height, (Paint) this.f5393b);
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 6:
                RectF rectF2 = (RectF) this.f5393b;
                rc0 rc0Var = (rc0) this.d;
                Drawable drawable2 = rc0Var.f41115s;
                Rect rect = (Rect) this.f5394c;
                drawable2.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                rc0Var.f41115s.draw(canvas);
                int i12 = rc0Var.F0;
                if (i12 == 0 || i12 == 1) {
                    int dp3 = AndroidUtilities.dp(36.0f);
                    rectF2.set((getMeasuredWidth() - dp3) / 2, AndroidUtilities.dp(10.0f) + rect.top, (getMeasuredWidth() + dp3) / 2, AndroidUtilities.dp(4.0f) + dp);
                    int themedColor = rc0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii);
                    Color.alpha(themedColor);
                    org.telegram.ui.ActionBar.k6.f21474t0.setColor(themedColor);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21474t0);
                    return;
                }
                return;
            case 7:
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
                Path path = (Path) this.f5394c;
                path.rewind();
                path.addRoundRect(rectF3, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int dp5 = AndroidUtilities.dp(10.0f);
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                float f16 = dp5;
                int width2 = ((int) (rectF3.width() / f16)) + 1;
                int height2 = ((int) (rectF3.height() / f16)) + 1;
                for (int i13 = 0; i13 < height2; i13++) {
                    canvas.save();
                    for (int i14 = 0; i14 < width2; i14++) {
                        int i15 = i14 % 2;
                        if ((i15 == 0 && i13 % 2 == 0) || (i15 != 0 && i13 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f5393b);
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
                zh.f fVar = (zh.f) this.f5393b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.f52465o < 1.0f || fVar.f52462l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 9:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((re.b) this.f5393b).iterator();
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
        switch (this.f5392a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), ((q31) this.d).e.d + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f5392a) {
            case 7:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f33599g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5392a) {
            case 3:
                if (((q31) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h3(org.telegram.ui.k8 k8Var, Context context, String[] strArr, Drawable drawable) {
        super(context);
        this.d = k8Var;
        this.f5393b = strArr;
        this.f5394c = drawable;
    }

    public h3(p60 p60Var, Context context) {
        super(context);
        this.d = p60Var;
        this.f5393b = new RectF();
        this.f5394c = new Paint(1);
    }

    public h3(ch0 ch0Var, Context context) {
        super(context);
        this.d = ch0Var;
        Paint paint = new Paint();
        this.f5393b = paint;
        Paint paint2 = new Paint();
        this.f5394c = paint2;
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
        this.f5394c = rect;
        this.f5393b = new RectF();
    }

    public h3(q31 q31Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = q31Var;
        this.f5394c = g6Var;
        this.f5393b = new org.telegram.ui.Components.h6(this, g6Var);
        q31Var.e.setCallback(this);
    }

    public h3(Context context, zh.e eVar) {
        super(context);
        zh.f fVar = new zh.f();
        this.f5393b = fVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (fVar.f52474y != -16777216 || fVar.f52475z == null) {
            fVar.f52474y = -16777216;
            fVar.f52475z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f5394c = eVar;
    }

    public h3(p4 p4Var, Context context) {
        super(context);
        this.d = p4Var;
        this.f5393b = new aa0();
        this.f5394c = new org.telegram.ui.Components.d6(250L, zr.f33337f);
    }

    public h3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f5393b = paint;
        this.f5394c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public h3(d50 d50Var, Context context, e50 e50Var) {
        super(context);
        this.d = d50Var;
        this.f5394c = e50Var;
        this.f5393b = new int[2];
    }
}
