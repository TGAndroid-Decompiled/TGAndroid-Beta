package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class uk implements RequestDelegate {

    public final int f21754a;

    public final BaseController f21755b;

    public final long f21756c;
    public final Object d;

    public uk(BaseController baseController, long j10, Object obj, int i10) {
        this.f21754a = i10;
        this.f21755b = baseController;
        this.f21756c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21754a) {
            case 0:
                ((TranslateController) this.f21755b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f21756c, tLObject, tL_error);
                break;
            case 1:
                ((TranslateController) this.f21755b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f21756c, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.f21755b).lambda$loadPinnedMessageInternal$165(this.f21756c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f21755b).lambda$updateTimerProc$155(this.f21756c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.f21755b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f21756c, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.f21755b).lambda$getGroupCall$63(this.f21756c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 6:
                ((MessagesController) this.f21755b).lambda$getSponsoredMessages$440(this.f21756c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController) this.f21755b).lambda$loadUnknownChannel$330(this.f21756c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                break;
            case 8:
                ((MessagesController) this.f21755b).lambda$setChatReactions$471(this.f21756c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f21755b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f21756c, tLObject, tL_error);
                break;
        }
    }

    public uk(BaseController baseController, Object obj, long j10, int i10) {
        this.f21754a = i10;
        this.f21755b = baseController;
        this.d = obj;
        this.f21756c = j10;
    }
}
