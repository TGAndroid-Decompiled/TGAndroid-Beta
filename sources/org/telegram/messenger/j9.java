package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16700a;
    public final MediaDataController f16701b;
    public final TLRPC.StickerSet f16702c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16700a = i10;
        this.f16701b = mediaDataController;
        this.f16702c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16700a) {
            case 0:
                this.f16701b.lambda$toggleStickerSetInternal$115(this.f16702c, (ArrayList) obj);
                return;
            default:
                this.f16701b.lambda$toggleStickerSetInternal$112(this.f16702c, (ArrayList) obj);
                return;
        }
    }
}
