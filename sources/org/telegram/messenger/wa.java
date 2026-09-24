package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f17999a;
    public final int f18000b;
    public final Object f18001c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f17999a = i11;
        this.f18001c = obj;
        this.f18000b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17999a) {
            case 0:
                ((MessagesController) this.f18001c).lambda$checkChatlistFolderUpdate$478(this.f18000b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18001c).lambda$startDownloadRequest$28(this.f18000b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18001c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18000b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18001c).lambda$loadStickers$97(this.f18000b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18001c).lambda$registerForPush$324(this.f18000b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17999a = 2;
        this.f18001c = mediaDataController;
        this.d = stickerSet;
        this.f18000b = i10;
    }
}
