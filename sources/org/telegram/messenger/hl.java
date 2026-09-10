package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hl implements RequestDelegate {
    public final int f15406a;
    public final BaseController f15407b;
    public final long f15408c;
    public final Object d;

    public hl(BaseController baseController, long j3, Object obj, int i10) {
        this.f15406a = i10;
        this.f15407b = baseController;
        this.f15408c = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15406a) {
            case 0:
                ((TranslateController) this.f15407b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f15408c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f15407b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f15408c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f15407b).lambda$loadPinnedMessageInternal$165(this.f15408c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f15407b).lambda$updateTimerProc$155(this.f15408c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f15407b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f15408c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f15407b).lambda$getGroupCall$63(this.f15408c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f15407b).lambda$getSponsoredMessages$440(this.f15408c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f15407b).lambda$loadUnknownChannel$330(this.f15408c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f15407b).lambda$setChatReactions$471(this.f15408c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f15407b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f15408c, tLObject, tL_error);
                return;
        }
    }

    public hl(BaseController baseController, Object obj, long j3, int i10) {
        this.f15406a = i10;
        this.f15407b = baseController;
        this.d = obj;
        this.f15408c = j3;
    }
}
