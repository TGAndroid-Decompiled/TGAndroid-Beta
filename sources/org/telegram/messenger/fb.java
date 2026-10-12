package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb implements RequestDelegate {
    public final int f17238a;
    public final int f17239b;
    public final Object f17240c;
    public final Object d;

    public fb(Object obj, int i10, Object obj2, int i11) {
        this.f17238a = i11;
        this.f17240c = obj;
        this.f17239b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17238a) {
            case 0:
                ((MessagesController) this.f17240c).lambda$checkChatlistFolderUpdate$481(this.f17239b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f17240c).lambda$startDownloadRequest$29(this.f17239b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17240c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f17239b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f17240c).lambda$loadStickers$97(this.f17239b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17240c).lambda$registerForPush$323(this.f17239b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public fb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f17238a = 2;
        this.f17240c = mediaDataController;
        this.d = stickerSet;
        this.f17239b = i10;
    }
}
