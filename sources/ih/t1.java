package ih;

import android.view.ViewTreeObserver;
public final class t1 extends r5 {
    public final ViewTreeObserver J;
    public final a1 K;

    public t1(long j10, String str, long j11, org.telegram.ui.ActionBar.c6 c6Var, ViewTreeObserver viewTreeObserver, a1 a1Var) {
        super(j10, str, j11, c6Var);
        this.J = viewTreeObserver;
        this.K = a1Var;
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
