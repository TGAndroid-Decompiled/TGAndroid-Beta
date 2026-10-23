package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Utilities.Callback {
    public final int f18877a;
    public final MediaDataController f18878b;
    public final TLRPC.StickerSet f18879c;

    public l9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18877a = i10;
        this.f18878b = mediaDataController;
        this.f18879c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18877a) {
            case 0:
                this.f18878b.lambda$toggleStickerSetInternal$115(this.f18879c, (ArrayList) obj);
                return;
            default:
                this.f18878b.lambda$toggleStickerSetInternal$112(this.f18879c, (ArrayList) obj);
                return;
        }
    }
}
