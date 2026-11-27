package defpackage;

import android.os.Build;
public final class aj6 implements Runnable {
    public final byte a;
    public final fj6 b;

    public aj6(fj6 fj6Var, byte b) {
        this.a = b;
        this.b = fj6Var;
    }

    @Override
    public final void run() {
        rz4 rz4Var;
        uz4[] uz4VarArr;
        byte b = this.a;
        fj6 fj6Var = this.b;
        switch (b) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (rz4Var = fj6Var.V) != null) {
                    rz4Var.c.d = 0L;
                    fj6Var.W.c.d = 0L;
                    fj6Var.c0();
                    return;
                }
                return;
            case 1:
                fj6Var.o0();
                return;
            case 2:
                i91.j0(fj6Var);
                return;
            case 3:
                fj6Var.p0();
                return;
            case 4:
                new sl7(fj6Var, fj6Var.getParentActivity()).show();
                return;
            case 5:
                fj6Var.presentFragment(new i91(bs2.l("needFinishFragment", false)));
                return;
            case 6:
                fj6Var.h0(false);
                return;
            case 7:
                if (fj6Var.getParentActivity() != null && (uz4VarArr = fj6Var.N) != null) {
                    uz4 uz4Var = uz4VarArr[5];
                    float width = ((uz4Var.getWidth() / 2.0f) + (fj6Var.b.getWidth() - ((uz4Var.getX() + fj6Var.I.getX()) + uz4Var.getWidth()))) / hl.p;
                    kg5 kg5Var = new kg5(fj6Var.getParentActivity(), 3);
                    fj6Var.S = kg5Var;
                    kg5Var.setTranslationY(hl.L(4.0f) + (-fj6Var.O));
                    fj6Var.S.setPadding(hl.L(7.33f), 0, hl.L(7.33f), 0);
                    fj6Var.S.p(false);
                    fj6Var.S.j(true);
                    fj6Var.S.t(ob6.M0(2131743954, null));
                    fj6Var.S.n(1.0f, (-width) + 7.33f);
                    fj6Var.b.addView(fj6Var.S, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    kg5 kg5Var2 = fj6Var.S;
                    kg5Var2.r0 = new aj6(fj6Var, (byte) 8);
                    kg5Var2.d = 8000L;
                    kg5Var2.v();
                    mg5.r.b();
                    return;
                }
                return;
            default:
                hl.B2(fj6Var.S);
                return;
        }
    }
}
