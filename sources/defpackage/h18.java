package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class h18 extends TwoStepVerificationActivity {
    public final c34 e0;

    public h18(c34 c34Var) {
        this.e0 = c34Var;
    }

    @Override
    public final void onFragmentDestroy() {
        c34 c34Var = this.e0;
        if ((((rj4) c34Var.c) != null || ((g25) c34Var.d) != null) && !c34Var.b) {
            c34Var.f();
        }
        super.onFragmentDestroy();
    }
}
