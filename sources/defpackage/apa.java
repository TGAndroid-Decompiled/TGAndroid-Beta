package defpackage;

import org.telegram.tgnet.RequestDelegate;
public final class apa implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;

    public apa(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r13, org.telegram.tgnet.TLRPC.TL_error r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apa.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }
}
