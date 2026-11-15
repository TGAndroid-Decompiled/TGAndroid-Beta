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
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.qv;
public final class p extends FrameLayout {
    public org.telegram.ui.ActionBar.j5 E;
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
    public final h7 P;
    public float Q;
    public float R;
    public gh0 S;
    public g T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean f12143a;
    public boolean f12144a0;
    public int f12145b;
    public final org.telegram.ui.Components.u5 f12146b0;
    public boolean f12147c;
    public final qv f12148c0;
    public boolean d;
    public i7 f12149e;
    public TLRPC.User f12150f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.t8 f12151n;
    public final ImageReceiver f12152r;
    public final ImageReceiver f12153s;
    public final org.telegram.ui.Components.t8 f12154w;
    public boolean f12155x;
    public final FrameLayout f12156y;

    public p(qv qvVar, Context context) {
        super(context);
        boolean z10;
        this.f12148c0 = qvVar;
        this.f12151n = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12152r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f12153s = imageReceiver2;
        this.f12154w = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f12155x = true;
        h7 h7Var = new h7(null, true);
        this.P = h7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.f12146b0 = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        if (qvVar.f12186b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        h7Var.f11790o = z10;
        h7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12156y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, ja.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
        this.E = j5Var;
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.E;
        textColor = this.f12148c0.getTextColor();
        j5Var2.setTextColor(textColor);
        ns.i(this.E);
        this.E.setMaxLines(1);
        this.f12156y.addView(this.E, ja.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f12152r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f12153s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i7;
        qv qvVar = this.f12148c0;
        int i10 = qvVar.f12186b;
        Paint paint = qvVar.H;
        s6 s6Var = qvVar.f12208s;
        Paint paint2 = qvVar.I;
        Drawable drawable = qvVar.f12188c;
        if (this.G && !s6Var.K(this.F) && Utilities.x(s6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.j6.r1(f12, qvVar.f(org.telegram.ui.ActionBar.j6.Yl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(f12, qvVar.f(org.telegram.ui.ActionBar.j6.f29129s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(f12, qvVar.f(org.telegram.ui.ActionBar.j6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i7 = org.telegram.ui.ActionBar.j6.f29129s8;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.M8;
            }
            int f13 = qvVar.f(i7);
            if (f13 != qvVar.f12191e) {
                qvVar.f12191e = f13;
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
        qv qvVar = this.f12148c0;
        if (i11 != 0 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            qvVar.h.invalidate();
        }
        if (this.O) {
            i7 = 0.0f;
        } else {
            i7 = 1.0f - Utilities.i(qvVar.O / qvVar.C0, 1.0f, 0.0f);
        }
        this.R = i7;
        float f13 = i7 * this.Q;
        FrameLayout frameLayout = this.f12156y;
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
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) / 2.0f, this.f12148c0.f12190d0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.f12143a && getParent() != null)) {
            ViewParent parent = getParent();
            qv qvVar = this.f12148c0;
            i iVar = qvVar.f12206r;
            if (parent == iVar) {
                iVar.invalidate();
            } else {
                qvVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12152r.P();
        this.f12153s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12152r.R();
        this.f12153s.R();
        this.P.g();
        i7 i7Var = this.f12149e;
        if (i7Var != null) {
            i7Var.a();
            this.f12149e = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.O) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f12148c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i7 = this.f12148c0.f12193f;
        if (this.J != j3) {
            this.J = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            ImageReceiver imageReceiver = this.f12153s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
                    this.f12150f = a22;
                    this.h = null;
                    user = a22;
                } else {
                    TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
                    this.h = M0;
                    this.f12150f = null;
                    user = M0;
                }
                if (user != null) {
                    org.telegram.ui.Components.t8 t8Var = this.f12154w;
                    t8Var.p(user);
                    imageReceiver.i0(user, t8Var, null);
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
        h7 h7Var = this.P;
        if (z10 && h7Var.H == null) {
            h7Var.H = new dc(this, 1.5f, 5.0f);
        }
        dc dcVar = h7Var.H;
        if (dcVar != null) {
            dcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.O || (this.f12143a && getParent() != null)) {
            ViewParent parent = getParent();
            qv qvVar = this.f12148c0;
            i iVar = qvVar.f12206r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            qvVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
