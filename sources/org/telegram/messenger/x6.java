package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f18102a;
    public final int f18103b;
    public final String f18104c;
    public final String d;
    public final BaseController e;

    public x6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f18102a = i11;
        this.e = baseController;
        this.f18103b = i10;
        this.f18104c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18102a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f18103b, this.f18104c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.f18103b, this.f18104c, this.d, tLObject, tL_error);
                return;
        }
    }
}
