package defpackage;

import android.content.Context;
import android.view.KeyEvent;
public final class rk2 extends gl2 {
    public final int h2;
    public final int i2;
    public final tk2 j2;

    public rk2(tk2 tk2Var, Context context, int i, int i2) {
        super(context);
        this.j2 = tk2Var;
        this.h2 = i;
        this.i2 = i2;
        this.P1 = 1.0f;
        this.Q1 = new zna(this, gl2.d2);
        this.R1 = new zna(this, gl2.e2);
        this.S1 = new zna(this, gl2.f2);
        this.T1 = new zna(this, gl2.g2);
        this.U1 = true;
        this.V1 = 1.0f;
        this.W1 = 1.0f;
        this.c2 = false;
        setBackground(null);
        anb.X(this, cmb.F6, null);
        setMovementMethod(null);
        addTextChangedListener(new b7(this, (byte) 15));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            int keyCode = keyEvent.getKeyCode();
            tk2 tk2Var = this.j2;
            int length = tk2Var.f.length;
            int i = this.h2;
            if (i < length) {
                if (keyEvent.getAction() == 1) {
                    if (keyCode == 67) {
                        int length2 = tk2Var.f[i].length();
                        gl2[] gl2VarArr = tk2Var.f;
                        if (length2 == 1) {
                            gl2VarArr[i].E();
                            tk2Var.f[i].setText("");
                            return true;
                        } else if (gl2VarArr[i].length() == 0 && i > 0) {
                            int i2 = i - 1;
                            gl2 gl2Var = tk2Var.f[i2];
                            gl2Var.setSelection(gl2Var.length());
                            for (int i3 = 0; i3 < i; i3++) {
                                gl2[] gl2VarArr2 = tk2Var.f;
                                if (i3 == i2) {
                                    gl2VarArr2[i2].requestFocus();
                                } else {
                                    gl2VarArr2[i3].clearFocus();
                                }
                            }
                            tk2Var.f[i2].E();
                            tk2Var.f[i2].setText("");
                            return true;
                        }
                    }
                    if (keyCode >= 7 && keyCode <= 16) {
                        String num = Integer.toString(keyCode - 7);
                        if (tk2Var.f[i].getText() != null && num.equals(tk2Var.f[i].getText().toString())) {
                            if (i >= this.i2 - 1) {
                                tk2Var.a();
                                return true;
                            }
                            tk2Var.f[i + 1].requestFocus();
                            return true;
                        }
                        if (tk2Var.f[i].length() > 0) {
                            tk2Var.f[i].E();
                        }
                        tk2Var.f[i].setText(num);
                    }
                    return true;
                }
                return isFocused();
            }
        }
        return false;
    }
}
