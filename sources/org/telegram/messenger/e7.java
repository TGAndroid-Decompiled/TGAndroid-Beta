package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e7 implements RequestDelegate {
    public final int f18265a;
    public final int f18266b;
    public final String f18267c;
    public final String d;
    public final BaseController e;

    public e7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f18265a = i11;
        this.e = baseController;
        this.f18266b = i10;
        this.f18267c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18265a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f18266b, this.f18267c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f18266b, this.f18267c, this.d, tLObject, tL_error);
                return;
        }
    }
}
