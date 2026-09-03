package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Utilities.Callback {
    public final int f17982a;
    public final MediaDataController f17983b;
    public final TLRPC.StickerSet f17984c;

    public o9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17982a = i10;
        this.f17983b = mediaDataController;
        this.f17984c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17982a) {
            case 0:
                this.f17983b.lambda$toggleStickerSetInternal$115(this.f17984c, (ArrayList) obj);
                return;
            default:
                this.f17983b.lambda$toggleStickerSetInternal$112(this.f17984c, (ArrayList) obj);
                return;
        }
    }
}
