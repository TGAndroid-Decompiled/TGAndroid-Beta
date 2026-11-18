package bi;

import android.view.ViewTreeObserver;
public final class w2 extends h8 {
    public final ViewTreeObserver V;
    public final f2 W;

    public w2(long j3, String str, long j10, org.telegram.ui.ActionBar.i6 i6Var, ViewTreeObserver viewTreeObserver, f2 f2Var) {
        super(j3, str, j10, i6Var);
        this.V = viewTreeObserver;
        this.W = f2Var;
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
