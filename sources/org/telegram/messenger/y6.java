package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19878a;
    public final int f19879b;
    public final String f19880c;
    public final String d;
    public final BaseController f19881e;

    public y6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19878a = i11;
        this.f19881e = baseController;
        this.f19879b = i10;
        this.f19880c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19878a) {
            case 0:
                ((MediaDataController) this.f19881e).lambda$fetchNewEmojiKeywords$213(this.f19879b, this.f19880c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19881e).lambda$checkPromoInfoInternal$168(this.f19879b, this.f19880c, this.d, tLObject, tL_error);
                return;
        }
    }
}
