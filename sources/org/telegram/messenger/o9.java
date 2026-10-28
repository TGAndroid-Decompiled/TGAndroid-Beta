package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Utilities.Callback {
    public final int f20846a;
    public final MediaDataController f20847b;
    public final TLRPC.StickerSet f20848c;

    public o9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f20846a = i10;
        this.f20847b = mediaDataController;
        this.f20848c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20846a) {
            case 0:
                this.f20847b.lambda$toggleStickerSetInternal$115(this.f20848c, (ArrayList) obj);
                return;
            default:
                this.f20847b.lambda$toggleStickerSetInternal$112(this.f20848c, (ArrayList) obj);
                return;
        }
    }
}
