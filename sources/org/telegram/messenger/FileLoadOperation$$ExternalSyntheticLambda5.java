package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class FileLoadOperation$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public FileLoadOperation$$ExternalSyntheticLambda5(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoadOperation) this.f$0).lambda$startDownloadRequest$28(this.f$1, (FileLoadOperation.RequestInfo) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$checkChatlistFolderUpdate$478(this.f$1, (MessagesController.ChatlistUpdatesStat) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.f$2, this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$loadStickers$97(this.f$1, (Utilities.Callback) this.f$2, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f$0).lambda$registerForPush$324(this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
        }
    }

    public FileLoadOperation$$ExternalSyntheticLambda5(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i) {
        this.$r8$classId = 2;
        this.f$0 = mediaDataController;
        this.f$2 = stickerSet;
        this.f$1 = i;
    }
}
