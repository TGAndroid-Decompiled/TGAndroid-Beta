package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements RequestDelegate {
    public final int f22200a;
    public final BaseController f22201b;
    public final long f22202c;
    public final Object d;

    public xk(BaseController baseController, long j10, Object obj, int i10) {
        this.f22200a = i10;
        this.f22201b = baseController;
        this.f22202c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22200a) {
            case 0:
                ((TranslateController) this.f22201b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f22202c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f22201b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f22202c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f22201b).lambda$loadPinnedMessageInternal$165(this.f22202c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f22201b).lambda$updateTimerProc$155(this.f22202c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f22201b).lambda$reloadMentionsCountForChannel$221((TLRPC.InputPeer) this.d, this.f22202c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f22201b).lambda$getGroupCall$63(this.f22202c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f22201b).lambda$getSponsoredMessages$440(this.f22202c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f22201b).lambda$loadUnknownChannel$330(this.f22202c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f22201b).lambda$setChatReactions$471(this.f22202c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f22201b).lambda$checkLastDialogMessage$227((TLRPC.Dialog) this.d, this.f22202c, tLObject, tL_error);
                return;
        }
    }

    public xk(BaseController baseController, Object obj, long j10, int i10) {
        this.f22200a = i10;
        this.f22201b = baseController;
        this.d = obj;
        this.f22202c = j10;
    }
}
