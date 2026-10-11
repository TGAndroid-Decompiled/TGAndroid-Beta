package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y6 implements RequestDelegate {
    public final int f19869a;
    public final int f19870b;
    public final String f19871c;
    public final String d;
    public final BaseController f19872e;

    public y6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19869a = i11;
        this.f19872e = baseController;
        this.f19870b = i10;
        this.f19871c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19869a) {
            case 0:
                ((MediaDataController) this.f19872e).lambda$fetchNewEmojiKeywords$213(this.f19870b, this.f19871c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19872e).lambda$checkPromoInfoInternal$168(this.f19870b, this.f19871c, this.d, tLObject, tL_error);
                return;
        }
    }
}
