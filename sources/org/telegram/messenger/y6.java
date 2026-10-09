package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19874a;
    public final int f19875b;
    public final String f19876c;
    public final String d;
    public final BaseController f19877e;

    public y6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19874a = i11;
        this.f19877e = baseController;
        this.f19875b = i10;
        this.f19876c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19874a) {
            case 0:
                ((MediaDataController) this.f19877e).lambda$fetchNewEmojiKeywords$213(this.f19875b, this.f19876c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19877e).lambda$checkPromoInfoInternal$168(this.f19875b, this.f19876c, this.d, tLObject, tL_error);
                return;
        }
    }
}
