package org.telegram.messenger;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class UserConfig$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public UserConfig$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((UserConfig) this.f$0).lambda$loadGlobalTTl$4(tLObject, tL_error);
                break;
            case 1:
                ((BirthdayController) this.f$0).lambda$check$3(tLObject, tL_error);
                break;
            case 2:
                ChannelBoostsController.lambda$getBoostsStats$1((Consumer) this.f$0, tLObject, tL_error);
                break;
            case 3:
                ((DownloadController) this.f$0).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                break;
            case 4:
                ((FileLoadOperation) this.f$0).lambda$requestFileOffsets$21(tLObject, tL_error);
                break;
            case 5:
                MessagesController.lambda$unblockPeer$111((Runnable) this.f$0, tLObject, tL_error);
                break;
            case 6:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.f$0, tLObject, tL_error);
                break;
            case 7:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.f$0, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController.SavedMusicIds) this.f$0).lambda$load$1(tLObject, tL_error);
                break;
            case 9:
                ((MessagesController.SavedMusicList) this.f$0).lambda$load$1(tLObject, tL_error);
                break;
            default:
                ((TopicsController) this.f$0).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                break;
        }
    }
}
