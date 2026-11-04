package ei;

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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.mv;
public final class q extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 E;
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
    public final o7 P;
    public float Q;
    public float R;
    public gh0 S;
    public h T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean f10780a;
    public boolean f10781a0;
    public int f10782b;
    public final org.telegram.ui.Components.u5 f10783b0;
    public boolean f10784c;
    public final mv f10785c0;
    public boolean d;
    public p7 f10786e;
    public TLRPC.User f10787f;
    public TLRPC.Chat h;
    public final org.telegram.ui.Components.u8 f10788n;
    public final ImageReceiver f10789r;
    public final ImageReceiver f10790s;
    public final org.telegram.ui.Components.u8 f10791w;
    public boolean f10792x;
    public final FrameLayout f10793y;

    public q(mv mvVar, Context context) {
        super(context);
        boolean z10;
        this.f10785c0 = mvVar;
        this.f10788n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f10789r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f10790s = imageReceiver2;
        this.f10791w = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f10792x = true;
        o7 o7Var = new o7(null, true);
        this.P = o7Var;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.f10783b0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        if (mvVar.f10824b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        o7Var.f10708o = z10;
        o7Var.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10793y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, mf.c(-2.0f, -1));
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
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.E = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        this.E.setTextColor(r.a(this.f10785c0));
        hs.i(this.E);
        this.E.setMaxLines(1);
        this.f10793y.addView(this.E, mf.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f10789r.J0(org.telegram.messenger.g0.L(48.0f) / 2);
        this.f10790s.J0(org.telegram.messenger.g0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        int i3;
        mv mvVar = this.f10785c0;
        int i10 = mvVar.f10824b;
        Paint paint = mvVar.H;
        z6 z6Var = mvVar.f10846s;
        Paint paint2 = mvVar.I;
        Drawable drawable = mvVar.f10826c;
        if (this.G && !z6Var.K(this.F) && Utilities.x(z6Var.F(this.F))) {
            float L = f10 + org.telegram.messenger.g0.L(16.0f);
            float L2 = f11 + org.telegram.messenger.g0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(f12, mvVar.f(org.telegram.ui.ActionBar.k6.Vl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, mvVar.f(org.telegram.ui.ActionBar.k6.f28160s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(f12, mvVar.f(org.telegram.ui.ActionBar.k6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.g0.L(9.0f), paint);
            if (i10 == 0) {
                i3 = org.telegram.ui.ActionBar.k6.f28160s8;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.M8;
            }
            int f13 = mvVar.f(i3);
            if (f13 != mvVar.f10829e) {
                mvVar.f10829e = f13;
                drawable.setColorFilter(new PorterDuffColorFilter(f13, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float i3;
        int i10;
        int i11 = (this.K > f10 ? 1 : (this.K == f10 ? 0 : -1));
        mv mvVar = this.f10785c0;
        if (i11 != 0 || this.L != f11 || 0.0f != f12 || this.W != z10) {
            this.W = z10;
            this.K = f10;
            this.L = f11;
            invalidate();
            mvVar.h.invalidate();
        }
        if (this.O) {
            i3 = 0.0f;
        } else {
            i3 = 1.0f - Utilities.i(mvVar.O / mvVar.C0, 1.0f, 0.0f);
        }
        this.R = i3;
        float f13 = i3 * this.Q;
        FrameLayout frameLayout = this.f10793y;
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
        throw new UnsupportedOperationException("Method not decompiled: ei.q.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = org.telegram.messenger.g0.L(26.33f);
        return org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L) / 2.0f, this.f10785c0.f10828d0) + (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.f10780a && getParent() != null)) {
            ViewParent parent = getParent();
            mv mvVar = this.f10785c0;
            j jVar = mvVar.f10844r;
            if (parent == jVar) {
                jVar.invalidate();
            } else {
                mvVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10789r.P();
        this.f10790s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10789r.R();
        this.f10790s.R();
        this.P.g();
        p7 p7Var = this.f10786e;
        if (p7Var != null) {
            p7Var.a();
            this.f10786e = null;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (this.O) {
            i11 = org.telegram.messenger.g0.L(70.0f);
        } else {
            i11 = this.f10785c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i3 = this.f10785c0.f10831f;
        if (this.J != j10) {
            this.J = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.I = z10;
            ImageReceiver imageReceiver = this.f10790s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
                    this.f10787f = a22;
                    this.h = null;
                    user = a22;
                } else {
                    TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
                    this.h = M0;
                    this.f10787f = null;
                    user = M0;
                }
                if (user != null) {
                    org.telegram.ui.Components.u8 u8Var = this.f10791w;
                    u8Var.p(user);
                    imageReceiver.i0(user, u8Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.q.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        o7 o7Var = this.P;
        if (z10 && o7Var.H == null) {
            o7Var.H = new gc(this, 1.5f, 5.0f);
        }
        gc gcVar = o7Var.H;
        if (gcVar != null) {
            gcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (this.O || (this.f10780a && getParent() != null)) {
            ViewParent parent = getParent();
            mv mvVar = this.f10785c0;
            j jVar = mvVar.f10844r;
            if (parent == jVar) {
                jVar.invalidate();
            }
            mvVar.invalidate();
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
