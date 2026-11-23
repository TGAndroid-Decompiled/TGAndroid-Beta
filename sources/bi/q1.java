package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class q1 implements RequestDelegate {
    public final int f4024a;
    public final Object f4025b;
    public final Object f4026c;
    public final Object d;

    public q1(Object obj, Object obj2, Object obj3, int i7) {
        this.f4024a = i7;
        this.f4025b = obj;
        this.f4026c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r11, org.telegram.tgnet.TLRPC.TL_error r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public q1(boolean[] zArr, org.telegram.ui.web.o oVar, TLRPC.UserFull userFull) {
        this.f4024a = 14;
        this.f4025b = zArr;
        this.d = oVar;
        this.f4026c = userFull;
    }
}
