package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f19680a;
    public final int f19681b;
    public final Object f19682c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f19680a = i11;
        this.f19682c = obj;
        this.f19681b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19680a) {
            case 0:
                ((MessagesController) this.f19682c).lambda$checkChatlistFolderUpdate$478(this.f19681b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19682c).lambda$startDownloadRequest$28(this.f19681b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19682c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19681b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19682c).lambda$loadStickers$97(this.f19681b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19682c).lambda$registerForPush$324(this.f19681b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19680a = 2;
        this.f19682c = mediaDataController;
        this.d = stickerSet;
        this.f19681b = i10;
    }
}
