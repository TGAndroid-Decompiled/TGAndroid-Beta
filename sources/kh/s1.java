package kh;

import android.view.ViewTreeObserver;
public final class s1 extends r5 {
    public final ViewTreeObserver K;
    public final z0 L;

    public s1(long j10, String str, long j11, org.telegram.ui.ActionBar.f6 f6Var, ViewTreeObserver viewTreeObserver, z0 z0Var) {
        super(j10, str, j11, f6Var);
        this.K = viewTreeObserver;
        this.L = z0Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.K.removeOnPreDrawListener(this.L);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.K.addOnPreDrawListener(this.L);
    }
}
