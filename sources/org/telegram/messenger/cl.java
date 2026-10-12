package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cl implements RequestDelegate {
    public final int f17027a;
    public final BaseController f17028b;
    public final long f17029c;
    public final Object d;

    public cl(BaseController baseController, long j10, Object obj, int i10) {
        this.f17027a = i10;
        this.f17028b = baseController;
        this.f17029c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17027a) {
            case 0:
                ((TranslateController) this.f17028b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f17029c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f17028b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f17029c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17028b).lambda$loadPinnedMessageInternal$165(this.f17029c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17028b).lambda$updateTimerProc$154(this.f17029c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f17028b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f17029c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f17028b).lambda$getGroupCall$62(this.f17029c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17028b).lambda$getSponsoredMessages$443(this.f17029c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17028b).lambda$loadUnknownChannel$329(this.f17029c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f17028b).lambda$setChatReactions$474(this.f17029c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17028b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f17029c, tLObject, tL_error);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, long j10, int i10) {
        this.f17027a = i10;
        this.f17028b = baseController;
        this.d = obj;
        this.f17029c = j10;
    }
}
