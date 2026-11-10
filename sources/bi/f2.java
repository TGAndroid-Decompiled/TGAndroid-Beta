package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.tl.TL_phone;
public final class f2 implements RequestDelegate {
    public final int f3853a;
    public final Object f3854b;
    public final Object f3855c;
    public final Object d;

    public f2(fi.n8 n8Var, org.telegram.ui.ActionBar.u1 u1Var, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl) {
        this.f3853a = 6;
        this.f3854b = n8Var;
        this.d = u1Var;
        this.f3855c = getgroupcallstreamrtmpurl;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r11, org.telegram.tgnet.TLRPC.TL_error r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.f2.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public f2(Object obj, Object obj2, Object obj3, int i7) {
        this.f3853a = i7;
        this.f3854b = obj;
        this.f3855c = obj2;
        this.d = obj3;
    }
}
