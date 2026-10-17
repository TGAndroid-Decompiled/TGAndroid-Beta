package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bb implements RequestDelegate {
    public final int f17936a;
    public final int f17937b;
    public final Object f17938c;
    public final Object d;

    public bb(Object obj, int i10, Object obj2, int i11) {
        this.f17936a = i11;
        this.f17938c = obj;
        this.f17937b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17936a) {
            case 0:
                ((MessagesController) this.f17938c).lambda$checkChatlistFolderUpdate$481(this.f17937b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17938c).lambda$startDownloadRequest$29(this.f17937b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17938c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17937b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17938c).lambda$loadStickers$97(this.f17937b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17938c).lambda$registerForPush$323(this.f17937b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public bb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17936a = 2;
        this.f17938c = mediaDataController;
        this.d = stickerSet;
        this.f17937b = i10;
    }
}
