package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class m42 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final tk4 b;
    public final int c;
    public final Object d;

    public m42(Object obj, tk4 tk4Var, int i, byte b) {
        this.a = b;
        this.d = obj;
        this.b = tk4Var;
        this.c = i;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        int i = this.c;
        tk4 tk4Var = this.b;
        Object obj = this.d;
        int i2 = 2;
        switch (b) {
            case 0:
                o42 o42Var = (o42) obj;
                p42 p42Var = o42Var.Y;
                p42Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = p42Var.r.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = p42Var.r.getChildAt(i3);
                    if (tk4Var != null) {
                        p42Var.r.getClass();
                        if (RecyclerView.R(childAt) < i) {
                        }
                    }
                    childAt.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(p42Var.r.getMeasuredHeight(), Math.max(0, childAt.getTop())) / p42Var.r.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    animatorSet.playTogether(ofFloat);
                }
                animatorSet.addListener(new l42(this));
                o42Var.V.d();
                animatorSet.start();
                if (tk4Var != null && tk4Var.getParent() == null) {
                    p42Var.r.addView(tk4Var);
                    f69 layoutManager = p42Var.r.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.L(tk4Var);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat2.addListener(new l42(this, layoutManager));
                        ofFloat2.start();
                    }
                }
                return true;
            case 1:
                wg2 wg2Var = (wg2) obj;
                wg2Var.c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = wg2Var.c.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = wg2Var.c.getChildAt(i4);
                    if (childAt2 != tk4Var) {
                        wg2Var.c.getClass();
                        if (RecyclerView.R(childAt2) >= i) {
                            childAt2.setAlpha(0.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                            ofFloat3.setStartDelay((int) ((Math.min(wg2Var.c.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / wg2Var.c.getMeasuredHeight()) * 100.0f));
                            ofFloat3.setDuration(200L);
                            animatorSet2.playTogether(ofFloat3);
                        }
                    }
                }
                if (tk4Var != null && tk4Var.getParent() == null) {
                    wg2Var.c.addView(tk4Var);
                    f69 layoutManager2 = wg2Var.c.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.L(tk4Var);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat4.addListener(new b91(this, layoutManager2));
                        ofFloat4.start();
                    }
                }
                animatorSet2.start();
                return true;
            case 2:
                float f = 0.0f;
                ch4 ch4Var = (ch4) obj;
                ch4Var.getViewTreeObserver().removeOnPreDrawListener(this);
                fv fvVar = ch4Var.b;
                int childCount3 = fvVar.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i5 = 0;
                while (i5 < childCount3) {
                    View childAt3 = fvVar.getChildAt(i5);
                    if (tk4Var != null) {
                        fvVar.getClass();
                        if (RecyclerView.R(childAt3) < i) {
                            i5++;
                            f = 0.0f;
                        }
                    }
                    childAt3.setAlpha(f);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(childAt3, View.ALPHA, 0.0f, 1.0f);
                    ofFloat5.setStartDelay((int) ((Math.min(fvVar.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / fvVar.getMeasuredHeight()) * 100.0f));
                    ofFloat5.setDuration(200L);
                    animatorSet3.playTogether(ofFloat5);
                    i5++;
                    f = 0.0f;
                }
                animatorSet3.addListener(new rg4(this));
                ch4Var.m0.d();
                animatorSet3.start();
                if (tk4Var != null && tk4Var.getParent() == null) {
                    fvVar.addView(tk4Var);
                    f69 layoutManager3 = fvVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.L(tk4Var);
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat6.addListener(new rg4(this, layoutManager3));
                        ofFloat6.start();
                    }
                }
                return true;
            default:
                w49 w49Var = (w49) obj;
                SparseArray sparseArray = w49Var.b;
                r59 r59Var = w49Var.a;
                r59Var.getViewTreeObserver().removeOnPreDrawListener(this);
                w49Var.h.remove(this);
                int childCount4 = r59Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i6 = 0;
                while (i6 < childCount4) {
                    View childAt4 = r59Var.getChildAt(i6);
                    r59Var.getClass();
                    int R = RecyclerView.R(childAt4);
                    if (childAt4 != tk4Var && R >= i - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        w49Var.d = true;
                        r59Var.invalidate();
                        float[] fArr = new float[i2];
                        
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(fArr);
                        ofFloat7.addUpdateListener(new by0(this, R, (byte) 3));
                        ofFloat7.addListener(new co(this, R, (byte) 9));
                        ofFloat7.setStartDelay((int) ((Math.min(r59Var.getMeasuredHeight(), Math.max(0, childAt4.getTop())) / r59Var.getMeasuredHeight()) * 100.0f));
                        ofFloat7.setDuration(200L);
                        animatorSet4.playTogether(ofFloat7);
                    }
                    i6++;
                    i2 = 2;
                }
                w49Var.g.add(animatorSet4);
                animatorSet4.start();
                animatorSet4.addListener(new ic8(this, animatorSet4, (byte) 8));
                return false;
        }
    }
}
