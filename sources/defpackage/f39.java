package defpackage;

import org.telegram.tgnet.TLObject;
public final class f39 implements Runnable {
    public final byte a;
    public final o39 b;
    public final TLObject c;

    public f39(o39 o39Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = o39Var;
        this.c = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        o39 o39Var = this.b;
        switch (b) {
            case 0:
                jn7.f(o39Var.b).d(new f39(o39Var, tLObject, (byte) 1));
                return;
            default:
                o39Var.b(tLObject);
                return;
        }
    }
}
