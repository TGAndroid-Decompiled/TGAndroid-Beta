package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18035a;
    public final MediaDataController f18036b;
    public final TLRPC.StickerSet f18037c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18035a = i10;
        this.f18036b = mediaDataController;
        this.f18037c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18035a) {
            case 0:
                this.f18036b.lambda$toggleStickerSetInternal$115(this.f18037c, (ArrayList) obj);
                return;
            default:
                this.f18036b.lambda$toggleStickerSetInternal$112(this.f18037c, (ArrayList) obj);
                return;
        }
    }
}
