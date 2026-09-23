package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16456a;
    public final MediaDataController f16457b;
    public final TLRPC.StickerSet f16458c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16456a = i10;
        this.f16457b = mediaDataController;
        this.f16458c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16456a) {
            case 0:
                this.f16457b.lambda$toggleStickerSetInternal$115(this.f16458c, (ArrayList) obj);
                return;
            default:
                this.f16457b.lambda$toggleStickerSetInternal$112(this.f16458c, (ArrayList) obj);
                return;
        }
    }
}
