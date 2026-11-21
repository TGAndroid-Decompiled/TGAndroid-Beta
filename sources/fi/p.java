package fi;

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
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.tv;
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.m5 E;
    public long F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public float K;
    public float L;
    public float M;
    public float N;
    public boolean O;
    public final e7 P;
    public float Q;
    public float R;
    public sh0 S;
    public g T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean f12394a;
    public boolean f12395a0;
    public int f12396b;
    public final org.telegram.ui.Components.d6 f12397b0;
    public boolean f12398c;
    public final tv f12399c0;
    public boolean d;
    public f7 f12400e;
    public TLRPC.User f12401f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.b9 f12402n;
    public final ImageReceiver f12403r;
    public final ImageReceiver f12404s;
    public final org.telegram.ui.Components.b9 f12405w;
    public boolean f12406x;
    public final FrameLayout f12407y;

    public p(tv tvVar, Context context) {
        super(context);
        boolean z10;
        this.f12399c0 = tvVar;
        this.f12402n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12403r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f12404s = imageReceiver2;
        this.f12405w = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f12406x = true;
        e7 e7Var = new e7(null, true);
        this.P = e7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.f12397b0 = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        if (tvVar.f12451b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e7Var.f11943o = z10;
        e7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12407y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, ma.c(-2.0f, -1));
        imageReceiver.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        imageReceiver2.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
        }
    }

    public final void b() {
        int textColor;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(getContext());
        this.E = m5Var;
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.E;
        textColor = this.f12399c0.getTextColor();
        m5Var2.setTextColor(textColor);
        ks.i(this.E);
        this.E.setMaxLines(1);
        this.f12407y.addView(this.E, ma.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f12403r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f12404s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i7;
        tv tvVar = this.f12399c0;
        int i10 = tvVar.f12451b;
        Paint paint = tvVar.H;
        p6 p6Var = tvVar.f12473s;
        Paint paint2 = tvVar.I;
        Drawable drawable = tvVar.f12453c;
        if (this.G && !p6Var.K(this.F) && Utilities.x(p6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.m6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.m6.Yl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.m6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.m6.f29658s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.m6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.m6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i7 = org.telegram.ui.ActionBar.m6.f29658s8;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.M8;
            }
            int f13 = tvVar.f(i7);
            if (f13 != tvVar.f12456e) {
                tvVar.f12456e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float i7;
        int i10;
        int i11 = (this.K > f10 ? 1 : (this.K == f10 ? 0 : -1));
        tv tvVar = this.f12399c0;
        if (i11 != 0 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            tvVar.h.invalidate();
        }
        if (this.O) {
            i7 = 0.0f;
        } else {
            i7 = 1.0f - Utilities.i(tvVar.O / tvVar.C0, 1.0f, 0.0f);
        }
        this.R = i7;
        float f13 = i7 * this.Q;
        FrameLayout frameLayout = this.f12407y;
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
        throw new UnsupportedOperationException("Method not decompiled: fi.p.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = org.telegram.messenger.g0.L(26.33f);
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) / 2.0f, this.f12399c0.f12455d0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.f12394a && getParent() != null)) {
            ViewParent parent = getParent();
            tv tvVar = this.f12399c0;
            i iVar = tvVar.f12471r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                tvVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12403r.P();
        this.f12404s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12403r.R();
        this.f12404s.R();
        this.P.g();
        f7 f7Var = this.f12400e;
        if (f7Var != null) {
            f7Var.a();
            this.f12400e = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.O) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f12399c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i7 = this.f12399c0.f12458f;
        if (this.J != j3) {
            this.J = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            ImageReceiver imageReceiver = this.f12404s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
                    this.f12401f = c22;
                    this.h = null;
                    user = c22;
                } else {
                    TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                    this.h = O0;
                    this.f12401f = null;
                    user = O0;
                }
                if (user != null) {
                    org.telegram.ui.Components.b9 b9Var = this.f12405w;
                    b9Var.p(user);
                    imageReceiver.i0(user, b9Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.p.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        e7 e7Var = this.P;
        if (z10 && e7Var.H == null) {
            e7Var.H = new mc(this, 1.5f, 5.0f);
        }
        mc mcVar = e7Var.H;
        if (mcVar != null) {
            mcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.O || (this.f12394a && getParent() != null)) {
            ViewParent parent = getParent();
            tv tvVar = this.f12399c0;
            i iVar = tvVar.f12471r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            tvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
