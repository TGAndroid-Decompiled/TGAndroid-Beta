package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7 implements RequestDelegate {
    public final int f18398a;
    public final int f18399b;
    public final String f18400c;
    public final String d;
    public final BaseController e;

    public f7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f18398a = i11;
        this.e = baseController;
        this.f18399b = i10;
        this.f18400c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18398a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f18399b, this.f18400c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f18399b, this.f18400c, this.d, tLObject, tL_error);
                return;
        }
    }
}
