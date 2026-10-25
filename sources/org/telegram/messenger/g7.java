package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g7 implements RequestDelegate {
    public final int f20146a;
    public final int f20147b;
    public final String f20148c;
    public final String d;
    public final BaseController e;

    public g7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f20146a = i11;
        this.e = baseController;
        this.f20147b = i10;
        this.f20148c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20146a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f20147b, this.f20148c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f20147b, this.f20148c, this.d, tLObject, tL_error);
                return;
        }
    }
}
