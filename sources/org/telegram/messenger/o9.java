package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Utilities.Callback {
    public final int f19548a;
    public final MediaDataController f19549b;
    public final TLRPC.StickerSet f19550c;

    public o9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19548a = i10;
        this.f19549b = mediaDataController;
        this.f19550c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19548a) {
            case 0:
                this.f19549b.lambda$toggleStickerSetInternal$115(this.f19550c, (ArrayList) obj);
                return;
            default:
                this.f19549b.lambda$toggleStickerSetInternal$112(this.f19550c, (ArrayList) obj);
                return;
        }
    }
}
