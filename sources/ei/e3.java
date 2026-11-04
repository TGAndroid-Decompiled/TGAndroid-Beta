package ei;

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
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.i30;
import org.telegram.ui.r40;
public final class e3 extends View {
    public final int f10220a;
    public final Object f10221b;
    public Object f10222c;
    public Object d;

    public e3(Context context, int i3) {
        super(context);
        this.f10220a = i3;
        switch (i3) {
            case 8:
                super(context);
                this.f10221b = new ue.b();
                this.f10222c = new cg.y(1, this);
                return;
            default:
                this.f10221b = new qe.a(this, xq.h, 320L);
                this.f10222c = k2.p1.g(context, 2131232490);
                this.d = k2.p1.g(context, 2131231504);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f10220a) {
            case 2:
                b11 b11Var = (b11) this.d;
                org.telegram.ui.Components.g6 g6Var = b11Var.f32050e;
                float i3 = g6Var.i();
                if (i3 > 0.0f) {
                    float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, i3);
                    float max = Math.max(org.telegram.messenger.g0.L(16.66f), g6Var.c() + org.telegram.messenger.g0.L(10.0f));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f10221b;
                    z5Var.setColor(z5Var.f40918b.a(org.telegram.ui.ActionBar.k6.w0(b11Var.J, z5Var.f40917a), false));
                    z5Var.setColor(i0.a.f(b11Var.G, z5Var.getColor(), b11.a(b11Var)));
                    z5Var.setAlpha((int) (z5Var.getAlpha() * i3));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(8.33f), z5Var);
                    g6Var.p(rectF);
                    g6Var.B = (int) (i3 * 255.0f);
                    g6Var.u(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W8, (org.telegram.ui.ActionBar.e6) this.f10222c));
                    g6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                int[] iArr = (int[]) this.f10221b;
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) this.f10222c;
                i30 i30Var = (i30) this.d;
                if (i30Var.h > 0.0f && i30Var.d != null) {
                    i30Var.f46048f.reset();
                    float width = getWidth() / i30Var.f46046c.getWidth();
                    i30Var.f46048f.postScale(width, width);
                    i30Var.f46047e.setLocalMatrix(i30Var.f46048f);
                    i30Var.d.setAlpha((int) (i30Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), i30Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (r0Var != null) {
                    if (r0Var.isAttachedToWindow() && r0Var.getAlpha() > 0.5f) {
                        r0Var.getLocationInWindow(iArr);
                    } else {
                        i30Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - r0Var.getScaleX()) * r0Var.getMeasuredWidth()), iArr[1] - ((1.0f - r0Var.getScaleY()) * r0Var.getMeasuredHeight()));
                    if (((g.b) r0Var.f39583b).a(canvas2, r0Var.getMeasuredWidth(), i30Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 4:
                super.dispatchDraw(canvas);
                int L = org.telegram.messenger.g0.L(48.0f);
                r40 r40Var = (r40) this.d;
                int i10 = L + ((int) r40Var.f49033b.f53846f);
                Paint paint = (Paint) this.f10222c;
                paint.setColor(r40Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8));
                RectF rectF2 = (RectF) this.f10221b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), r40.g0(r40Var).getMeasuredHeight() + i10);
                r40.f0(r40Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f10220a) {
            case 6:
                super.onAttachedToWindow();
                if (((bi.e) this.f10222c) != null) {
                    postDelayed((org.telegram.ui.Wallet.l) this.d, 200L);
                    return;
                }
                return;
            case 7:
            default:
                super.onAttachedToWindow();
                return;
            case 8:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((cg.y) this.f10222c);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10220a) {
            case 6:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) this.d;
                removeCallbacks(lVar);
                lVar.run();
                return;
            case 7:
            default:
                super.onDetachedFromWindow();
                return;
            case 8:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((cg.y) this.f10222c);
                }
                this.d = null;
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ud0 ud0Var;
        switch (this.f10220a) {
            case 0:
                w70 w70Var = (w70) this.f10221b;
                super.onDraw(canvas);
                org.telegram.ui.Components.u5 u5Var = (org.telegram.ui.Components.u5) this.f10222c;
                u5Var.f38643a = this;
                ((j4) this.d).getClass();
                u5Var.e(false, 0.0f);
                float f10 = u5Var.f38645c;
                if (f10 != 0.0f) {
                    if (f10 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (u5Var.f38645c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    w70Var.e(rectF);
                    w70Var.k(24.0f);
                    w70Var.g(i0.a.o(-1, 20), i0.a.o(-1, 50), i0.a.o(-1, 50), i0.a.o(-1, 70));
                    w70Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                ie0 ie0Var = (ie0) this.d;
                if (!ie0Var.f34701n || ((ud0Var = ie0Var.f34703r) != null && ud0Var.f38729y)) {
                    int width = getWidth();
                    int L = org.telegram.messenger.g0.L(10.0f);
                    float f11 = (width - L) - L;
                    int i3 = L + ((int) (ie0Var.f34685a0 * f11));
                    float height = getHeight() - org.telegram.messenger.g0.L(8.0f);
                    float f12 = ie0Var.f34687b0;
                    if (f12 != 0.0f) {
                        float f13 = L;
                        canvas.drawLine(f13, height, (f12 * f11) + f13, height, (Paint) this.f10222c);
                    }
                    canvas.drawLine(L, height, i3, height, (Paint) this.f10221b);
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
                float L2 = org.telegram.messenger.g0.L(10.0f);
                float f14 = L2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f14;
                float measuredHeight = getMeasuredHeight() - f14;
                canvas.save();
                RectF rectF2 = org.telegram.messenger.g0.P;
                float f15 = L2 + measuredWidth;
                rectF2.set(L2, L2, f15, f15);
                rectF2.offset(0.0f, (measuredHeight - rectF2.height()) / 2.0f);
                float f16 = measuredWidth / 7.0f;
                Path path = (Path) this.f10222c;
                path.rewind();
                path.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
                canvas.clipPath(path);
                int L3 = org.telegram.messenger.g0.L(10.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                float f17 = L3;
                int width2 = ((int) (rectF2.width() / f17)) + 1;
                int height2 = ((int) (rectF2.height() / f17)) + 1;
                for (int i10 = 0; i10 < height2; i10++) {
                    canvas.save();
                    for (int i11 = 0; i11 < width2; i11++) {
                        int i12 = i11 % 2;
                        if ((i12 == 0 && i10 % 2 == 0) || (i12 != 0 && i10 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f17, f17, (Paint) this.f10221b);
                        }
                        canvas.translate(f17, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f17);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 6:
                bi.f fVar = (bi.f) this.f10221b;
                fVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (fVar.f3729o < 1.0f || fVar.f3726l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 7:
                super.onDraw(canvas);
                float f18 = ((qe.a) this.f10221b).f53840e;
                cg.r.b(canvas, (Drawable) this.f10222c, 1.0f - f18);
                cg.r.b(canvas, (Drawable) this.d, f18);
                return;
            case 8:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((ue.b) this.f10221b).iterator();
                    while (it.hasNext()) {
                        ((pi.h) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f10220a) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(16.66f), ((b11) this.d).f32050e.d + org.telegram.messenger.g0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f10220a) {
            case 7:
                super.onSizeChanged(i3, i10, i11, i12);
                float f10 = i3 / 2.0f;
                float f11 = i10 / 2.0f;
                cg.r.d((Drawable) this.f10222c, f10, f11, 17);
                cg.r.d((Drawable) this.d, f10, f11, 17);
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f10220a) {
            case 5:
                super.setAlpha(f10);
                ((PhotoViewer) this.d).f41437h0.invalidate();
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f10220a) {
            case 2:
                if (((b11) this.d).f32050e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public e3(r40 r40Var, Context context) {
        super(context);
        this.f10220a = 4;
        this.d = r40Var;
        this.f10221b = new RectF();
        this.f10222c = new Paint(1);
    }

    public e3(ie0 ie0Var, Context context) {
        super(context);
        this.f10220a = 1;
        this.d = ie0Var;
        Paint paint = new Paint();
        this.f10221b = paint;
        Paint paint2 = new Paint();
        this.f10222c = paint2;
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

    public e3(b11 b11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f10220a = 2;
        this.d = b11Var;
        this.f10222c = e6Var;
        this.f10221b = new org.telegram.ui.Components.z5(this, e6Var);
        b11Var.f32050e.setCallback(this);
    }

    public e3(Context context, bi.e eVar) {
        super(context);
        this.f10220a = 6;
        bi.f fVar = new bi.f();
        this.f10221b = fVar;
        this.d = new org.telegram.ui.Wallet.l(this, 9);
        if (fVar.f3738y != -16777216 || fVar.f3739z == null) {
            fVar.f3738y = -16777216;
            fVar.f3739z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f10222c = eVar;
    }

    public e3(j4 j4Var, Context context) {
        super(context);
        this.f10220a = 0;
        this.d = j4Var;
        this.f10221b = new w70();
        this.f10222c = new org.telegram.ui.Components.u5(250L, xq.f40452f);
    }

    public e3(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f10220a = 5;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f10221b = paint;
        this.f10222c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public e3(i30 i30Var, Context context, org.telegram.ui.Components.voip.r0 r0Var) {
        super(context);
        this.f10220a = 3;
        this.d = i30Var;
        this.f10222c = r0Var;
        this.f10221b = new int[2];
    }
}
