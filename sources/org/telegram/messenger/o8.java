package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o8 implements RequestDelegate {
    public final int f15942a;
    public final int f15943b;
    public final String f15944c;
    public final String d;
    public final BaseController e;

    public o8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f15942a = i11;
        this.e = baseController;
        this.f15943b = i10;
        this.f15944c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15942a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$212(this.f15943b, this.f15944c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.f15943b, this.f15944c, this.d, tLObject, tL_error);
                return;
        }
    }
}
