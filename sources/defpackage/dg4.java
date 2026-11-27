package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class dg4 extends View {
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
    public dm P;
    public StaticLayout Q;
    public dm R;
    public StaticLayout S;
    public dm T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public boolean a0;
    public bg4 b;
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
    public final fg4 n0;
    public dm r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    public dg4(fg4 fg4Var, Context context) {
        super(context);
        this.n0 = fg4Var;
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, hl.L(f));
        ofFloat.addUpdateListener(new wf4(this, (byte) 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new cg4(this, i, f, (byte) 0));
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
        this.r = hm.update(i, this, this.r, this.s);
        if (this.b.g) {
            i2 = 26;
        } else {
            i2 = 0;
        }
        this.P = hm.update(i2, this, this.P, this.Q);
        if (this.b.g) {
            i3 = 26;
        } else {
            i3 = 0;
        }
        this.R = hm.update(i3, this, this.R, this.S);
        if (!this.b.g) {
            i4 = 0;
        }
        this.T = hm.update(i4, this, this.T, this.U);
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
        hm.release(this, this.r);
        hm.release(this, this.P);
        hm.release(this, this.R);
        hm.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bg4 bg4Var = this.b;
        if (bg4Var != null && (i2 = this.n0.M) != -1 && bg4Var.a == i2) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754811, null)));
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.b);
            bg4 bg4Var2 = this.b;
            if (bg4Var2 != null) {
                i = bg4Var2.d;
            } else {
                i = 0;
            }
            if (i > 0) {
                sb.append("\n");
                sb.append(ob6.G(i, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(24.0f) + this.b.a(false) + this.n0.O, View.MeasureSpec.getSize(i2));
    }
}
