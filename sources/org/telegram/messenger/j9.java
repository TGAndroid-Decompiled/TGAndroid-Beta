package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16716a;
    public final MediaDataController f16717b;
    public final TLRPC.StickerSet f16718c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16716a = i10;
        this.f16717b = mediaDataController;
        this.f16718c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16716a) {
            case 0:
                this.f16717b.lambda$toggleStickerSetInternal$115(this.f16718c, (ArrayList) obj);
                return;
            default:
                this.f16717b.lambda$toggleStickerSetInternal$112(this.f16718c, (ArrayList) obj);
                return;
        }
    }
}
