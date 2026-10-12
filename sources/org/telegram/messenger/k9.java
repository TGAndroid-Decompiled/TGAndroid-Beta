package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Utilities.Callback {
    public final int f18053a;
    public final MediaDataController f18054b;
    public final TLRPC.StickerSet f18055c;

    public k9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18053a = i10;
        this.f18054b = mediaDataController;
        this.f18055c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18053a) {
            case 0:
                this.f18054b.lambda$toggleStickerSetInternal$115(this.f18055c, (ArrayList) obj);
                return;
            default:
                this.f18054b.lambda$toggleStickerSetInternal$112(this.f18055c, (ArrayList) obj);
                return;
        }
    }
}
