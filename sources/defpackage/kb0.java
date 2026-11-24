package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class kb0 extends be0 {
    public final byte H;
    public final Object I;

    public kb0(hv0 hv0Var, Context context) {
        super(context);
        this.H = (byte) 1;
        this.I = hv0Var;
        this.a = new ml(this, this, (byte) 1);
    }

    @Override
    public final ImageReceiver c() {
        switch (this.H) {
            case 6:
                return new ml(this, this, (byte) 4);
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
                ((lb0) obj).invalidate();
                return;
            case 1:
            case 6:
            default:
                super.invalidate();
                return;
            case 2:
                s71 s71Var = ((yh1) obj).h;
                if (s71Var != null) {
                    s71Var.invalidate();
                }
                super.invalidate();
                return;
            case 3:
                s71 s71Var2 = ((p82) obj).f;
                if (s71Var2 != null) {
                    s71Var2.invalidate();
                }
                super.invalidate();
                return;
            case 4:
                if (!pg5.b(this)) {
                    super.invalidate();
                    ((zx3) obj).f();
                    return;
                }
                return;
            case 5:
                s71 s71Var3 = ((wa5) obj).e;
                if (s71Var3 != null) {
                    s71Var3.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                s71 s71Var4 = ((ae6) obj).h;
                if (s71Var4 != null) {
                    s71Var4.invalidate();
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
                if (((hv0) obj).w) {
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
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((v28) obj).a(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 9:
                iba ibaVar = (iba) obj;
                kb0 kb0Var = ibaVar.b;
                if (kb0Var.getImageReceiver().B()) {
                    f = 1.0f - kb0Var.getImageReceiver().i1;
                }
                ibaVar.d.setAlpha(f);
                ibaVar.a.setAlpha(f);
                super.onDraw(canvas);
                return;
            case 10:
                v6c v6cVar = (v6c) obj;
                j72 j72Var = v6cVar.U;
                if (v6cVar.G) {
                    j72Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    x2b.h(v6cVar.V, canvas, this.a, j72Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 11:
                super.onDraw(canvas);
                pqc pqcVar = (pqc) obj;
                qqc qqcVar = pqcVar.s;
                Object obj2 = pqcVar.h;
                if ((obj2 instanceof krc) || (obj2 instanceof lrc)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, qqcVar.n);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), qqcVar.n);
                    canvas.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), qqcVar.n);
                    canvas.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, qqcVar.n);
                }
                if (pqcVar.e) {
                    qqcVar.r.setColor(bkb.b0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas.drawCircle(measuredWidth, measuredHeight, gl.L(20.0f), qqcVar.r);
                    Drawable drawable = qqcVar.w;
                    drawable.setBounds(oo1.A(2, measuredWidth, drawable), oo1.y(2, measuredHeight, qqcVar.w), oo1.w(2, measuredWidth, qqcVar.w), oo1.i(2, measuredHeight, qqcVar.w));
                    qqcVar.w.draw(canvas);
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(240.0f), 1073741824));
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
                if (((v6c) this.I).U.a(this, motionEvent)) {
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
                if (drawable != ((pa6) this.I).n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public kb0(byte b, Context context, Object obj) {
        super(context);
        this.H = b;
        this.I = obj;
    }

    @Override
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                super.invalidate(rect);
                ((lb0) this.I).invalidate();
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
                ((lb0) obj).invalidate();
                return;
            case 1:
            case 6:
            default:
                super.invalidate(i, i2, i3, i4);
                return;
            case 2:
                s71 s71Var = ((yh1) obj).h;
                if (s71Var != null) {
                    s71Var.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 3:
                s71 s71Var2 = ((p82) obj).f;
                if (s71Var2 != null) {
                    s71Var2.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 4:
                if (pg5.b(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 5:
                s71 s71Var3 = ((wa5) obj).e;
                if (s71Var3 != null) {
                    s71Var3.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 7:
                s71 s71Var4 = ((ae6) obj).h;
                if (s71Var4 != null) {
                    s71Var4.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
        }
    }
}
