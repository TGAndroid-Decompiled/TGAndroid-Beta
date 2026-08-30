package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f17344a;
    public final Object f17345b;

    public h0(Object obj, int i10) {
        this.f17344a = i10;
        this.f17345b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17344a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f17345b, tLObject, tL_error);
                return;
            case 1:
                ChannelBoostsController.lambda$getBoostsStats$1((h5.d) this.f17345b, tLObject, tL_error);
                return;
            case 2:
                ((DownloadController) this.f17345b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 3:
                ((FileLoadOperation) this.f17345b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f17345b, tLObject, tL_error);
                return;
            case 5:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.f17345b, tLObject, tL_error);
                return;
            case 6:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f17345b, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController.SavedMusicIds) this.f17345b).lambda$load$1(tLObject, tL_error);
                return;
            case 8:
                ((MessagesController.SavedMusicList) this.f17345b).lambda$load$1(tLObject, tL_error);
                return;
            case 9:
                ((TopicsController) this.f17345b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f17345b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
