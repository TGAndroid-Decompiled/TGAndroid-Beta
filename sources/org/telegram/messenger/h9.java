package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f16540a;
    public final MediaDataController f16541b;
    public final TLRPC.StickerSet f16542c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16540a = i10;
        this.f16541b = mediaDataController;
        this.f16542c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16540a) {
            case 0:
                this.f16541b.lambda$toggleStickerSetInternal$115(this.f16542c, (ArrayList) obj);
                return;
            default:
                this.f16541b.lambda$toggleStickerSetInternal$112(this.f16542c, (ArrayList) obj);
                return;
        }
    }
}
