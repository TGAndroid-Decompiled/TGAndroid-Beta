package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18513a;
    public final MediaDataController f18514b;
    public final TLRPC.StickerSet f18515c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18513a = i10;
        this.f18514b = mediaDataController;
        this.f18515c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18513a) {
            case 0:
                this.f18514b.lambda$toggleStickerSetInternal$115(this.f18515c, (ArrayList) obj);
                return;
            default:
                this.f18514b.lambda$toggleStickerSetInternal$112(this.f18515c, (ArrayList) obj);
                return;
        }
    }
}
