package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16651a;
    public final MediaDataController f16652b;
    public final TLRPC.StickerSet f16653c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16651a = i10;
        this.f16652b = mediaDataController;
        this.f16653c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16651a) {
            case 0:
                this.f16652b.lambda$toggleStickerSetInternal$115(this.f16653c, (ArrayList) obj);
                return;
            default:
                this.f16652b.lambda$toggleStickerSetInternal$112(this.f16653c, (ArrayList) obj);
                return;
        }
    }
}
