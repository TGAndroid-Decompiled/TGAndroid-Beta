package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g8 implements RequestDelegate {
    public final int f17766a;
    public final int f17767b;
    public final String f17768c;
    public final String d;
    public final BaseController f17769e;

    public g8(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f17766a = i11;
        this.f17769e = baseController;
        this.f17767b = i10;
        this.f17768c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17766a) {
            case 0:
                ((MediaDataController) this.f17769e).lambda$fetchNewEmojiKeywords$212(this.f17767b, this.f17768c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17769e).lambda$checkPromoInfoInternal$169(this.f17767b, this.f17768c, this.d, tLObject, tL_error);
                return;
        }
    }
}
