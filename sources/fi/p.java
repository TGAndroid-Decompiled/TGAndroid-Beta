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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.tv;
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.n5 E;
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
    public qh0 S;
    public g T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean f12352a;
    public boolean f12353a0;
    public int f12354b;
    public final org.telegram.ui.Components.c6 f12355b0;
    public boolean f12356c;
    public final tv f12357c0;
    public boolean d;
    public f7 f12358e;
    public TLRPC.User f12359f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.b9 f12360n;
    public final ImageReceiver f12361r;
    public final ImageReceiver f12362s;
    public final org.telegram.ui.Components.b9 f12363w;
    public boolean f12364x;
    public final FrameLayout f12365y;

    public p(tv tvVar, Context context) {
        super(context);
        boolean z10;
        this.f12357c0 = tvVar;
        this.f12360n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12361r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f12362s = imageReceiver2;
        this.f12363w = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f12364x = true;
        e7 e7Var = new e7(null, true);
        this.P = e7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.f12355b0 = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        if (tvVar.f12411b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e7Var.f11901o = z10;
        e7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12365y = frameLayout;
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
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.E = n5Var;
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.E;
        textColor = this.f12357c0.getTextColor();
        n5Var2.setTextColor(textColor);
        ks.i(this.E);
        this.E.setMaxLines(1);
        this.f12365y.addView(this.E, ma.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f12361r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f12362s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i7;
        tv tvVar = this.f12357c0;
        int i10 = tvVar.f12411b;
        Paint paint = tvVar.H;
        p6 p6Var = tvVar.f12433s;
        Paint paint2 = tvVar.I;
        Drawable drawable = tvVar.f12413c;
        if (this.G && !p6Var.K(this.F) && Utilities.x(p6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.n6.Yl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.n6.f29674s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(f12, tvVar.f(org.telegram.ui.ActionBar.n6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i7 = org.telegram.ui.ActionBar.n6.f29674s8;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.M8;
            }
            int f13 = tvVar.f(i7);
            if (f13 != tvVar.f12416e) {
                tvVar.f12416e = f13;
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
        tv tvVar = this.f12357c0;
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
        FrameLayout frameLayout = this.f12365y;
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
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) / 2.0f, this.f12357c0.f12415d0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.f12352a && getParent() != null)) {
            ViewParent parent = getParent();
            tv tvVar = this.f12357c0;
            i iVar = tvVar.f12431r;
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
        this.f12361r.P();
        this.f12362s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12361r.R();
        this.f12362s.R();
        this.P.g();
        f7 f7Var = this.f12358e;
        if (f7Var != null) {
            f7Var.a();
            this.f12358e = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.O) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f12357c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i7 = this.f12357c0.f12418f;
        if (this.J != j3) {
            this.J = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            ImageReceiver imageReceiver = this.f12362s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
                    this.f12359f = c22;
                    this.h = null;
                    user = c22;
                } else {
                    TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                    this.h = O0;
                    this.f12359f = null;
                    user = O0;
                }
                if (user != null) {
                    org.telegram.ui.Components.b9 b9Var = this.f12363w;
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
        if (this.O || (this.f12352a && getParent() != null)) {
            ViewParent parent = getParent();
            tv tvVar = this.f12357c0;
            i iVar = tvVar.f12431r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            tvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
