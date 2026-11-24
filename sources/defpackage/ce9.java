package defpackage;

import android.view.View;
public final class ce9 implements Runnable {
    public final byte a;
    public final ye9 b;
    public final lk0 c;

    public ce9(ye9 ye9Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = lk0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lk0 lk0Var = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                ye9Var.Z2(lk0Var);
                return;
            case 2:
                ye9Var.Z2(lk0Var);
                return;
            case 3:
                ye9Var.a3(lk0Var);
                return;
            case 4:
                ye9Var.Z2(lk0Var);
                return;
            default:
                ye9Var.Z2(lk0Var);
                return;
        }
    }
}
