package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class lh3 implements qac {
    public final byte a;
    public final nk3 b;

    public lh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.Q1 = (Long) obj;
                nk3Var.q5();
                return;
            default:
                nk3Var.q4((TL_account.TL_birthday) obj);
                return;
        }
    }
}
