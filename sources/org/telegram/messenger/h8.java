package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h8 implements RequestDelegate {
    public final int f17877a;
    public final int f17878b;
    public final String f17879c;
    public final String d;
    public final BaseController f17880e;

    public h8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17877a = i11;
        this.f17880e = baseController;
        this.f17878b = i10;
        this.f17879c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17877a) {
            case 0:
                ((MediaDataController) this.f17880e).lambda$fetchNewEmojiKeywords$212(this.f17878b, this.f17879c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17880e).lambda$checkPromoInfoInternal$169(this.f17878b, this.f17879c, this.d, tLObject, tL_error);
                return;
        }
    }
}
