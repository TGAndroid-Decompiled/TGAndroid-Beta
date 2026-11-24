package defpackage;

import org.telegram.tgnet.RequestDelegate;
public final class w47 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public w47(eta etaVar, na7 na7Var, long j) {
        this.a = (byte) 17;
        this.d = etaVar;
        this.b = na7Var;
        this.c = j;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r28, org.telegram.tgnet.TLRPC.TL_error r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w47.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public w47(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public w47(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
