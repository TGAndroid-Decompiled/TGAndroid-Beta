package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18036a;
    public final MediaDataController f18037b;
    public final TLRPC.StickerSet f18038c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18036a = i10;
        this.f18037b = mediaDataController;
        this.f18038c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18036a) {
            case 0:
                this.f18037b.lambda$toggleStickerSetInternal$115(this.f18038c, (ArrayList) obj);
                return;
            default:
                this.f18037b.lambda$toggleStickerSetInternal$112(this.f18038c, (ArrayList) obj);
                return;
        }
    }
}
