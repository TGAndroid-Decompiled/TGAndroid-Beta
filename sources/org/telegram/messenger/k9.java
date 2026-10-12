package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Utilities.Callback {
    public final int f17674a;
    public final MediaDataController f17675b;
    public final TLRPC.StickerSet f17676c;

    public k9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17674a = i10;
        this.f17675b = mediaDataController;
        this.f17676c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17674a) {
            case 0:
                this.f17675b.lambda$toggleStickerSetInternal$115(this.f17676c, (ArrayList) obj);
                return;
            default:
                this.f17675b.lambda$toggleStickerSetInternal$112(this.f17676c, (ArrayList) obj);
                return;
        }
    }
}
