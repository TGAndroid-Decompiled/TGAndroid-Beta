package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k0 implements RequestDelegate {
    public final int f20471a;
    public final Object f20472b;

    public k0(Object obj, int i10) {
        this.f20471a = i10;
        this.f20472b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20471a) {
            case 0:
                BirthdayController.d((BirthdayController) this.f20472b, tLObject, tL_error);
                return;
            case 1:
                ((DownloadController) this.f20472b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                return;
            case 2:
                ((FileLoadOperation) this.f20472b).lambda$requestFileOffsets$22(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$unblockPeer$110((Runnable) this.f20472b, tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$checkIsInChat$479((MessagesController.IsInChatCheckedCallback) this.f20472b, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController.SavedMusicIds) this.f20472b).lambda$load$1(tLObject, tL_error);
                return;
            case 6:
                ((MessagesController.SavedMusicList) this.f20472b).lambda$load$1(tLObject, tL_error);
                return;
            case 7:
                ((TopicsController) this.f20472b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                return;
            default:
                ((UserConfig) this.f20472b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                return;
        }
    }
}
