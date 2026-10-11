package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cb implements RequestDelegate {
    public final int f17594a;
    public final int f17595b;
    public final Object f17596c;
    public final Object d;

    public cb(Object obj, int i10, Object obj2, int i11) {
        this.f17594a = i11;
        this.f17596c = obj;
        this.f17595b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17594a) {
            case 0:
                ((MessagesController) this.f17596c).lambda$checkChatlistFolderUpdate$481(this.f17595b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17596c).lambda$startDownloadRequest$29(this.f17595b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17596c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17595b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17596c).lambda$loadStickers$97(this.f17595b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17596c).lambda$registerForPush$323(this.f17595b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public cb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17594a = 2;
        this.f17596c = mediaDataController;
        this.d = stickerSet;
        this.f17595b = i10;
    }
}
