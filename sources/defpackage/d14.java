package defpackage;
public final class d14 extends yv1 {
    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        ms1 ms1Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (ms1Var = this.a0) != null) {
            ms1Var.Y1();
            this.a0.postDelayed(new a14(this, (byte) 0), 100L);
        }
    }
}
