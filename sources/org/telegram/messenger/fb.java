package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb implements RequestDelegate {
    public final int f18357a;
    public final int f18358b;
    public final Object f18359c;
    public final Object d;

    public fb(Object obj, int i10, Object obj2, int i11) {
        this.f18357a = i11;
        this.f18359c = obj;
        this.f18358b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18357a) {
            case 0:
                ((MessagesController) this.f18359c).lambda$checkChatlistFolderUpdate$481(this.f18358b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18359c).lambda$startDownloadRequest$29(this.f18358b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18359c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18358b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18359c).lambda$loadStickers$97(this.f18358b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18359c).lambda$registerForPush$323(this.f18358b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public fb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18357a = 2;
        this.f18359c = mediaDataController;
        this.d = stickerSet;
        this.f18358b = i10;
    }
}
