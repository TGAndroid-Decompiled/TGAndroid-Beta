package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ad;
import org.telegram.ui.e50;
import org.telegram.ui.oc0;
import org.telegram.ui.pc1;
import org.telegram.ui.qc1;
import org.telegram.ui.rn;
public final class t3 extends p9 {
    public final int H;
    public final Object I;

    public t3(int i7, Context context, Object obj) {
        super(context);
        this.H = i7;
        this.I = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 1:
                return new s2(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.H) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.w8) this.I).invalidate();
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
                if (this.f38429a.R0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((v3) this.I).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.I;
                t3 t3Var = h7Var.f30845b;
                float f10 = 1.0f;
                if (t3Var.getImageReceiver().J()) {
                    f10 = 1.0f - t3Var.getImageReceiver().f22739i1;
                }
                h7Var.d.setAlpha(f10);
                h7Var.f30844a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 3:
                sa saVar = (sa) this.I;
                org.telegram.ui.Cells.k6 k6Var = saVar.U;
                if (saVar.G) {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i7.h(saVar.V, canvas, this.f38429a, k6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                va vaVar = (va) this.I;
                Object obj = vaVar.h;
                if (!(obj instanceof pc1) && !(obj instanceof qc1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, vaVar.f32301s.f32369n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), vaVar.f32301s.f32369n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), vaVar.f32301s.f32369n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, vaVar.f32301s.f32369n);
                }
                if (vaVar.f32297e) {
                    vaVar.f32301s.f32370r.setColor(org.telegram.ui.ActionBar.n6.f29427c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), vaVar.f32301s.f32370r);
                    Drawable drawable = vaVar.f32301s.f32372w;
                    drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, vaVar.f32301s.f32372w), org.telegram.ui.Cells.c0.y(2, measuredWidth, vaVar.f32301s.f32372w), org.telegram.ui.Cells.c0.j(2, measuredHeight, vaVar.f32301s.f32372w));
                    vaVar.f32301s.f32372w.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.v0) this.I).f53604w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t6 = this.f38429a.t();
                if (t6 != null) {
                    this.f38429a.z0(0.0f, 0.0f, getWidth(), (getWidth() / t6.getIntrinsicWidth()) * t6.getIntrinsicHeight());
                    this.f38429a.h(canvas, null);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 3:
                if (((sa) this.I).U.a(this, motionEvent)) {
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
                if (drawable != ((kg.c1) this.I).f18371n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public t3(org.telegram.ui.web.v0 v0Var, Context context) {
        super(context);
        this.H = 11;
        this.I = v0Var;
        this.f38429a = new s2(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 5:
                hi.w5 w5Var = ((ad) this.I).h;
                if (w5Var != null) {
                    w5Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                hi.w5 w5Var2 = ((rn) this.I).f51773f;
                if (w5Var2 != null) {
                    w5Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.w8) this.I).invalidate();
                return;
            case 8:
                if (ch.f0.b(this)) {
                    return;
                }
                super.invalidate();
                ((hv) this.I).f();
                return;
            case 9:
                hi.w5 w5Var3 = ((e50) this.I).f47439e;
                if (w5Var3 != null) {
                    w5Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                hi.w5 w5Var4 = ((oc0) this.I).h;
                if (w5Var4 != null) {
                    w5Var4.invalidate();
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.H) {
            case 5:
                hi.w5 w5Var = ((ad) this.I).h;
                if (w5Var != null) {
                    w5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 6:
                hi.w5 w5Var2 = ((rn) this.I).f51773f;
                if (w5Var2 != null) {
                    w5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.w8) this.I).invalidate();
                return;
            case 8:
                if (ch.f0.b(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 9:
                hi.w5 w5Var3 = ((e50) this.I).f47439e;
                if (w5Var3 != null) {
                    w5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 10:
                hi.w5 w5Var4 = ((oc0) this.I).h;
                if (w5Var4 != null) {
                    w5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
