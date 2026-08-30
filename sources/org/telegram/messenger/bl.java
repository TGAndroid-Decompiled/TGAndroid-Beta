package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f16886a;
    public final BaseController f16887b;
    public final long f16888c;
    public final Object d;

    public bl(BaseController baseController, long j10, Object obj, int i10) {
        this.f16886a = i10;
        this.f16887b = baseController;
        this.f16888c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16886a) {
            case 0:
                ((TranslateController) this.f16887b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f16888c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f16887b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f16888c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f16887b).lambda$loadPinnedMessageInternal$165(this.f16888c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f16887b).lambda$updateTimerProc$155(this.f16888c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f16887b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f16888c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f16887b).lambda$getGroupCall$63(this.f16888c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f16887b).lambda$getSponsoredMessages$440(this.f16888c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f16887b).lambda$loadUnknownChannel$330(this.f16888c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f16887b).lambda$setChatReactions$471(this.f16888c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f16887b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f16888c, tLObject, tL_error);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, long j10, int i10) {
        this.f16886a = i10;
        this.f16887b = baseController;
        this.d = obj;
        this.f16888c = j10;
    }
}
