package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f17841a;
    public final int f17842b;
    public final String f17843c;
    public final String d;
    public final BaseController e;

    public a7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17841a = i11;
        this.e = baseController;
        this.f17842b = i10;
        this.f17843c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17841a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f17842b, this.f17843c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f17842b, this.f17843c, this.d, tLObject, tL_error);
                return;
        }
    }
}
