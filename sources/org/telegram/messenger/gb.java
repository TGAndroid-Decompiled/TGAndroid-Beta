package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gb implements RequestDelegate {
    public final int f18426a;
    public final int f18427b;
    public final Object f18428c;
    public final Object d;

    public gb(Object obj, int i10, Object obj2, int i11) {
        this.f18426a = i11;
        this.f18428c = obj;
        this.f18427b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18426a) {
            case 0:
                ((MessagesController) this.f18428c).lambda$checkChatlistFolderUpdate$481(this.f18427b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f18428c).lambda$startDownloadRequest$29(this.f18427b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f18428c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f18427b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f18428c).lambda$loadStickers$97(this.f18427b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18428c).lambda$registerForPush$323(this.f18427b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public gb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f18426a = 2;
        this.f18428c = mediaDataController;
        this.d = stickerSet;
        this.f18427b = i10;
    }
}
