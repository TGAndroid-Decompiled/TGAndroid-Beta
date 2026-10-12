package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Utilities.Callback {
    public final int f18054a;
    public final MediaDataController f18055b;
    public final TLRPC.StickerSet f18056c;

    public k9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18054a = i10;
        this.f18055b = mediaDataController;
        this.f18056c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18054a) {
            case 0:
                this.f18055b.lambda$toggleStickerSetInternal$115(this.f18056c, (ArrayList) obj);
                return;
            default:
                this.f18055b.lambda$toggleStickerSetInternal$112(this.f18056c, (ArrayList) obj);
                return;
        }
    }
}
