package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class pda implements ViewTreeObserver.OnPreDrawListener {
    public final sca a;
    public final SparseBooleanArray b;
    public final pi4 c;
    public final int d;
    public final nfa e;

    public pda(nfa nfaVar, sca scaVar, SparseBooleanArray sparseBooleanArray, pi4 pi4Var, int i) {
        this.e = nfaVar;
        this.a = scaVar;
        this.b = sparseBooleanArray;
        this.c = pi4Var;
        this.d = i;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        nfa nfaVar = this.e;
        nfaVar.getViewTreeObserver().removeOnPreDrawListener(this);
        final sca scaVar = this.a;
        w39 adapter = scaVar.getAdapter();
        if (adapter != nfaVar.K && adapter != nfaVar.N && adapter != nfaVar.P && adapter != nfaVar.O) {
            int childCount = scaVar.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i = 0; i < childCount; i++) {
                View childAt2 = scaVar.getChildAt(i);
                pi4 pi4Var = this.c;
                if (childAt2 != pi4Var && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(scaVar.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / scaVar.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            sca scaVar2 = scaVar;
                            switch (b) {
                                case 0:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (pi4Var != null && pi4Var.getParent() == null) {
                    scaVar.addView(pi4Var);
                    d49 layoutManager = scaVar.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.L(pi4Var);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pi4Var, View.ALPHA, pi4Var.getAlpha(), 0.0f);
                        ofFloat2.addListener(new ng9(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                sca scaVar2 = scaVar;
                                switch (b) {
                                    case 0:
                                        if (scaVar2.c1()) {
                                            scaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (scaVar2.c1()) {
                                            scaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (scaVar2.c1()) {
                                            scaVar2.invalidate();
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
            int childCount2 = scaVar.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                int Q = nfa.Q(scaVar.getChildAt(i2));
                if (Q != 0 && sparseBooleanArray.get(Q, false)) {
                    nfaVar.S1.put(Q, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new j24(this, Q, scaVar));
                    ofFloat3.addListener(new cn(this, Q, (byte) 12));
                    ofFloat3.setStartDelay((int) ((Math.min(scaVar.getMeasuredHeight(), Math.max(0, childAt.getTop())) / scaVar.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            sca scaVar2 = scaVar;
                            switch (b) {
                                case 0:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    if (scaVar2.c1()) {
                                        scaVar2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                scaVar.invalidate();
            }
        }
        return true;
    }
}
