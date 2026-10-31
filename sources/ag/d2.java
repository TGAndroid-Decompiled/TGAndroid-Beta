package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.n8;
import org.telegram.ui.c60;
import org.telegram.ui.kd;
import org.telegram.ui.me1;
import org.telegram.ui.ne1;
import org.telegram.ui.oo;
import org.telegram.ui.wd0;
import th.w5;
public final class d2 extends g9 {
    public final int G;
    public final Object H;

    public d2(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new c2(0, this, this);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 6:
                super.invalidate(rect);
                ((n8) this.H).invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.G) {
            case 1:
                l7 l7Var = (l7) this.H;
                d2 d2Var = l7Var.f22248b;
                float f7 = 1.0f;
                if (d2Var.getImageReceiver().I()) {
                    f7 = 1.0f - d2Var.getImageReceiver().f14384h1;
                }
                l7Var.d.setAlpha(f7);
                l7Var.f22247a.setAlpha(f7);
                super.onDraw(canvas);
                return;
            case 2:
                pa paVar = (pa) this.H;
                o6 o6Var = paVar.T;
                if (paVar.F) {
                    o6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    w5.h(paVar.U, canvas, this.f26292a, o6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                ta taVar = (ta) this.H;
                Object obj = taVar.h;
                if (!(obj instanceof me1) && !(obj instanceof ne1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, taVar.f23116s.f23154n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), taVar.f23116s.f23154n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), taVar.f23116s.f23154n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, taVar.f23116s.f23154n);
                }
                if (taVar.e) {
                    taVar.f23116s.f23155r.setColor(t6.f20904c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(20.0f), taVar.f23116s.f23155r);
                    Drawable drawable = taVar.f23116s.f23157w;
                    drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, taVar.f23116s.f23157w), org.telegram.ui.Cells.f1.w(2, measuredWidth, taVar.f23116s.f23157w), org.telegram.ui.Cells.f1.f(2, measuredHeight, taVar.f23116s.f23157w));
                    taVar.f23116s.f23157w.draw(canvas2);
                    return;
                }
                return;
            case 10:
                if (((org.telegram.ui.web.z0) this.H).f43285w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t10 = this.f26292a.t();
                if (t10 != null) {
                    this.f26292a.y0(0.0f, 0.0f, getWidth(), (getWidth() / t10.getIntrinsicWidth()) * t10.getIntrinsicHeight());
                    this.f26292a.h(canvas, null);
                    return;
                }
                return;
            case 11:
                if (this.f26292a.Q0) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((th.w2) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G) {
            case 2:
                if (((pa) this.H).T.a(this, motionEvent)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.G) {
            case 0:
                if (drawable != ((f2) this.H).f519n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d2(org.telegram.ui.web.z0 z0Var, Context context) {
        super(context);
        this.G = 10;
        this.H = z0Var;
        this.f26292a = new c2(6, this, this);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 4:
                kg.f0 f0Var = ((kd) this.H).h;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                super.invalidate();
                return;
            case 5:
                kg.f0 f0Var2 = ((oo) this.H).f40322f;
                if (f0Var2 != null) {
                    f0Var2.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                super.invalidate();
                ((n8) this.H).invalidate();
                return;
            case 7:
                if (sg.e0.b(this)) {
                    return;
                }
                super.invalidate();
                ((iv) this.H).f();
                return;
            case 8:
                kg.f0 f0Var3 = ((c60) this.H).e;
                if (f0Var3 != null) {
                    f0Var3.invalidate();
                }
                super.invalidate();
                return;
            case 9:
                kg.f0 f0Var4 = ((wd0) this.H).h;
                if (f0Var4 != null) {
                    f0Var4.invalidate();
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.G) {
            case 4:
                kg.f0 f0Var = ((kd) this.H).h;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 5:
                kg.f0 f0Var2 = ((oo) this.H).f40322f;
                if (f0Var2 != null) {
                    f0Var2.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 6:
                super.invalidate(i10, i11, i12, i13);
                ((n8) this.H).invalidate();
                return;
            case 7:
                if (sg.e0.b(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 8:
                kg.f0 f0Var3 = ((c60) this.H).e;
                if (f0Var3 != null) {
                    f0Var3.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 9:
                kg.f0 f0Var4 = ((wd0) this.H).h;
                if (f0Var4 != null) {
                    f0Var4.invalidate();
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
