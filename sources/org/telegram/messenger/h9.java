package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f20476a;
    public final MediaDataController f20477b;
    public final TLRPC.StickerSet f20478c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i9) {
        this.f20476a = i9;
        this.f20477b = mediaDataController;
        this.f20478c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20476a) {
            case 0:
                this.f20477b.lambda$toggleStickerSetInternal$115(this.f20478c, (ArrayList) obj);
                return;
            default:
                this.f20477b.lambda$toggleStickerSetInternal$112(this.f20478c, (ArrayList) obj);
                return;
        }
    }
}
