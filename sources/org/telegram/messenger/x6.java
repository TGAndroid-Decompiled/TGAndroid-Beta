package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f19771a;
    public final int f19772b;
    public final String f19773c;
    public final String d;
    public final BaseController f19774e;

    public x6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19771a = i11;
        this.f19774e = baseController;
        this.f19772b = i10;
        this.f19773c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19771a) {
            case 0:
                ((MediaDataController) this.f19774e).lambda$fetchNewEmojiKeywords$213(this.f19772b, this.f19773c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19774e).lambda$checkPromoInfoInternal$169(this.f19772b, this.f19773c, this.d, tLObject, tL_error);
                return;
        }
    }
}
