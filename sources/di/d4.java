package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.xu;
import org.telegram.ui.bd;
import org.telegram.ui.f50;
import org.telegram.ui.rc0;
import org.telegram.ui.rn;
import org.telegram.ui.sc1;
import org.telegram.ui.tc1;
public final class d4 extends org.telegram.ui.Components.l9 {
    public final int G;
    public final Object H;

    public d4(int i7, Context context, Object obj) {
        super(context);
        this.G = i7;
        this.H = obj;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 1:
                return new z2(this, this, 1);
            default:
                return super.c();
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 7:
                super.invalidate(rect);
                ((org.telegram.ui.Components.s8) this.H).invalidate();
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
            case 0:
                if (this.f35647a.Q0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((f4) this.H).b(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 2:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.H;
                d4 d4Var = h7Var.f29289b;
                float f10 = 1.0f;
                if (d4Var.getImageReceiver().I()) {
                    f10 = 1.0f - d4Var.getImageReceiver().f21197h1;
                }
                h7Var.d.setAlpha(f10);
                h7Var.f29288a.setAlpha(f10);
                super.onDraw(canvas);
                return;
            case 3:
                pa paVar = (pa) this.H;
                org.telegram.ui.Cells.k6 k6Var = paVar.T;
                if (paVar.F) {
                    k6Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    s7.h(paVar.U, canvas, this.f35647a, k6Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                ta taVar = (ta) this.H;
                Object obj = taVar.h;
                if (!(obj instanceof sc1) && !(obj instanceof tc1)) {
                    canvas2 = canvas;
                } else {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, taVar.f30555s.f30602n);
                    canvas2 = canvas;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), taVar.f30555s.f30602n);
                    canvas2.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), taVar.f30555s.f30602n);
                    canvas2.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, taVar.f30555s.f30602n);
                }
                if (taVar.f30551e) {
                    taVar.f30555s.f30603r.setColor(org.telegram.ui.ActionBar.l6.f27841c0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas2.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(20.0f), taVar.f30555s.f30603r);
                    Drawable drawable = taVar.f30555s.f30605w;
                    drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, taVar.f30555s.f30605w), org.telegram.ui.Cells.f1.w(2, measuredWidth, taVar.f30555s.f30605w), org.telegram.ui.Cells.f1.f(2, measuredHeight, taVar.f30555s.f30605w));
                    taVar.f30555s.f30605w.draw(canvas2);
                    return;
                }
                return;
            case 11:
                if (((org.telegram.ui.web.x0) this.H).f51370w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t6 = this.f35647a.t();
                if (t6 != null) {
                    this.f35647a.y0(0.0f, 0.0f, getWidth(), (getWidth() / t6.getIntrinsicWidth()) * t6.getIntrinsicHeight());
                    this.f35647a.h(canvas, null);
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
        switch (this.G) {
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
        switch (this.G) {
            case 3:
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
            case 1:
                if (drawable != ((kg.a1) this.H).f17306n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d4(org.telegram.ui.web.x0 x0Var, Context context) {
        super(context);
        this.G = 11;
        this.H = x0Var;
        this.f35647a = new z2(this, this, 7);
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 5:
                fi.p5 p5Var = ((bd) this.H).h;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                super.invalidate();
                return;
            case 6:
                fi.p5 p5Var2 = ((rn) this.H).f49518f;
                if (p5Var2 != null) {
                    p5Var2.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                super.invalidate();
                ((org.telegram.ui.Components.s8) this.H).invalidate();
                return;
            case 8:
                if (ch.e0.b(this)) {
                    return;
                }
                super.invalidate();
                ((xu) this.H).f();
                return;
            case 9:
                fi.p5 p5Var3 = ((f50) this.H).f45587e;
                if (p5Var3 != null) {
                    p5Var3.invalidate();
                }
                super.invalidate();
                return;
            case 10:
                fi.p5 p5Var4 = ((rc0) this.H).h;
                if (p5Var4 != null) {
                    p5Var4.invalidate();
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
        switch (this.G) {
            case 5:
                fi.p5 p5Var = ((bd) this.H).h;
                if (p5Var != null) {
                    p5Var.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 6:
                fi.p5 p5Var2 = ((rn) this.H).f49518f;
                if (p5Var2 != null) {
                    p5Var2.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 7:
                super.invalidate(i7, i10, i11, i12);
                ((org.telegram.ui.Components.s8) this.H).invalidate();
                return;
            case 8:
                if (ch.e0.b(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 9:
                fi.p5 p5Var3 = ((f50) this.H).f45587e;
                if (p5Var3 != null) {
                    p5Var3.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 10:
                fi.p5 p5Var4 = ((rc0) this.H).h;
                if (p5Var4 != null) {
                    p5Var4.invalidate();
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }
}
