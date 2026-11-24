package defpackage;
public final class sz3 extends mu1 {
    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        ar1 ar1Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (ar1Var = this.a0) != null) {
            ar1Var.V1();
            this.a0.postDelayed(new li3(this, (byte) 25), 100L);
        }
    }
}
