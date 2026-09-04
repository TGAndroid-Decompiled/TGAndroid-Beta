package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f18043a;
    public final MediaDataController f18044b;
    public final TLRPC.StickerSet f18045c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18043a = i10;
        this.f18044b = mediaDataController;
        this.f18045c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18043a) {
            case 0:
                this.f18044b.lambda$toggleStickerSetInternal$115(this.f18045c, (ArrayList) obj);
                return;
            default:
                this.f18044b.lambda$toggleStickerSetInternal$112(this.f18045c, (ArrayList) obj);
                return;
        }
    }
}
