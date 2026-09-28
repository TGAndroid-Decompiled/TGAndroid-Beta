package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f18022a;
    public final int f18023b;
    public final Object f18024c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f18022a = i11;
        this.f18024c = obj;
        this.f18023b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18022a) {
            case 0:
                ((MessagesController) this.f18024c).lambda$checkChatlistFolderUpdate$478(this.f18023b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18024c).lambda$startDownloadRequest$28(this.f18023b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18024c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18023b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18024c).lambda$loadStickers$97(this.f18023b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18024c).lambda$registerForPush$324(this.f18023b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18022a = 2;
        this.f18024c = mediaDataController;
        this.d = stickerSet;
        this.f18023b = i10;
    }
}
