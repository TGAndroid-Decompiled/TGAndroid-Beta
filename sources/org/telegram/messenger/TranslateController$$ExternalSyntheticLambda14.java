package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TranslateController$$ExternalSyntheticLambda14 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final long f$2;

    public TranslateController$$ExternalSyntheticLambda14(BaseController baseController, long j, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$2 = j;
        this.f$1 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((TranslateController) this.f$0).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((TranslateController) this.f$0).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f$0).lambda$loadPinnedMessageInternal$165(this.f$2, (TLRPC.TL_messages_getMessages) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$updateTimerProc$155(this.f$2, (TLRPC.TL_messages_getMessagesViews) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$getGroupCall$63(this.f$2, (Runnable) this.f$1, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.f$0).lambda$getSponsoredMessages$440(this.f$2, (MessagesController.SponsoredMessagesInfo) this.f$1, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.f$0).lambda$loadUnknownChannel$330(this.f$2, (TLRPC.TL_channel) this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.f$0).lambda$setChatReactions$471(this.f$2, (TLRPC.TL_messages_setChatAvailableReactions) this.f$1, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f$0).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }

    public TranslateController$$ExternalSyntheticLambda14(BaseController baseController, Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = j;
    }
}
