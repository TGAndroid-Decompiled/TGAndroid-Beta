package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n9 implements Utilities.Callback {
    public final int f21046a;
    public final MediaDataController f21047b;
    public final TLRPC.StickerSet f21048c;

    public n9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f21046a = i10;
        this.f21047b = mediaDataController;
        this.f21048c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21046a) {
            case 0:
                this.f21047b.lambda$toggleStickerSetInternal$115(this.f21048c, (ArrayList) obj);
                return;
            default:
                this.f21047b.lambda$toggleStickerSetInternal$112(this.f21048c, (ArrayList) obj);
                return;
        }
    }
}
