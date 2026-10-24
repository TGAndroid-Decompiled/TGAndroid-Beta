package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gb implements RequestDelegate {
    public final int f18492a;
    public final int f18493b;
    public final Object f18494c;
    public final Object d;

    public gb(Object obj, int i10, Object obj2, int i11) {
        this.f18492a = i11;
        this.f18494c = obj;
        this.f18493b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18492a) {
            case 0:
                ((MessagesController) this.f18494c).lambda$checkChatlistFolderUpdate$481(this.f18493b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18494c).lambda$startDownloadRequest$29(this.f18493b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18494c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18493b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18494c).lambda$loadStickers$97(this.f18493b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18494c).lambda$registerForPush$323(this.f18493b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public gb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18492a = 2;
        this.f18494c = mediaDataController;
        this.d = stickerSet;
        this.f18493b = i10;
    }
}
