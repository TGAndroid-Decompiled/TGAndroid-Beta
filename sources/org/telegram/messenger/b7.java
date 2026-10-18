package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b7 implements RequestDelegate {
    public final int f17930a;
    public final int f17931b;
    public final String f17932c;
    public final String d;
    public final BaseController e;

    public b7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17930a = i11;
        this.e = baseController;
        this.f17931b = i10;
        this.f17932c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17930a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f17931b, this.f17932c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f17931b, this.f17932c, this.d, tLObject, tL_error);
                return;
        }
    }
}
