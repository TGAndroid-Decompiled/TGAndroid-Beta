package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pk implements RequestDelegate {
    public final int f21264a;
    public final BaseController f21265b;
    public final long f21266c;
    public final Object d;

    public pk(BaseController baseController, long j10, Object obj, int i9) {
        this.f21264a = i9;
        this.f21265b = baseController;
        this.f21266c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21264a) {
            case 0:
                ((TranslateController) this.f21265b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f21266c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f21265b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f21266c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f21265b).lambda$loadPinnedMessageInternal$165(this.f21266c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f21265b).lambda$updateTimerProc$155(this.f21266c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f21265b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f21266c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f21265b).lambda$getGroupCall$63(this.f21266c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f21265b).lambda$getSponsoredMessages$440(this.f21266c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f21265b).lambda$loadUnknownChannel$330(this.f21266c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f21265b).lambda$setChatReactions$471(this.f21266c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f21265b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f21266c, tLObject, tL_error);
                return;
        }
    }

    public pk(BaseController baseController, Object obj, long j10, int i9) {
        this.f21264a = i9;
        this.f21265b = baseController;
        this.d = obj;
        this.f21266c = j10;
    }
}
