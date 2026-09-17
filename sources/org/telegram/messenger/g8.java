package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f17793a;
    public final int f17794b;
    public final String f17795c;
    public final String d;
    public final BaseController f17796e;

    public g8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17793a = i11;
        this.f17796e = baseController;
        this.f17794b = i10;
        this.f17795c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17793a) {
            case 0:
                ((MediaDataController) this.f17796e).lambda$fetchNewEmojiKeywords$212(this.f17794b, this.f17795c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17796e).lambda$checkPromoInfoInternal$169(this.f17794b, this.f17795c, this.d, tLObject, tL_error);
                return;
        }
    }
}
