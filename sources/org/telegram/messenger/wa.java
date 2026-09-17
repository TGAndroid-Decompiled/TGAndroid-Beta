package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f17777a;
    public final int f17778b;
    public final Object f17779c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f17777a = i11;
        this.f17779c = obj;
        this.f17778b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17777a) {
            case 0:
                ((MessagesController) this.f17779c).lambda$checkChatlistFolderUpdate$478(this.f17778b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17779c).lambda$startDownloadRequest$28(this.f17778b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17779c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17778b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17779c).lambda$loadStickers$97(this.f17778b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17779c).lambda$registerForPush$324(this.f17778b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17777a = 2;
        this.f17779c = mediaDataController;
        this.d = stickerSet;
        this.f17778b = i10;
    }
}
