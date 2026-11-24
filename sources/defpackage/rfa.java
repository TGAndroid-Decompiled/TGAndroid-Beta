package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class rfa extends FrameLayout implements tjb {
    public ofa[] a;
    public k27[] b;
    public int[] c;
    public pfa d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public boolean r;
    public int s;

    public static int a(int i) {
        if (gl.O1()) {
            return (gl.L(490.0f) - (gl.L(2.0f) * (i - 1))) / i;
        }
        return (gl.q.x - (gl.L(2.0f) * (i - 1))) / i;
    }

    public final void b(int i, boolean z, boolean z2) {
        float f;
        ofa ofaVar = this.a[i];
        FrameLayout frameLayout = ofaVar.f;
        wf2 wf2Var = ofaVar.e;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, true);
        AnimatorSet animatorSet = ofaVar.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            ofaVar.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ofaVar.h = animatorSet2;
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
        ofaVar.h.setDuration(200L);
        ofaVar.h.addListener(new ng9(ofaVar, (byte) 15));
        ofaVar.h.start();
    }

    public final void c(int i, int i2, k27 k27Var) {
        k27[] k27VarArr = this.b;
        k27VarArr[i] = k27Var;
        this.c[i] = i2;
        ofa[] ofaVarArr = this.a;
        if (k27Var != null) {
            ofaVarArr[i].setVisibility(0);
            ofaVarArr[i].setMessageObject(k27Var);
            return;
        }
        ofaVarArr[i].clearAnimation();
        ofaVarArr[i].setVisibility(4);
        k27VarArr[i] = null;
    }

    public pfa getDelegate() {
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
            a = (View.MeasureSpec.getSize(i) - (gl.L(2.0f) * (this.e - 1))) / this.e;
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
                L = gl.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (gl.L(2.0f) + a) * i4;
            if (i4 == this.e - 1) {
                if (gl.O1()) {
                    layoutParams.width = gl.L(490.0f) - ((gl.L(2.0f) + a) * (this.e - 1));
                } else {
                    layoutParams.width = gl.q.x - ((gl.L(2.0f) + a) * (this.e - 1));
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
            i3 = gl.L(2.0f);
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

    public void setDelegate(pfa pfaVar) {
        this.d = pfaVar;
    }

    public void setIsFirst(boolean z) {
        this.f = z;
    }

    public void setItemsCount(int i) {
        int i2;
        ofa[] ofaVarArr = this.a;
        for (int i3 = 0; i3 < ofaVarArr.length; i3++) {
            ofaVarArr[i3].clearAnimation();
            ofa ofaVar = ofaVarArr[i3];
            if (i3 < i) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            ofaVar.setVisibility(i2);
        }
        this.e = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(bkb.w0(null, bkb.Bi, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
