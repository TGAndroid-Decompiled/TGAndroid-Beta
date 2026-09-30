package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f18117a;
    public final int f18118b;
    public final String f18119c;
    public final String d;
    public final BaseController e;

    public x6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f18117a = i11;
        this.e = baseController;
        this.f18118b = i10;
        this.f18119c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18117a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.f18118b, this.f18119c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.f18118b, this.f18119c, this.d, tLObject, tL_error);
                return;
        }
    }
}
