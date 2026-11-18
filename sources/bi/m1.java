package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class m1 implements RequestDelegate {
    public final int f3840a;
    public final Object f3841b;
    public final Object f3842c;
    public final Object d;

    public m1(Object obj, Object obj2, Object obj3, int i7) {
        this.f3840a = i7;
        this.f3841b = obj;
        this.f3842c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r11, org.telegram.tgnet.TLRPC.TL_error r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m1.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public m1(boolean[] zArr, org.telegram.ui.web.o oVar, TLRPC.UserFull userFull) {
        this.f3840a = 14;
        this.f3841b = zArr;
        this.d = oVar;
        this.f3842c = userFull;
    }
}
