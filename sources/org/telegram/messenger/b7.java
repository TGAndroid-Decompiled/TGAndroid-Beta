package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b7 implements RequestDelegate {
    public final int f16846a;
    public final int f16847b;
    public final String f16848c;
    public final String d;
    public final BaseController e;

    public b7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f16846a = i11;
        this.e = baseController;
        this.f16847b = i10;
        this.f16848c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16846a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f16847b, this.f16848c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f16847b, this.f16848c, this.d, tLObject, tL_error);
                return;
        }
    }
}
