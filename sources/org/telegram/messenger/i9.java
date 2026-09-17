package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Utilities.Callback {
    public final int f17993a;
    public final MediaDataController f17994b;
    public final TLRPC.StickerSet f17995c;

    public i9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17993a = i10;
        this.f17994b = mediaDataController;
        this.f17995c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17993a) {
            case 0:
                this.f17994b.lambda$toggleStickerSetInternal$115(this.f17995c, (ArrayList) obj);
                return;
            default:
                this.f17994b.lambda$toggleStickerSetInternal$112(this.f17995c, (ArrayList) obj);
                return;
        }
    }
}
