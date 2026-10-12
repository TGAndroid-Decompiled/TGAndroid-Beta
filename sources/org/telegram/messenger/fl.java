package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f17633a;
    public final BaseController f17634b;
    public final long f17635c;
    public final Object d;

    public fl(BaseController baseController, long j3, Object obj, int i10) {
        this.f17633a = i10;
        this.f17634b = baseController;
        this.f17635c = j3;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17633a) {
            case 0:
                ((TranslateController) this.f17634b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f17635c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f17634b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f17635c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f17634b).lambda$loadPinnedMessageInternal$165(this.f17635c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17634b).lambda$updateTimerProc$154(this.f17635c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f17634b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f17635c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f17634b).lambda$getGroupCall$62(this.f17635c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f17634b).lambda$getSponsoredMessages$443(this.f17635c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f17634b).lambda$loadUnknownChannel$329(this.f17635c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f17634b).lambda$setChatReactions$474(this.f17635c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f17634b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f17635c, tLObject, tL_error);
                return;
        }
    }

    public fl(BaseController baseController, Object obj, long j3, int i10) {
        this.f17633a = i10;
        this.f17634b = baseController;
        this.d = obj;
        this.f17635c = j3;
    }
}
