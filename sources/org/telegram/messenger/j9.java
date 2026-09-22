package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f16466a;
    public final MediaDataController f16467b;
    public final TLRPC.StickerSet f16468c;

    public j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16466a = i10;
        this.f16467b = mediaDataController;
        this.f16468c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16466a) {
            case 0:
                this.f16467b.lambda$toggleStickerSetInternal$115(this.f16468c, (ArrayList) obj);
                return;
            default:
                this.f16467b.lambda$toggleStickerSetInternal$112(this.f16468c, (ArrayList) obj);
                return;
        }
    }
}
