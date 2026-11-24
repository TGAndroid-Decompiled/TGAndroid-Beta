package defpackage;

import android.view.ViewTreeObserver;
public final class jx4 extends zb9 {
    public final ViewTreeObserver V;
    public final cx4 W;

    public jx4(long j, String str, long j2, ylb ylbVar, ViewTreeObserver viewTreeObserver, cx4 cx4Var) {
        super(j, str, j2, ylbVar);
        this.V = viewTreeObserver;
        this.W = cx4Var;
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
