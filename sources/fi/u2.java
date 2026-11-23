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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.v11;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.q30;
import org.telegram.ui.uv;
import org.telegram.ui.z40;
public final class u2 extends View {
    public final int f12605a;
    public final Object f12606b;
    public Object f12607c;
    public Object d;

    public u2(Context context, int i7) {
        super(context);
        this.f12605a = i7;
        switch (i7) {
            case 8:
                super(context);
                this.f12606b = new xe.b();
                this.f12607c = new bg.a0(1, this);
                return;
            default:
                this.f12606b = new te.a(this, nr.h, 320L);
                this.f12607c = i5.c.g(context, 2131232492);
                this.d = i5.c.g(context, 2131231505);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f12605a) {
            case 1:
                v11 v11Var = (v11) this.d;
                org.telegram.ui.Components.n6 n6Var = v11Var.f40587e;
                float i7 = n6Var.i();
                if (i7 > 0.0f) {
                    float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, i7);
                    float max = Math.max(org.telegram.messenger.g0.L(16.66f), n6Var.c() + org.telegram.messenger.g0.L(10.0f));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f12606b;
                    h6Var.setColor(h6Var.f35749b.a(org.telegram.ui.ActionBar.m6.w0(v11Var.J, h6Var.f35748a), false));
                    h6Var.setColor(i0.a.f(v11Var.G, h6Var.getColor(), v11.a(v11Var)));
                    h6Var.setAlpha((int) (h6Var.getAlpha() * i7));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(8.33f), h6Var);
                    n6Var.p(rectF);
                    n6Var.C = (int) (i7 * 255.0f);
                    n6Var.u(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W8, (org.telegram.ui.ActionBar.h6) this.f12607c));
                    n6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                int[] iArr = (int[]) this.f12606b;
                uv uvVar = (uv) this.f12607c;
                q30 q30Var = (q30) this.d;
                if (q30Var.h > 0.0f && q30Var.d != null) {
                    q30Var.f50980f.reset();
                    float width = getWidth() / q30Var.f50978c.getWidth();
                    q30Var.f50980f.postScale(width, width);
                    q30Var.f50979e.setLocalMatrix(q30Var.f50980f);
                    q30Var.d.setAlpha((int) (q30Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), q30Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (uvVar != null) {
                    if (uvVar.isAttachedToWindow() && uvVar.getAlpha() > 0.5f) {
                        uvVar.getLocationInWindow(iArr);
                    } else {
                        q30Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - uvVar.getScaleX()) * uvVar.getMeasuredWidth()), iArr[1] - ((1.0f - uvVar.getScaleY()) * uvVar.getMeasuredHeight()));
                    if (((g.b) uvVar.f52638b).a(canvas2, uvVar.getMeasuredWidth(), q30Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 3:
                super.dispatchDraw(canvas);
                int L = org.telegram.messenger.g0.L(48.0f);
                z40 z40Var = (z40) this.d;
                int i10 = L + ((int) z40Var.f54369b.f57671f);
                Paint paint = (Paint) this.f12607c;
                paint.setColor(z40Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29627s8));
                RectF rectF2 = (RectF) this.f12606b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), z40.g0(z40Var).getMeasuredHeight() + i10);
                z40.f0(z40Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f12605a) {
            case 5:
                super.onAttachedToWindow();
                if (((ci.e) this.f12607c) != null) {
                    postDelayed((org.telegram.ui.Wallet.m) this.d, 200L);
                    return;
                }
                return;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((bg.a0) this.f12607c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f12605a) {
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
                    ((ViewTreeObserver) this.d).removeOnDrawListener((bg.a0) this.f12607c);
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
        switch (this.f12605a) {
            case 0:
                q80 q80Var = (q80) this.f12606b;
                super.onDraw(canvas);
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.f12607c;
                d6Var.f34347a = this;
                ((z3) this.d).getClass();
                d6Var.e(false, 0.0f);
                float f10 = d6Var.f34349c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (d6Var.f34349c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    q80Var.e(rectF);
                    q80Var.k(24.0f);
                    q80Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    q80Var.draw(canvas);
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
                Path path = (Path) this.f12607c;
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
                            canvas.drawRect(0.0f, 0.0f, f14, f14, (Paint) this.f12606b);
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
                ci.f fVar = (ci.f) this.f12606b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.f5646o < 1.0f || fVar.f5643l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 6:
                super.onDraw(canvas);
                float f15 = ((te.a) this.f12606b).f57665e;
                bg.t.b(canvas, (Drawable) this.f12607c, 1.0f - f15);
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
                    canvas.drawLine(L3, height2, (f16 * L4) + L3, height2, (Paint) this.f12607c);
                }
                canvas.drawLine(L3, height2, (L4 * hVar.I) + L3, height2, (Paint) this.f12606b);
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((xe.b) this.f12606b).iterator();
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
        switch (this.f12605a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(16.66f), ((v11) this.d).f40587e.d + org.telegram.messenger.g0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f12605a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                float f10 = i7 / 2.0f;
                float f11 = i10 / 2.0f;
                bg.t.d((Drawable) this.f12607c, f10, f11, 17);
                bg.t.d((Drawable) this.d, f10, f11, 17);
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f12605a) {
            case 4:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f43236h0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f12605a) {
            case 1:
                if (((v11) this.d).f40587e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public u2(z40 z40Var, Context context) {
        super(context);
        this.f12605a = 3;
        this.d = z40Var;
        this.f12606b = new RectF();
        this.f12607c = new Paint(1);
    }

    public u2(wi.h hVar, Activity activity) {
        super(activity);
        this.f12605a = 7;
        this.d = hVar;
        Paint paint = new Paint(1);
        this.f12606b = paint;
        Paint paint2 = new Paint(1);
        this.f12607c = paint2;
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

    public u2(v11 v11Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f12605a = 1;
        this.d = v11Var;
        this.f12607c = h6Var;
        this.f12606b = new org.telegram.ui.Components.h6(this, h6Var);
        v11Var.f40587e.setCallback(this);
    }

    public u2(Context context, ci.e eVar) {
        super(context);
        this.f12605a = 5;
        ci.f fVar = new ci.f();
        this.f12606b = fVar;
        this.d = new org.telegram.ui.Wallet.m(this, 9);
        if (fVar.f5655y != -16777216 || fVar.f5656z == null) {
            fVar.f5655y = -16777216;
            fVar.f5656z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f12607c = eVar;
    }

    public u2(z3 z3Var, Context context) {
        super(context);
        this.f12605a = 0;
        this.d = z3Var;
        this.f12606b = new q80();
        this.f12607c = new org.telegram.ui.Components.d6(250L, nr.f37917f);
    }

    public u2(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f12605a = 4;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f12606b = paint;
        this.f12607c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public u2(q30 q30Var, Context context, uv uvVar) {
        super(context);
        this.f12605a = 2;
        this.d = q30Var;
        this.f12607c = uvVar;
        this.f12606b = new int[2];
    }
}
