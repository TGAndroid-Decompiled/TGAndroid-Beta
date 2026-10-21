package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f18676a;
    public final MediaDataController f18677b;
    public final TLRPC.StickerSet f18678c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18676a = i10;
        this.f18677b = mediaDataController;
        this.f18678c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18676a) {
            case 0:
                this.f18677b.lambda$toggleStickerSetInternal$115(this.f18678c, (ArrayList) obj);
                return;
            default:
                this.f18677b.lambda$toggleStickerSetInternal$112(this.f18678c, (ArrayList) obj);
                return;
        }
    }
}
