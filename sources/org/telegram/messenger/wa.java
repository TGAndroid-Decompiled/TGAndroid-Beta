package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f18023a;
    public final int f18024b;
    public final Object f18025c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f18023a = i11;
        this.f18025c = obj;
        this.f18024b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18023a) {
            case 0:
                ((MessagesController) this.f18025c).lambda$checkChatlistFolderUpdate$478(this.f18024b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18025c).lambda$startDownloadRequest$28(this.f18024b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18025c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18024b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18025c).lambda$loadStickers$97(this.f18024b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18025c).lambda$registerForPush$324(this.f18024b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18023a = 2;
        this.f18025c = mediaDataController;
        this.d = stickerSet;
        this.f18024b = i10;
    }
}
