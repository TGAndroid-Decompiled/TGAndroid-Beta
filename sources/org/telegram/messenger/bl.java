package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f19740a;
    public final BaseController f19741b;
    public final long f19742c;
    public final Object d;

    public bl(BaseController baseController, long j10, Object obj, int i10) {
        this.f19740a = i10;
        this.f19741b = baseController;
        this.f19742c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19740a) {
            case 0:
                ((TranslateController) this.f19741b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f19742c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f19741b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f19742c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19741b).lambda$loadPinnedMessageInternal$165(this.f19742c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19741b).lambda$updateTimerProc$154(this.f19742c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19741b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f19742c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19741b).lambda$getGroupCall$62(this.f19742c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19741b).lambda$getSponsoredMessages$446(this.f19742c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19741b).lambda$loadUnknownChannel$331(this.f19742c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19741b).lambda$setChatReactions$477(this.f19742c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19741b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f19742c, tLObject, tL_error);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, long j10, int i10) {
        this.f19740a = i10;
        this.f19741b = baseController;
        this.d = obj;
        this.f19742c = j10;
    }
}
