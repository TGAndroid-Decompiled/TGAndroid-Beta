package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class h8 implements RequestDelegate {

    public final int f20468a;

    public final int f20469b;

    public final String f20470c;
    public final String d;

    public final BaseController f20471e;

    public h8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f20468a = i11;
        this.f20471e = baseController;
        this.f20469b = i10;
        this.f20470c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20468a) {
            case 0:
                ((MediaDataController) this.f20471e).lambda$fetchNewEmojiKeywords$212(this.f20469b, this.f20470c, this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f20471e).lambda$checkPromoInfoInternal$169(this.f20469b, this.f20470c, this.d, tLObject, tL_error);
                break;
        }
    }
}
