package di;

import org.telegram.tgnet.RequestDelegate;
public final class w1 implements RequestDelegate {
    public final int f9941a;
    public final int f9942b;
    public final Object f9943c;

    public w1(int i7, p9 p9Var) {
        this.f9941a = 3;
        this.f9942b = i7;
        this.f9943c = p9Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r24, org.telegram.tgnet.TLRPC.TL_error r25) {
        throw new UnsupportedOperationException("Method not decompiled: di.w1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public w1(Object obj, int i7, int i10) {
        this.f9941a = i10;
        this.f9943c = obj;
        this.f9942b = i7;
    }
}
