package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f18021a;
    public final int f18022b;
    public final Object f18023c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f18021a = i11;
        this.f18023c = obj;
        this.f18022b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18021a) {
            case 0:
                ((MessagesController) this.f18023c).lambda$checkChatlistFolderUpdate$478(this.f18022b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18023c).lambda$startDownloadRequest$28(this.f18022b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18023c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18022b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18023c).lambda$loadStickers$97(this.f18022b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18023c).lambda$registerForPush$324(this.f18022b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18021a = 2;
        this.f18023c = mediaDataController;
        this.d = stickerSet;
        this.f18022b = i10;
    }
}
