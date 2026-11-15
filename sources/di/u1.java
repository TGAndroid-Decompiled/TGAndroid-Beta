package di;

import org.telegram.tgnet.RequestDelegate;
public final class u1 implements RequestDelegate {
    public final int f9496a;
    public final int f9497b;
    public final Object f9498c;

    public u1(int i7, l9 l9Var) {
        this.f9496a = 3;
        this.f9497b = i7;
        this.f9498c = l9Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r24, org.telegram.tgnet.TLRPC.TL_error r25) {
        throw new UnsupportedOperationException("Method not decompiled: di.u1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public u1(Object obj, int i7, int i10) {
        this.f9496a = i10;
        this.f9498c = obj;
        this.f9497b = i7;
    }
}
