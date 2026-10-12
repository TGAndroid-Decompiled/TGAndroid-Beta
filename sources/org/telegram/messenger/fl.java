package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f17632a;
    public final BaseController f17633b;
    public final long f17634c;
    public final Object d;

    public fl(BaseController baseController, long j3, Object obj, int i10) {
        this.f17632a = i10;
        this.f17633b = baseController;
        this.f17634c = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17632a) {
            case 0:
                ((TranslateController) this.f17633b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f17634c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f17633b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f17634c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17633b).lambda$loadPinnedMessageInternal$165(this.f17634c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17633b).lambda$updateTimerProc$154(this.f17634c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f17633b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f17634c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f17633b).lambda$getGroupCall$62(this.f17634c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17633b).lambda$getSponsoredMessages$443(this.f17634c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17633b).lambda$loadUnknownChannel$329(this.f17634c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f17633b).lambda$setChatReactions$474(this.f17634c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17633b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f17634c, tLObject, tL_error);
                return;
        }
    }

    public fl(BaseController baseController, Object obj, long j3, int i10) {
        this.f17632a = i10;
        this.f17633b = baseController;
        this.d = obj;
        this.f17634c = j3;
    }
}
