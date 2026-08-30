package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r7 implements RequestDelegate {
    public final int f18276a;
    public final MediaDataController f18277b;
    public final int f18278c;

    public r7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18276a = i11;
        this.f18277b = mediaDataController;
        this.f18278c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18276a) {
            case 0:
                this.f18277b.lambda$loadArchivedStickersCount$72(this.f18278c, tLObject, tL_error);
                return;
            case 1:
                this.f18277b.lambda$loadRecents$50(this.f18278c, tLObject, tL_error);
                return;
            case 2:
                this.f18277b.lambda$loadRecents$51(this.f18278c, tLObject, tL_error);
                return;
            default:
                this.f18277b.lambda$fetchEmojiStatuses$233(this.f18278c, tLObject, tL_error);
                return;
        }
    }
}
