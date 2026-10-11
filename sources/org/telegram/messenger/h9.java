package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18073a;
    public final MediaDataController f18074b;
    public final TLRPC.StickerSet f18075c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18073a = i10;
        this.f18074b = mediaDataController;
        this.f18075c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18073a) {
            case 0:
                this.f18074b.lambda$toggleStickerSetInternal$115(this.f18075c, (ArrayList) obj);
                return;
            default:
                this.f18074b.lambda$toggleStickerSetInternal$112(this.f18075c, (ArrayList) obj);
                return;
        }
    }
}
