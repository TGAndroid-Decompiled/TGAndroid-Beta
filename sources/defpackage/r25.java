package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class r25 extends PasscodeActivity {
    public final boolean[] X;
    public final pcc Y;

    public r25(boolean[] zArr, pcc pccVar) {
        super(3);
        this.X = zArr;
        this.Y = pccVar;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X[0]) {
            this.Y.a("PASSCODE_FAILED");
        }
    }
}
