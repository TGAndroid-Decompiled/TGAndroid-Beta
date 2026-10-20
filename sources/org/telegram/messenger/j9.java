package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f18678a;
    public final MediaDataController f18679b;
    public final TLRPC.StickerSet f18680c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18678a = i10;
        this.f18679b = mediaDataController;
        this.f18680c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18678a) {
            case 0:
                this.f18679b.lambda$toggleStickerSetInternal$115(this.f18680c, (ArrayList) obj);
                return;
            default:
                this.f18679b.lambda$toggleStickerSetInternal$112(this.f18680c, (ArrayList) obj);
                return;
        }
    }
}
