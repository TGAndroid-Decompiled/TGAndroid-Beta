package defpackage;
public final class n04 extends zu1 {
    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        nr1 nr1Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (nr1Var = this.a0) != null) {
            nr1Var.h2();
            this.a0.postDelayed(new lw3(this, (byte) 4), 100L);
        }
    }
}
