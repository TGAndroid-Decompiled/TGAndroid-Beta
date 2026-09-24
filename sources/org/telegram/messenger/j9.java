package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16701a;
    public final MediaDataController f16702b;
    public final TLRPC.StickerSet f16703c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16701a = i10;
        this.f16702b = mediaDataController;
        this.f16703c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16701a) {
            case 0:
                this.f16702b.lambda$toggleStickerSetInternal$115(this.f16703c, (ArrayList) obj);
                return;
            default:
                this.f16702b.lambda$toggleStickerSetInternal$112(this.f16703c, (ArrayList) obj);
                return;
        }
    }
}
