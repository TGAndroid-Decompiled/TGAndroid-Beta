package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k8 implements RequestDelegate {
    public final int f19143a;
    public final int f19144b;
    public final String f19145c;
    public final String d;
    public final BaseController f19146e;

    public k8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19143a = i11;
        this.f19146e = baseController;
        this.f19144b = i10;
        this.f19145c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19143a) {
            case 0:
                ((MediaDataController) this.f19146e).lambda$fetchNewEmojiKeywords$212(this.f19144b, this.f19145c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19146e).lambda$checkPromoInfoInternal$169(this.f19144b, this.f19145c, this.d, tLObject, tL_error);
                return;
        }
    }
}
