package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class l9 implements Utilities.Callback {

    public final int f20858a;

    public final MediaDataController f20859b;

    public final TLRPC.StickerSet f20860c;

    public l9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f20858a = i10;
        this.f20859b = mediaDataController;
        this.f20860c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20858a) {
            case 0:
                this.f20859b.lambda$toggleStickerSetInternal$115(this.f20860c, (ArrayList) obj);
                break;
            default:
                this.f20859b.lambda$toggleStickerSetInternal$112(this.f20860c, (ArrayList) obj);
                break;
        }
    }
}
