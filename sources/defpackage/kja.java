package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class kja extends FrameLayout implements snb {
    public fja[] a;
    public r47[] b;
    public int[] c;
    public gja d;
    public int e;
    public boolean f;
    public boolean h;
    public Paint n;
    public boolean r;
    public int s;

    public static int a(int i) {
        if (hl.O1()) {
            return (hl.L(490.0f) - (hl.L(2.0f) * (i - 1))) / i;
        }
        return (hl.q.x - (hl.L(2.0f) * (i - 1))) / i;
    }

    public final void b(int i, boolean z, boolean z2) {
        float f;
        fja fjaVar = this.a[i];
        FrameLayout frameLayout = fjaVar.f;
        og2 og2Var = fjaVar.e;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, true);
        AnimatorSet animatorSet = fjaVar.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            fjaVar.h = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        fjaVar.h = animatorSet2;
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
        fjaVar.h.setDuration(200L);
        fjaVar.h.addListener(new po9(fjaVar, (byte) 14));
        fjaVar.h.start();
    }

    public final void c(int i, int i2, r47 r47Var) {
        r47[] r47VarArr = this.b;
        r47VarArr[i] = r47Var;
        this.c[i] = i2;
        fja[] fjaVarArr = this.a;
        if (r47Var != null) {
            fjaVarArr[i].setVisibility(0);
            fjaVarArr[i].setMessageObject(r47Var);
            return;
        }
        fjaVarArr[i].clearAnimation();
        fjaVarArr[i].setVisibility(4);
        r47VarArr[i] = null;
    }

    public gja getDelegate() {
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
            a = (View.MeasureSpec.getSize(i) - (hl.L(2.0f) * (this.e - 1))) / this.e;
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
                L = hl.L(2.0f);
            }
            layoutParams.topMargin = L;
            layoutParams.leftMargin = (hl.L(2.0f) + a) * i4;
            if (i4 == this.e - 1) {
                if (hl.O1()) {
                    layoutParams.width = hl.L(490.0f) - ((hl.L(2.0f) + a) * (this.e - 1));
                } else {
                    layoutParams.width = hl.q.x - ((hl.L(2.0f) + a) * (this.e - 1));
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
            i3 = hl.L(2.0f);
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

    public void setDelegate(gja gjaVar) {
        this.d = gjaVar;
    }

    public void setIsFirst(boolean z) {
        this.f = z;
    }

    public void setItemsCount(int i) {
        int i2;
        fja[] fjaVarArr = this.a;
        for (int i3 = 0; i3 < fjaVarArr.length; i3++) {
            fjaVarArr[i3].clearAnimation();
            fja fjaVar = fjaVarArr[i3];
            if (i3 < i) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            fjaVar.setVisibility(i2);
        }
        this.e = i;
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(aob.w0(null, aob.Ci, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
