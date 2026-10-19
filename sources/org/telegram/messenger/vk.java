package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements RequestDelegate {
    public final int f19825a;
    public final BaseController f19826b;
    public final long f19827c;
    public final Object d;

    public vk(BaseController baseController, long j10, Object obj, int i10) {
        this.f19825a = i10;
        this.f19826b = baseController;
        this.f19827c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19825a) {
            case 0:
                ((TranslateController) this.f19826b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f19827c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f19826b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f19827c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19826b).lambda$loadPinnedMessageInternal$165(this.f19827c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19826b).lambda$updateTimerProc$154(this.f19827c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19826b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f19827c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19826b).lambda$getGroupCall$62(this.f19827c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19826b).lambda$getSponsoredMessages$443(this.f19827c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19826b).lambda$loadUnknownChannel$329(this.f19827c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19826b).lambda$setChatReactions$474(this.f19827c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19826b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f19827c, tLObject, tL_error);
                return;
        }
    }

    public vk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19825a = i10;
        this.f19826b = baseController;
        this.d = obj;
        this.f19827c = j10;
    }
}
