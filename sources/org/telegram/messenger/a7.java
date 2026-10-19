package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a7 implements RequestDelegate {
    public final int f17847a;
    public final int f17848b;
    public final String f17849c;
    public final String d;
    public final BaseController e;

    public a7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17847a = i11;
        this.e = baseController;
        this.f17848b = i10;
        this.f17849c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17847a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f17848b, this.f17849c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f17848b, this.f17849c, this.d, tLObject, tL_error);
                return;
        }
    }
}
