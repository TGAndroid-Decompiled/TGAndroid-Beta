package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k8 implements RequestDelegate {
    public final int f19141a;
    public final int f19142b;
    public final String f19143c;
    public final String d;
    public final BaseController f19144e;

    public k8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19141a = i11;
        this.f19144e = baseController;
        this.f19142b = i10;
        this.f19143c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19141a) {
            case 0:
                ((MediaDataController) this.f19144e).lambda$fetchNewEmojiKeywords$212(this.f19142b, this.f19143c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19144e).lambda$checkPromoInfoInternal$169(this.f19142b, this.f19143c, this.d, tLObject, tL_error);
                return;
        }
    }
}
