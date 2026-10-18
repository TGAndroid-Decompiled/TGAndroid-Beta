package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i9 implements Utilities.Callback {
    public final int f18586a;
    public final MediaDataController f18587b;
    public final TLRPC.StickerSet f18588c;

    public i9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18586a = i10;
        this.f18587b = mediaDataController;
        this.f18588c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18586a) {
            case 0:
                this.f18587b.lambda$toggleStickerSetInternal$115(this.f18588c, (ArrayList) obj);
                return;
            default:
                this.f18587b.lambda$toggleStickerSetInternal$112(this.f18588c, (ArrayList) obj);
                return;
        }
    }
}
