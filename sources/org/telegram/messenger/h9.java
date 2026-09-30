package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f16541a;
    public final MediaDataController f16542b;
    public final TLRPC.StickerSet f16543c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16541a = i10;
        this.f16542b = mediaDataController;
        this.f16543c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16541a) {
            case 0:
                this.f16542b.lambda$toggleStickerSetInternal$115(this.f16543c, (ArrayList) obj);
                return;
            default:
                this.f16542b.lambda$toggleStickerSetInternal$112(this.f16543c, (ArrayList) obj);
                return;
        }
    }
}
