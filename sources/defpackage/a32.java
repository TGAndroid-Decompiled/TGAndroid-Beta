package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class a32 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final pi4 b;
    public final int c;
    public final Object d;

    public a32(Object obj, pi4 pi4Var, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = pi4Var;
        this.c = i;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        int i = this.c;
        pi4 pi4Var = this.b;
        Object obj = this.d;
        int i2 = 2;
        switch (b) {
            case 0:
                c32 c32Var = (c32) obj;
                d32 d32Var = c32Var.Y;
                d32Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = d32Var.r.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = d32Var.r.getChildAt(i3);
                    if (pi4Var != null) {
                        d32Var.r.getClass();
                        if (RecyclerView.R(childAt) < i) {
                        }
                    }
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(d32Var.r.getMeasuredHeight(), Math.max(0, childAt.getTop())) / d32Var.r.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    animatorSet.playTogether(ofFloat);
                }
                animatorSet.addListener(new z22(this));
                c32Var.V.d();
                animatorSet.start();
                if (pi4Var != null && pi4Var.getParent() == null) {
                    d32Var.r.addView(pi4Var);
                    d49 layoutManager = d32Var.r.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.L(pi4Var);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pi4Var, View.ALPHA, pi4Var.getAlpha(), 0.0f);
                        ofFloat2.addListener(new z22(this, layoutManager));
                        ofFloat2.start();
                    }
                }
                return true;
            case 1:
                kf2 kf2Var = (kf2) obj;
                kf2Var.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = kf2Var.c.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = kf2Var.c.getChildAt(i4);
                    if (childAt2 != pi4Var) {
                        kf2Var.c.getClass();
                        if (RecyclerView.R(childAt2) >= i) {
                            childAt2.setAlpha(0.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                            ofFloat3.setStartDelay((int) ((Math.min(kf2Var.c.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / kf2Var.c.getMeasuredHeight()) * 100.0f));
                            ofFloat3.setDuration(200L);
                            animatorSet2.playTogether(ofFloat3);
                        }
                    }
                }
                if (pi4Var != null && pi4Var.getParent() == null) {
                    kf2Var.c.addView(pi4Var);
                    d49 layoutManager2 = kf2Var.c.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.L(pi4Var);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pi4Var, View.ALPHA, pi4Var.getAlpha(), 0.0f);
                        ofFloat4.addListener(new bb1(this, layoutManager2));
                        ofFloat4.start();
                    }
                }
                animatorSet2.start();
                return true;
            case 2:
                float f = 0.0f;
                af4 af4Var = (af4) obj;
                af4Var.getViewTreeObserver().removeOnPreDrawListener(this);
                fu fuVar = af4Var.b;
                int childCount3 = fuVar.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i5 = 0;
                while (i5 < childCount3) {
                    View childAt3 = fuVar.getChildAt(i5);
                    if (pi4Var != null) {
                        fuVar.getClass();
                        if (RecyclerView.R(childAt3) < i) {
                            i5++;
                            f = 0.0f;
                        }
                    }
                    childAt3.setAlpha(f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(childAt3, View.ALPHA, 0.0f, 1.0f);
                    ofFloat5.setStartDelay((int) ((Math.min(fuVar.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / fuVar.getMeasuredHeight()) * 100.0f));
                    ofFloat5.setDuration(200L);
                    animatorSet3.playTogether(ofFloat5);
                    i5++;
                    f = 0.0f;
                }
                animatorSet3.addListener(new pe4(this));
                af4Var.m0.d();
                animatorSet3.start();
                if (pi4Var != null && pi4Var.getParent() == null) {
                    fuVar.addView(pi4Var);
                    d49 layoutManager3 = fuVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.L(pi4Var);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(pi4Var, View.ALPHA, pi4Var.getAlpha(), 0.0f);
                        ofFloat6.addListener(new pe4(this, layoutManager3));
                        ofFloat6.start();
                    }
                }
                return true;
            default:
                t29 t29Var = (t29) obj;
                SparseArray sparseArray = t29Var.b;
                o39 o39Var = t29Var.a;
                o39Var.getViewTreeObserver().removeOnPreDrawListener(this);
                t29Var.h.remove(this);
                int childCount4 = o39Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i6 = 0;
                while (i6 < childCount4) {
                    View childAt4 = o39Var.getChildAt(i6);
                    o39Var.getClass();
                    int R = RecyclerView.R(childAt4);
                    if (childAt4 != pi4Var && R >= i - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        t29Var.d = true;
                        o39Var.invalidate();
                        float[] fArr = new float[i2];
                        
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr);
                        ofFloat7.addUpdateListener(new tw0(this, R, (byte) 3));
                        ofFloat7.addListener(new cn(this, R, (byte) 9));
                        ofFloat7.setStartDelay((int) ((Math.min(o39Var.getMeasuredHeight(), Math.max(0, childAt4.getTop())) / o39Var.getMeasuredHeight()) * 100.0f));
                        ofFloat7.setDuration(200L);
                        animatorSet4.playTogether(ofFloat7);
                    }
                    i6++;
                    i2 = 2;
                }
                t29Var.g.add(animatorSet4);
                animatorSet4.start();
                animatorSet4.addListener(new eh8(this, animatorSet4, (byte) 7));
                return false;
        }
    }
}
