package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Utilities.Callback {
    public final int f19019a;
    public final MediaDataController f19020b;
    public final TLRPC.StickerSet f19021c;

    public m9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19019a = i10;
        this.f19020b = mediaDataController;
        this.f19021c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19019a) {
            case 0:
                this.f19020b.lambda$toggleStickerSetInternal$115(this.f19021c, (ArrayList) obj);
                return;
            default:
                this.f19020b.lambda$toggleStickerSetInternal$112(this.f19021c, (ArrayList) obj);
                return;
        }
    }
}
