package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cb implements RequestDelegate {
    public final int f19815a;
    public final int f19816b;
    public final Object f19817c;
    public final Object d;

    public cb(Object obj, int i10, Object obj2, int i11) {
        this.f19815a = i11;
        this.f19817c = obj;
        this.f19816b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19815a) {
            case 0:
                ((MessagesController) this.f19817c).lambda$checkChatlistFolderUpdate$483(this.f19816b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19817c).lambda$startDownloadRequest$29(this.f19816b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19817c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19816b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19817c).lambda$loadStickers$97(this.f19816b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19817c).lambda$registerForPush$325(this.f19816b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public cb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19815a = 2;
        this.f19817c = mediaDataController;
        this.d = stickerSet;
        this.f19816b = i10;
    }
}
