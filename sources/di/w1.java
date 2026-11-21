package di;

import org.telegram.tgnet.RequestDelegate;
public final class w1 implements RequestDelegate {
    public final int f9971a;
    public final int f9972b;
    public final Object f9973c;

    public w1(int i7, p9 p9Var) {
        this.f9971a = 3;
        this.f9972b = i7;
        this.f9973c = p9Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r19, org.telegram.tgnet.TLRPC.TL_error r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.w1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public w1(Object obj, int i7, int i10) {
        this.f9971a = i10;
        this.f9973c = obj;
        this.f9972b = i7;
    }
}
