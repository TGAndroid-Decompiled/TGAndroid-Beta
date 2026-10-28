package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jb implements RequestDelegate {
    public final int f20425a;
    public final int f20426b;
    public final Object f20427c;
    public final Object d;

    public jb(Object obj, int i10, Object obj2, int i11) {
        this.f20425a = i11;
        this.f20427c = obj;
        this.f20426b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20425a) {
            case 0:
                ((MessagesController) this.f20427c).lambda$checkChatlistFolderUpdate$484(this.f20426b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f20427c).lambda$startDownloadRequest$29(this.f20426b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20427c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f20426b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f20427c).lambda$loadStickers$97(this.f20426b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20427c).lambda$registerForPush$325(this.f20426b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public jb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f20425a = 2;
        this.f20427c = mediaDataController;
        this.d = stickerSet;
        this.f20426b = i10;
    }
}
