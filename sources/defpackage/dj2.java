package defpackage;

import android.content.Context;
import android.view.KeyEvent;
public final class dj2 extends sj2 {
    public final int h2;
    public final int i2;
    public final fj2 j2;

    public dj2(fj2 fj2Var, Context context, int i, int i2) {
        super(context);
        this.j2 = fj2Var;
        this.h2 = i;
        this.i2 = i2;
        this.P1 = 1.0f;
        this.Q1 = new yla(this, sj2.d2);
        this.R1 = new yla(this, sj2.e2);
        this.S1 = new yla(this, sj2.f2);
        this.T1 = new yla(this, sj2.g2);
        this.U1 = true;
        this.V1 = 1.0f;
        this.W1 = 1.0f;
        this.c2 = false;
        setBackground(null);
        zkb.X(this, bkb.F6, null);
        setMovementMethod(null);
        addTextChangedListener(new b7(this, (byte) 14));
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            int keyCode = keyEvent.getKeyCode();
            fj2 fj2Var = this.j2;
            int length = fj2Var.f.length;
            int i = this.h2;
            if (i < length) {
                if (keyEvent.getAction() == 1) {
                    if (keyCode == 67) {
                        int length2 = fj2Var.f[i].length();
                        sj2[] sj2VarArr = fj2Var.f;
                        if (length2 == 1) {
                            sj2VarArr[i].E();
                            fj2Var.f[i].setText("");
                            return true;
                        } else if (sj2VarArr[i].length() == 0 && i > 0) {
                            int i2 = i - 1;
                            sj2 sj2Var = fj2Var.f[i2];
                            sj2Var.setSelection(sj2Var.length());
                            for (int i3 = 0; i3 < i; i3++) {
                                sj2[] sj2VarArr2 = fj2Var.f;
                                if (i3 == i2) {
                                    sj2VarArr2[i2].requestFocus();
                                } else {
                                    sj2VarArr2[i3].clearFocus();
                                }
                            }
                            fj2Var.f[i2].E();
                            fj2Var.f[i2].setText("");
                            return true;
                        }
                    }
                    if (keyCode >= 7 && keyCode <= 16) {
                        String num = Integer.toString(keyCode - 7);
                        if (fj2Var.f[i].getText() != null && num.equals(fj2Var.f[i].getText().toString())) {
                            if (i >= this.i2 - 1) {
                                fj2Var.a();
                                return true;
                            }
                            fj2Var.f[i + 1].requestFocus();
                            return true;
                        }
                        if (fj2Var.f[i].length() > 0) {
                            fj2Var.f[i].E();
                        }
                        fj2Var.f[i].setText(num);
                    }
                    return true;
                }
                return isFocused();
            }
        }
        return false;
    }
}
