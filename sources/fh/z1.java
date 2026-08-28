package fh;

import android.view.ViewTreeObserver;
public final class z1 extends g6 {
    public final ViewTreeObserver J;
    public final e1 K;

    public z1(long j10, String str, long j11, org.telegram.ui.ActionBar.b6 b6Var, ViewTreeObserver viewTreeObserver, e1 e1Var) {
        super(j10, str, j11, b6Var);
        this.J = viewTreeObserver;
        this.K = e1Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.J.removeOnPreDrawListener(this.K);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.J.addOnPreDrawListener(this.K);
    }
}
