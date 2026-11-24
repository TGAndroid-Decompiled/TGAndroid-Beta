package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class kc0 extends bf0 {
    public final byte H;
    public final Object I;

    public kc0(qw0 qw0Var, Context context) {
        super(context);
        this.H = (byte) 1;
        this.I = qw0Var;
        this.a = new mm(this, this, (byte) 1);
    }

    @Override
    public final ImageReceiver c() {
        switch (this.H) {
            case 6:
                return new mm(this, this, (byte) 4);
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
                ((lc0) obj).invalidate();
                return;
            case 1:
            case 6:
            default:
                super.invalidate();
                return;
            case 2:
                a91 a91Var = ((fj1) obj).h;
                if (a91Var != null) {
                    a91Var.invalidate();
                }
                super.invalidate();
                return;
            case 3:
                a91 a91Var2 = ((ba2) obj).f;
                if (a91Var2 != null) {
                    a91Var2.invalidate();
                }
                super.invalidate();
                return;
            case 4:
                if (!oi5.b(this)) {
                    super.invalidate();
                    ((jz3) obj).f();
                    return;
                }
                return;
            case 5:
                a91 a91Var3 = ((uc5) obj).e;
                if (a91Var3 != null) {
                    a91Var3.invalidate();
                }
                super.invalidate();
                return;
            case 7:
                a91 a91Var4 = ((zf6) obj).h;
                if (a91Var4 != null) {
                    a91Var4.invalidate();
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
                if (((qw0) obj).w) {
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
                    RectF rectF = gm.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((x48) obj).a(1.0f, canvas, rectF, true);
                }
                super.onDraw(canvas);
                return;
            case 9:
                ida idaVar = (ida) obj;
                kc0 kc0Var = idaVar.b;
                if (kc0Var.getImageReceiver().B()) {
                    f = 1.0f - kc0Var.getImageReceiver().i1;
                }
                idaVar.d.setAlpha(f);
                idaVar.a.setAlpha(f);
                super.onDraw(canvas);
                return;
            case 10:
                w8c w8cVar = (w8c) obj;
                u82 u82Var = w8cVar.U;
                if (w8cVar.G) {
                    u82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    y4b.h(w8cVar.V, canvas, this.a, u82Var);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 11:
                super.onDraw(canvas);
                rsc rscVar = (rsc) obj;
                ssc sscVar = rscVar.s;
                Object obj2 = rscVar.h;
                if ((obj2 instanceof mtc) || (obj2 instanceof ntc)) {
                    canvas.drawLine(1.0f, 0.0f, getMeasuredWidth() - 1, 0.0f, sscVar.n);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getMeasuredHeight(), sscVar.n);
                    canvas.drawLine(getMeasuredWidth() - 1, 0.0f, getMeasuredWidth() - 1, getMeasuredHeight(), sscVar.n);
                    canvas.drawLine(1.0f, getMeasuredHeight() - 1, getMeasuredWidth() - 1, getMeasuredHeight() - 1, sscVar.n);
                }
                if (rscVar.e) {
                    sscVar.r.setColor(cmb.b0);
                    int measuredWidth = getMeasuredWidth() / 2;
                    int measuredHeight = getMeasuredHeight() / 2;
                    canvas.drawCircle(measuredWidth, measuredHeight, gm.L(20.0f), sscVar.r);
                    Drawable drawable = sscVar.w;
                    drawable.setBounds(aq1.A(2, measuredWidth, drawable), aq1.y(2, measuredHeight, sscVar.w), aq1.w(2, measuredWidth, sscVar.w), aq1.i(2, measuredHeight, sscVar.w));
                    sscVar.w.draw(canvas);
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
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(240.0f), 1073741824));
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
                if (((w8c) this.I).U.a(this, motionEvent)) {
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
                if (drawable != ((oc6) this.I).n && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public kc0(byte b, Context context, Object obj) {
        super(context);
        this.H = b;
        this.I = obj;
    }

    @Override
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                super.invalidate(rect);
                ((lc0) this.I).invalidate();
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
                ((lc0) obj).invalidate();
                return;
            case 1:
            case 6:
            default:
                super.invalidate(i, i2, i3, i4);
                return;
            case 2:
                a91 a91Var = ((fj1) obj).h;
                if (a91Var != null) {
                    a91Var.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 3:
                a91 a91Var2 = ((ba2) obj).f;
                if (a91Var2 != null) {
                    a91Var2.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 4:
                if (oi5.b(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 5:
                a91 a91Var3 = ((uc5) obj).e;
                if (a91Var3 != null) {
                    a91Var3.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 7:
                a91 a91Var4 = ((zf6) obj).h;
                if (a91Var4 != null) {
                    a91Var4.invalidate();
                }
                super.invalidate(i, i2, i3, i4);
                return;
        }
    }
}
