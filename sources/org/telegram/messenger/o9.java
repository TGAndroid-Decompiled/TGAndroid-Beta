package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Utilities.Callback {
    public final int f18005a;
    public final MediaDataController f18006b;
    public final TLRPC.StickerSet f18007c;

    public o9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18005a = i10;
        this.f18006b = mediaDataController;
        this.f18007c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18005a) {
            case 0:
                this.f18006b.lambda$toggleStickerSetInternal$115(this.f18007c, (ArrayList) obj);
                return;
            default:
                this.f18006b.lambda$toggleStickerSetInternal$112(this.f18007c, (ArrayList) obj);
                return;
        }
    }
}
