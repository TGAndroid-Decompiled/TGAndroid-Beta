package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x6 implements RequestDelegate {
    public final int f19766a;
    public final int f19767b;
    public final String f19768c;
    public final String d;
    public final BaseController f19769e;

    public x6(BaseController baseController, int i10, String str, String str2, int i11) {
        this.f19766a = i11;
        this.f19769e = baseController;
        this.f19767b = i10;
        this.f19768c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19766a) {
            case 0:
                ((MediaDataController) this.f19769e).lambda$fetchNewEmojiKeywords$213(this.f19767b, this.f19768c, this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19769e).lambda$checkPromoInfoInternal$169(this.f19767b, this.f19768c, this.d, tLObject, tL_error);
                return;
        }
    }
}
