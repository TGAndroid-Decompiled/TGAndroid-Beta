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
public final class hh3 extends FrameLayout {
    public lka E;
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
    public final v4b P;
    public float Q;
    public float R;
    public u09 S;
    public ah3 T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean a;
    public boolean a0;
    public int b;
    public final ln b0;
    public boolean c;
    public final aj3 c0;
    public boolean d;
    public ow0 e;
    public TLRPC.User f;
    public TLRPC.Chat h;
    public final pc0 n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public final pc0 w;
    public boolean x;
    public final FrameLayout y;

    public hh3(aj3 aj3Var, Context context) {
        super(context);
        boolean z;
        this.c0 = aj3Var;
        this.n = new pc0((ylb) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.w = new pc0((ylb) null);
        this.x = true;
        v4b v4bVar = new v4b(null, true);
        this.P = v4bVar;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.U = 1.0f;
        this.b0 = new ln(this, 0L, 350L, d53.h);
        if (aj3Var.b == 1) {
            z = true;
        } else {
            z = false;
        }
        v4bVar.o = z;
        v4bVar.D = true;
        imageReceiver.K0 = true;
        imageReceiver.A1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.O) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, qoe.c(-2.0f, -1));
        imageReceiver.q0(gm.L(48.0f) / 2);
        imageReceiver2.q0(gm.L(48.0f) / 2);
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
        lka lkaVar = new lka(getContext());
        this.E = lkaVar;
        lkaVar.setTypeface(gm.o());
        this.E.setGravity(17);
        this.E.setTextSize(11);
        lka lkaVar2 = this.E;
        textColor = this.c0.getTextColor();
        lkaVar2.setTextColor(textColor);
        nm7.i(this.E);
        this.E.setMaxLines(1);
        this.y.addView(this.E, qoe.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.r.q0(gm.L(48.0f) / 2);
        this.s.q0(gm.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f, float f2, float f3) {
        int i;
        aj3 aj3Var = this.c0;
        Paint paint = aj3Var.I;
        int i2 = aj3Var.b;
        Paint paint2 = aj3Var.H;
        h4b h4bVar = aj3Var.s;
        Drawable drawable = aj3Var.c;
        if (this.G && !h4bVar.J(this.F) && Utilities.x(h4bVar.E(this.F))) {
            float L = f + gm.L(16.0f);
            float L2 = f2 + gm.L(16.0f);
            paint2.setColor(cmb.p1(f3, aj3Var.f(cmb.Xl)));
            if (i2 == 0) {
                paint.setColor(cmb.p1(f3, aj3Var.f(cmb.r8)));
            } else {
                paint.setColor(cmb.p1(f3, aj3Var.f(cmb.L8)));
            }
            canvas.drawCircle(L, L2, gm.L(11.0f), paint);
            canvas.drawCircle(L, L2, gm.L(9.0f), paint2);
            if (i2 == 0) {
                i = cmb.r8;
            } else {
                i = cmb.L8;
            }
            int f4 = aj3Var.f(i);
            if (f4 != aj3Var.e) {
                aj3Var.e = f4;
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
        aj3 aj3Var = this.c0;
        if (i3 != 0 || this.L != f2 || 0.0f != f3 || this.W != z) {
            this.W = z;
            this.K = f;
            this.L = f2;
            invalidate();
            aj3Var.h.invalidate();
        }
        if (this.O) {
            i = 0.0f;
        } else {
            i = 1.0f - Utilities.i(aj3Var.O / aj3Var.C0, 1.0f, 0.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh3.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = gm.L(26.33f);
        return gm.R1(gm.L(5.0f), (a.getCurrentActionBarHeight() - L) / 2.0f, this.c0.d0) + (gm.R1(gm.L(48.0f), L, this.K) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            aj3 aj3Var = this.c0;
            ch3 ch3Var = aj3Var.r;
            if (parent == ch3Var) {
                ch3Var.invalidate();
            } else {
                aj3Var.invalidate();
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
        ow0 ow0Var = this.e;
        if (ow0Var != null) {
            ow0Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.O) {
            i3 = gm.L(70.0f);
        } else {
            i3 = this.c0.N;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(81.0f), 1073741824));
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
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
                    this.f = W1;
                    this.h = null;
                    user = W1;
                } else {
                    TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
                    this.h = L0;
                    this.f = null;
                    user = L0;
                }
                if (user != null) {
                    pc0 pc0Var = this.w;
                    pc0Var.o(user);
                    imageReceiver.U(user, pc0Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh3.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        v4b v4bVar = this.P;
        if (z && v4bVar.H == null) {
            v4bVar.H = new u51(this, 1.5f, 5.0f);
        }
        u51 u51Var = v4bVar.H;
        if (u51Var != null) {
            u51Var.c(z);
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (this.O || (this.a && getParent() != null)) {
            ViewParent parent = getParent();
            aj3 aj3Var = this.c0;
            ch3 ch3Var = aj3Var.r;
            if (parent == ch3Var) {
                ch3Var.invalidate();
            }
            aj3Var.invalidate();
        }
        super.invalidate(i, i2, i3, i4);
    }
}
