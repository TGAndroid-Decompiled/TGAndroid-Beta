package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16715a;
    public final MediaDataController f16716b;
    public final TLRPC.StickerSet f16717c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16715a = i10;
        this.f16716b = mediaDataController;
        this.f16717c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16715a) {
            case 0:
                this.f16716b.lambda$toggleStickerSetInternal$115(this.f16717c, (ArrayList) obj);
                return;
            default:
                this.f16716b.lambda$toggleStickerSetInternal$112(this.f16717c, (ArrayList) obj);
                return;
        }
    }
}
