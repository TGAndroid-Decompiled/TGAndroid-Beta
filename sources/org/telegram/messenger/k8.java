package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k8 implements RequestDelegate {
    public final int f17647a;
    public final int f17648b;
    public final String f17649c;
    public final String d;
    public final BaseController e;

    public k8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17647a = i11;
        this.e = baseController;
        this.f17648b = i10;
        this.f17649c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17647a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$212(this.f17648b, this.f17649c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.f17648b, this.f17649c, this.d, tLObject, tL_error);
                return;
        }
    }
}
