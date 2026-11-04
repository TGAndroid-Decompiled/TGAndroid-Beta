package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.vu;
import org.telegram.ui.ad;
import org.telegram.ui.kc1;
import org.telegram.ui.lc1;
import org.telegram.ui.ln;
import org.telegram.ui.nc0;
import org.telegram.ui.y40;
public final class d4 extends org.telegram.ui.Components.k9 {
    public final int H;
    public final Object I;

    public d4(int i3, Context context, Object obj) {
        super(context);
        this.H = i3;
        this.I = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 1:
                return new c3(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.H) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.q8) this.I).invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.H) {
            case 0:
                if (this.f35342a.R0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((f4) this.I).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.I;
                d4 d4Var = g7Var.f29265b;
                float f10 = 1.0f;
                if (d4Var.getImageReceiver().I()) {
                    f10 = 1.0f - d4Var.getImageReceiver().f21249i1;
                }
                g7Var.d.setAlpha(f10);
                g7Var.f29264a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 3:
                pa paVar = (pa) this.I;
                org.telegram.ui.Cells.j6 j6Var = paVar.U;
                if (paVar.G) {
                    j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    s7.h(paVar.V, canvas, this.f35342a, j6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                sa saVar = (sa) this.I;
                Object obj = saVar.h;
                if (!(obj instanceof kc1) && !(obj instanceof lc1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, saVar.f30365s.f30620n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), saVar.f30365s.f30620n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), saVar.f30365s.f30620n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, saVar.f30365s.f30620n);
                }
                if (saVar.f30361e) {
                    saVar.f30365s.f30621r.setColor(org.telegram.ui.ActionBar.k6.f27856c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), saVar.f30365s.f30621r);
                    Drawable drawable = saVar.f30365s.f30623w;
                    drawable.setBounds(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.B(2, measuredHeight, saVar.f30365s.f30623w), org.telegram.ui.Cells.f1.z(2, measuredWidth, saVar.f30365s.f30623w), org.telegram.ui.Cells.f1.i(2, measuredHeight, saVar.f30365s.f30623w));
                    saVar.f30365s.f30623w.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.w0) this.I).f51089w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t10 = this.f35342a.t();
                if (t10 != null) {
                    this.f35342a.y0(0.0f, 0.0f, getWidth(), (getWidth() / t10.getIntrinsicWidth()) * t10.getIntrinsicHeight());
                    this.f35342a.h(canvas, null);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 3:
                if (((pa) this.I).U.a(this, motionEvent)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.H) {
            case 1:
                if (drawable != ((lg.b1) this.I).f18243n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d4(org.telegram.ui.web.w0 w0Var, Context context) {
        super(context);
        this.H = 11;
        this.I = w0Var;
        this.f35342a = new c3(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 5:
                gi.n5 n5Var = ((ad) this.I).h;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                gi.n5 n5Var2 = ((ln) this.I).f47373f;
                if (n5Var2 != null) {
                    n5Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.q8) this.I).invalidate();
                return;
            case 8:
                if (dh.d0.b(this)) {
                    return;
                }
                super.invalidate();
                ((vu) this.I).f();
                return;
            case 9:
                gi.n5 n5Var3 = ((y40) this.I).f52183e;
                if (n5Var3 != null) {
                    n5Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                gi.n5 n5Var4 = ((nc0) this.I).h;
                if (n5Var4 != null) {
                    n5Var4.invalidate();
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void invalidate(int i3, int i10, int i11, int i12) {
        switch (this.H) {
            case 5:
                gi.n5 n5Var = ((ad) this.I).h;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            case 6:
                gi.n5 n5Var2 = ((ln) this.I).f47373f;
                if (n5Var2 != null) {
                    n5Var2.invalidate();
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            case 7:
                super.invalidate(i3, i10, i11, i12);
                ((org.telegram.ui.Components.q8) this.I).invalidate();
                return;
            case 8:
                if (dh.d0.b(this)) {
                    return;
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            case 9:
                gi.n5 n5Var3 = ((y40) this.I).f52183e;
                if (n5Var3 != null) {
                    n5Var3.invalidate();
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            case 10:
                gi.n5 n5Var4 = ((nc0) this.I).h;
                if (n5Var4 != null) {
                    n5Var4.invalidate();
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            default:
                super.invalidate(i3, i10, i11, i12);
                return;
        }
    }
}
