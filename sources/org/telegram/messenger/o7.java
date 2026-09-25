package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o7 implements RequestDelegate {
    public final int f17172a;
    public final MediaDataController f17173b;
    public final int f17174c;

    public o7(MediaDataController mediaDataController, int i10, int i11) {
        this.f17172a = i11;
        this.f17173b = mediaDataController;
        this.f17174c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17172a) {
            case 0:
                this.f17173b.lambda$loadArchivedStickersCount$72(this.f17174c, tLObject, tL_error);
                return;
            case 1:
                this.f17173b.lambda$loadRecents$50(this.f17174c, tLObject, tL_error);
                return;
            case 2:
                this.f17173b.lambda$loadRecents$51(this.f17174c, tLObject, tL_error);
                return;
            default:
                this.f17173b.lambda$fetchEmojiStatuses$233(this.f17174c, tLObject, tL_error);
                return;
        }
    }
}
