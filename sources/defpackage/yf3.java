package defpackage;

import org.telegram.tgnet.tl.TL_account;
public final class yf3 implements p8c {
    public final byte a;
    public final cj3 b;

    public yf3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.Q1 = (Long) obj;
                cj3Var.m5();
                return;
            default:
                cj3Var.n4((TL_account.TL_birthday) obj);
                return;
        }
    }
}
