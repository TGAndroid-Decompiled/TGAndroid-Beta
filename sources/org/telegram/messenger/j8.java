package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j8 implements RequestDelegate {
    public final int f20650a;
    public final int f20651b;
    public final String f20652c;
    public final String d;
    public final BaseController f20653e;

    public j8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f20650a = i11;
        this.f20653e = baseController;
        this.f20651b = i10;
        this.f20652c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20650a) {
            case 0:
                ((MediaDataController) this.f20653e).lambda$fetchNewEmojiKeywords$212(this.f20651b, this.f20652c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20653e).lambda$checkPromoInfoInternal$169(this.f20651b, this.f20652c, this.d, tLObject, tL_error);
                return;
        }
    }
}
