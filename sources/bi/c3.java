package bi;

import android.view.ViewTreeObserver;
public final class c3 extends m8 {
    public final ViewTreeObserver V;
    public final l2 W;

    public c3(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var, ViewTreeObserver viewTreeObserver, l2 l2Var) {
        super(j3, str, j10, h6Var);
        this.V = viewTreeObserver;
        this.W = l2Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.V.removeOnPreDrawListener(this.W);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.V.addOnPreDrawListener(this.W);
    }
}
