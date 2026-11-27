package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class mb0 extends de0 {
    public final byte H;
    public final Object I;

    public mb0(rv0 rv0Var, Context context) {
        super(context);
        this.H = (byte) 1;
        this.I = rv0Var;
        this.a = new nl(this, this, (byte) 1);
    }

    @Override
    public final ImageReceiver c() {
        switch (this.H) {
            case 6:
                return new nl(this, this, (byte) 4);
            default:
                return super.c();
        }
    }

    @Override
    public final void invalidate() {
        byte b = this.H;
        Object obj = this.I;
        switch (b) {
            case 0:
                super.invalidate();
                ((nb0) obj).invalidate();
                return;
            case 1:
            case 6:
            default:
                super.invalidate();
                return;
            case 2:
                a81 a81Var = ((gi1) obj).h;
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                super.invalidate();
                return;
            case 3:
                a81 a81Var2 = ((g92) obj).f;
                if (a81Var2 != null) {
                    a81Var2.invalidate();
                }
                super.invalidate();
                return;
            case 4:
                if (!ri5.b(this)) {
                    super.invalidate();
                    ((uy3) obj).f();
                    return;
                }
                return;
            case 5:
                a81 a81Var3 = ((xc5) obj).e;
                if (a81Var3 != null) {
                    a81Var3.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                a81 a81Var4 = ((cg6) obj).h;
                if (a81Var4 != null) {
                    a81Var4.invalidate();
                }
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.H;
        float f = 1.0f;
        Object obj = this.I;
        switch (b) {
            case 1:
                if (((rv0) obj).w) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable t = this.a.t();
                if (t != null) {
                    this.a.i0(0.0f, 0.0f, getWidth(), (getWidth() / t.getIntrinsicWidth()) * t.getIntrinsicHeight());
                    this.a.h(canvas, null);
                    return;
                }
                return;
            case 8:
                if (this.a.R0) {
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((l68) obj).a(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 9:
                zea zeaVar = (zea) obj;
                mb0 mb0Var = zeaVar.b;
                if (mb0Var.getImageReceiver().B()) {
                    f = 1.0f - mb0Var.getImageReceiver().i1;
                }
                zeaVar.d.setAlpha(f);
                zeaVar.a.setAlpha(f);
                super.onDraw(canvas);
                return;
            case 10:
                vac vacVar = (vac) obj;
                a82 a82Var = vacVar.U;
                if (vacVar.G) {
                    a82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    t6b.h(vacVar.V, canvas, this.a, a82Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 11:
                super.onDraw(canvas);
                dvc dvcVar = (dvc) obj;
                evc evcVar = dvcVar.s;
                Object obj2 = dvcVar.h;
                if ((obj2 instanceof yvc) || (obj2 instanceof zvc)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, evcVar.n);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), evcVar.n);
                    canvas.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), evcVar.n);
                    canvas.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, evcVar.n);
                }
                if (dvcVar.e) {
                    evcVar.r.setColor(aob.b0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas.drawCircle(measuredWidth, measuredHeight, hl.L(20.0f), evcVar.r);
                    Drawable drawable = evcVar.w;
                    drawable.setBounds(bp1.A(2, measuredWidth, drawable), bp1.y(2, measuredHeight, evcVar.w), bp1.w(2, measuredWidth, evcVar.w), bp1.i(2, measuredHeight, evcVar.w));
                    evcVar.w.draw(canvas);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.H) {
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(240.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H) {
            case 10:
                if (((vac) this.I).U.a(this, motionEvent)) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.H) {
            case 6:
                if (drawable != ((tc6) this.I).n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public mb0(byte b, Context context, Object obj) {
        super(context);
        this.H = b;
        this.I = obj;
    }

    @Override
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                super.invalidate(rect);
                ((nb0) this.I).invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        byte b = this.H;
        Object obj = this.I;
        switch (b) {
            case 0:
                super.invalidate(i, i2, i3, i4);
                ((nb0) obj).invalidate();
                return;
            case 1:
            case 6:
            default:
                super.invalidate(i, i2, i3, i4);
                return;
            case 2:
                a81 a81Var = ((gi1) obj).h;
                if (a81Var != null) {
                    a81Var.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 3:
                a81 a81Var2 = ((g92) obj).f;
                if (a81Var2 != null) {
                    a81Var2.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 4:
                if (ri5.b(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 5:
                a81 a81Var3 = ((xc5) obj).e;
                if (a81Var3 != null) {
                    a81Var3.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 7:
                a81 a81Var4 = ((cg6) obj).h;
                if (a81Var4 != null) {
                    a81Var4.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
        }
    }
}
