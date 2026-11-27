package defpackage;

import android.content.Context;
import android.view.KeyEvent;
public final class zj2 extends ok2 {
    public final int i2;
    public final int j2;
    public final bk2 k2;

    public zj2(bk2 bk2Var, Context context, int i, int i2) {
        super(context);
        this.k2 = bk2Var;
        this.i2 = i;
        this.j2 = i2;
        this.Q1 = 1.0f;
        this.R1 = new vpa(this, ok2.e2);
        this.S1 = new vpa(this, ok2.f2);
        this.T1 = new vpa(this, ok2.g2);
        this.U1 = new vpa(this, ok2.h2);
        this.V1 = true;
        this.W1 = 1.0f;
        this.X1 = 1.0f;
        this.d2 = false;
        setBackground(null);
        yob.X(this, aob.G6, null);
        setMovementMethod(null);
        addTextChangedListener(new c7(this, (byte) 14));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            int keyCode = keyEvent.getKeyCode();
            bk2 bk2Var = this.k2;
            int length = bk2Var.f.length;
            int i = this.i2;
            if (i < length) {
                if (keyEvent.getAction() == 1) {
                    if (keyCode == 67) {
                        int length2 = bk2Var.f[i].length();
                        ok2[] ok2VarArr = bk2Var.f;
                        if (length2 == 1) {
                            ok2VarArr[i].E();
                            bk2Var.f[i].setText("");
                            return true;
                        } else if (ok2VarArr[i].length() == 0 && i > 0) {
                            int i2 = i - 1;
                            ok2 ok2Var = bk2Var.f[i2];
                            ok2Var.setSelection(ok2Var.length());
                            for (int i3 = 0; i3 < i; i3++) {
                                ok2[] ok2VarArr2 = bk2Var.f;
                                if (i3 == i2) {
                                    ok2VarArr2[i2].requestFocus();
                                } else {
                                    ok2VarArr2[i3].clearFocus();
                                }
                            }
                            bk2Var.f[i2].E();
                            bk2Var.f[i2].setText("");
                            return true;
                        }
                    }
                    if (keyCode >= 7 && keyCode <= 16) {
                        String num = Integer.toString(keyCode - 7);
                        if (bk2Var.f[i].getText() != null && num.equals(bk2Var.f[i].getText().toString())) {
                            if (i >= this.j2 - 1) {
                                bk2Var.a();
                                return true;
                            }
                            bk2Var.f[i + 1].requestFocus();
                            return true;
                        }
                        if (bk2Var.f[i].length() > 0) {
                            bk2Var.f[i].E();
                        }
                        bk2Var.f[i].setText(num);
                    }
                    return true;
                }
                return isFocused();
            }
        }
        return false;
    }
}
