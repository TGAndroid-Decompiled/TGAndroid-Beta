package defpackage;

import org.telegram.ui.TwoStepVerificationActivity;
public final class by7 extends TwoStepVerificationActivity {
    public final h24 e0;

    public by7(h24 h24Var) {
        this.e0 = h24Var;
    }

    @Override
    public final void onFragmentDestroy() {
        h24 h24Var = this.e0;
        if ((((iu4) h24Var.c) != null || ((c05) h24Var.d) != null) && !h24Var.b) {
            h24Var.f();
        }
        super.onFragmentDestroy();
    }
}
