package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final int f20754a;
    public final MediaDataController f20755b;
    public final TLRPC.StickerSet f20756c;

    public n9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f20754a = i10;
        this.f20755b = mediaDataController;
        this.f20756c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20754a) {
            case 0:
                this.f20755b.lambda$toggleStickerSetInternal$115(this.f20756c, (ArrayList) obj);
                return;
            default:
                this.f20755b.lambda$toggleStickerSetInternal$112(this.f20756c, (ArrayList) obj);
                return;
        }
    }
}
