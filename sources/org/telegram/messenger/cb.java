package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cb implements RequestDelegate {
    public final int f17558a;
    public final int f17559b;
    public final Object f17560c;
    public final Object d;

    public cb(Object obj, int i10, Object obj2, int i11) {
        this.f17558a = i11;
        this.f17560c = obj;
        this.f17559b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17558a) {
            case 0:
                ((MessagesController) this.f17560c).lambda$checkChatlistFolderUpdate$481(this.f17559b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17560c).lambda$startDownloadRequest$29(this.f17559b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17560c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17559b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17560c).lambda$loadStickers$97(this.f17559b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17560c).lambda$registerForPush$323(this.f17559b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public cb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17558a = 2;
        this.f17560c = mediaDataController;
        this.d = stickerSet;
        this.f17559b = i10;
    }
}
