package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class qfa implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final int b;
    public final KeyEvent.Callback c;

    public qfa(KeyEvent.Callback callback, int i, byte b) {
        this.a = b;
        this.c = callback;
        this.b = i;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        int i = this.b;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                nha nhaVar = (nha) callback;
                nhaVar.n0[i].getViewTreeObserver().removeOnPreDrawListener(this);
                nhaVar.N(i);
                return true;
            default:
                y9c y9cVar = (y9c) callback;
                pu9 pu9Var = y9cVar.n1;
                pu9Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = pu9Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = pu9Var.getChildAt(i2);
                    pu9Var.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= i) {
                        if (R == 1 && pu9Var.getAdapter() == y9cVar.o1 && (childAt instanceof l55)) {
                            childAt = ((l55) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(pu9Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / pu9Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
