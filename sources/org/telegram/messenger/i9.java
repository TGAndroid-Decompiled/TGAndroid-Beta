package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Utilities.Callback {
    public final int f18589a;
    public final MediaDataController f18590b;
    public final TLRPC.StickerSet f18591c;

    public i9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18589a = i10;
        this.f18590b = mediaDataController;
        this.f18591c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18589a) {
            case 0:
                this.f18590b.lambda$toggleStickerSetInternal$115(this.f18591c, (ArrayList) obj);
                return;
            default:
                this.f18590b.lambda$toggleStickerSetInternal$112(this.f18591c, (ArrayList) obj);
                return;
        }
    }
}
