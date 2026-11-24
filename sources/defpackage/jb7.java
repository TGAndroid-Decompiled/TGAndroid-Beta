package defpackage;

import org.telegram.tgnet.RequestDelegate;
public final class jb7 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public jb7(hva hvaVar, oc7 oc7Var, long j) {
        this.a = (byte) 17;
        this.d = hvaVar;
        this.b = oc7Var;
        this.c = j;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r26, org.telegram.tgnet.TLRPC.TL_error r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb7.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public jb7(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public jb7(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
