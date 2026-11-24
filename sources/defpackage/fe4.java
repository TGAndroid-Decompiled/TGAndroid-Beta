package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class fe4 extends View {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public StaticLayout N;
    public CharSequence O;
    public cm P;
    public StaticLayout Q;
    public cm R;
    public StaticLayout S;
    public cm T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public boolean a0;
    public de4 b;
    public float b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public int e0;
    public final RectF f;
    public float f0;
    public float g0;
    public CharSequence h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public boolean m0;
    public boolean n;
    public final he4 n0;
    public cm r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    public fe4(he4 he4Var, Context context) {
        super(context);
        this.n0 = he4Var;
        this.f = new RectF();
        this.J = -1;
    }

    public final void a() {
        this.x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.a0 = false;
        this.a = null;
        invalidate();
    }

    public final void b(float f, int i) {
        if (i == 6) {
            this.E = 0.0f;
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, gl.L(f));
        ofFloat.addUpdateListener(new yd4(this, (byte) 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new ee4(this, i, f, (byte) 0));
        animatorSet.start();
    }

    @Override
    public int getId() {
        return this.b.a;
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        int i2;
        int i3;
        this.m0 = true;
        super.onAttachedToWindow();
        int i4 = 26;
        if (this.b.g) {
            i = 26;
        } else {
            i = 0;
        }
        this.r = gm.update(i, this, this.r, this.s);
        if (this.b.g) {
            i2 = 26;
        } else {
            i2 = 0;
        }
        this.P = gm.update(i2, this, this.P, this.Q);
        if (this.b.g) {
            i3 = 26;
        } else {
            i3 = 0;
        }
        this.R = gm.update(i3, this, this.R, this.S);
        if (!this.b.g) {
            i4 = 0;
        }
        this.T = gm.update(i4, this, this.T, this.U);
    }

    @Override
    public final void onDetachedFromWindow() {
        this.m0 = false;
        super.onDetachedFromWindow();
        this.x = false;
        this.I = false;
        this.V = false;
        this.H = false;
        this.a0 = false;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.a.removeAllUpdateListeners();
            this.a.cancel();
            this.a = null;
        }
        invalidate();
        gm.release(this, this.r);
        gm.release(this, this.P);
        gm.release(this, this.R);
        gm.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        de4 de4Var = this.b;
        if (de4Var != null && (i2 = this.n0.M) != -1 && de4Var.a == i2) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, k96.M0(2131754815, null)));
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.b);
            de4 de4Var2 = this.b;
            if (de4Var2 != null) {
                i = de4Var2.d;
            } else {
                i = 0;
            }
            if (i > 0) {
                sb.append("\n");
                sb.append(k96.G(i, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(24.0f) + this.b.a(false) + this.n0.O, View.MeasureSpec.getSize(i2));
    }
}
