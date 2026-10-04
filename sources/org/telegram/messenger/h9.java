package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18038a;
    public final MediaDataController f18039b;
    public final TLRPC.StickerSet f18040c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18038a = i10;
        this.f18039b = mediaDataController;
        this.f18040c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18038a) {
            case 0:
                this.f18039b.lambda$toggleStickerSetInternal$115(this.f18040c, (ArrayList) obj);
                return;
            default:
                this.f18039b.lambda$toggleStickerSetInternal$112(this.f18040c, (ArrayList) obj);
                return;
        }
    }
}
