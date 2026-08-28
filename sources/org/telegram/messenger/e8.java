package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e8 implements RequestDelegate {
    public final int f20163a;
    public final int f20164b;
    public final String f20165c;
    public final String d;
    public final BaseController f20166e;

    public e8(BaseController baseController, int i9, String str, String str2, int i10) {
        this.f20163a = i10;
        this.f20166e = baseController;
        this.f20164b = i9;
        this.f20165c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20163a) {
            case 0:
                ((MediaDataController) this.f20166e).lambda$fetchNewEmojiKeywords$212(this.f20164b, this.f20165c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20166e).lambda$checkPromoInfoInternal$169(this.f20164b, this.f20165c, this.d, tLObject, tL_error);
                return;
        }
    }
}
