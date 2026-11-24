package defpackage;

import org.telegram.tgnet.RequestDelegate;
public final class w22 implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;

    public w22(int i, rp2 rp2Var) {
        this.a = (byte) 7;
        this.b = i;
        this.c = rp2Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r13, org.telegram.tgnet.TLRPC.TL_error r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public w22(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
