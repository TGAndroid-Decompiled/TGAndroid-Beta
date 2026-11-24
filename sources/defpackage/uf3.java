package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public final class uf3 extends FrameLayout {
    public jia E;
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
    public final u2b P;
    public float Q;
    public float R;
    public ty8 S;
    public nf3 T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final lm b0;
    public boolean c;
    public final oh3 c0;
    public boolean d;
    public ev0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final pb0 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final pb0 w;
    public boolean x;
    public final FrameLayout y;

    public uf3(oh3 oh3Var, Context context) {
        super(context);
        boolean z;
        this.c0 = oh3Var;
        this.n = new pb0((wjb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new pb0((wjb) null);
        this.x = true;
        u2b u2bVar = new u2b(null, true);
        this.P = u2bVar;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new lm(this, 0L, 350L, s33.h);
        if (oh3Var.b == 1) {
            z = true;
        } else {
            z = false;
        }
        u2bVar.o = z;
        u2bVar.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, nme.c(-2.0f, -1));
        imageReceiver.q0(gl.L(48.0f) / 2);
        imageReceiver2.q0(gl.L(48.0f) / 2);
    }

    public void setClipInParent(boolean z) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z);
        }
    }

    public final void b() {
        int textColor;
        jia jiaVar = new jia(getContext());
        this.E = jiaVar;
        jiaVar.setTypeface(gl.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        jia jiaVar2 = this.E;
        textColor = this.c0.getTextColor();
        jiaVar2.setTextColor(textColor);
        kk7.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, nme.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.q0(gl.L(48.0f) / 2);
        this.s.q0(gl.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f, float f2, float f3) {
        int i;
        oh3 oh3Var = this.c0;
        Paint paint = oh3Var.I;
        int i2 = oh3Var.b;
        Paint paint2 = oh3Var.H;
        g2b g2bVar = oh3Var.s;
        Drawable drawable = oh3Var.c;
        if (this.G && !g2bVar.J(this.F) && Utilities.x(g2bVar.E(this.F))) {
            float L = f + gl.L(16.0f);
            float L2 = f2 + gl.L(16.0f);
            paint2.setColor(bkb.p1(f3, oh3Var.f(bkb.Xl)));
            if (i2 == 0) {
                paint.setColor(bkb.p1(f3, oh3Var.f(bkb.r8)));
            } else {
                paint.setColor(bkb.p1(f3, oh3Var.f(bkb.L8)));
            }
            canvas.drawCircle(L, L2, gl.L(11.0f), paint);
            canvas.drawCircle(L, L2, gl.L(9.0f), paint2);
            if (i2 == 0) {
                i = bkb.r8;
            } else {
                i = bkb.L8;
            }
            int f4 = oh3Var.f(i);
            if (f4 != oh3Var.e) {
                oh3Var.e = f4;
                drawable.setColorFilter(new PorterDuffColorFilter(f4, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f3 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f, float f2, float f3, boolean z) {
        float i;
        int i2;
        int i3 = (this.K > f ? 1 : (this.K == f ? 0 : -1));
        oh3 oh3Var = this.c0;
        if (i3 != 0 || this.L != f2 || 0.0f != f3 || this.W != z) {
            this.W = z;
            this.K = f;
            this.L = f2;
            invalidate();
            oh3Var.h.invalidate();
        }
        if (this.O) {
            i = 0.0f;
        } else {
            i = 1.0f - Utilities.i(oh3Var.O / oh3Var.C0, 1.0f, 0.0f);
        }
        this.R = i;
        float f4 = i * this.Q;
        FrameLayout frameLayout = this.y;
        frameLayout.setAlpha(f4);
        if (f4 > 0.0f) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        frameLayout.setVisibility(i2);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf3.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = gl.L(26.33f);
        return gl.R1(gl.L(5.0f), (a.getCurrentActionBarHeight() - L) / 2.0f, this.c0.d0) + (gl.R1(gl.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            oh3 oh3Var = this.c0;
            pf3 pf3Var = oh3Var.r;
            if (parent == pf3Var) {
                pf3Var.invalidate();
            } else {
                oh3Var.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.I();
        this.s.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        this.s.K();
        this.P.g();
        ev0 ev0Var = this.e;
        if (ev0Var != null) {
            ev0Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.O) {
            i3 = gl.L(70.0f);
        } else {
            i3 = this.c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j) {
        boolean z;
        TLRPC.User user;
        if (this.J != j) {
            this.J = j;
            if (j != -1) {
                z = true;
            } else {
                z = false;
            }
            this.I = z;
            ImageReceiver imageReceiver = this.s;
            if (z) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                int i2 = this.c0.f;
                if (i > 0) {
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
                    this.f = V1;
                    this.h = null;
                    user = V1;
                } else {
                    TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
                    this.h = K0;
                    this.f = null;
                    user = K0;
                }
                if (user != null) {
                    pb0 pb0Var = this.w;
                    pb0Var.o(user);
                    imageReceiver.U(user, pb0Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf3.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        u2b u2bVar = this.P;
        if (z && u2bVar.H == null) {
            u2bVar.H = new n41(this, 1.5f, 5.0f);
        }
        n41 n41Var = u2bVar.H;
        if (n41Var != null) {
            n41Var.c(z);
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            oh3 oh3Var = this.c0;
            pf3 pf3Var = oh3Var.r;
            if (parent == pf3Var) {
                pf3Var.invalidate();
            }
            oh3Var.invalidate();
        }
        super.invalidate(i, i2, i3, i4);
    }
}
