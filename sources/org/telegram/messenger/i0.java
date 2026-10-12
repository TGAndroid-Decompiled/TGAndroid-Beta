package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i0 implements RequestDelegate {
    public final int f17454a;
    public final Object f17455b;

    public i0(Object obj, int i10) {
        this.f17454a = i10;
        this.f17455b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17454a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f17455b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f17455b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f17455b).lambda$requestFileOffsets$22(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$110((Runnable) this.f17455b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$476((MessagesController.IsInChatCheckedCallback) this.f17455b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f17455b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f17455b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f17455b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f17455b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
