package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m7 implements RequestDelegate {
    public final int f16995a;
    public final MediaDataController f16996b;
    public final int f16997c;

    public m7(MediaDataController mediaDataController, int i10, int i11) {
        this.f16995a = i11;
        this.f16996b = mediaDataController;
        this.f16997c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16995a) {
            case 0:
                this.f16996b.lambda$loadArchivedStickersCount$72(this.f16997c, tLObject, tL_error);
                return;
            case 1:
                this.f16996b.lambda$fetchEmojiStatuses$234(this.f16997c, tLObject, tL_error);
                return;
            case 2:
                this.f16996b.lambda$loadRecents$50(this.f16997c, tLObject, tL_error);
                return;
            default:
                this.f16996b.lambda$loadRecents$51(this.f16997c, tLObject, tL_error);
                return;
        }
    }
}
