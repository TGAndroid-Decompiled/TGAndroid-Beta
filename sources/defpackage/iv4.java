package defpackage;

import android.view.ViewTreeObserver;
public final class iv4 extends z99 {
    public final ViewTreeObserver V;
    public final bv4 W;

    public iv4(long j, String str, long j2, wjb wjbVar, ViewTreeObserver viewTreeObserver, bv4 bv4Var) {
        super(j, str, j2, wjbVar);
        this.V = viewTreeObserver;
        this.W = bv4Var;
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
