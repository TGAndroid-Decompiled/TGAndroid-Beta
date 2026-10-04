package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f18009a;
    public final Object f18010b;

    public h0(Object obj, int i10) {
        this.f18009a = i10;
        this.f18010b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18009a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f18010b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f18010b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f18010b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f18010b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f18010b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f18010b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f18010b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f18010b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f18010b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
