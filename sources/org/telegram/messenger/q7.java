package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q7 implements RequestDelegate {
    public final int f18173a;
    public final MediaDataController f18174b;
    public final int f18175c;

    public q7(MediaDataController mediaDataController, int i10, int i11) {
        this.f18173a = i11;
        this.f18174b = mediaDataController;
        this.f18175c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18173a) {
            case 0:
                this.f18174b.lambda$loadArchivedStickersCount$72(this.f18175c, tLObject, tL_error);
                return;
            case 1:
                this.f18174b.lambda$fetchEmojiStatuses$234(this.f18175c, tLObject, tL_error);
                return;
            case 2:
                this.f18174b.lambda$loadRecents$50(this.f18175c, tLObject, tL_error);
                return;
            default:
                this.f18174b.lambda$loadRecents$51(this.f18175c, tLObject, tL_error);
                return;
        }
    }
}
