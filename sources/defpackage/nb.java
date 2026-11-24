package defpackage;

import org.telegram.tgnet.TLRPC;
public final class nb implements p8c {
    public final byte a;
    public final bc b;

    public nb(bc bcVar, byte b) {
        this.a = b;
        this.b = bcVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        bc bcVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new ee2(bcVar, (TLRPC.UserFull) obj, (byte) 22));
                return;
            case 1:
                bcVar.b0.commission_permille = ((Integer) obj).intValue();
                bcVar.K0();
                return;
            default:
                bcVar.b0.duration_months = ((Integer) bcVar.d0.get(((Integer) obj).intValue())).intValue();
                bcVar.K0();
                return;
        }
    }
}
