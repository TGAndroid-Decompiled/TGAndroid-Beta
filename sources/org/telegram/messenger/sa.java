package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sa implements RequestDelegate {
    public final int f21473a;
    public final int f21474b;
    public final Object f21475c;
    public final Object d;

    public sa(Object obj, int i9, Object obj2, int i10) {
        this.f21473a = i10;
        this.f21475c = obj;
        this.f21474b = i9;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21473a) {
            case 0:
                ((MessagesController) this.f21475c).lambda$checkChatlistFolderUpdate$478(this.f21474b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f21475c).lambda$startDownloadRequest$28(this.f21474b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f21475c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f21474b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f21475c).lambda$loadStickers$97(this.f21474b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f21475c).lambda$registerForPush$324(this.f21474b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public sa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i9) {
        this.f21473a = 2;
        this.f21475c = mediaDataController;
        this.d = stickerSet;
        this.f21474b = i9;
    }
}
