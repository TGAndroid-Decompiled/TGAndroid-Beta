package defpackage;

import android.view.View;
public final class sd9 implements Runnable {
    public final byte a;
    public final ye9 b;
    public final lk0 c;

    public sd9(ye9 ye9Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = lk0Var;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        lk0 lk0Var = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                ye9Var.Z2(lk0Var);
                return;
            case 1:
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var = (wi9) C1;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                ye9Var.Z2(lk0Var);
                return;
            case 3:
                ye9Var.Y2(lk0Var, true);
                return;
            case 4:
                ye9Var.Y2(lk0Var, false);
                return;
            case 5:
                ye9Var.Y2(lk0Var, true);
                return;
            case 6:
                ye9Var.Z2(lk0Var);
                return;
            case 7:
                ye9Var.X2(lk0Var, false);
                return;
            case 8:
                ye9Var.X2(lk0Var, true);
                return;
            case 9:
                ye9Var.Z2(lk0Var);
                return;
            case 10:
                ye9Var.X2(lk0Var, true);
                return;
            case 11:
                ye9Var.Z2(lk0Var);
                return;
            case 12:
                ye9Var.Y2(lk0Var, false);
                return;
            case 13:
                ye9Var.X2(lk0Var, true);
                return;
            case 14:
                View C12 = ye9Var.C1(lk0Var);
                if (C12 instanceof eib) {
                    ye9Var.v3.a0(0, 0, (eib) C12);
                    return;
                }
                return;
            case 15:
                View C13 = ye9Var.C1(lk0Var);
                if (C13 instanceof eib) {
                    if (C13 instanceof wi9) {
                        i = ((wi9) C13).getEditText().length();
                    } else {
                        i = 0;
                    }
                    ye9Var.v3.a0(0, i, (eib) C13);
                    return;
                }
                return;
            case 16:
                ye9Var.b3(lk0Var);
                return;
            case 17:
                View C14 = ye9Var.C1(lk0Var);
                if (C14 instanceof wi9) {
                    wi9 wi9Var2 = (wi9) C14;
                    wi9Var2.A();
                    wi9Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View C15 = ye9Var.C1(lk0Var);
                if (C15 instanceof wi9) {
                    wi9 wi9Var3 = (wi9) C15;
                    wi9Var3.A();
                    wi9Var3.getEditText().setSelection(wi9Var3.getEditText().length());
                    return;
                } else if (C15 instanceof ii9) {
                    ii9 ii9Var = (ii9) C15;
                    if (ii9Var.getGrid().getChildCount() > 0) {
                        View childAt = ii9Var.getGrid().getChildAt(0);
                        if (childAt instanceof li9) {
                            ((li9) childAt).a.O();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                ye9Var.a3(lk0Var);
                return;
            case 20:
                View C16 = ye9Var.C1(lk0Var);
                if (C16 instanceof ac9) {
                    ((ac9) C16).d.O();
                    return;
                }
                return;
            case 21:
                ye9Var.a3(lk0Var);
                return;
            case 22:
                ye9Var.a3(lk0Var);
                return;
            case 23:
                View C17 = ye9Var.C1(lk0Var);
                if (C17 instanceof wi9) {
                    wi9 wi9Var4 = (wi9) C17;
                    wi9Var4.A();
                    wi9Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                ye9Var.Z2(lk0Var);
                return;
            case 25:
                ye9Var.d5(lk0Var, "");
                return;
            case 26:
                ye9Var.Z2(lk0Var);
                return;
            case 27:
                ye9Var.Z2(lk0Var);
                return;
            case 28:
                ye9Var.Z2(lk0Var);
                return;
            default:
                ye9Var.Z2(lk0Var);
                return;
        }
    }
}
