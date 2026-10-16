package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fb implements RequestDelegate {
    public final int f16937a;
    public final int f16938b;
    public final Object f16939c;
    public final Object d;

    public fb(Object obj, int i10, Object obj2, int i11) {
        this.f16937a = i11;
        this.f16939c = obj;
        this.f16938b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16937a) {
            case 0:
                ((MessagesController) this.f16939c).lambda$checkChatlistFolderUpdate$481(this.f16938b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f16939c).lambda$startDownloadRequest$29(this.f16938b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f16939c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f16938b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f16939c).lambda$loadStickers$97(this.f16938b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f16939c).lambda$registerForPush$323(this.f16938b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public fb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f16937a = 2;
        this.f16939c = mediaDataController;
        this.d = stickerSet;
        this.f16938b = i10;
    }
}
