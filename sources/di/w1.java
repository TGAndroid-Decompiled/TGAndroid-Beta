package di;

import org.telegram.tgnet.RequestDelegate;
public final class w1 implements RequestDelegate {
    public final int f9959a;
    public final int f9960b;
    public final Object f9961c;

    public w1(int i7, o9 o9Var) {
        this.f9959a = 3;
        this.f9960b = i7;
        this.f9961c = o9Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r19, org.telegram.tgnet.TLRPC.TL_error r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.w1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public w1(Object obj, int i7, int i10) {
        this.f9959a = i10;
        this.f9961c = obj;
        this.f9960b = i7;
    }
}
