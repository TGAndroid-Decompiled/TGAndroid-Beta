package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f19686a;
    public final int f19687b;
    public final Object f19688c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f19686a = i11;
        this.f19688c = obj;
        this.f19687b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19686a) {
            case 0:
                ((MessagesController) this.f19688c).lambda$checkChatlistFolderUpdate$478(this.f19687b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19688c).lambda$startDownloadRequest$28(this.f19687b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19688c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19687b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19688c).lambda$loadStickers$97(this.f19687b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19688c).lambda$registerForPush$324(this.f19687b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19686a = 2;
        this.f19688c = mediaDataController;
        this.d = stickerSet;
        this.f19687b = i10;
    }
}
