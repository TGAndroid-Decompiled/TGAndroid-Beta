package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cb implements RequestDelegate {
    public final int f18077a;
    public final int f18078b;
    public final Object f18079c;
    public final Object d;

    public cb(Object obj, int i10, Object obj2, int i11) {
        this.f18077a = i11;
        this.f18079c = obj;
        this.f18078b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18077a) {
            case 0:
                ((MessagesController) this.f18079c).lambda$checkChatlistFolderUpdate$481(this.f18078b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18079c).lambda$startDownloadRequest$29(this.f18078b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18079c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18078b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18079c).lambda$loadStickers$97(this.f18078b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18079c).lambda$registerForPush$323(this.f18078b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public cb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18077a = 2;
        this.f18079c = mediaDataController;
        this.d = stickerSet;
        this.f18078b = i10;
    }
}
