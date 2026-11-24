package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class rj4 extends View {
    public final byte a = 4;
    public final Object b;
    public Object c;
    public Object d;

    public rj4(sj4 sj4Var, Activity activity) {
        super(activity);
        this.d = sj4Var;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gl.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gl.L(2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                int[] iArr = (int[]) obj;
                sb sbVar = (sb) this.c;
                v65 v65Var = (v65) this.d;
                Matrix matrix = v65Var.f;
                if (v65Var.h > 0.0f && v65Var.d != null) {
                    matrix.reset();
                    float width = getWidth() / v65Var.c.getWidth();
                    matrix.postScale(width, width);
                    v65Var.e.setLocalMatrix(matrix);
                    v65Var.d.setAlpha((int) (v65Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v65Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (sbVar.isAttachedToWindow() && sbVar.getAlpha() > 0.5f) {
                    sbVar.getLocationInWindow(iArr);
                } else {
                    v65Var.dismiss();
                }
                canvas2.save();
                canvas2.translate(iArr[0] - ((1.0f - sbVar.getScaleX()) * sbVar.getMeasuredWidth()), iArr[1] - ((1.0f - sbVar.getScaleY()) * sbVar.getMeasuredHeight()));
                if (((pc) sbVar.b).a(canvas2, sbVar.getMeasuredWidth(), v65Var.h)) {
                    invalidate();
                }
                canvas2.restore();
                return;
            case 2:
                super.dispatchDraw(canvas);
                int L = gl.L(48.0f);
                qa5 qa5Var = (qa5) this.d;
                int i = L + ((int) qa5Var.b.f);
                Paint paint = (Paint) obj;
                paint.setColor(qa5Var.getThemedColor(bkb.r8));
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), qa5.c0(qa5Var).getMeasuredHeight() + i);
                qa5Var.m0(canvas, rectF, paint);
                return;
            case 3:
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                fxb fxbVar = (fxb) this.d;
                gn gnVar = fxbVar.e;
                float i2 = gnVar.i();
                if (i2 > 0.0f) {
                    float R1 = gl.R1(0.6f, 1.0f, i2);
                    float max = Math.max(gl.L(16.66f), gnVar.c() + gl.L(10.0f));
                    RectF rectF2 = gl.P;
                    rectF2.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
                    rm rmVar = (rm) obj;
                    rmVar.setColor(rmVar.b.a(bkb.v0(fxbVar.J, rmVar.a), false));
                    rmVar.setColor(bm2.f(fxbVar.G, rmVar.getColor(), fxb.a(fxbVar)));
                    rmVar.setAlpha((int) (rmVar.getAlpha() * i2));
                    canvas.drawRoundRect(rectF2, gl.L(8.33f), gl.L(8.33f), rmVar);
                    gnVar.p(rectF2);
                    gnVar.C = (int) (i2 * 255.0f);
                    gnVar.u(bkb.v0(bkb.V8, (wjb) this.c));
                    gnVar.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 6:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((gp4) this.c);
                return;
            case 7:
                super.onAttachedToWindow();
                if (((gv8) this.c) != null) {
                    postDelayed((kbc) this.d, 200L);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 6:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((gp4) this.c);
                }
                this.d = null;
                return;
            case 7:
                super.onDetachedFromWindow();
                kbc kbcVar = (kbc) this.d;
                removeCallbacks(kbcVar);
                kbcVar.run();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int width = getWidth();
                float L = gl.L(10.0f);
                float L2 = (width - L) - gl.L(10.0f);
                float height = getHeight() - gl.L(8.0f);
                sj4 sj4Var = (sj4) this.d;
                float f2 = sj4Var.J;
                if (f2 != 0.0f) {
                    f = L;
                    canvas.drawLine(f, height, (f2 * L2) + L, height, (Paint) this.c);
                } else {
                    f = L;
                }
                canvas.drawLine(f, height, (L2 * sj4Var.I) + f, height, (Paint) obj);
                return;
            case 1:
            case 2:
            case 5:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                float L3 = gl.L(10.0f);
                float f3 = L3 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f3;
                float measuredHeight = getMeasuredHeight() - f3;
                canvas.save();
                RectF rectF = gl.P;
                float f4 = L3 + measuredWidth;
                rectF.set(L3, L3, f4, f4);
                rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
                float f5 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
                canvas.clipPath(path);
                int L4 = gl.L(10.0f);
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                float f6 = L4;
                int width2 = ((int) (rectF.width() / f6)) + 1;
                int height2 = ((int) (rectF.height() / f6)) + 1;
                for (int i = 0; i < height2; i++) {
                    canvas.save();
                    for (int i2 = 0; i2 < width2; i2++) {
                        int i3 = i2 % 2;
                        if ((i3 == 0 && i % 2 == 0) || (i3 != 0 && i % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f6, f6, (Paint) obj);
                        }
                        canvas.translate(f6, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f6);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 4:
                super.onDraw(canvas);
                float f7 = ((fm0) obj).e;
                kq3.b(canvas, (Drawable) this.c, 1.0f - f7);
                kq3.b(canvas, (Drawable) this.d, f7);
                return;
            case 6:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((e59) obj).iterator();
                    while (it.hasNext()) {
                        ((hw4) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 7:
                hv8 hv8Var = (hv8) obj;
                hv8Var.e(canvas, 0.0f, 0.0f, getWidth());
                if (hv8Var.o < 1.0f || hv8Var.l > 0) {
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(gl.L(16.66f), ((fxb) this.d).e.d + gl.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i, i2, i3, i4);
                float f = i / 2.0f;
                float f2 = i2 / 2.0f;
                kq3.d((Drawable) this.c, f, f2, 17);
                kq3.d((Drawable) this.d, f, f2, 17);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 3:
                super.setAlpha(f);
                ((PhotoViewer) this.d).h0.invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 5:
                if (((fxb) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public rj4(Activity activity) {
        super(activity);
        this.b = new fm0(320L, this, s33.h);
        this.c = activity.getResources().getDrawable(2131232495).mutate();
        this.d = activity.getResources().getDrawable(2131231508).mutate();
    }

    public rj4(qa5 qa5Var, Context context) {
        super(context);
        this.d = qa5Var;
        this.c = new RectF();
        this.b = new Paint(1);
    }

    public rj4(Context context) {
        super(context);
        this.b = new e59(0, false);
        this.c = new gp4(this, (byte) 1);
    }

    public rj4(fxb fxbVar, Context context, wjb wjbVar) {
        super(context);
        this.d = fxbVar;
        this.c = wjbVar;
        this.b = new rm(this, wjbVar);
        fxbVar.e.setCallback(this);
    }

    public rj4(Context context, gv8 gv8Var) {
        super(context);
        hv8 hv8Var = new hv8();
        this.b = hv8Var;
        this.d = new kbc(this, (byte) 21);
        if (hv8Var.y != -16777216 || hv8Var.z == null) {
            hv8Var.y = -16777216;
            hv8Var.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = gv8Var;
    }

    public rj4(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public rj4(v65 v65Var, LaunchActivity launchActivity, sb sbVar) {
        super(launchActivity);
        this.d = v65Var;
        this.c = sbVar;
        this.b = new int[2];
    }
}
