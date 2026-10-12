package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb implements RequestDelegate {
    public final int f17598a;
    public final int f17599b;
    public final Object f17600c;
    public final Object d;

    public fb(Object obj, int i10, Object obj2, int i11) {
        this.f17598a = i11;
        this.f17600c = obj;
        this.f17599b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17598a) {
            case 0:
                ((MessagesController) this.f17600c).lambda$checkChatlistFolderUpdate$481(this.f17599b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17600c).lambda$startDownloadRequest$29(this.f17599b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17600c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17599b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17600c).lambda$loadStickers$97(this.f17599b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17600c).lambda$registerForPush$323(this.f17599b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public fb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17598a = 2;
        this.f17600c = mediaDataController;
        this.d = stickerSet;
        this.f17599b = i10;
    }
}
