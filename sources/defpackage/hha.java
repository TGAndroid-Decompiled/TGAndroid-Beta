package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class hha implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final int b;
    public final KeyEvent.Callback c;

    public hha(KeyEvent.Callback callback, int i, byte b) {
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
                eja ejaVar = (eja) callback;
                ejaVar.n0[i].getViewTreeObserver().removeOnPreDrawListener(this);
                ejaVar.N(i);
                return true;
            default:
                xbc xbcVar = (xbc) callback;
                gw9 gw9Var = xbcVar.n1;
                gw9Var.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = gw9Var.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = gw9Var.getChildAt(i2);
                    gw9Var.getClass();
                    int S = RecyclerView.S(childAt);
                    if (S >= i) {
                        if (S == 1 && gw9Var.getAdapter() == xbcVar.o1 && (childAt instanceof p55)) {
                            childAt = ((p55) childAt).getTextView();
                        }
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(gw9Var.getMeasuredHeight(), Math.max(0, childAt.getTop())) / gw9Var.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
        }
    }
}
