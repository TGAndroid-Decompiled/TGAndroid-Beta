package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f17993a;
    public final int f17994b;
    public final Object f17995c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f17993a = i11;
        this.f17995c = obj;
        this.f17994b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17993a) {
            case 0:
                ((MessagesController) this.f17995c).lambda$checkChatlistFolderUpdate$478(this.f17994b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17995c).lambda$startDownloadRequest$28(this.f17994b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17995c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17994b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17995c).lambda$loadStickers$97(this.f17994b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17995c).lambda$registerForPush$324(this.f17994b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17993a = 2;
        this.f17995c = mediaDataController;
        this.d = stickerSet;
        this.f17994b = i10;
    }
}
