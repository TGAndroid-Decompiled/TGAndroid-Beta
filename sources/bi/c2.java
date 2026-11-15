package bi;

import android.view.ViewTreeObserver;
public final class c2 extends a6 {
    public final ViewTreeObserver T;
    public final j1 U;

    public c2(long j3, String str, long j10, org.telegram.ui.ActionBar.e6 e6Var, ViewTreeObserver viewTreeObserver, j1 j1Var) {
        super(j3, str, j10, e6Var);
        this.T = viewTreeObserver;
        this.U = j1Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T.removeOnPreDrawListener(this.U);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T.addOnPreDrawListener(this.U);
    }
}
