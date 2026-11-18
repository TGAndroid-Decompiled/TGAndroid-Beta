package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.q9;
import org.telegram.ui.ad;
import org.telegram.ui.f50;
import org.telegram.ui.oc0;
import org.telegram.ui.rc1;
import org.telegram.ui.rn;
import org.telegram.ui.sc1;
public final class t3 extends q9 {
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
                ((org.telegram.ui.Components.x8) this.I).invalidate();
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
                if (this.f38742a.R0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((v3) this.I).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.I;
                t3 t3Var = h7Var.f30778b;
                float f10 = 1.0f;
                if (t3Var.getImageReceiver().I()) {
                    f10 = 1.0f - t3Var.getImageReceiver().f22644i1;
                }
                h7Var.d.setAlpha(f10);
                h7Var.f30777a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 3:
                qa qaVar = (qa) this.I;
                org.telegram.ui.Cells.k6 k6Var = qaVar.U;
                if (qaVar.G) {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i7.h(qaVar.V, canvas, this.f38742a, k6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                ta taVar = (ta) this.I;
                Object obj = taVar.h;
                if (!(obj instanceof rc1) && !(obj instanceof sc1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, taVar.f32004s.f32136n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), taVar.f32004s.f32136n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), taVar.f32004s.f32136n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, taVar.f32004s.f32136n);
                }
                if (taVar.f32000e) {
                    taVar.f32004s.f32137r.setColor(org.telegram.ui.ActionBar.n6.f29372c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), taVar.f32004s.f32137r);
                    Drawable drawable = taVar.f32004s.f32139w;
                    drawable.setBounds(org.telegram.ui.Cells.c0.C(2, measuredWidth, drawable), org.telegram.ui.Cells.c0.A(2, measuredHeight, taVar.f32004s.f32139w), org.telegram.ui.Cells.c0.y(2, measuredWidth, taVar.f32004s.f32139w), org.telegram.ui.Cells.c0.j(2, measuredHeight, taVar.f32004s.f32139w));
                    taVar.f32004s.f32139w.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.v0) this.I).f53372w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t6 = this.f38742a.t();
                if (t6 != null) {
                    this.f38742a.y0(0.0f, 0.0f, getWidth(), (getWidth() / t6.getIntrinsicWidth()) * t6.getIntrinsicHeight());
                    this.f38742a.h(canvas, null);
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
                if (((qa) this.I).U.a(this, motionEvent)) {
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
                if (drawable != ((kg.d1) this.I).f18284n && !super.verifyDrawable(drawable)) {
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
        this.f38742a = new s2(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 5:
                hi.m5 m5Var = ((ad) this.I).h;
                if (m5Var != null) {
                    m5Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                hi.m5 m5Var2 = ((rn) this.I).f51684f;
                if (m5Var2 != null) {
                    m5Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.x8) this.I).invalidate();
                return;
            case 8:
                if (ch.f0.b(this)) {
                    return;
                }
                super.invalidate();
                ((hv) this.I).f();
                return;
            case 9:
                hi.m5 m5Var3 = ((f50) this.I).f47568e;
                if (m5Var3 != null) {
                    m5Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                hi.m5 m5Var4 = ((oc0) this.I).h;
                if (m5Var4 != null) {
                    m5Var4.invalidate();
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
                hi.m5 m5Var = ((ad) this.I).h;
                if (m5Var != null) {
                    m5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 6:
                hi.m5 m5Var2 = ((rn) this.I).f51684f;
                if (m5Var2 != null) {
                    m5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.x8) this.I).invalidate();
                return;
            case 8:
                if (ch.f0.b(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 9:
                hi.m5 m5Var3 = ((f50) this.I).f47568e;
                if (m5Var3 != null) {
                    m5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 10:
                hi.m5 m5Var4 = ((oc0) this.I).h;
                if (m5Var4 != null) {
                    m5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
