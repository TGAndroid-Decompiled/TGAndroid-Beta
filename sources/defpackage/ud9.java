package defpackage;

import android.view.View;
public final class ud9 implements Runnable {
    public final byte a;
    public final ye9 b;
    public final lk0 c;
    public final int d;

    public ud9(ye9 ye9Var, lk0 lk0Var, int i, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = lk0Var;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        View view = null;
        int i = this.d;
        lk0 lk0Var = this.c;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                if (lk0Var != null) {
                    view = ye9Var.C1(lk0Var);
                }
                if (view instanceof wi9) {
                    wi9 wi9Var = (wi9) view;
                    wi9Var.A();
                    wi9Var.getEditText().setSelection(Math.min(i, wi9Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                if (lk0Var != null) {
                    view = ye9Var.C1(lk0Var);
                }
                if (view instanceof wi9) {
                    wi9 wi9Var2 = (wi9) view;
                    wi9Var2.A();
                    wi9Var2.getEditText().setSelection(Math.min(i, wi9Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof wi9) {
                    wi9 wi9Var3 = (wi9) C1;
                    wi9Var3.A();
                    wi9Var3.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View C12 = ye9Var.C1(lk0Var);
                if (C12 instanceof wi9) {
                    wi9 wi9Var4 = (wi9) C12;
                    wi9Var4.A();
                    wi9Var4.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View C13 = ye9Var.C1(lk0Var);
                if (C13 instanceof wi9) {
                    wi9 wi9Var5 = (wi9) C13;
                    wi9Var5.A();
                    wi9Var5.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View C14 = ye9Var.C1(lk0Var);
                if (C14 instanceof wi9) {
                    wi9 wi9Var6 = (wi9) C14;
                    wi9Var6.A();
                    wi9Var6.getEditText().setSelection(Math.max(0, Math.min(i, wi9Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
