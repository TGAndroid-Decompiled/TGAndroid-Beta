package di;

import org.telegram.tgnet.RequestDelegate;
public final class w1 implements RequestDelegate {
    public final int f9935a;
    public final int f9936b;
    public final Object f9937c;

    public w1(int i7, p9 p9Var) {
        this.f9935a = 3;
        this.f9936b = i7;
        this.f9937c = p9Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r23, org.telegram.tgnet.TLRPC.TL_error r24) {
        throw new UnsupportedOperationException("Method not decompiled: di.w1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public w1(Object obj, int i7, int i10) {
        this.f9935a = i10;
        this.f9937c = obj;
        this.f9936b = i7;
    }
}
