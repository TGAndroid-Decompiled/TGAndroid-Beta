package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ob implements pcc {
    public final byte a;
    public final cc b;

    public ob(cc ccVar, byte b) {
        this.a = b;
        this.b = ccVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        cc ccVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new ve2(ccVar, (TLRPC.UserFull) obj, (byte) 22));
                return;
            case 1:
                ccVar.b0.commission_permille = ((Integer) obj).intValue();
                ccVar.L0();
                return;
            default:
                ccVar.b0.duration_months = ((Integer) ccVar.d0.get(((Integer) obj).intValue())).intValue();
                ccVar.L0();
                return;
        }
    }
}
