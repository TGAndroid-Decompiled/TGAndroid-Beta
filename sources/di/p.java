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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.sv;
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.m5 D;
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
    public final o7 O;
    public float P;
    public float Q;
    public dh0 R;
    public g S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f9476a;
    public final org.telegram.ui.Components.v5 f9477a0;
    public int f9478b;
    public final sv f9479b0;
    public boolean f9480c;
    public boolean d;
    public p7 f9481e;
    public TLRPC.User f9482f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.v8 f9483n;
    public final ImageReceiver f9484r;
    public final ImageReceiver f9485s;
    public final org.telegram.ui.Components.v8 f9486w;
    public boolean f9487x;
    public final FrameLayout f9488y;

    public p(sv svVar, Context context) {
        super(context);
        boolean z9;
        this.f9479b0 = svVar;
        this.f9483n = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f9484r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f9485s = imageReceiver2;
        this.f9486w = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f9487x = true;
        o7 o7Var = new o7(null, true);
        this.O = o7Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f9477a0 = new org.telegram.ui.Components.v5(this, 0L, 350L, wq.h);
        if (svVar.f9533b == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        o7Var.f9458o = z9;
        o7Var.D = true;
        imageReceiver.J0 = true;
        imageReceiver.f21241z1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f9488y = frameLayout;
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
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
        this.D = m5Var;
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        this.D.setGravity(17);
        this.D.setTextSize(11);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.D;
        textColor = this.f9479b0.getTextColor();
        m5Var2.setTextColor(textColor);
        qs.i(this.D);
        this.D.setMaxLines(1);
        this.f9488y.addView(this.D, ha.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f9484r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f9485s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i7;
        sv svVar = this.f9479b0;
        int i10 = svVar.f9533b;
        Paint paint = svVar.G;
        z6 z6Var = svVar.f9555s;
        Paint paint2 = svVar.H;
        Drawable drawable = svVar.f9535c;
        if (this.F && !z6Var.K(this.E) && Utilities.x(z6Var.F(this.E))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(f12, svVar.f(org.telegram.ui.ActionBar.m6.Vl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.m6.r1(f12, svVar.f(org.telegram.ui.ActionBar.m6.f28170s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.m6.r1(f12, svVar.f(org.telegram.ui.ActionBar.m6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i7 = org.telegram.ui.ActionBar.m6.f28170s8;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.M8;
            }
            int f13 = svVar.f(i7);
            if (f13 != svVar.f9538e) {
                svVar.f9538e = f13;
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
        sv svVar = this.f9479b0;
        if (i11 != 0 || this.K != f11 || 0.0f != f12 || this.V != z9) {
            this.V = z9;
            this.J = f10;
            this.K = f11;
            invalidate();
            svVar.h.invalidate();
        }
        if (this.N) {
            i7 = 0.0f;
        } else {
            i7 = 1.0f - Utilities.i(svVar.N / svVar.B0, 1.0f, 0.0f);
        }
        this.Q = i7;
        float f13 = i7 * this.P;
        FrameLayout frameLayout = this.f9488y;
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
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L) / 2.0f, this.f9479b0.f9536c0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f9476a && getParent() != null)) {
            ViewParent parent = getParent();
            sv svVar = this.f9479b0;
            i iVar = svVar.f9553r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                svVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9484r.P();
        this.f9485s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9484r.R();
        this.f9485s.R();
        this.O.g();
        p7 p7Var = this.f9481e;
        if (p7Var != null) {
            p7Var.a();
            this.f9481e = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.N) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f9479b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z9;
        TLRPC.User user;
        int i7 = this.f9479b0.f9540f;
        if (this.I != j3) {
            this.I = j3;
            if (j3 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.H = z9;
            ImageReceiver imageReceiver = this.f9485s;
            if (z9) {
                if (j3 > 0) {
                    TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
                    this.f9482f = a22;
                    this.h = null;
                    user = a22;
                } else {
                    TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
                    this.h = M0;
                    this.f9482f = null;
                    user = M0;
                }
                if (user != null) {
                    org.telegram.ui.Components.v8 v8Var = this.f9486w;
                    v8Var.p(user);
                    imageReceiver.i0(user, v8Var, null);
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
        o7 o7Var = this.O;
        if (z9 && o7Var.H == null) {
            o7Var.H = new hc(this, 1.5f, 5.0f);
        }
        hc hcVar = o7Var.H;
        if (hcVar != null) {
            hcVar.c(z9);
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.N || (this.f9476a && getParent() != null)) {
            ViewParent parent = getParent();
            sv svVar = this.f9479b0;
            i iVar = svVar.f9553r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            svVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
