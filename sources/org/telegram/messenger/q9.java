package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q9 implements Utilities.Callback {
    public final int f16124a;
    public final MediaDataController f16125b;
    public final TLRPC.StickerSet f16126c;

    public q9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16124a = i10;
        this.f16125b = mediaDataController;
        this.f16126c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16124a) {
            case 0:
                this.f16125b.lambda$toggleStickerSetInternal$115(this.f16126c, (ArrayList) obj);
                return;
            default:
                this.f16125b.lambda$toggleStickerSetInternal$112(this.f16126c, (ArrayList) obj);
                return;
        }
    }
}
