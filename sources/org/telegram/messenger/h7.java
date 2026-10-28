package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h7 implements RequestDelegate {
    public final int f20227a;
    public final int f20228b;
    public final String f20229c;
    public final String d;
    public final BaseController e;

    public h7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f20227a = i11;
        this.e = baseController;
        this.f20228b = i10;
        this.f20229c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20227a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f20228b, this.f20229c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f20228b, this.f20229c, this.d, tLObject, tL_error);
                return;
        }
    }
}
