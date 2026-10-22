package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m9 implements Utilities.Callback {
    public final int f18953a;
    public final MediaDataController f18954b;
    public final TLRPC.StickerSet f18955c;

    public m9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18953a = i10;
        this.f18954b = mediaDataController;
        this.f18955c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18953a) {
            case 0:
                this.f18954b.lambda$toggleStickerSetInternal$115(this.f18955c, (ArrayList) obj);
                return;
            default:
                this.f18954b.lambda$toggleStickerSetInternal$112(this.f18955c, (ArrayList) obj);
                return;
        }
    }
}
