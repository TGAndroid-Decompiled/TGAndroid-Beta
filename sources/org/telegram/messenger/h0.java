package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f18803a;
    public final Object f18804b;

    public h0(Object obj, int i10) {
        this.f18803a = i10;
        this.f18804b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18803a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f18804b, tLObject, tL_error);
                return;
            case 1:
                ChannelBoostsController.lambda$getBoostsStats$1((h5.d) this.f18804b, tLObject, tL_error);
                return;
            case 2:
                ((DownloadController) this.f18804b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 3:
                ((FileLoadOperation) this.f18804b).lambda$requestFileOffsets$21(tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f18804b, tLObject, tL_error);
                return;
            case 5:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.f18804b, tLObject, tL_error);
                return;
            case 6:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f18804b, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController.SavedMusicIds) this.f18804b).lambda$load$1(tLObject, tL_error);
                return;
            case 8:
                ((MessagesController.SavedMusicList) this.f18804b).lambda$load$1(tLObject, tL_error);
                return;
            case 9:
                ((TopicsController) this.f18804b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f18804b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
