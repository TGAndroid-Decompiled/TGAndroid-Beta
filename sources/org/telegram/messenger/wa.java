package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f19486a;
    public final int f19487b;
    public final Object f19488c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f19486a = i11;
        this.f19488c = obj;
        this.f19487b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19486a) {
            case 0:
                ((MessagesController) this.f19488c).lambda$checkChatlistFolderUpdate$478(this.f19487b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19488c).lambda$startDownloadRequest$28(this.f19487b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19488c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19487b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19488c).lambda$loadStickers$97(this.f19487b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19488c).lambda$registerForPush$324(this.f19487b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19486a = 2;
        this.f19488c = mediaDataController;
        this.d = stickerSet;
        this.f19487b = i10;
    }
}
