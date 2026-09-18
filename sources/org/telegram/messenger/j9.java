package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16479a;
    public final MediaDataController f16480b;
    public final TLRPC.StickerSet f16481c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16479a = i10;
        this.f16480b = mediaDataController;
        this.f16481c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16479a) {
            case 0:
                this.f16480b.lambda$toggleStickerSetInternal$115(this.f16481c, (ArrayList) obj);
                return;
            default:
                this.f16480b.lambda$toggleStickerSetInternal$112(this.f16481c, (ArrayList) obj);
                return;
        }
    }
}
