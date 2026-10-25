package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k0 implements RequestDelegate {
    public final int f20474a;
    public final Object f20475b;

    public k0(Object obj, int i10) {
        this.f20474a = i10;
        this.f20475b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20474a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f20475b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f20475b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f20475b).lambda$requestFileOffsets$22(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$110((Runnable) this.f20475b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$478((MessagesController.IsInChatCheckedCallback) this.f20475b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f20475b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f20475b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f20475b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f20475b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
