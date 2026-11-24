package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class n25 extends PasscodeActivity {
    public final boolean[] X;
    public final qac Y;

    public n25(boolean[] zArr, qac qacVar) {
        super(3);
        this.X = zArr;
        this.Y = qacVar;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X[0]) {
            this.Y.a("PASSCODE_FAILED");
        }
    }
}
