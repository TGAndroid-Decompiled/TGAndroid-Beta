package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o9 implements Utilities.Callback {
    public final int f19546a;
    public final MediaDataController f19547b;
    public final TLRPC.StickerSet f19548c;

    public o9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19546a = i10;
        this.f19547b = mediaDataController;
        this.f19548c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19546a) {
            case 0:
                this.f19547b.lambda$toggleStickerSetInternal$115(this.f19548c, (ArrayList) obj);
                return;
            default:
                this.f19547b.lambda$toggleStickerSetInternal$112(this.f19548c, (ArrayList) obj);
                return;
        }
    }
}
