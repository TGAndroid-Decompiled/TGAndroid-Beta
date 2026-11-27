package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class sg3 implements pcc {
    public final byte a;
    public final uj3 b;

    public sg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.Q1 = (Long) obj;
                uj3Var.q5();
                return;
            default:
                uj3Var.q4((TL_account.TL_birthday) obj);
                return;
        }
    }
}
