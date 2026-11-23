package bi;

import android.view.ViewTreeObserver;
public final class a3 extends j8 {
    public final ViewTreeObserver V;
    public final j2 W;

    public a3(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var, ViewTreeObserver viewTreeObserver, j2 j2Var) {
        super(j3, str, j10, h6Var);
        this.V = viewTreeObserver;
        this.W = j2Var;
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
