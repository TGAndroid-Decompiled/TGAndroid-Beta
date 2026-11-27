package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public abstract class nb0 extends FrameLayout {
    public float E;
    public float F;
    public final ob0 G;
    public long a;
    public TLRPC.Document b;
    public final mb0 c;
    public final o15 d;
    public final o15 e;
    public float f;
    public jb0 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final mm s;
    public boolean w;
    public float x;
    public float y;

    public nb0(ob0 ob0Var, Activity activity) {
        super(activity);
        this.G = ob0Var;
        this.d = new o15();
        this.e = new o15();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new mm(200L, this, k43.g);
        this.x = -1.0f;
        mb0 mb0Var = new mb0((byte) 0, activity, this);
        this.c = mb0Var;
        mb0Var.getImageReceiver().N(1);
        mb0Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(mb0Var, tre.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = this.s.c;
        if (f5 == 0.0f) {
            canvas.drawCircle(f, f2, f4, paint);
            return;
        }
        float R1 = hl.R1(f3, 0.0f, f5);
        RectF rectF = hl.P;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawRoundRect(rectF, R1, R1, paint);
    }

    public final void b(jb0 jb0Var, boolean z) {
        jb0 jb0Var2 = this.h;
        if (jb0Var2 != null) {
            this.e.d(jb0Var2.c, jb0Var2.d, jb0Var2.e, jb0Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = jb0Var;
        this.n = z;
        jn7.e().k(jn7.u4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f;
        int i;
        nb0 nb0Var;
        Canvas canvas2;
        int L2;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        ob0 ob0Var = this.G;
        if (ob0Var.V) {
            L = getMeasuredWidth() * 0.3f;
        } else {
            L = hl.L(50.0f);
        }
        float f2 = L;
        if (this.w) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        mm mmVar = this.s;
        mmVar.e(false, f);
        float f3 = this.x;
        if (f3 >= 0.0f) {
            mmVar.e(true, f3);
        }
        float R1 = hl.R1(f2, getMeasuredWidth() / 2.0f, mmVar.c);
        this.y = R1;
        this.y = hl.R1(R1, hl.L(21.0f), ob0Var.O);
        this.E = hl.R1(this.E, (getMeasuredWidth() - hl.L(12.0f)) - hl.L(21.0f), ob0Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-i) / 2.0f, getMeasuredWidth(), (((ob0Var.d - ob0Var.c) / 2.0f) * ob0Var.F) + getMeasuredHeight());
        jb0 jb0Var = this.h;
        if (jb0Var != null) {
            int i2 = jb0Var.c;
            int i3 = jb0Var.d;
            int i4 = jb0Var.e;
            int i5 = jb0Var.f;
            o15 o15Var = this.d;
            o15Var.d(i2, i3, i4, i5);
            Paint paint = o15Var.c;
            float f4 = this.E;
            float f5 = this.y;
            float f6 = this.F;
            o15Var.b(f4 - f5, f6 - f5, f4 + f5, f6 + f5);
            if (this.f != 1.0f) {
                float f7 = this.E;
                float f8 = this.y;
                float f9 = f7 - f8;
                float f10 = this.F;
                float f11 = f10 - f8;
                float f12 = f7 + f8;
                float f13 = f10 + f8;
                o15 o15Var2 = this.e;
                o15Var2.b(f9, f11, f12, f13);
                Paint paint2 = o15Var2.c;
                paint2.setAlpha(255);
                nb0Var = this;
                nb0Var.a(canvas, this.E, this.F, f2, this.y, paint2);
                paint.setAlpha((int) (nb0Var.f * 255.0f));
                nb0Var.a(canvas, nb0Var.E, nb0Var.F, f2, nb0Var.y, paint);
                float f14 = nb0Var.f + 0.064f;
                nb0Var.f = f14;
                if (f14 > 1.0f) {
                    nb0Var.f = 1.0f;
                }
                nb0Var.invalidate();
                canvas2 = canvas;
            } else {
                nb0Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                nb0Var.a(canvas2, nb0Var.E, nb0Var.F, f2, nb0Var.y, paint);
            }
        } else {
            nb0Var = this;
            canvas2 = canvas;
        }
        if (ob0Var.V) {
            L2 = (int) (f2 * 2.0f * 0.7f);
        } else {
            L2 = hl.L(70.0f);
        }
        float R12 = hl.R1(hl.U1(mmVar.c, L2, (int) (nb0Var.getMeasuredWidth() * 0.7f)), (int) (hl.L(42.0f) * 0.7f), ob0Var.O) / 2.0f;
        mb0 mb0Var = nb0Var.c;
        wl wlVar = mb0Var.e;
        if (wlVar != null) {
            nl nlVar = wlVar.k;
            if (nlVar != null) {
                nlVar.q0((int) (2.0f * R12 * 0.13f));
            }
            wl wlVar2 = mb0Var.e;
            float f15 = nb0Var.E;
            float f16 = nb0Var.F;
            wlVar2.setBounds((int) (f15 - R12), (int) (f16 - R12), (int) (f15 + R12), (int) (f16 + R12));
            mb0Var.e.setColorFilter(nb0Var.r);
            mb0Var.e.draw(canvas2);
            return;
        }
        ImageReceiver imageReceiver = mb0Var.a;
        float f17 = nb0Var.E - R12;
        float f18 = nb0Var.F - R12;
        float f19 = R12 * 2.0f;
        imageReceiver.i0(f17, f18, f19, f19);
        mb0Var.a.q0((int) (f19 * 0.13f));
        mb0Var.a.h(canvas2, null);
    }

    public long getDuration() {
        mb0 mb0Var = this.c;
        ImageReceiver imageReceiver = mb0Var.getImageReceiver();
        wl wlVar = mb0Var.e;
        if (wlVar != null) {
            imageReceiver = wlVar.k;
        }
        if (imageReceiver != null && imageReceiver.y() != null) {
            return imageReceiver.y().m();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        mb0 mb0Var = this.c;
        ImageReceiver imageReceiver = mb0Var.getImageReceiver();
        wl wlVar = mb0Var.e;
        if (wlVar != null) {
            nl nlVar = wlVar.k;
            wlVar.setColorFilter(this.r);
            return nlVar;
        }
        return imageReceiver;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.G.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.G.V) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z) {
        nl nlVar;
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (z) {
            mb0 mb0Var = this.c;
            wl wlVar = mb0Var.e;
            if (wlVar != null && (nlVar = wlVar.k) != null) {
                nlVar.w0(false);
            }
            mb0Var.a.w0(false);
        }
        jn7.e().k(jn7.u4, new Object[0]);
        invalidate();
    }
}
