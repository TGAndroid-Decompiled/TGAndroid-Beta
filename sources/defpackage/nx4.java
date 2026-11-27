package defpackage;

import android.view.ViewTreeObserver;
public final class nx4 extends nd9 {
    public final ViewTreeObserver d0;
    public final fx4 e0;

    public nx4(long j, String str, long j2, vnb vnbVar, ViewTreeObserver viewTreeObserver, fx4 fx4Var) {
        super(j, str, j2, vnbVar);
        this.d0 = viewTreeObserver;
        this.e0 = fx4Var;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.d0.removeOnPreDrawListener(this.e0);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.d0.addOnPreDrawListener(this.e0);
    }
}
