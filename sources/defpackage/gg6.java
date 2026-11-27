package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gg6 implements Runnable {
    public final byte a;
    public final tg6 b;

    public gg6(tg6 tg6Var, byte b) {
        this.a = b;
        this.b = tg6Var;
    }

    @Override
    public final void run() {
        ok2[] ok2VarArr;
        View view;
        byte b = this.a;
        int i = 0;
        tg6 tg6Var = this.b;
        switch (b) {
            case 0:
                e29 e29Var = tg6Var.H;
                bk2 bk2Var = tg6Var.f;
                byte b2 = tg6Var.i0;
                if (b2 != 3 && (ok2VarArr = bk2Var.f) != null) {
                    for (int length = ok2VarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || bk2Var.f[length].length() != 0) {
                            bk2Var.f[length].requestFocus();
                            ok2 ok2Var = bk2Var.f[length];
                            ok2Var.setSelection(ok2Var.length());
                            tg6Var.v0.M1(bk2Var.f[length]);
                        }
                    }
                }
                b29 b29Var = tg6Var.a;
                if (b29Var != null) {
                    b29Var.start();
                }
                if (b2 == 15) {
                    e29Var.getAnimatedDrawable().I(0, false, false);
                    e29Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                hl.c3(new gg6(tg6Var, (byte) 6));
                return;
            case 2:
                cf6 cf6Var = tg6Var.x;
                tg6Var.t0 = false;
                while (true) {
                    ok2[] ok2VarArr2 = tg6Var.f.f;
                    if (i < ok2VarArr2.length) {
                        ok2VarArr2[i].A(0.0f);
                        i++;
                    } else {
                        if (tg6Var.i0 == 15) {
                            view = tg6Var.G;
                        } else {
                            view = tg6Var.E;
                        }
                        if (cf6Var.getCurrentView() != view) {
                            cf6Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                hl.c3(new gg6(tg6Var, (byte) 4));
                return;
            case 4:
                e29 e29Var2 = tg6Var.s;
                e29Var2.setAutoRepeat(true);
                b29 b29Var2 = tg6Var.R;
                b29Var2.I(0, false, false);
                b29Var2.F(1);
                e29Var2.setAnimation(b29Var2);
                e29Var2.d();
                return;
            case 5:
                try {
                    tg6Var.v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tg6Var.getContext());
                String M0 = ob6.M0(2131742429, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.a0(null, null, 2131752515, xnb.k(new StringBuilder("+"), tg6Var.d, f78.f()));
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                idVar.setOnDismissListener(new og6(tg6Var, (byte) 1));
                alertDialog$Builder.o();
                return;
            case 6:
                b29 b29Var3 = tg6Var.S;
                b29Var3.u0 = new gg6(tg6Var, (byte) 8);
                e29 e29Var3 = tg6Var.s;
                e29Var3.setAutoRepeat(false);
                b29Var3.I(0, false, false);
                e29Var3.setAnimation(b29Var3);
                e29Var3.d();
                return;
            case 7:
                tg6Var.postDelayed(new gg6(tg6Var, (byte) 9), 150L);
                return;
            case 8:
                hl.c3(new gg6(tg6Var, (byte) 10));
                return;
            case 9:
                bk2 bk2Var2 = tg6Var.f;
                bk2Var2.e = false;
                bk2Var2.f[0].requestFocus();
                while (true) {
                    ok2[] ok2VarArr3 = bk2Var2.f;
                    if (i < ok2VarArr3.length) {
                        ok2VarArr3[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                e29 e29Var4 = tg6Var.s;
                e29Var4.setAutoRepeat(false);
                e29Var4.setAnimation(tg6Var.a);
                return;
        }
    }
}
