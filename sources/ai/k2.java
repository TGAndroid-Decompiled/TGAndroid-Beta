package ai;

import android.view.ViewTreeObserver;
public final class k2 extends i6 {
    public final ViewTreeObserver R;
    public final n1 S;

    public k2(long j10, String str, long j11, org.telegram.ui.ActionBar.e6 e6Var, ViewTreeObserver viewTreeObserver, n1 n1Var) {
        super(j10, str, j11, e6Var);
        this.R = viewTreeObserver;
        this.S = n1Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.R.removeOnPreDrawListener(this.S);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.R.addOnPreDrawListener(this.S);
    }
}
