package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.PasscodeActivity;
public final class jv7 implements TextWatcher {
    public final byte a;
    public final PasscodeActivity b;

    public jv7(PasscodeActivity passcodeActivity, byte b) {
        this.a = b;
        this.b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        PasscodeActivity passcodeActivity = this.b;
        switch (b) {
            case 0:
                ev7 ev7Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(ev7Var);
                    ev7Var.run();
                    return;
                }
                return;
            default:
                ev7 ev7Var2 = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.n.removeCallbacks(ev7Var2);
                    ev7Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
