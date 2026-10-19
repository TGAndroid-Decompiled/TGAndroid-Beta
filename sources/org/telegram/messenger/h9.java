package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18509a;
    public final MediaDataController f18510b;
    public final TLRPC.StickerSet f18511c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18509a = i10;
        this.f18510b = mediaDataController;
        this.f18511c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18509a) {
            case 0:
                this.f18510b.lambda$toggleStickerSetInternal$115(this.f18511c, (ArrayList) obj);
                return;
            default:
                this.f18510b.lambda$toggleStickerSetInternal$112(this.f18511c, (ArrayList) obj);
                return;
        }
    }
}
