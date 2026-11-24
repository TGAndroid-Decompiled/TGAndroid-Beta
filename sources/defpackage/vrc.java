package defpackage;

import org.telegram.tgnet.TLRPC;
public final class vrc implements qac {
    public final byte a;
    public final asc b;

    public vrc(asc ascVar, byte b) {
        this.a = b;
        this.b = ascVar;
    }

    @Override
    public final void a(Object obj) {
        l7 l7Var;
        byte b = this.a;
        asc ascVar = this.b;
        switch (b) {
            case 0:
                ascVar.f0((String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!ascVar.isFinished && (l7Var = ascVar.O) != null) {
                    if (user == null) {
                        gm.c3(new wrc(ascVar, (byte) 1));
                        return;
                    }
                    gm.t1(l7Var);
                    ascVar.m0(null, user);
                    return;
                }
                return;
        }
    }
}
