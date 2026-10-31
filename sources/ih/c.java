package ih;

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
import bi.t0;
import java.util.Iterator;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m40;
import org.telegram.ui.v50;
import th.z2;
public final class c extends View {
    public final int f8520a;
    public final Object f8521b;
    public Object f8522c;
    public Object d;

    public c(Context context, int i10) {
        super(context);
        this.f8520a = i10;
        switch (i10) {
            case 1:
                super(context);
                this.f8521b = new je.b();
                this.f8522c = new nf.a(0, this);
                return;
            default:
                this.f8521b = new fe.b(this, gr.h, 320L);
                this.f8522c = i0.a.f(context, 2131232489);
                this.d = i0.a.f(context, 2131231505);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f8520a) {
            case 3:
                j21 j21Var = (j21) this.d;
                e6 e6Var = j21Var.e;
                float i10 = e6Var.i();
                if (i10 > 0.0f) {
                    float T1 = i0.T1(0.6f, 1.0f, i10);
                    float max = Math.max(i0.L(16.66f), e6Var.c() + i0.L(10.0f));
                    RectF rectF = i0.P;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(T1, T1, rectF.centerX(), rectF.centerY());
                    y5 y5Var = (y5) this.f8521b;
                    y5Var.setColor(y5Var.f32638b.a(t6.w0(j21Var.I, y5Var.f32637a), false));
                    y5Var.setColor(i0.b.f(j21Var.F, y5Var.getColor(), j21.a(j21Var)));
                    y5Var.setAlpha((int) (y5Var.getAlpha() * i10));
                    canvas.drawRoundRect(rectF, i0.L(8.33f), i0.L(8.33f), y5Var);
                    e6Var.p(rectF);
                    e6Var.B = (int) (i10 * 255.0f);
                    e6Var.u(t6.w0(t6.W8, (p6) this.f8522c));
                    e6Var.draw(canvas);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
                int[] iArr = (int[]) this.f8521b;
                t0 t0Var = (t0) this.f8522c;
                m40 m40Var = (m40) this.d;
                if (m40Var.h > 0.0f && m40Var.d != null) {
                    m40Var.f39471f.reset();
                    float width = getWidth() / m40Var.f39470c.getWidth();
                    m40Var.f39471f.postScale(width, width);
                    m40Var.e.setLocalMatrix(m40Var.f39471f);
                    m40Var.d.setAlpha((int) (m40Var.h * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), m40Var.d);
                } else {
                    canvas2 = canvas;
                }
                if (t0Var != null) {
                    if (t0Var.isAttachedToWindow() && t0Var.getAlpha() > 0.5f) {
                        t0Var.getLocationInWindow(iArr);
                    } else {
                        m40Var.dismiss();
                    }
                    canvas2.save();
                    canvas2.translate(iArr[0] - ((1.0f - t0Var.getScaleX()) * t0Var.getMeasuredWidth()), iArr[1] - ((1.0f - t0Var.getScaleY()) * t0Var.getMeasuredHeight()));
                    if (((g.b) t0Var.f3356b).a(canvas2, t0Var.getMeasuredWidth(), m40Var.h)) {
                        invalidate();
                    }
                    canvas2.restore();
                    return;
                }
                return;
            case 5:
                super.dispatchDraw(canvas);
                int L = i0.L(48.0f);
                v50 v50Var = (v50) this.d;
                int i11 = L + ((int) v50Var.f42607b.f7031f);
                Paint paint = (Paint) this.f8522c;
                paint.setColor(v50Var.getThemedColor(t6.f21206s8));
                RectF rectF2 = (RectF) this.f8521b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), v50.f0(v50Var).getMeasuredHeight() + i11);
                v50.e0(v50Var, canvas, rectF2, paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f8520a) {
            case 1:
                super.onAttachedToWindow();
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                this.d = viewTreeObserver;
                viewTreeObserver.addOnDrawListener((nf.a) this.f8522c);
                return;
            case 7:
                super.onAttachedToWindow();
                if (((qh.f) this.f8522c) != null) {
                    postDelayed((org.telegram.ui.Wallet.l) this.d, 200L);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8520a) {
            case 1:
                super.onDetachedFromWindow();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    ((ViewTreeObserver) this.d).removeOnDrawListener((nf.a) this.f8522c);
                }
                this.d = null;
                return;
            case 7:
                super.onDetachedFromWindow();
                org.telegram.ui.Wallet.l lVar = (org.telegram.ui.Wallet.l) this.d;
                removeCallbacks(lVar);
                lVar.run();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ve0 ve0Var;
        switch (this.f8520a) {
            case 0:
                super.onDraw(canvas);
                float f7 = ((fe.b) this.f8521b).e;
                rf.o.b(canvas, (Drawable) this.f8522c, 1.0f - f7);
                rf.o.b(canvas, (Drawable) this.d, f7);
                return;
            case 1:
                Trace.beginSection("OnPostDraw");
                try {
                    Iterator it = ((je.b) this.f8521b).iterator();
                    while (it.hasNext()) {
                        ((ei.i) it.next()).b();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 2:
                super.onDraw(canvas);
                jf0 jf0Var = (jf0) this.d;
                if (!jf0Var.f27362n || ((ve0Var = jf0Var.f27363r) != null && ve0Var.f31243y)) {
                    int width = getWidth();
                    int L = i0.L(10.0f);
                    float f10 = (width - L) - L;
                    int i10 = L + ((int) (jf0Var.Z * f10));
                    float height = getHeight() - i0.L(8.0f);
                    float f11 = jf0Var.f27347a0;
                    if (f11 != 0.0f) {
                        float f12 = L;
                        canvas.drawLine(f12, height, (f11 * f10) + f12, height, (Paint) this.f8522c);
                    }
                    canvas.drawLine(L, height, i10, height, (Paint) this.f8521b);
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
                float L2 = i0.L(10.0f);
                float f13 = L2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f13;
                float measuredHeight = getMeasuredHeight() - f13;
                canvas.save();
                RectF rectF = i0.P;
                float f14 = L2 + measuredWidth;
                rectF.set(L2, L2, f14, f14);
                rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
                float f15 = measuredWidth / 7.0f;
                Path path = (Path) this.f8522c;
                path.rewind();
                path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                canvas.clipPath(path);
                int L3 = i0.L(10.0f);
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                float f16 = L3;
                int width2 = ((int) (rectF.width() / f16)) + 1;
                int height2 = ((int) (rectF.height() / f16)) + 1;
                for (int i11 = 0; i11 < height2; i11++) {
                    canvas.save();
                    for (int i12 = 0; i12 < width2; i12++) {
                        int i13 = i12 % 2;
                        if ((i13 == 0 && i11 % 2 == 0) || (i13 != 0 && i11 % 2 != 0)) {
                            canvas.drawRect(0.0f, 0.0f, f16, f16, (Paint) this.f8521b);
                        }
                        canvas.translate(f16, 0.0f);
                    }
                    canvas.restore();
                    canvas.translate(0.0f, f16);
                }
                canvas.restore();
                canvas.restore();
                return;
            case 7:
                qh.g gVar = (qh.g) this.f8521b;
                gVar.e(canvas, 0.0f, 0.0f, getWidth());
                if (gVar.f45628o < 1.0f || gVar.f45625l > 0) {
                    invalidate();
                    return;
                }
                return;
            case 8:
                t80 t80Var = (t80) this.f8521b;
                super.onDraw(canvas);
                t5 t5Var = (t5) this.f8522c;
                t5Var.f30443a = this;
                ((z2) this.d).getClass();
                t5Var.e(false, 0.0f);
                float f17 = t5Var.f30445c;
                if (f17 != 0.0f) {
                    if (f17 != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (t5Var.f30445c * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF2 = i0.P;
                    rectF2.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    t80Var.e(rectF2);
                    t80Var.k(24.0f);
                    t80Var.g(i0.b.o(-1, 20), i0.b.o(-1, 50), i0.b.o(-1, 50), i0.b.o(-1, 70));
                    t80Var.draw(canvas);
                    invalidate();
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8520a) {
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(i0.L(16.66f), ((j21) this.d).e.d + i0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(16.66f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f8520a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                float f7 = i10 / 2.0f;
                float f10 = i11 / 2.0f;
                rf.o.d((Drawable) this.f8522c, f7, f10, 17);
                rf.o.d((Drawable) this.d, f7, f10, 17);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f8520a) {
            case 6:
                super.setAlpha(f7);
                ((PhotoViewer) this.d).f33487g0.invalidate();
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8520a) {
            case 3:
                if (((j21) this.d).e != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public c(v50 v50Var, Context context) {
        super(context);
        this.f8520a = 5;
        this.d = v50Var;
        this.f8521b = new RectF();
        this.f8522c = new Paint(1);
    }

    public c(jf0 jf0Var, Context context) {
        super(context);
        this.f8520a = 2;
        this.d = jf0Var;
        Paint paint = new Paint();
        this.f8521b = paint;
        Paint paint2 = new Paint();
        this.f8522c = paint2;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(i0.L(2.0f));
        paint2.setColor(paint.getColor());
        paint2.setAlpha((int) (paint.getAlpha() * 0.3f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(i0.L(2.0f));
    }

    public c(j21 j21Var, Context context, p6 p6Var) {
        super(context);
        this.f8520a = 3;
        this.d = j21Var;
        this.f8522c = p6Var;
        this.f8521b = new y5(this, p6Var);
        j21Var.e.setCallback(this);
    }

    public c(Context context, qh.f fVar) {
        super(context);
        this.f8520a = 7;
        qh.g gVar = new qh.g();
        this.f8521b = gVar;
        this.d = new org.telegram.ui.Wallet.l(this, 9);
        if (gVar.f45637y != -16777216 || gVar.f45638z == null) {
            gVar.f45637y = -16777216;
            gVar.f45638z = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
        }
        this.f8522c = fVar;
    }

    public c(z2 z2Var, Context context) {
        super(context);
        this.f8520a = 8;
        this.d = z2Var;
        this.f8521b = new t80();
        this.f8522c = new t5(250L, gr.f26495f);
    }

    public c(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f8520a = 6;
        this.d = photoViewer;
        Paint paint = new Paint();
        this.f8521b = paint;
        this.f8522c = new Path();
        paint.setColor(-1);
        paint.setAlpha(40);
        setLayerType(2, null);
    }

    public c(m40 m40Var, Context context, t0 t0Var) {
        super(context);
        this.f8520a = 4;
        this.d = m40Var;
        this.f8522c = t0Var;
        this.f8521b = new int[2];
    }
}
