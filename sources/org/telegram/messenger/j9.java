package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16470a;
    public final MediaDataController f16471b;
    public final TLRPC.StickerSet f16472c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16470a = i10;
        this.f16471b = mediaDataController;
        this.f16472c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16470a) {
            case 0:
                this.f16471b.lambda$toggleStickerSetInternal$115(this.f16472c, (ArrayList) obj);
                return;
            default:
                this.f16471b.lambda$toggleStickerSetInternal$112(this.f16472c, (ArrayList) obj);
                return;
        }
    }
}
