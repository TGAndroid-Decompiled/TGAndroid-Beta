package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
import org.telegram.ui.pv;
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final n7 O;
    public float P;
    public float Q;
    public dh0 R;
    public g S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f9482a;
    public final org.telegram.ui.Components.w5 f9483a0;
    public int f9484b;
    public final pv f9485b0;
    public boolean f9486c;
    public boolean d;
    public o7 f9487e;
    public TLRPC.User f9488f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.w8 f9489n;
    public final ImageReceiver f9490r;
    public final ImageReceiver f9491s;
    public final org.telegram.ui.Components.w8 f9492w;
    public boolean f9493x;
    public final FrameLayout f9494y;

    public p(pv pvVar, Context context) {
        super(context);
        boolean z9;
        this.f9485b0 = pvVar;
        this.f9489n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f9490r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f9491s = imageReceiver2;
        this.f9492w = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f9493x = true;
        n7 n7Var = new n7(null, true);
        this.O = n7Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f9483a0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        if (pvVar.f9587b == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        n7Var.f9420o = z9;
        n7Var.D = true;
        imageReceiver.J0 = true;
        imageReceiver.f21233z1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9494y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, ha.c(-2.0f, -1));
        imageReceiver.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        imageReceiver2.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public void setClipInParent(boolean z9) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z9);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z9);
        }
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.D = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        this.D.setGravity(17);
        this.D.setTextSize(11);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.D;
        textColor = this.f9485b0.getTextColor();
        k5Var2.setTextColor(textColor);
        qs.i(this.D);
        this.D.setMaxLines(1);
        this.f9494y.addView(this.D, ha.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f9490r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f9491s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i7;
        pv pvVar = this.f9485b0;
        int i10 = pvVar.f9587b;
        Paint paint = pvVar.G;
        y6 y6Var = pvVar.f9609s;
        Paint paint2 = pvVar.H;
        Drawable drawable = pvVar.f9589c;
        if (this.F && !y6Var.K(this.E) && Utilities.x(y6Var.F(this.E))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(f12, pvVar.f(org.telegram.ui.ActionBar.k6.Vl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, pvVar.f(org.telegram.ui.ActionBar.k6.f28129s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, pvVar.f(org.telegram.ui.ActionBar.k6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i7 = org.telegram.ui.ActionBar.k6.f28129s8;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.M8;
            }
            int f13 = pvVar.f(i7);
            if (f13 != pvVar.f9592e) {
                pvVar.f9592e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z9) {
        float i7;
        int i10;
        int i11 = (this.J > f10 ? 1 : (this.J == f10 ? 0 : -1));
        pv pvVar = this.f9485b0;
        if (i11 != 0 || this.K != f11 || 0.0f != f12 || this.V != z9) {
            this.V = z9;
            this.J = f10;
            this.K = f11;
            invalidate();
            pvVar.h.invalidate();
        }
        if (this.N) {
            i7 = 0.0f;
        } else {
            i7 = 1.0f - Utilities.i(pvVar.N / pvVar.B0, 1.0f, 0.0f);
        }
        this.Q = i7;
        float f13 = i7 * this.P;
        FrameLayout frameLayout = this.f9494y;
        frameLayout.setAlpha(f13);
        if (f13 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        frameLayout.setVisibility(i10);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: di.p.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = org.telegram.messenger.g0.L(26.33f);
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) / 2.0f, this.f9485b0.f9590c0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f9482a && getParent() != null)) {
            ViewParent parent = getParent();
            pv pvVar = this.f9485b0;
            i iVar = pvVar.f9607r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                pvVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9490r.P();
        this.f9491s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9490r.R();
        this.f9491s.R();
        this.O.g();
        o7 o7Var = this.f9487e;
        if (o7Var != null) {
            o7Var.a();
            this.f9487e = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.N) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f9485b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z9;
        TLRPC.User user;
        int i7 = this.f9485b0.f9594f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.H = z9;
            ImageReceiver imageReceiver = this.f9491s;
            if (z9) {
                if (j3 > 0) {
                    TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
                    this.f9488f = a22;
                    this.h = null;
                    user = a22;
                } else {
                    TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                    this.h = M0;
                    this.f9488f = null;
                    user = M0;
                }
                if (user != null) {
                    org.telegram.ui.Components.w8 w8Var = this.f9492w;
                    w8Var.p(user);
                    imageReceiver.i0(user, w8Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.p.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        n7 n7Var = this.O;
        if (z9 && n7Var.H == null) {
            n7Var.H = new ic(this, 1.5f, 5.0f);
        }
        ic icVar = n7Var.H;
        if (icVar != null) {
            icVar.c(z9);
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.N || (this.f9482a && getParent() != null)) {
            ViewParent parent = getParent();
            pv pvVar = this.f9485b0;
            i iVar = pvVar.f9607r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            pvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
