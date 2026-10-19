package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cb implements RequestDelegate {
    public final int f18080a;
    public final int f18081b;
    public final Object f18082c;
    public final Object d;

    public cb(Object obj, int i10, Object obj2, int i11) {
        this.f18080a = i11;
        this.f18082c = obj;
        this.f18081b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18080a) {
            case 0:
                ((MessagesController) this.f18082c).lambda$checkChatlistFolderUpdate$481(this.f18081b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18082c).lambda$startDownloadRequest$29(this.f18081b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18082c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18081b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18082c).lambda$loadStickers$97(this.f18081b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18082c).lambda$registerForPush$323(this.f18081b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public cb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18080a = 2;
        this.f18082c = mediaDataController;
        this.d = stickerSet;
        this.f18081b = i10;
    }
}
