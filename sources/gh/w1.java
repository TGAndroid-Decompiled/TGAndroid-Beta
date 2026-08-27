package gh;

import android.view.ViewTreeObserver;

public final class w1 extends y5 {
    public final ViewTreeObserver J;
    public final c1 K;

    public w1(long j10, String str, long j11, org.telegram.ui.ActionBar.c6 c6Var, ViewTreeObserver viewTreeObserver, c1 c1Var) {
        super(j10, str, j11, c6Var);
        this.J = viewTreeObserver;
        this.K = c1Var;
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
