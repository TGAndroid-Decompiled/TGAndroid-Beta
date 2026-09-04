package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h8 implements RequestDelegate {
    public final int f17850a;
    public final int f17851b;
    public final String f17852c;
    public final String d;
    public final BaseController f17853e;

    public h8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17850a = i11;
        this.f17853e = baseController;
        this.f17851b = i10;
        this.f17852c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17850a) {
            case 0:
                ((MediaDataController) this.f17853e).lambda$fetchNewEmojiKeywords$212(this.f17851b, this.f17852c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17853e).lambda$checkPromoInfoInternal$169(this.f17851b, this.f17852c, this.d, tLObject, tL_error);
                return;
        }
    }
}
