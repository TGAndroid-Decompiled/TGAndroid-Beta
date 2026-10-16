package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements RequestDelegate {
    public final int f16817a;
    public final BaseController f16818b;
    public final long f16819c;
    public final Object d;

    public dl(BaseController baseController, long j10, Object obj, int i10) {
        this.f16817a = i10;
        this.f16818b = baseController;
        this.f16819c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16817a) {
            case 0:
                ((TranslateController) this.f16818b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f16819c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f16818b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f16819c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f16818b).lambda$loadPinnedMessageInternal$165(this.f16819c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f16818b).lambda$updateTimerProc$154(this.f16819c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f16818b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f16819c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f16818b).lambda$getGroupCall$62(this.f16819c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f16818b).lambda$getSponsoredMessages$443(this.f16819c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f16818b).lambda$loadUnknownChannel$329(this.f16819c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f16818b).lambda$setChatReactions$474(this.f16819c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f16818b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f16819c, tLObject, tL_error);
                return;
        }
    }

    public dl(BaseController baseController, Object obj, long j10, int i10) {
        this.f16817a = i10;
        this.f16818b = baseController;
        this.d = obj;
        this.f16819c = j10;
    }
}
