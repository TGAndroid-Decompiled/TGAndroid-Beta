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
public final class og3 extends FrameLayout {
    public ema E;
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
    public final q6b P;
    public float Q;
    public float R;
    public g29 S;
    public hg3 T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final mm b0;
    public boolean c;
    public final ii3 c0;
    public boolean d;
    public pv0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final rb0 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final rb0 w;
    public boolean x;
    public final FrameLayout y;

    public og3(ii3 ii3Var, Context context) {
        super(context);
        boolean z;
        this.c0 = ii3Var;
        this.n = new rb0((vnb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new rb0((vnb) null);
        this.x = true;
        q6b q6bVar = new q6b(null, true);
        this.P = q6bVar;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new mm(this, 0L, 350L, k43.h);
        if (ii3Var.b == 1) {
            z = true;
        } else {
            z = false;
        }
        q6bVar.o = z;
        q6bVar.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, tre.c(-2.0f, -1));
        imageReceiver.q0(hl.L(48.0f) / 2);
        imageReceiver2.q0(hl.L(48.0f) / 2);
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
        ema emaVar = new ema(getContext());
        this.E = emaVar;
        emaVar.setTypeface(hl.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        ema emaVar2 = this.E;
        textColor = this.c0.getTextColor();
        emaVar2.setTextColor(textColor);
        jn7.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, tre.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.q0(hl.L(48.0f) / 2);
        this.s.q0(hl.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f, float f2, float f3) {
        int i;
        ii3 ii3Var = this.c0;
        Paint paint = ii3Var.I;
        int i2 = ii3Var.b;
        Paint paint2 = ii3Var.H;
        c6b c6bVar = ii3Var.s;
        Drawable drawable = ii3Var.c;
        if (this.G && !c6bVar.J(this.F) && Utilities.x(c6bVar.E(this.F))) {
            float L = f + hl.L(16.0f);
            float L2 = f2 + hl.L(16.0f);
            paint2.setColor(aob.p1(f3, ii3Var.f(aob.Yl)));
            if (i2 == 0) {
                paint.setColor(aob.p1(f3, ii3Var.f(aob.s8)));
            } else {
                paint.setColor(aob.p1(f3, ii3Var.f(aob.M8)));
            }
            canvas.drawCircle(L, L2, hl.L(11.0f), paint);
            canvas.drawCircle(L, L2, hl.L(9.0f), paint2);
            if (i2 == 0) {
                i = aob.s8;
            } else {
                i = aob.M8;
            }
            int f4 = ii3Var.f(i);
            if (f4 != ii3Var.e) {
                ii3Var.e = f4;
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
        ii3 ii3Var = this.c0;
        if (i3 != 0 || this.L != f2 || 0.0f != f3 || this.W != z) {
            this.W = z;
            this.K = f;
            this.L = f2;
            invalidate();
            ii3Var.h.invalidate();
        }
        if (this.O) {
            i = 0.0f;
        } else {
            i = 1.0f - Utilities.i(ii3Var.O / ii3Var.C0, 1.0f, 0.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og3.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = hl.L(26.33f);
        return hl.R1(hl.L(5.0f), (a.getCurrentActionBarHeight() - L) / 2.0f, this.c0.d0) + (hl.R1(hl.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            ii3 ii3Var = this.c0;
            jg3 jg3Var = ii3Var.r;
            if (parent == jg3Var) {
                jg3Var.invalidate();
            } else {
                ii3Var.invalidate();
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
        pv0 pv0Var = this.e;
        if (pv0Var != null) {
            pv0Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.O) {
            i3 = hl.L(70.0f);
        } else {
            i3 = this.c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(81.0f), 1073741824));
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
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
                    this.f = X1;
                    this.h = null;
                    user = X1;
                } else {
                    TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j));
                    this.h = M0;
                    this.f = null;
                    user = M0;
                }
                if (user != null) {
                    rb0 rb0Var = this.w;
                    rb0Var.o(user);
                    imageReceiver.U(user, rb0Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og3.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        q6b q6bVar = this.P;
        if (z && q6bVar.H == null) {
            q6bVar.H = new v41(this, 1.5f, 5.0f);
        }
        v41 v41Var = q6bVar.H;
        if (v41Var != null) {
            v41Var.c(z);
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            ii3 ii3Var = this.c0;
            jg3 jg3Var = ii3Var.r;
            if (parent == jg3Var) {
                jg3Var.invalidate();
            }
            ii3Var.invalidate();
        }
        super.invalidate(i, i2, i3, i4);
    }
}
