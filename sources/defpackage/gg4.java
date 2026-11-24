package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class gg4 extends View {
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
    public cn P;
    public StaticLayout Q;
    public cn R;
    public StaticLayout S;
    public cn T;
    public StaticLayout U;
    public boolean V;
    public boolean W;
    public ValueAnimator a;
    public boolean a0;
    public eg4 b;
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
    public final ig4 n0;
    public cn r;
    public StaticLayout s;
    public int w;
    public boolean x;
    public float y;

    public gg4(ig4 ig4Var, Context context) {
        super(context);
        this.n0 = ig4Var;
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, gm.L(f));
        ofFloat.addUpdateListener(new zf4(this, (byte) 1));
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(50L);
        animatorSet.addListener(new fg4(this, i, f, (byte) 0));
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
        this.r = gn.update(i, this, this.r, this.s);
        if (this.b.g) {
            i2 = 26;
        } else {
            i2 = 0;
        }
        this.P = gn.update(i2, this, this.P, this.Q);
        if (this.b.g) {
            i3 = 26;
        } else {
            i3 = 0;
        }
        this.R = gn.update(i3, this, this.R, this.S);
        if (!this.b.g) {
            i4 = 0;
        }
        this.T = gn.update(i4, this, this.T, this.U);
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
        gn.release(this, this.r);
        gn.release(this, this.P);
        gn.release(this, this.R);
        gn.release(this, this.T);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        eg4 eg4Var = this.b;
        if (eg4Var != null && (i2 = this.n0.M) != -1 && eg4Var.a == i2) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setSelected(z);
        accessibilityNodeInfo.addAction(16);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, jb6.M0(2131754815, null)));
        if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.b);
            eg4 eg4Var2 = this.b;
            if (eg4Var2 != null) {
                i = eg4Var2.d;
            } else {
                i = 0;
            }
            if (i > 0) {
                sb.append("\n");
                sb.append(jb6.G(i, "AccDescrUnreadCount", new Object[0]));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(24.0f) + this.b.a(false) + this.n0.O, View.MeasureSpec.getSize(i2));
    }
}
