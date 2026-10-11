package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18603a;
    public final MediaDataController f18604b;
    public final int f18605c;

    public n7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18603a = i11;
        this.f18604b = mediaDataController;
        this.f18605c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18603a) {
            case 0:
                this.f18604b.lambda$loadArchivedStickersCount$72(this.f18605c, tLObject, tL_error);
                return;
            case 1:
                this.f18604b.lambda$fetchEmojiStatuses$234(this.f18605c, tLObject, tL_error);
                return;
            case 2:
                this.f18604b.lambda$loadRecents$50(this.f18605c, tLObject, tL_error);
                return;
            default:
                this.f18604b.lambda$loadRecents$51(this.f18605c, tLObject, tL_error);
                return;
        }
    }
}
