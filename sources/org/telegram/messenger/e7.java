package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e7 implements RequestDelegate {
    public final int f18330a;
    public final int f18331b;
    public final String f18332c;
    public final String d;
    public final BaseController e;

    public e7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f18330a = i11;
        this.e = baseController;
        this.f18331b = i10;
        this.f18332c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18330a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f18331b, this.f18332c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f18331b, this.f18332c, this.d, tLObject, tL_error);
                return;
        }
    }
}
