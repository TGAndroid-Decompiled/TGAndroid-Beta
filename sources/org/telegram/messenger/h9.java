package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18512a;
    public final MediaDataController f18513b;
    public final TLRPC.StickerSet f18514c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18512a = i10;
        this.f18513b = mediaDataController;
        this.f18514c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18512a) {
            case 0:
                this.f18513b.lambda$toggleStickerSetInternal$115(this.f18514c, (ArrayList) obj);
                return;
            default:
                this.f18513b.lambda$toggleStickerSetInternal$112(this.f18514c, (ArrayList) obj);
                return;
        }
    }
}
