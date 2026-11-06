package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.l00;
import org.telegram.ui.n30;
import org.telegram.ui.w40;
public final class b3 extends View {
    public final int f8840a;
    public final Object f8841b;
    public Object f8842c;
    public Object d;

    public b3(Context context, int i7) {
        super(context);
        this.f8840a = i7;
        switch (i7) {
            case 8:
                super(context);
                this.f8841b = new xe.b();
                this.f8842c = new bg.z(1, this);
                return;
            default:
                this.f8841b = new te.a(this, xq.h, 320L);
                this.f8842c = jg.g.h(context, 2131232490);
                this.d = jg.g.h(context, 2131231504);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f8840a) {
            case 1:
                b11 b11Var = (b11) this.d;
                org.telegram.ui.Components.i6 i6Var = b11Var.f31970e;
                float i7 = i6Var.i();
                if (i7 > 0.0f) {
                    float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, i7);
                    float max = Math.max(org.telegram.messenger.g0.L(16.66f), i6Var.c() + org.telegram.messenger.g0.L(10.0f));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f8841b;
                    b6Var.setColor(b6Var.f32005b.a(org.telegram.ui.ActionBar.k6.w0(b11Var.I, b6Var.f32004a), false));
                    b6Var.setColor(i0.a.f(b11Var.F, b6Var.getColor(), b11.a(b11Var)));
                    b6Var.setAlpha((int) (b6Var.getAlpha() * i7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(8.33f), b6Var);
                    i6Var.p(rectF);
                    i6Var.B = (int) (i7 * 255.0f);
                    i6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, (org.telegram.ui.ActionBar.f6) this.f8842c));
                    i6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                int[] iArr = (int[]) this.f8841b;
                l00 l00Var = (l00) this.f8842c;
                n30 n30Var = (n30) this.d;
                if (n30Var.h > 0.0f && n30Var.d != null) {
                    n30Var.f47926f.reset();
                    float width = getWidth() / n30Var.f47924c.getWidth();
                    n30Var.f47926f.postScale(width, width);
                    n30Var.f47925e.setLocalMatrix(n30Var.f47926f);
                    n30Var.d.setAlpha((int) (n30Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), n30Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (l00Var != null) {
                    if (l00Var.isAttachedToWindow() && l00Var.getAlpha() > 0.5f) {
                        l00Var.getLocationInWindow(iArr);
                    } else {
                        n30Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - l00Var.getScaleX()) * l00Var.getMeasuredWidth()), iArr[1] - ((1.0f - l00Var.getScaleY()) * l00Var.getMeasuredHeight()));
                    if (((g.b) l00Var.f47347b).a(canvas2, l00Var.getMeasuredWidth(), n30Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 3:
                super.dispatchDraw(canvas);
                int L = org.telegram.messenger.g0.L(48.0f);
                w40 w40Var = (w40) this.d;
                int i10 = L + ((int) w40Var.f50920b.f55376f);
                Paint paint = (Paint) this.f8842c;
                paint.setColor(w40Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28128s8));
                RectF rectF2 = (RectF) this.f8841b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), w40.g0(w40Var).getMeasuredHeight() + i10);
                w40.f0(w40Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8840a) {
            case 5:
                super.onAttachedToWindow();
                if (((ai.g) this.f8842c) != null) {
                    postDelayed((org.telegram.ui.Wallet.l) this.d, 200L);
                    return;
                }
                return;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((bg.z) this.f8842c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8840a) {
            case 5:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) this.d;
                removeCallbacks(lVar);
                lVar.run();
                return;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((bg.z) this.f8842c);
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
        switch (this.f8840a) {
            case 0:
                a80 a80Var = (a80) this.f8841b;
                super.onDraw(canvas);
                org.telegram.ui.Components.w5 w5Var = (org.telegram.ui.Components.w5) this.f8842c;
                w5Var.f39847a = this;
                ((i4) this.d).getClass();
                w5Var.e(false, 0.0f);
                float f10 = w5Var.f39849c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (w5Var.f39849c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    a80Var.e(rectF);
                    a80Var.k(24.0f);
                    a80Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    a80Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                float L = org.telegram.messenger.g0.L(10.0f);
                float f11 = L * 2.0f;
                float measuredWidth = getMeasuredWidth() - f11;
                float measuredHeight = getMeasuredHeight() - f11;
                canvas.save();
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f12 = L + measuredWidth;
                rectF2.set(L, L, f12, f12);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f13 = measuredWidth / 7.0f;
                Path path = (Path) this.f8842c;
                path.rewind();
                path.addRoundRect(rectF2, f13, f13, Path.Direction.CW);
                canvas.clipPath(path);
                int L2 = org.telegram.messenger.g0.L(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f14 = L2;
                int width = ((int) (rectF2.width() / f14)) + 1;
                int height = ((int) (rectF2.height() / f14)) + 1;
                for (int i7 = 0; i7 < height; i7++) {
                    canvas.save();
                    for (int i10 = 0; i10 < width; i10++) {
                        int i11 = i10 % 2;
                        if ((i11 == 0 && i7 % 2 == 0) || (i11 != 0 && i7 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f14, f14, (Paint) this.f8841b);
                        }
                        canvas.translate(f14, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f14);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 5:
                ai.h hVar = (ai.h) this.f8841b;
                hVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (hVar.f1214o < 1.0f || hVar.f1211l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 6:
                super.onDraw(canvas);
                float f15 = ((te.a) this.f8841b).f55370e;
                bg.s.b(canvas, (Drawable) this.f8842c, 1.0f - f15);
                bg.s.b(canvas, (Drawable) this.d, f15);
                return;
            case 7:
                int width2 = getWidth();
                float L3 = org.telegram.messenger.g0.L(10.0f);
                float L4 = (width2 - L3) - org.telegram.messenger.g0.L(10.0f);
                float height2 = getHeight() - org.telegram.messenger.g0.L(8.0f);
                ti.i iVar = (ti.i) this.d;
                float f16 = iVar.J;
                if (f16 != 0.0f) {
                    canvas.drawLine(L3, height2, (f16 * L4) + L3, height2, (Paint) this.f8842c);
                }
                canvas.drawLine(L3, height2, (L4 * iVar.I) + L3, height2, (Paint) this.f8841b);
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((xe.b) this.f8841b).iterator();
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
    public void onMeasure(int i7, int i10) {
        switch (this.f8840a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(16.66f), ((b11) this.d).f31970e.d + org.telegram.messenger.g0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f8840a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                float f10 = i7 / 2.0f;
                float f11 = i10 / 2.0f;
                bg.s.d((Drawable) this.f8842c, f10, f11, 17);
                bg.s.d((Drawable) this.d, f10, f11, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f8840a) {
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f41375g0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8840a) {
            case 1:
                if (((b11) this.d).f31970e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public b3(w40 w40Var, Context context) {
        super(context);
        this.f8840a = 3;
        this.d = w40Var;
        this.f8841b = new RectF();
        this.f8842c = new Paint(1);
    }

    public b3(ti.i iVar, Activity activity) {
        super(activity);
        this.f8840a = 7;
        this.d = iVar;
        Paint paint = new Paint(1);
        this.f8841b = paint;
        Paint paint2 = new Paint(1);
        this.f8842c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    public b3(b11 b11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f8840a = 1;
        this.d = b11Var;
        this.f8842c = f6Var;
        this.f8841b = new org.telegram.ui.Components.b6(this, f6Var);
        b11Var.f31970e.setCallback(this);
    }

    public b3(Context context, ai.g gVar) {
        super(context);
        this.f8840a = 5;
        ai.h hVar = new ai.h();
        this.f8841b = hVar;
        this.d = new org.telegram.ui.Wallet.l(this, 9);
        if (hVar.f1223y != -16777216 || hVar.f1224z == null) {
            hVar.f1223y = -16777216;
            hVar.f1224z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f8842c = gVar;
    }

    public b3(i4 i4Var, Context context) {
        super(context);
        this.f8840a = 0;
        this.d = i4Var;
        this.f8841b = new a80();
        this.f8842c = new org.telegram.ui.Components.w5(250L, xq.f40310f);
    }

    public b3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f8840a = 4;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f8841b = paint;
        this.f8842c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public b3(n30 n30Var, Context context, l00 l00Var) {
        super(context);
        this.f8840a = 2;
        this.d = n30Var;
        this.f8842c = l00Var;
        this.f8841b = new int[2];
    }
}
