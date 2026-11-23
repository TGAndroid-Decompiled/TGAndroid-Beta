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
import c8.na;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.sv;
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
    public rh0 S;
    public g T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean f12359a;
    public boolean f12360a0;
    public int f12361b;
    public final org.telegram.ui.Components.c6 f12362b0;
    public boolean f12363c;
    public final sv f12364c0;
    public boolean d;
    public f7 f12365e;
    public TLRPC.User f12366f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.a9 f12367n;
    public final ImageReceiver f12368r;
    public final ImageReceiver f12369s;
    public final org.telegram.ui.Components.a9 f12370w;
    public boolean f12371x;
    public final FrameLayout f12372y;

    public p(sv svVar, Context context) {
        super(context);
        boolean z10;
        this.f12364c0 = svVar;
        this.f12367n = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f12368r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f12369s = imageReceiver2;
        this.f12370w = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f12371x = true;
        e7 e7Var = new e7(null, true);
        this.P = e7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.f12362b0 = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
        if (svVar.f12416b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e7Var.f11908o = z10;
        e7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12372y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, na.c(-2.0f, -1));
        imageReceiver.K0(org.telegram.messenger.g0.L(48.0f) / 2);
        imageReceiver2.K0(org.telegram.messenger.g0.L(48.0f) / 2);
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
        textColor = this.f12364c0.getTextColor();
        n5Var2.setTextColor(textColor);
        ks.i(this.E);
        this.E.setMaxLines(1);
        this.f12372y.addView(this.E, na.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f12368r.K0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f12369s.K0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i7;
        sv svVar = this.f12364c0;
        int i10 = svVar.f12416b;
        Paint paint = svVar.H;
        p6 p6Var = svVar.f12438s;
        Paint paint2 = svVar.I;
        Drawable drawable = svVar.f12418c;
        if (this.G && !p6Var.K(this.F) && Utilities.x(p6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.n6.r1(f12, svVar.f(org.telegram.ui.ActionBar.n6.Yl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(f12, svVar.f(org.telegram.ui.ActionBar.n6.f29731s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(f12, svVar.f(org.telegram.ui.ActionBar.n6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i7 = org.telegram.ui.ActionBar.n6.f29731s8;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.M8;
            }
            int f13 = svVar.f(i7);
            if (f13 != svVar.f12421e) {
                svVar.f12421e = f13;
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
        sv svVar = this.f12364c0;
        if (i11 != 0 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            svVar.h.invalidate();
        }
        if (this.O) {
            i7 = 0.0f;
        } else {
            i7 = 1.0f - Utilities.i(svVar.O / svVar.C0, 1.0f, 0.0f);
        }
        this.R = i7;
        float f13 = i7 * this.Q;
        FrameLayout frameLayout = this.f12372y;
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
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) / 2.0f, this.f12364c0.f12420d0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.f12359a && getParent() != null)) {
            ViewParent parent = getParent();
            sv svVar = this.f12364c0;
            i iVar = svVar.f12436r;
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
        this.f12368r.Q();
        this.f12369s.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12368r.S();
        this.f12369s.S();
        this.P.g();
        f7 f7Var = this.f12365e;
        if (f7Var != null) {
            f7Var.a();
            this.f12365e = null;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.O) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f12364c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j3) {
        boolean z10;
        TLRPC.User user;
        int i7 = this.f12364c0.f12423f;
        if (this.J != j3) {
            this.J = j3;
            if (j3 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            ImageReceiver imageReceiver = this.f12369s;
            if (z10) {
                if (j3 > 0) {
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
                    this.f12366f = c22;
                    this.h = null;
                    user = c22;
                } else {
                    TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
                    this.h = O0;
                    this.f12366f = null;
                    user = O0;
                }
                if (user != null) {
                    org.telegram.ui.Components.a9 a9Var = this.f12370w;
                    a9Var.p(user);
                    imageReceiver.j0(user, a9Var, null);
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
            e7Var.H = new lc(this, 1.5f, 5.0f);
        }
        lc lcVar = e7Var.H;
        if (lcVar != null) {
            lcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (this.O || (this.f12359a && getParent() != null)) {
            ViewParent parent = getParent();
            sv svVar = this.f12364c0;
            i iVar = svVar.f12436r;
            if (parent == iVar) {
                iVar.invalidate();
            }
            svVar.invalidate();
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
