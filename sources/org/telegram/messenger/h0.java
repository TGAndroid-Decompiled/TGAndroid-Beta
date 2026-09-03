package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f18805a;
    public final Object f18806b;

    public h0(Object obj, int i10) {
        this.f18805a = i10;
        this.f18806b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18805a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f18806b, tLObject, tL_error);
                return;
            case 1:
                ChannelBoostsController.lambda$getBoostsStats$1((h5.d) this.f18806b, tLObject, tL_error);
                return;
            case 2:
                ((DownloadController) this.f18806b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 3:
                ((FileLoadOperation) this.f18806b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f18806b, tLObject, tL_error);
                return;
            case 5:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.f18806b, tLObject, tL_error);
                return;
            case 6:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f18806b, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController.SavedMusicIds) this.f18806b).lambda$load$1(tLObject, tL_error);
                return;
            case 8:
                ((MessagesController.SavedMusicList) this.f18806b).lambda$load$1(tLObject, tL_error);
                return;
            case 9:
                ((TopicsController) this.f18806b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f18806b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
