package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f16155a;
    public final Object f16156b;

    public g0(Object obj, int i10) {
        this.f16155a = i10;
        this.f16156b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16155a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f16156b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f16156b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f16156b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f16156b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f16156b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f16156b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f16156b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f16156b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f16156b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
