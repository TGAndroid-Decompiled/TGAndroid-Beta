package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class tha extends FrameLayout implements vlb {
    public pha[] a;
    public k47[] b;
    public int[] c;
    public qha d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public boolean r;
    public int s;

    public static int a(int i) {
        if (gm.O1()) {
            return (gm.L(490.0f) - (gm.L(2.0f) * (i - 1))) / i;
        }
        return (gm.q.x - (gm.L(2.0f) * (i - 1))) / i;
    }

    public final void b(int i, boolean z, boolean z2) {
        float f;
        pha phaVar = this.a[i];
        FrameLayout frameLayout = phaVar.f;
        jh2 jh2Var = phaVar.e;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, true);
        AnimatorSet animatorSet = phaVar.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            phaVar.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        phaVar.h = animatorSet2;
        float f2 = 0.81f;
        if (z) {
            f = 0.81f;
        } else {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, f);
        if (!z) {
            f2 = 1.0f;
        }
        animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, f2));
        phaVar.h.setDuration(200L);
        phaVar.h.addListener(new c39(phaVar, (byte) 17));
        phaVar.h.start();
    }

    public final void c(int i, int i2, k47 k47Var) {
        k47[] k47VarArr = this.b;
        k47VarArr[i] = k47Var;
        this.c[i] = i2;
        pha[] phaVarArr = this.a;
        if (k47Var != null) {
            phaVarArr[i].setVisibility(0);
            phaVarArr[i].setMessageObject(k47Var);
            return;
        }
        phaVarArr[i].clearAnimation();
        phaVarArr[i].setVisibility(4);
        k47VarArr[i] = null;
    }

    public qha getDelegate() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        for (int i = 0; i < 6; i++) {
            this.a[i].invalidate();
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int a;
        int L;
        View[] viewArr = this.a;
        if (this.r) {
            a = (View.MeasureSpec.getSize(i) - (gm.L(2.0f) * (this.e - 1))) / this.e;
        } else {
            a = a(this.e);
        }
        this.h = true;
        int i3 = 0;
        for (int i4 = 0; i4 < this.e; i4++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i4].getLayoutParams();
            if (this.f) {
                L = 0;
            } else {
                L = gm.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (gm.L(2.0f) + a) * i4;
            if (i4 == this.e - 1) {
                if (gm.O1()) {
                    layoutParams.width = gm.L(490.0f) - ((gm.L(2.0f) + a) * (this.e - 1));
                } else {
                    layoutParams.width = gm.q.x - ((gm.L(2.0f) + a) * (this.e - 1));
                }
            } else {
                layoutParams.width = a;
            }
            layoutParams.height = a;
            layoutParams.gravity = 51;
            viewArr[i4].setLayoutParams(layoutParams);
        }
        this.h = false;
        if (!this.f) {
            i3 = gm.L(2.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + a, 1073741824));
    }

    @Override
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setDelegate(qha qhaVar) {
        this.d = qhaVar;
    }

    public void setIsFirst(boolean z) {
        this.f = z;
    }

    public void setItemsCount(int i) {
        int i2;
        pha[] phaVarArr = this.a;
        for (int i3 = 0; i3 < phaVarArr.length; i3++) {
            phaVarArr[i3].clearAnimation();
            pha phaVar = phaVarArr[i3];
            if (i3 < i) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            phaVar.setVisibility(i2);
        }
        this.e = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(cmb.w0(null, cmb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
