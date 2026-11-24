package defpackage;

import org.telegram.ui.PasscodeActivity;
public final class n05 extends PasscodeActivity {
    public final boolean[] X;
    public final p8c Y;

    public n05(boolean[] zArr, p8c p8cVar) {
        super(3);
        this.X = zArr;
        this.Y = p8cVar;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X[0]) {
            this.Y.a("PASSCODE_FAILED");
        }
    }
}
