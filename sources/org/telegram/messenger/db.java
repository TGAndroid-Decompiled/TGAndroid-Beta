package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class db implements RequestDelegate {
    public final int f14998a;
    public final int f14999b;
    public final Object f15000c;
    public final Object d;

    public db(Object obj, int i10, Object obj2, int i11) {
        this.f14998a = i11;
        this.f15000c = obj;
        this.f14999b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14998a) {
            case 0:
                ((MessagesController) this.f15000c).lambda$checkChatlistFolderUpdate$478(this.f14999b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f15000c).lambda$startDownloadRequest$28(this.f14999b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f15000c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f14999b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f15000c).lambda$loadStickers$97(this.f14999b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f15000c).lambda$registerForPush$324(this.f14999b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public db(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f14998a = 2;
        this.f15000c = mediaDataController;
        this.d = stickerSet;
        this.f14999b = i10;
    }
}
