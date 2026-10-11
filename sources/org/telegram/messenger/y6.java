package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19905a;
    public final int f19906b;
    public final String f19907c;
    public final String d;
    public final BaseController f19908e;

    public y6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19905a = i11;
        this.f19908e = baseController;
        this.f19906b = i10;
        this.f19907c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19905a) {
            case 0:
                ((MediaDataController) this.f19908e).lambda$fetchNewEmojiKeywords$213(this.f19906b, this.f19907c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19908e).lambda$checkPromoInfoInternal$168(this.f19906b, this.f19907c, this.d, tLObject, tL_error);
                return;
        }
    }
}
