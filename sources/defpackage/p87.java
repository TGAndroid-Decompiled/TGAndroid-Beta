package defpackage;

import org.telegram.tgnet.RequestDelegate;
public final class p87 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public p87(hxa hxaVar, uc7 uc7Var, long j) {
        this.a = (byte) 18;
        this.d = hxaVar;
        this.b = uc7Var;
        this.c = j;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r25, org.telegram.tgnet.TLRPC.TL_error r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p87.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public p87(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public p87(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
