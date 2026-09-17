package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n7 implements RequestDelegate {
    public final int f18490a;
    public final MediaDataController f18491b;
    public final int f18492c;

    public n7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18490a = i11;
        this.f18491b = mediaDataController;
        this.f18492c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18490a) {
            case 0:
                this.f18491b.lambda$loadArchivedStickersCount$72(this.f18492c, tLObject, tL_error);
                return;
            case 1:
                this.f18491b.lambda$loadRecents$50(this.f18492c, tLObject, tL_error);
                return;
            case 2:
                this.f18491b.lambda$loadRecents$51(this.f18492c, tLObject, tL_error);
                return;
            default:
                this.f18491b.lambda$fetchEmojiStatuses$233(this.f18492c, tLObject, tL_error);
                return;
        }
    }
}
