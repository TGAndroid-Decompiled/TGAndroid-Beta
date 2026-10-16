package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Utilities.Callback {
    public final int f17373a;
    public final MediaDataController f17374b;
    public final TLRPC.StickerSet f17375c;

    public k9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17373a = i10;
        this.f17374b = mediaDataController;
        this.f17375c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17373a) {
            case 0:
                this.f17374b.lambda$toggleStickerSetInternal$115(this.f17375c, (ArrayList) obj);
                return;
            default:
                this.f17374b.lambda$toggleStickerSetInternal$112(this.f17375c, (ArrayList) obj);
                return;
        }
    }
}
