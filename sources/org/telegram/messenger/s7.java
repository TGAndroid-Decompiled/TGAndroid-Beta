package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s7 implements RequestDelegate {
    public final int f19494a;
    public final MediaDataController f19495b;
    public final int f19496c;

    public s7(MediaDataController mediaDataController, int i10, int i11) {
        this.f19494a = i11;
        this.f19495b = mediaDataController;
        this.f19496c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19494a) {
            case 0:
                this.f19495b.lambda$loadArchivedStickersCount$72(this.f19496c, tLObject, tL_error);
                return;
            case 1:
                this.f19495b.lambda$fetchEmojiStatuses$234(this.f19496c, tLObject, tL_error);
                return;
            case 2:
                this.f19495b.lambda$loadRecents$50(this.f19496c, tLObject, tL_error);
                return;
            default:
                this.f19495b.lambda$loadRecents$51(this.f19496c, tLObject, tL_error);
                return;
        }
    }
}
