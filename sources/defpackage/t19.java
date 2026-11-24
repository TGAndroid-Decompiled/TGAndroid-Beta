package defpackage;

import org.telegram.tgnet.TLObject;
public final class t19 implements Runnable {
    public final byte a;
    public final c29 b;
    public final TLObject c;

    public t19(c29 c29Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = c29Var;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        c29 c29Var = this.b;
        switch (b) {
            case 0:
                nm7.f(c29Var.b).d(new t19(c29Var, tLObject, (byte) 1));
                return;
            default:
                c29Var.b(tLObject);
                return;
        }
    }
}
