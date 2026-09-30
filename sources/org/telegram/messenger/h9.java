package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f16557a;
    public final MediaDataController f16558b;
    public final TLRPC.StickerSet f16559c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16557a = i10;
        this.f16558b = mediaDataController;
        this.f16559c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16557a) {
            case 0:
                this.f16558b.lambda$toggleStickerSetInternal$115(this.f16559c, (ArrayList) obj);
                return;
            default:
                this.f16558b.lambda$toggleStickerSetInternal$112(this.f16559c, (ArrayList) obj);
                return;
        }
    }
}
