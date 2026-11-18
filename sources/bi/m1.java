package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class m1 implements RequestDelegate {
    public final int f3869a;
    public final Object f3870b;
    public final Object f3871c;
    public final Object d;

    public m1(Object obj, Object obj2, Object obj3, int i7) {
        this.f3869a = i7;
        this.f3870b = obj;
        this.f3871c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r11, org.telegram.tgnet.TLRPC.TL_error r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public m1(boolean[] zArr, org.telegram.ui.web.o oVar, TLRPC.UserFull userFull) {
        this.f3869a = 14;
        this.f3870b = zArr;
        this.d = oVar;
        this.f3871c = userFull;
    }
}
