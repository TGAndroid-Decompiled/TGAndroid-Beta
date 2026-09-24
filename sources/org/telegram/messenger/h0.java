package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f16494a;
    public final Object f16495b;

    public h0(Object obj, int i10) {
        this.f16494a = i10;
        this.f16495b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16494a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f16495b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f16495b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f16495b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f16495b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f16495b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f16495b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f16495b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f16495b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f16495b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
