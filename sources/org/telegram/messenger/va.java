package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class va implements RequestDelegate {
    public final int f19254a;
    public final int f19255b;
    public final Object f19256c;
    public final Object d;

    public va(Object obj, int i10, Object obj2, int i11) {
        this.f19254a = i11;
        this.f19256c = obj;
        this.f19255b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19254a) {
            case 0:
                ((MessagesController) this.f19256c).lambda$checkChatlistFolderUpdate$478(this.f19255b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19256c).lambda$startDownloadRequest$28(this.f19255b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19256c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19255b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19256c).lambda$loadStickers$97(this.f19255b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19256c).lambda$registerForPush$324(this.f19255b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public va(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19254a = 2;
        this.f19256c = mediaDataController;
        this.d = stickerSet;
        this.f19255b = i10;
    }
}
