package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f18008a;
    public final int f18009b;
    public final Object f18010c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f18008a = i11;
        this.f18010c = obj;
        this.f18009b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18008a) {
            case 0:
                ((MessagesController) this.f18010c).lambda$checkChatlistFolderUpdate$478(this.f18009b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18010c).lambda$startDownloadRequest$28(this.f18009b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18010c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18009b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18010c).lambda$loadStickers$97(this.f18009b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18010c).lambda$registerForPush$324(this.f18009b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18008a = 2;
        this.f18010c = mediaDataController;
        this.d = stickerSet;
        this.f18009b = i10;
    }
}
