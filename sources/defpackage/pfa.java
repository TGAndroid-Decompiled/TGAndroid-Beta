package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class pfa implements ViewTreeObserver.OnPreDrawListener {
    public final sea a;
    public final SparseBooleanArray b;
    public final tk4 c;
    public final int d;
    public final nha e;

    public pfa(nha nhaVar, sea seaVar, SparseBooleanArray sparseBooleanArray, tk4 tk4Var, int i) {
        this.e = nhaVar;
        this.a = seaVar;
        this.b = sparseBooleanArray;
        this.c = tk4Var;
        this.d = i;
    }

    @Override
    public final boolean onPreDraw() {
        View childAt;
        nha nhaVar = this.e;
        nhaVar.getViewTreeObserver().removeOnPreDrawListener(this);
        final sea seaVar = this.a;
        y59 adapter = seaVar.getAdapter();
        if (adapter != nhaVar.K && adapter != nhaVar.N && adapter != nhaVar.P && adapter != nhaVar.O) {
            int childCount = seaVar.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i = 0; i < childCount; i++) {
                View childAt2 = seaVar.getChildAt(i);
                tk4 tk4Var = this.c;
                if (childAt2 != tk4Var && RecyclerView.R(childAt2) >= this.d - 1) {
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat.setStartDelay((int) ((Math.min(seaVar.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / seaVar.getMeasuredHeight()) * 100.0f));
                    ofFloat.setDuration(200L);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            sea seaVar2 = seaVar;
                            switch (b) {
                                case 0:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat);
                }
                if (tk4Var != null && tk4Var.getParent() == null) {
                    seaVar.addView(tk4Var);
                    f69 layoutManager = seaVar.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.L(tk4Var);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tk4Var, View.ALPHA, tk4Var.getAlpha(), 0.0f);
                        ofFloat2.addListener(new c39(this, layoutManager));
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b = r2;
                                sea seaVar2 = seaVar;
                                switch (b) {
                                    case 0:
                                        if (seaVar2.c1()) {
                                            seaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (seaVar2.c1()) {
                                            seaVar2.invalidate();
                                            return;
                                        }
                                        return;
                                    default:
                                        if (seaVar2.c1()) {
                                            seaVar2.invalidate();
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
            int childCount2 = seaVar.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                int Q = nha.Q(seaVar.getChildAt(i2));
                if (Q != 0 && sparseBooleanArray.get(Q, false)) {
                    nhaVar.S1.put(Q, Float.valueOf(0.0f));
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(new u34(this, Q, seaVar));
                    ofFloat3.addListener(new co(this, Q, (byte) 12));
                    ofFloat3.setStartDelay((int) ((Math.min(seaVar.getMeasuredHeight(), Math.max(0, childAt.getTop())) / seaVar.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(250L);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            byte b = r2;
                            sea seaVar2 = seaVar;
                            switch (b) {
                                case 0:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        return;
                                    }
                                    return;
                                default:
                                    if (seaVar2.c1()) {
                                        seaVar2.invalidate();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    ofFloat3.start();
                }
                seaVar.invalidate();
            }
        }
        return true;
    }
}
