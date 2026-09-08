package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f18070a;
    public final MediaDataController f18071b;
    public final TLRPC.StickerSet f18072c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18070a = i10;
        this.f18071b = mediaDataController;
        this.f18072c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18070a) {
            case 0:
                this.f18071b.lambda$toggleStickerSetInternal$115(this.f18072c, (ArrayList) obj);
                return;
            default:
                this.f18071b.lambda$toggleStickerSetInternal$112(this.f18072c, (ArrayList) obj);
                return;
        }
    }
}
