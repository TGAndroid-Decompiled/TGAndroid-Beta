package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f19773a;
    public final int f19774b;
    public final String f19775c;
    public final String d;
    public final BaseController f19776e;

    public x6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19773a = i11;
        this.f19776e = baseController;
        this.f19774b = i10;
        this.f19775c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19773a) {
            case 0:
                ((MediaDataController) this.f19776e).lambda$fetchNewEmojiKeywords$213(this.f19774b, this.f19775c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19776e).lambda$checkPromoInfoInternal$169(this.f19774b, this.f19775c, this.d, tLObject, tL_error);
                return;
        }
    }
}
