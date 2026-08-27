package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class wa implements RequestDelegate {

    public final int f22040a;

    public final int f22041b;

    public final Object f22042c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f22040a = i11;
        this.f22042c = obj;
        this.f22041b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22040a) {
            case 0:
                ((MessagesController) this.f22042c).lambda$checkChatlistFolderUpdate$478(this.f22041b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                break;
            case 1:
                ((FileLoadOperation) this.f22042c).lambda$startDownloadRequest$28(this.f22041b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f22042c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f22041b, tLObject, tL_error);
                break;
            case 3:
                ((MediaDataController) this.f22042c).lambda$loadStickers$97(this.f22041b, (Utilities.Callback) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f22042c).lambda$registerForPush$324(this.f22041b, (String) this.d, tLObject, tL_error);
                break;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f22040a = 2;
        this.f22042c = mediaDataController;
        this.d = stickerSet;
        this.f22041b = i10;
    }
}
