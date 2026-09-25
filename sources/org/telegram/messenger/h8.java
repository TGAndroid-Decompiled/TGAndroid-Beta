package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h8 implements RequestDelegate {
    public final int f16536a;
    public final int f16537b;
    public final String f16538c;
    public final String d;
    public final BaseController e;

    public h8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f16536a = i11;
        this.e = baseController;
        this.f16537b = i10;
        this.f16538c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16536a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$212(this.f16537b, this.f16538c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.f16537b, this.f16538c, this.d, tLObject, tL_error);
                return;
        }
    }
}
