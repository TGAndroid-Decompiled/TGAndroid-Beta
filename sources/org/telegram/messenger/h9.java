package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18031a;
    public final MediaDataController f18032b;
    public final TLRPC.StickerSet f18033c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18031a = i10;
        this.f18032b = mediaDataController;
        this.f18033c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18031a) {
            case 0:
                this.f18032b.lambda$toggleStickerSetInternal$115(this.f18033c, (ArrayList) obj);
                return;
            default:
                this.f18032b.lambda$toggleStickerSetInternal$112(this.f18033c, (ArrayList) obj);
                return;
        }
    }
}
