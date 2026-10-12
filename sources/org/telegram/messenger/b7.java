package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b7 implements RequestDelegate {
    public final int f17146a;
    public final int f17147b;
    public final String f17148c;
    public final String d;
    public final BaseController f17149e;

    public b7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17146a = i11;
        this.f17149e = baseController;
        this.f17147b = i10;
        this.f17148c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17146a) {
            case 0:
                ((MediaDataController) this.f17149e).lambda$fetchNewEmojiKeywords$213(this.f17147b, this.f17148c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17149e).lambda$checkPromoInfoInternal$168(this.f17147b, this.f17148c, this.d, tLObject, tL_error);
                return;
        }
    }
}
