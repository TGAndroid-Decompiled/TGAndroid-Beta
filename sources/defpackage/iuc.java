package defpackage;

import org.telegram.tgnet.TLRPC;
public final class iuc implements pcc {
    public final byte a;
    public final muc b;

    public iuc(muc mucVar, byte b) {
        this.a = b;
        this.b = mucVar;
    }

    @Override
    public final void a(Object obj) {
        m7 m7Var;
        byte b = this.a;
        muc mucVar = this.b;
        switch (b) {
            case 0:
                mucVar.e0((String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!mucVar.isFinished && (m7Var = mucVar.O) != null) {
                    if (user == null) {
                        hl.c3(new juc(mucVar, (byte) 1));
                        return;
                    }
                    hl.t1(m7Var);
                    mucVar.l0(null, user);
                    return;
                }
                return;
        }
    }
}
