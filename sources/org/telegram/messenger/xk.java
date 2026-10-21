package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements RequestDelegate {
    public final int f20108a;
    public final BaseController f20109b;
    public final long f20110c;
    public final Object d;

    public xk(BaseController baseController, long j10, Object obj, int i10) {
        this.f20108a = i10;
        this.f20109b = baseController;
        this.f20110c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20108a) {
            case 0:
                ((TranslateController) this.f20109b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f20110c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f20109b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f20110c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f20109b).lambda$loadPinnedMessageInternal$165(this.f20110c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20109b).lambda$updateTimerProc$154(this.f20110c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f20109b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f20110c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f20109b).lambda$getGroupCall$62(this.f20110c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f20109b).lambda$getSponsoredMessages$443(this.f20110c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f20109b).lambda$loadUnknownChannel$329(this.f20110c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f20109b).lambda$setChatReactions$474(this.f20110c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20109b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f20110c, tLObject, tL_error);
                return;
        }
    }

    public xk(BaseController baseController, Object obj, long j10, int i10) {
        this.f20108a = i10;
        this.f20109b = baseController;
        this.d = obj;
        this.f20110c = j10;
    }
}
