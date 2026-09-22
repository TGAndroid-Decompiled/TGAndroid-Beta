package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f17765a;
    public final int f17766b;
    public final Object f17767c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f17765a = i11;
        this.f17767c = obj;
        this.f17766b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17765a) {
            case 0:
                ((MessagesController) this.f17767c).lambda$checkChatlistFolderUpdate$478(this.f17766b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17767c).lambda$startDownloadRequest$28(this.f17766b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17767c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17766b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17767c).lambda$loadStickers$97(this.f17766b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17767c).lambda$registerForPush$324(this.f17766b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17765a = 2;
        this.f17767c = mediaDataController;
        this.d = stickerSet;
        this.f17766b = i10;
    }
}
