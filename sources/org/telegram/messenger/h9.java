package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h9 implements Utilities.Callback {
    public final int f18039a;
    public final MediaDataController f18040b;
    public final TLRPC.StickerSet f18041c;

    public h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18039a = i10;
        this.f18040b = mediaDataController;
        this.f18041c = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18039a) {
            case 0:
                this.f18040b.lambda$toggleStickerSetInternal$115(this.f18041c, (ArrayList) obj);
                return;
            default:
                this.f18040b.lambda$toggleStickerSetInternal$112(this.f18041c, (ArrayList) obj);
                return;
        }
    }
}
