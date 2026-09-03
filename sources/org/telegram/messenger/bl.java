package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements RequestDelegate {
    public final int f16872a;
    public final BaseController f16873b;
    public final long f16874c;
    public final Object d;

    public bl(BaseController baseController, long j10, Object obj, int i10) {
        this.f16872a = i10;
        this.f16873b = baseController;
        this.f16874c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16872a) {
            case 0:
                ((TranslateController) this.f16873b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f16874c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f16873b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f16874c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f16873b).lambda$loadPinnedMessageInternal$165(this.f16874c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f16873b).lambda$updateTimerProc$155(this.f16874c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f16873b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f16874c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f16873b).lambda$getGroupCall$63(this.f16874c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f16873b).lambda$getSponsoredMessages$440(this.f16874c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f16873b).lambda$loadUnknownChannel$330(this.f16874c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f16873b).lambda$setChatReactions$471(this.f16874c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f16873b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f16874c, tLObject, tL_error);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, long j10, int i10) {
        this.f16872a = i10;
        this.f16873b = baseController;
        this.d = obj;
        this.f16874c = j10;
    }
}
