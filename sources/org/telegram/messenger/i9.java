package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Utilities.Callback {
    public final int f17966a;
    public final MediaDataController f17967b;
    public final TLRPC.StickerSet f17968c;

    public i9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17966a = i10;
        this.f17967b = mediaDataController;
        this.f17968c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17966a) {
            case 0:
                this.f17967b.lambda$toggleStickerSetInternal$115(this.f17968c, (ArrayList) obj);
                return;
            default:
                this.f17967b.lambda$toggleStickerSetInternal$112(this.f17968c, (ArrayList) obj);
                return;
        }
    }
}
