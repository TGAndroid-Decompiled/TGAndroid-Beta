package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ee6 implements Runnable {
    public final byte a;
    public final qe6 b;

    public ee6(qe6 qe6Var, byte b) {
        this.a = b;
        this.b = qe6Var;
    }

    @Override
    public final void run() {
        sj2[] sj2VarArr;
        View view;
        byte b = this.a;
        int i = 0;
        qe6 qe6Var = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = qe6Var.H;
                fj2 fj2Var = qe6Var.f;
                byte b2 = qe6Var.i0;
                if (b2 != 3 && (sj2VarArr = fj2Var.f) != null) {
                    for (int length = sj2VarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fj2Var.f[length].length() != 0) {
                            fj2Var.f[length].requestFocus();
                            sj2 sj2Var = fj2Var.f[length];
                            sj2Var.setSelection(sj2Var.length());
                            qe6Var.v0.L1(fj2Var.f[length]);
                        }
                    }
                }
                oy8 oy8Var = qe6Var.a;
                if (oy8Var != null) {
                    oy8Var.start();
                }
                if (b2 == 15) {
                    ry8Var.getAnimatedDrawable().I(0, false, false);
                    ry8Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                gl.c3(new ee6(qe6Var, (byte) 6));
                return;
            case 2:
                zc6 zc6Var = qe6Var.x;
                qe6Var.t0 = false;
                while (true) {
                    sj2[] sj2VarArr2 = qe6Var.f.f;
                    if (i < sj2VarArr2.length) {
                        sj2VarArr2[i].A(0.0f);
                        i++;
                    } else {
                        if (qe6Var.i0 == 15) {
                            view = qe6Var.G;
                        } else {
                            view = qe6Var.E;
                        }
                        if (zc6Var.getCurrentView() != view) {
                            zc6Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                gl.c3(new ee6(qe6Var, (byte) 4));
                return;
            case 4:
                ry8 ry8Var2 = qe6Var.s;
                ry8Var2.setAutoRepeat(true);
                oy8 oy8Var2 = qe6Var.R;
                oy8Var2.I(0, false, false);
                oy8Var2.F(1);
                ry8Var2.setAnimation(oy8Var2);
                ry8Var2.d();
                return;
            case 5:
                try {
                    qe6Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qe6Var.getContext());
                String M0 = k96.M0(2131742535, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.a0(null, null, 2131752522, yjb.k(new StringBuilder("+"), qe6Var.d, p38.f()));
                alertDialog$Builder.j(k96.M0(2131747638, null), null);
                hdVar.setOnDismissListener(new me6(qe6Var, (byte) 1));
                alertDialog$Builder.o();
                return;
            case 6:
                oy8 oy8Var3 = qe6Var.S;
                oy8Var3.u0 = new ee6(qe6Var, (byte) 8);
                ry8 ry8Var3 = qe6Var.s;
                ry8Var3.setAutoRepeat(false);
                oy8Var3.I(0, false, false);
                ry8Var3.setAnimation(oy8Var3);
                ry8Var3.d();
                return;
            case 7:
                qe6Var.postDelayed(new ee6(qe6Var, (byte) 9), 150L);
                return;
            case 8:
                gl.c3(new ee6(qe6Var, (byte) 10));
                return;
            case 9:
                fj2 fj2Var2 = qe6Var.f;
                fj2Var2.e = false;
                fj2Var2.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr3 = fj2Var2.f;
                    if (i < sj2VarArr3.length) {
                        sj2VarArr3[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                ry8 ry8Var4 = qe6Var.s;
                ry8Var4.setAutoRepeat(false);
                ry8Var4.setAnimation(qe6Var.a);
                return;
        }
    }
}
