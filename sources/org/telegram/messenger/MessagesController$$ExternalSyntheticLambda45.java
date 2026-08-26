package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda45 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final int f$1;
    public final String f$2;
    public final String f$3;

    public MessagesController$$ExternalSyntheticLambda45(BaseController baseController, int i, String str, String str2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = i;
        this.f$2 = str;
        this.f$3 = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$checkPromoInfoInternal$169(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                ((MediaDataController) this.f$0).lambda$fetchNewEmojiKeywords$212(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
        }
    }
}
