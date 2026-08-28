package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f20339a;
    public final Object f20340b;

    public g0(Object obj, int i9) {
        this.f20339a = i9;
        this.f20340b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20339a) {
            case 0:
                ((BirthdayController) this.f20340b).lambda$check$3(tLObject, tL_error);
                return;
            case 1:
                ChannelBoostsController.lambda$getBoostsStats$1((d5.d) this.f20340b, tLObject, tL_error);
                return;
            case 2:
                ((DownloadController) this.f20340b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 3:
                ((FileLoadOperation) this.f20340b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f20340b, tLObject, tL_error);
                return;
            case 5:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.f20340b, tLObject, tL_error);
                return;
            case 6:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f20340b, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController.SavedMusicIds) this.f20340b).lambda$load$1(tLObject, tL_error);
                return;
            case 8:
                ((MessagesController.SavedMusicList) this.f20340b).lambda$load$1(tLObject, tL_error);
                return;
            case 9:
                ((TopicsController) this.f20340b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f20340b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
