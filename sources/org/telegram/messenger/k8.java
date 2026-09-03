package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k8 implements RequestDelegate {
    public final int f17625a;
    public final int f17626b;
    public final String f17627c;
    public final String d;
    public final BaseController e;

    public k8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17625a = i11;
        this.e = baseController;
        this.f17626b = i10;
        this.f17627c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17625a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$212(this.f17626b, this.f17627c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.f17626b, this.f17627c, this.d, tLObject, tL_error);
                return;
        }
    }
}
