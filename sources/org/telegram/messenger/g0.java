package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class g0 implements RequestDelegate {

    public final int f20321a;

    public final Object f20322b;

    public g0(Object obj, int i10) {
        this.f20321a = i10;
        this.f20322b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20321a) {
            case 0:
                ((BirthdayController) this.f20322b).lambda$check$3(tLObject, tL_error);
                break;
            case 1:
                ChannelBoostsController.lambda$getBoostsStats$1((d5.d) this.f20322b, tLObject, tL_error);
                break;
            case 2:
                ((DownloadController) this.f20322b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                break;
            case 3:
                ((FileLoadOperation) this.f20322b).lambda$requestFileOffsets$21(tLObject, tL_error);
                break;
            case 4:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f20322b, tLObject, tL_error);
                break;
            case 5:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.f20322b, tLObject, tL_error);
                break;
            case 6:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f20322b, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController.SavedMusicIds) this.f20322b).lambda$load$1(tLObject, tL_error);
                break;
            case 8:
                ((MessagesController.SavedMusicList) this.f20322b).lambda$load$1(tLObject, tL_error);
                break;
            case 9:
                ((TopicsController) this.f20322b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                break;
            default:
                ((UserConfig) this.f20322b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                break;
        }
    }
}
