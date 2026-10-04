package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f19774a;
    public final int f19775b;
    public final String f19776c;
    public final String d;
    public final BaseController f19777e;

    public x6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19774a = i11;
        this.f19777e = baseController;
        this.f19775b = i10;
        this.f19776c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19774a) {
            case 0:
                ((MediaDataController) this.f19777e).lambda$fetchNewEmojiKeywords$213(this.f19775b, this.f19776c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19777e).lambda$checkPromoInfoInternal$169(this.f19775b, this.f19776c, this.d, tLObject, tL_error);
                return;
        }
    }
}
