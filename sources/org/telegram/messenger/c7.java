package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c7 implements RequestDelegate {
    public final int f18028a;
    public final int f18029b;
    public final String f18030c;
    public final String d;
    public final BaseController e;

    public c7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f18028a = i11;
        this.e = baseController;
        this.f18029b = i10;
        this.f18030c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18028a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f18029b, this.f18030c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.f18029b, this.f18030c, this.d, tLObject, tL_error);
                return;
        }
    }
}
