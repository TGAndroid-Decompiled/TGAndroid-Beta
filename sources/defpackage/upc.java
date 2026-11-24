package defpackage;

import org.telegram.tgnet.TLRPC;
public final class upc implements p8c {
    public final byte a;
    public final ypc b;

    public upc(ypc ypcVar, byte b) {
        this.a = b;
        this.b = ypcVar;
    }

    @Override
    public final void a(Object obj) {
        l7 l7Var;
        byte b = this.a;
        ypc ypcVar = this.b;
        switch (b) {
            case 0:
                ypcVar.e0((String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!ypcVar.isFinished && (l7Var = ypcVar.O) != null) {
                    if (user == null) {
                        gl.c3(new vpc(ypcVar, (byte) 1));
                        return;
                    }
                    gl.t1(l7Var);
                    ypcVar.l0(null, user);
                    return;
                }
                return;
        }
    }
}
