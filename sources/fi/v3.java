package fi;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.ad;
import org.telegram.ui.c50;
import org.telegram.ui.oc0;
import org.telegram.ui.oc1;
import org.telegram.ui.pc1;
import org.telegram.ui.qn;
public final class v3 extends org.telegram.ui.Components.i9 {
    public final int H;
    public final Object I;

    public v3(int i7, Context context, Object obj) {
        super(context);
        this.H = i7;
        this.I = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 1:
                return new u2(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.H) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.p8) this.I).invalidate();
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
                if (this.f35499a.R0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((x3) this.I).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.I;
                v3 v3Var = g7Var.f30324b;
                float f10 = 1.0f;
                if (v3Var.getImageReceiver().I()) {
                    f10 = 1.0f - v3Var.getImageReceiver().f22278i1;
                }
                g7Var.d.setAlpha(f10);
                g7Var.f30323a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 3:
                pa paVar = (pa) this.I;
                org.telegram.ui.Cells.j6 j6Var = paVar.U;
                if (paVar.G) {
                    j6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    l7.h(paVar.V, canvas, this.f35499a, j6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                sa saVar = (sa) this.I;
                Object obj = saVar.h;
                if (!(obj instanceof oc1) && !(obj instanceof pc1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, saVar.f31441s.f31696n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), saVar.f31441s.f31696n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), saVar.f31441s.f31696n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, saVar.f31441s.f31696n);
                }
                if (saVar.f31437e) {
                    saVar.f31441s.f31697r.setColor(org.telegram.ui.ActionBar.j6.f28825c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), saVar.f31441s.f31697r);
                    Drawable drawable = saVar.f31441s.f31699w;
                    drawable.setBounds(org.telegram.ui.Cells.y0.A(2, measuredWidth, drawable), org.telegram.ui.Cells.y0.y(2, measuredHeight, saVar.f31441s.f31699w), org.telegram.ui.Cells.y0.w(2, measuredWidth, saVar.f31441s.f31699w), org.telegram.ui.Cells.y0.h(2, measuredHeight, saVar.f31441s.f31699w));
                    saVar.f31441s.f31699w.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.v0) this.I).f52843w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t6 = this.f35499a.t();
                if (t6 != null) {
                    this.f35499a.y0(0.0f, 0.0f, getWidth(), (getWidth() / t6.getIntrinsicWidth()) * t6.getIntrinsicHeight());
                    this.f35499a.h(canvas, null);
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
                if (drawable != ((kg.a1) this.I).f17865n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public v3(org.telegram.ui.web.v0 v0Var, Context context) {
        super(context);
        this.H = 11;
        this.I = v0Var;
        this.f35499a = new u2(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 5:
                hi.n5 n5Var = ((ad) this.I).h;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                hi.n5 n5Var2 = ((qn) this.I).f50669f;
                if (n5Var2 != null) {
                    n5Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.p8) this.I).invalidate();
                return;
            case 8:
                if (ch.f0.b(this)) {
                    return;
                }
                super.invalidate();
                ((cv) this.I).f();
                return;
            case 9:
                hi.n5 n5Var3 = ((c50) this.I).f46009e;
                if (n5Var3 != null) {
                    n5Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                hi.n5 n5Var4 = ((oc0) this.I).h;
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
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.H) {
            case 5:
                hi.n5 n5Var = ((ad) this.I).h;
                if (n5Var != null) {
                    n5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 6:
                hi.n5 n5Var2 = ((qn) this.I).f50669f;
                if (n5Var2 != null) {
                    n5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.p8) this.I).invalidate();
                return;
            case 8:
                if (ch.f0.b(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 9:
                hi.n5 n5Var3 = ((c50) this.I).f46009e;
                if (n5Var3 != null) {
                    n5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 10:
                hi.n5 n5Var4 = ((oc0) this.I).h;
                if (n5Var4 != null) {
                    n5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
