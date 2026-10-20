package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class db implements RequestDelegate {
    public final int f18175a;
    public final int f18176b;
    public final Object f18177c;
    public final Object d;

    public db(Object obj, int i10, Object obj2, int i11) {
        this.f18175a = i11;
        this.f18177c = obj;
        this.f18176b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18175a) {
            case 0:
                ((MessagesController) this.f18177c).lambda$checkChatlistFolderUpdate$481(this.f18176b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18177c).lambda$startDownloadRequest$29(this.f18176b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18177c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18176b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18177c).lambda$loadStickers$97(this.f18176b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18177c).lambda$registerForPush$323(this.f18176b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public db(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18175a = 2;
        this.f18177c = mediaDataController;
        this.d = stickerSet;
        this.f18176b = i10;
    }
}
