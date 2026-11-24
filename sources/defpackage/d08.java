package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class d08 extends TwoStepVerificationActivity {
    public final s34 e0;

    public d08(s34 s34Var) {
        this.e0 = s34Var;
    }

    @Override
    public final void onFragmentDestroy() {
        s34 s34Var = this.e0;
        if ((((qn4) s34Var.c) != null || ((c25) s34Var.d) != null) && !s34Var.b) {
            s34Var.f();
        }
        super.onFragmentDestroy();
    }
}
