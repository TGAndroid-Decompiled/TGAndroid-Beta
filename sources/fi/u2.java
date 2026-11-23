package fi;

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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.u11;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p30;
import org.telegram.ui.tv;
import org.telegram.ui.y40;
public final class u2 extends View {
    public final int f12614a;
    public final Object f12615b;
    public Object f12616c;
    public Object d;

    public u2(Context context, int i7) {
        super(context);
        this.f12614a = i7;
        switch (i7) {
            case 8:
                super(context);
                this.f12615b = new xe.b();
                this.f12616c = new bg.a0(1, this);
                return;
            default:
                this.f12615b = new te.a(this, kr.h, 320L);
                this.f12616c = i5.c.g(context, 2131232495);
                this.d = i5.c.g(context, 2131231508);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f12614a) {
            case 1:
                u11 u11Var = (u11) this.d;
                org.telegram.ui.Components.m6 m6Var = u11Var.f40226e;
                float i7 = m6Var.i();
                if (i7 > 0.0f) {
                    float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, i7);
                    float max = Math.max(org.telegram.messenger.g0.L(16.66f), m6Var.c() + org.telegram.messenger.g0.L(10.0f));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f12615b;
                    g6Var.setColor(g6Var.f35330b.a(org.telegram.ui.ActionBar.n6.w0(u11Var.J, g6Var.f35329a), false));
                    g6Var.setColor(i0.a.f(u11Var.G, g6Var.getColor(), u11.a(u11Var)));
                    g6Var.setAlpha((int) (g6Var.getAlpha() * i7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(8.33f), g6Var);
                    m6Var.p(rectF);
                    m6Var.C = (int) (i7 * 255.0f);
                    m6Var.u(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W8, (org.telegram.ui.ActionBar.i6) this.f12616c));
                    m6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                int[] iArr = (int[]) this.f12615b;
                tv tvVar = (tv) this.f12616c;
                p30 p30Var = (p30) this.d;
                if (p30Var.h > 0.0f && p30Var.d != null) {
                    p30Var.f50818f.reset();
                    float width = getWidth() / p30Var.f50816c.getWidth();
                    p30Var.f50818f.postScale(width, width);
                    p30Var.f50817e.setLocalMatrix(p30Var.f50818f);
                    p30Var.d.setAlpha((int) (p30Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), p30Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (tvVar != null) {
                    if (tvVar.isAttachedToWindow() && tvVar.getAlpha() > 0.5f) {
                        tvVar.getLocationInWindow(iArr);
                    } else {
                        p30Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - tvVar.getScaleX()) * tvVar.getMeasuredWidth()), iArr[1] - ((1.0f - tvVar.getScaleY()) * tvVar.getMeasuredHeight()));
                    if (((g.b) tvVar.f52485b).a(canvas2, tvVar.getMeasuredWidth(), p30Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 3:
                super.dispatchDraw(canvas);
                int L = org.telegram.messenger.g0.L(48.0f);
                y40 y40Var = (y40) this.d;
                int i10 = L + ((int) y40Var.f54192b.f57785f);
                Paint paint = (Paint) this.f12616c;
                paint.setColor(y40Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29731s8));
                RectF rectF2 = (RectF) this.f12615b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), y40.g0(y40Var).getMeasuredHeight() + i10);
                y40.f0(y40Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f12614a) {
            case 5:
                super.onAttachedToWindow();
                if (((ci.e) this.f12616c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    return;
                }
                return;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((bg.a0) this.f12616c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f12614a) {
            case 5:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.m mVar = (org.telegram.ui.Wallet.m) this.d;
                removeCallbacks(mVar);
                mVar.run();
                return;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((bg.a0) this.f12616c);
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
        switch (this.f12614a) {
            case 0:
                n80 n80Var = (n80) this.f12615b;
                super.onDraw(canvas);
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f12616c;
                c6Var.f33929a = this;
                ((z3) this.d).getClass();
                c6Var.e(false, 0.0f);
                float f10 = c6Var.f33931c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (c6Var.f33931c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    n80Var.e(rectF);
                    n80Var.k(24.0f);
                    n80Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    n80Var.draw(canvas);
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
                Path path = (Path) this.f12616c;
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
                            canvas.drawRect(0.0f, 0.0f, f14, f14, (Paint) this.f12615b);
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
                ci.f fVar = (ci.f) this.f12615b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.f5646o < 1.0f || fVar.f5643l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 6:
                super.onDraw(canvas);
                float f15 = ((te.a) this.f12615b).f57779e;
                bg.t.b(canvas, (Drawable) this.f12616c, 1.0f - f15);
                bg.t.b(canvas, (Drawable) this.d, f15);
                return;
            case 7:
                int width2 = getWidth();
                float L3 = org.telegram.messenger.g0.L(10.0f);
                float L4 = (width2 - L3) - org.telegram.messenger.g0.L(10.0f);
                float height2 = getHeight() - org.telegram.messenger.g0.L(8.0f);
                wi.h hVar = (wi.h) this.d;
                float f16 = hVar.J;
                if (f16 != 0.0f) {
                    canvas.drawLine(L3, height2, (f16 * L4) + L3, height2, (Paint) this.f12616c);
                }
                canvas.drawLine(L3, height2, (L4 * hVar.I) + L3, height2, (Paint) this.f12615b);
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((xe.b) this.f12615b).iterator();
                    while (it.hasNext()) {
                        ((ri.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f12614a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(16.66f), ((u11) this.d).f40226e.d + org.telegram.messenger.g0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f12614a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                float f10 = i7 / 2.0f;
                float f11 = i10 / 2.0f;
                bg.t.d((Drawable) this.f12616c, f10, f11, 17);
                bg.t.d((Drawable) this.d, f10, f11, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f12614a) {
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f43352h0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12614a) {
            case 1:
                if (((u11) this.d).f40226e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public u2(y40 y40Var, Context context) {
        super(context);
        this.f12614a = 3;
        this.d = y40Var;
        this.f12615b = new RectF();
        this.f12616c = new Paint(1);
    }

    public u2(wi.h hVar, Activity activity) {
        super(activity);
        this.f12614a = 7;
        this.d = hVar;
        Paint paint = new Paint(1);
        this.f12615b = paint;
        Paint paint2 = new Paint(1);
        this.f12616c = paint2;
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

    public u2(u11 u11Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f12614a = 1;
        this.d = u11Var;
        this.f12616c = i6Var;
        this.f12615b = new org.telegram.ui.Components.g6(this, i6Var);
        u11Var.f40226e.setCallback(this);
    }

    public u2(Context context, ci.e eVar) {
        super(context);
        this.f12614a = 5;
        ci.f fVar = new ci.f();
        this.f12615b = fVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (fVar.f5655y != -16777216 || fVar.f5656z == null) {
            fVar.f5655y = -16777216;
            fVar.f5656z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f12616c = eVar;
    }

    public u2(z3 z3Var, Context context) {
        super(context);
        this.f12614a = 0;
        this.d = z3Var;
        this.f12615b = new n80();
        this.f12616c = new org.telegram.ui.Components.c6(250L, kr.f36858f);
    }

    public u2(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f12614a = 4;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f12615b = paint;
        this.f12616c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public u2(p30 p30Var, Context context, tv tvVar) {
        super(context);
        this.f12614a = 2;
        this.d = p30Var;
        this.f12616c = tvVar;
        this.f12615b = new int[2];
    }
}
