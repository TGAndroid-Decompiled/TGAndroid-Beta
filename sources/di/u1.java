package di;

import org.telegram.tgnet.RequestDelegate;
public final class u1 implements RequestDelegate {
    public final int f9511a;
    public final int f9512b;
    public final Object f9513c;

    public u1(int i7, m9 m9Var) {
        this.f9511a = 3;
        this.f9512b = i7;
        this.f9513c = m9Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r24, org.telegram.tgnet.TLRPC.TL_error r25) {
        throw new UnsupportedOperationException("Method not decompiled: di.u1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public u1(Object obj, int i7, int i10) {
        this.f9511a = i10;
        this.f9513c = obj;
        this.f9512b = i7;
    }
}
