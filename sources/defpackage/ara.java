package defpackage;

import org.telegram.tgnet.RequestDelegate;
public final class ara implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public ara(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r14, org.telegram.tgnet.TLRPC.TL_error r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ara.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
