package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class gha implements ViewTreeObserver.OnPreDrawListener {
    public final jga a;
    public final SparseBooleanArray b;
    public final tk4 c;
    public final int d;
    public final eja e;

    public gha(eja ejaVar, jga jgaVar, SparseBooleanArray sparseBooleanArray, tk4 tk4Var, int i) {
        this.e = ejaVar;
        this.a = jgaVar;
        this.b = sparseBooleanArray;
        this.c = tk4Var;
        this.d = i;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        eja ejaVar = this.e;
        ejaVar.getViewTreeObserver().removeOnPreDrawListener(this);
        final jga jgaVar = this.a;
        j79 adapter = jgaVar.getAdapter();
        if (adapter != ejaVar.K && adapter != ejaVar.N && adapter != ejaVar.P && adapter != ejaVar.O) {
            int childCount = jgaVar.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i = 0; i < childCount; i++) {
                View childAt2 = jgaVar.getChildAt(i);
                tk4 tk4Var = this.c;
                if (childAt2 != tk4Var && RecyclerView.S(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(jgaVar.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jgaVar.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            jga jgaVar2 = jgaVar;
                            switch (b) {
                                case 0:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (tk4Var != null && tk4Var.getParent() == null) {
                    jgaVar.addView(tk4Var);
                    q79 layoutManager = jgaVar.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.L(tk4Var);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat2.addListener(new po9(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                jga jgaVar2 = jgaVar;
                                switch (b) {
                                    case 0:
                                        if (jgaVar2.d1()) {
                                            jgaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (jgaVar2.d1()) {
                                            jgaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (jgaVar2.d1()) {
                                            jgaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        ofFloat2.start();
                    }
                }
            }
            animatorSet.start();
            return true;
        }
        SparseBooleanArray sparseBooleanArray = this.b;
        if (sparseBooleanArray != null) {
            int childCount2 = jgaVar.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                int Q = eja.Q(jgaVar.getChildAt(i2));
                if (Q != 0 && sparseBooleanArray.get(Q, false)) {
                    ejaVar.S1.put(Q, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new e34(this, Q, jgaVar));
                    ofFloat3.addListener(new dn(this, Q, (byte) 12));
                    ofFloat3.setStartDelay((int) ((Math.min(jgaVar.getMeasuredHeight(), Math.max(0, childAt.getTop())) / jgaVar.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            jga jgaVar2 = jgaVar;
                            switch (b) {
                                case 0:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    if (jgaVar2.d1()) {
                                        jgaVar2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                jgaVar.invalidate();
            }
        }
        return true;
    }
}
