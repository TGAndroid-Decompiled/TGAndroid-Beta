package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l9 implements Utilities.Callback {
    public final int f18945a;
    public final MediaDataController f18946b;
    public final TLRPC.StickerSet f18947c;

    public l9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18945a = i10;
        this.f18946b = mediaDataController;
        this.f18947c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18945a) {
            case 0:
                this.f18946b.lambda$toggleStickerSetInternal$115(this.f18947c, (ArrayList) obj);
                return;
            default:
                this.f18946b.lambda$toggleStickerSetInternal$112(this.f18947c, (ArrayList) obj);
                return;
        }
    }
}
