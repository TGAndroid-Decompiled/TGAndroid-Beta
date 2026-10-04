package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wa implements RequestDelegate {
    public final int f19687a;
    public final int f19688b;
    public final Object f19689c;
    public final Object d;

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f19687a = i11;
        this.f19689c = obj;
        this.f19688b = i10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19687a) {
            case 0:
                ((MessagesController) this.f19689c).lambda$checkChatlistFolderUpdate$478(this.f19688b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                return;
            case 1:
                ((FileLoadOperation) this.f19689c).lambda$startDownloadRequest$28(this.f19688b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19689c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.f19688b, tLObject, tL_error);
                return;
            case 3:
                ((MediaDataController) this.f19689c).lambda$loadStickers$97(this.f19688b, (Utilities.Callback) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19689c).lambda$registerForPush$324(this.f19688b, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.f19687a = 2;
        this.f19689c = mediaDataController;
        this.d = stickerSet;
        this.f19688b = i10;
    }
}
