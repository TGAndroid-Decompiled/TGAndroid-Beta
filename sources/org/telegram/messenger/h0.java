package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f17997a;
    public final Object f17998b;

    public h0(Object obj, int i10) {
        this.f17997a = i10;
        this.f17998b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17997a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f17998b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f17998b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f17998b).lambda$requestFileOffsets$22(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$110((Runnable) this.f17998b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$476((MessagesController.IsInChatCheckedCallback) this.f17998b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f17998b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f17998b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f17998b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f17998b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
