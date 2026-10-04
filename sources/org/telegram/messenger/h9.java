package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18037a;
    public final MediaDataController f18038b;
    public final TLRPC.StickerSet f18039c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18037a = i10;
        this.f18038b = mediaDataController;
        this.f18039c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18037a) {
            case 0:
                this.f18038b.lambda$toggleStickerSetInternal$115(this.f18039c, (ArrayList) obj);
                return;
            default:
                this.f18038b.lambda$toggleStickerSetInternal$112(this.f18039c, (ArrayList) obj);
                return;
        }
    }
}
