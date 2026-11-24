package defpackage;

import org.telegram.tgnet.TLObject;
public final class rz8 implements Runnable {
    public final byte a;
    public final a09 b;
    public final TLObject c;

    public rz8(a09 a09Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = a09Var;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        a09 a09Var = this.b;
        switch (b) {
            case 0:
                kk7.f(a09Var.b).d(new rz8(a09Var, tLObject, (byte) 1));
                return;
            default:
                a09Var.b(tLObject);
                return;
        }
    }
}
