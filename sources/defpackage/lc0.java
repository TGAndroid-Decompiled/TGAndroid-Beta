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
public abstract class lc0 extends FrameLayout {
    public float E;
    public float F;
    public final mc0 G;
    public long a;
    public TLRPC.Document b;
    public final kc0 c;
    public final j15 d;
    public final j15 e;
    public float f;
    public hc0 h;
    public boolean n;
    public final PorterDuffColorFilter r;
    public final ln s;
    public boolean w;
    public float x;
    public float y;

    public lc0(mc0 mc0Var, Activity activity) {
        super(activity);
        this.G = mc0Var;
        this.d = new j15();
        this.e = new j15();
        this.f = 1.0f;
        this.r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.s = new ln(200L, this, d53.g);
        this.x = -1.0f;
        kc0 kc0Var = new kc0((byte) 0, activity, this);
        this.c = kc0Var;
        kc0Var.getImageReceiver().N(1);
        kc0Var.getImageReceiver().S0 = true;
        setClipChildren(false);
        addView(kc0Var, qoe.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = this.s.c;
        if (f5 == 0.0f) {
            canvas.drawCircle(f, f2, f4, paint);
            return;
        }
        float R1 = gm.R1(f3, 0.0f, f5);
        RectF rectF = gm.P;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawRoundRect(rectF, R1, R1, paint);
    }

    public final void b(hc0 hc0Var, boolean z) {
        hc0 hc0Var2 = this.h;
        if (hc0Var2 != null) {
            this.e.d(hc0Var2.c, hc0Var2.d, hc0Var2.e, hc0Var2.f);
            this.f = 0.0f;
            this.G.n = true;
        }
        this.h = hc0Var;
        this.n = z;
        nm7.e().k(nm7.v4, new Object[0]);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f;
        int i;
        lc0 lc0Var;
        Canvas canvas2;
        int L2;
        this.E = getMeasuredWidth() / 2.0f;
        this.F = getMeasuredHeight() / 2.0f;
        mc0 mc0Var = this.G;
        if (mc0Var.V) {
            L = getMeasuredWidth() * 0.3f;
        } else {
            L = gm.L(50.0f);
        }
        float f2 = L;
        if (this.w) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ln lnVar = this.s;
        lnVar.e(false, f);
        float f3 = this.x;
        if (f3 >= 0.0f) {
            lnVar.e(true, f3);
        }
        float R1 = gm.R1(f2, getMeasuredWidth() / 2.0f, lnVar.c);
        this.y = R1;
        this.y = gm.R1(R1, gm.L(21.0f), mc0Var.O);
        this.E = gm.R1(this.E, (getMeasuredWidth() - gm.L(12.0f)) - gm.L(21.0f), mc0Var.O);
        canvas.save();
        canvas.clipRect(0.0f, (-i) / 2.0f, getMeasuredWidth(), (((mc0Var.d - mc0Var.c) / 2.0f) * mc0Var.F) + getMeasuredHeight());
        hc0 hc0Var = this.h;
        if (hc0Var != null) {
            int i2 = hc0Var.c;
            int i3 = hc0Var.d;
            int i4 = hc0Var.e;
            int i5 = hc0Var.f;
            j15 j15Var = this.d;
            j15Var.d(i2, i3, i4, i5);
            Paint paint = j15Var.c;
            float f4 = this.E;
            float f5 = this.y;
            float f6 = this.F;
            j15Var.b(f4 - f5, f6 - f5, f4 + f5, f6 + f5);
            if (this.f != 1.0f) {
                float f7 = this.E;
                float f8 = this.y;
                float f9 = f7 - f8;
                float f10 = this.F;
                float f11 = f10 - f8;
                float f12 = f7 + f8;
                float f13 = f10 + f8;
                j15 j15Var2 = this.e;
                j15Var2.b(f9, f11, f12, f13);
                Paint paint2 = j15Var2.c;
                paint2.setAlpha(255);
                lc0Var = this;
                lc0Var.a(canvas, this.E, this.F, f2, this.y, paint2);
                paint.setAlpha((int) (lc0Var.f * 255.0f));
                lc0Var.a(canvas, lc0Var.E, lc0Var.F, f2, lc0Var.y, paint);
                float f14 = lc0Var.f + 0.064f;
                lc0Var.f = f14;
                if (f14 > 1.0f) {
                    lc0Var.f = 1.0f;
                }
                lc0Var.invalidate();
                canvas2 = canvas;
            } else {
                lc0Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                lc0Var.a(canvas2, lc0Var.E, lc0Var.F, f2, lc0Var.y, paint);
            }
        } else {
            lc0Var = this;
            canvas2 = canvas;
        }
        if (mc0Var.V) {
            L2 = (int) (f2 * 2.0f * 0.7f);
        } else {
            L2 = gm.L(70.0f);
        }
        float R12 = gm.R1(gm.U1(lnVar.c, L2, (int) (lc0Var.getMeasuredWidth() * 0.7f)), (int) (gm.L(42.0f) * 0.7f), mc0Var.O) / 2.0f;
        kc0 kc0Var = lc0Var.c;
        vm vmVar = kc0Var.e;
        if (vmVar != null) {
            mm mmVar = vmVar.k;
            if (mmVar != null) {
                mmVar.q0((int) (2.0f * R12 * 0.13f));
            }
            vm vmVar2 = kc0Var.e;
            float f15 = lc0Var.E;
            float f16 = lc0Var.F;
            vmVar2.setBounds((int) (f15 - R12), (int) (f16 - R12), (int) (f15 + R12), (int) (f16 + R12));
            kc0Var.e.setColorFilter(lc0Var.r);
            kc0Var.e.draw(canvas2);
            return;
        }
        ImageReceiver imageReceiver = kc0Var.a;
        float f17 = lc0Var.E - R12;
        float f18 = lc0Var.F - R12;
        float f19 = R12 * 2.0f;
        imageReceiver.i0(f17, f18, f19, f19);
        kc0Var.a.q0((int) (f19 * 0.13f));
        kc0Var.a.h(canvas2, null);
    }

    public long getDuration() {
        kc0 kc0Var = this.c;
        ImageReceiver imageReceiver = kc0Var.getImageReceiver();
        vm vmVar = kc0Var.e;
        if (vmVar != null) {
            imageReceiver = vmVar.k;
        }
        if (imageReceiver != null && imageReceiver.y() != null) {
            return imageReceiver.y().m();
        }
        return 5000L;
    }

    public ImageReceiver getImageReceiver() {
        kc0 kc0Var = this.c;
        ImageReceiver imageReceiver = kc0Var.getImageReceiver();
        vm vmVar = kc0Var.e;
        if (vmVar != null) {
            mm mmVar = vmVar.k;
            vmVar.setColorFilter(this.r);
            return mmVar;
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
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z) {
        mm mmVar;
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (z) {
            kc0 kc0Var = this.c;
            vm vmVar = kc0Var.e;
            if (vmVar != null && (mmVar = vmVar.k) != null) {
                mmVar.w0(false);
            }
            kc0Var.a.w0(false);
        }
        nm7.e().k(nm7.v4, new Object[0]);
        invalidate();
    }
}
