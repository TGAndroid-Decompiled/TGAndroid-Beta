package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16713a;
    public final MediaDataController f16714b;
    public final TLRPC.StickerSet f16715c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16713a = i10;
        this.f16714b = mediaDataController;
        this.f16715c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16713a) {
            case 0:
                this.f16714b.lambda$toggleStickerSetInternal$115(this.f16715c, (ArrayList) obj);
                return;
            default:
                this.f16714b.lambda$toggleStickerSetInternal$112(this.f16715c, (ArrayList) obj);
                return;
        }
    }
}
