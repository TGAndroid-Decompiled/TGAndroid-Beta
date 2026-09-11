package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class va implements RequestDelegate {
    public final int f19227a;
    public final int f19228b;
    public final Object f19229c;
    public final Object d;

    public va(Object obj, int i10, Object obj2, int i11) {
        this.f19227a = i11;
        this.f19229c = obj;
        this.f19228b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19227a) {
            case 0:
                ((MessagesController) this.f19229c).lambda$checkChatlistFolderUpdate$478(this.f19228b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19229c).lambda$startDownloadRequest$28(this.f19228b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19229c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19228b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19229c).lambda$loadStickers$97(this.f19228b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19229c).lambda$registerForPush$324(this.f19228b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public va(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19227a = 2;
        this.f19229c = mediaDataController;
        this.d = stickerSet;
        this.f19228b = i10;
    }
}
