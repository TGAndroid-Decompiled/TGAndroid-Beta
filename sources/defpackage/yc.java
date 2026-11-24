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
import android.os.SystemClock;
import android.os.Trace;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class yc extends View {
    public final byte a = 0;
    public final Object b;
    public Object c;
    public Object d;

    public yc(tl4 tl4Var, Activity activity) {
        super(activity);
        this.d = tl4Var;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gm.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gm.L(2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                int[] iArr = (int[]) obj;
                sb sbVar = (sb) this.c;
                t85 t85Var = (t85) this.d;
                Matrix matrix = t85Var.f;
                if (t85Var.h > 0.0f && t85Var.d != null) {
                    matrix.reset();
                    float width = getWidth() / t85Var.c.getWidth();
                    matrix.postScale(width, width);
                    t85Var.e.setLocalMatrix(matrix);
                    t85Var.d.setAlpha((int) (t85Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t85Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (sbVar.isAttachedToWindow() && sbVar.getAlpha() > 0.5f) {
                    sbVar.getLocationInWindow(iArr);
                } else {
                    t85Var.dismiss();
                }
                canvas2.save();
                canvas2.translate(iArr[0] - ((1.0f - sbVar.getScaleX()) * sbVar.getMeasuredWidth()), iArr[1] - ((1.0f - sbVar.getScaleY()) * sbVar.getMeasuredHeight()));
                if (((pd) sbVar.b).a(canvas2, sbVar.getMeasuredWidth(), t85Var.h)) {
                    invalidate();
                }
                canvas2.restore();
                return;
            case 3:
                super.dispatchDraw(canvas);
                int L = gm.L(48.0f);
                oc5 oc5Var = (oc5) this.d;
                int i = L + ((int) oc5Var.b.f);
                Paint paint = (Paint) obj;
                paint.setColor(oc5Var.getThemedColor(cmb.r8));
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), oc5.d0(oc5Var).getMeasuredHeight() + i);
                oc5Var.n0(canvas, rectF, paint);
                return;
            case 4:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 6:
                hzb hzbVar = (hzb) this.d;
                ho hoVar = hzbVar.e;
                float i2 = hoVar.i();
                if (i2 > 0.0f) {
                    float R1 = gm.R1(0.6f, 1.0f, i2);
                    float max = Math.max(gm.L(16.66f), hoVar.c() + gm.L(10.0f));
                    RectF rectF2 = gm.P;
                    rectF2.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(R1, R1, rectF2.centerX(), rectF2.centerY());
                    rn rnVar = (rn) obj;
                    rnVar.setColor(rnVar.b.a(cmb.v0(hzbVar.J, rnVar.a), false));
                    rnVar.setColor(on2.f(hzbVar.G, rnVar.getColor(), hzb.a(hzbVar)));
                    rnVar.setAlpha((int) (rnVar.getAlpha() * i2));
                    canvas.drawRoundRect(rectF2, gm.L(8.33f), gm.L(8.33f), rnVar);
                    hoVar.p(rectF2);
                    hoVar.C = (int) (i2 * 255.0f);
                    hoVar.u(cmb.v0(cmb.V8, (ylb) this.c));
                    hoVar.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 7:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((hr4) this.c);
                return;
            case 8:
                super.onAttachedToWindow();
                if (((hx8) this.c) != null) {
                    postDelayed((f8c) this.d, 200L);
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
            case 7:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((hr4) this.c);
                }
                this.d = null;
                return;
            case 8:
                super.onDetachedFromWindow();
                f8c f8cVar = (f8c) this.d;
                removeCallbacks(f8cVar);
                f8cVar.run();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        float f;
        byte b = this.a;
        float f2 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                RectF rectF = (RectF) this.c;
                Paint paint = (Paint) obj;
                paint.setColor(cmb.p1((((((float) Math.sin(SystemClock.elapsedRealtime() / 220.0d)) * 0.5f) + 0.5f) * 0.05f) + 0.06f, cmb.v0(cmb.D8, ((ad) this.d).d)));
                if (jb6.a0) {
                    L = getWidth() - gm.L(16.0f);
                } else {
                    L = gm.L(16.0f);
                }
                float f3 = L;
                if (jb6.a0) {
                    f2 = -1.0f;
                }
                rectF.set(Math.min(f3, (gm.L(110.0f) * f2) + f3), gm.L(11.0f), Math.max(f3, (gm.L(110.0f) * f2) + f3), gm.L(23.0f));
                canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
                rectF.set(Math.min(f3, (gm.L(170.0f) * f2) + f3), gm.L(32.0f), Math.max(f3, (f2 * gm.L(170.0f)) + f3), gm.L(42.0f));
                canvas.drawRoundRect(rectF, gm.L(5.0f), gm.L(5.0f), paint);
                invalidate();
                return;
            case 1:
                int width = getWidth();
                float L2 = gm.L(10.0f);
                float L3 = (width - L2) - gm.L(10.0f);
                float height = getHeight() - gm.L(8.0f);
                tl4 tl4Var = (tl4) this.d;
                float f4 = tl4Var.J;
                if (f4 != 0.0f) {
                    f = L2;
                    canvas.drawLine(f, height, (f4 * L3) + L2, height, (Paint) this.c);
                } else {
                    f = L2;
                }
                canvas.drawLine(f, height, (L3 * tl4Var.I) + f, height, (Paint) obj);
                return;
            case 2:
            case 3:
            case 6:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                float L4 = gm.L(10.0f);
                float f5 = L4 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f5;
                float measuredHeight = getMeasuredHeight() - f5;
                canvas.save();
                RectF rectF2 = gm.P;
                float f6 = L4 + measuredWidth;
                rectF2.set(L4, L4, f6, f6);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f7 = measuredWidth / 7.0f;
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(rectF2, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                int L5 = gm.L(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f8 = L5;
                int width2 = ((int) (rectF2.width() / f8)) + 1;
                int height2 = ((int) (rectF2.height() / f8)) + 1;
                for (int i = 0; i < height2; i++) {
                    canvas.save();
                    for (int i2 = 0; i2 < width2; i2++) {
                        int i3 = i2 % 2;
                        if ((i3 == 0 && i % 2 == 0) || (i3 != 0 && i % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f8, f8, (Paint) obj);
                        }
                        canvas.translate(f8, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f8);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 5:
                super.onDraw(canvas);
                float f9 = ((fn0) obj).e;
                ur3.b(canvas, (Drawable) this.c, 1.0f - f9);
                ur3.b(canvas, (Drawable) this.d, f9);
                return;
            case 7:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((g79) obj).iterator();
                    while (it.hasNext()) {
                        ((jy4) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 8:
                ix8 ix8Var = (ix8) obj;
                ix8Var.e(canvas, 0.0f, 0.0f, getWidth());
                if (ix8Var.o < 1.0f || ix8Var.l > 0) {
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(gm.L(16.66f), ((hzb) this.d).e.d + gm.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 5:
                super.onSizeChanged(i, i2, i3, i4);
                float f = i / 2.0f;
                float f2 = i2 / 2.0f;
                ur3.d((Drawable) this.c, f, f2, 17);
                ur3.d((Drawable) this.d, f, f2, 17);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 4:
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
            case 6:
                if (((hzb) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public yc(Activity activity) {
        super(activity);
        this.b = new fn0(320L, this, d53.h);
        this.c = activity.getResources().getDrawable(2131232507).mutate();
        this.d = activity.getResources().getDrawable(2131231509).mutate();
    }

    public yc(ad adVar, Context context) {
        super(context);
        this.d = adVar;
        this.b = new Paint(1);
        this.c = new RectF();
    }

    public yc(oc5 oc5Var, Context context) {
        super(context);
        this.d = oc5Var;
        this.c = new RectF();
        this.b = new Paint(1);
    }

    public yc(Context context) {
        super(context);
        this.b = new g79(0, false);
        this.c = new hr4(this, (byte) 1);
    }

    public yc(hzb hzbVar, Context context, ylb ylbVar) {
        super(context);
        this.d = hzbVar;
        this.c = ylbVar;
        this.b = new rn(this, ylbVar);
        hzbVar.e.setCallback(this);
    }

    public yc(Context context, hx8 hx8Var) {
        super(context);
        ix8 ix8Var = new ix8();
        this.b = ix8Var;
        this.d = new f8c(this, (byte) 29);
        if (ix8Var.y != -16777216 || ix8Var.z == null) {
            ix8Var.y = -16777216;
            ix8Var.z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.c = hx8Var;
    }

    public yc(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.d = photoViewer;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public yc(t85 t85Var, LaunchActivity launchActivity, sb sbVar) {
        super(launchActivity);
        this.d = t85Var;
        this.c = sbVar;
        this.b = new int[2];
    }
}
