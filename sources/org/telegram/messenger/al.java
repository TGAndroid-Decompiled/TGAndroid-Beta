package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al implements RequestDelegate {
    public final int f19665a;
    public final BaseController f19666b;
    public final long f19667c;
    public final Object d;

    public al(BaseController baseController, long j10, Object obj, int i10) {
        this.f19665a = i10;
        this.f19666b = baseController;
        this.f19667c = j10;
        this.d = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19665a) {
            case 0:
                ((TranslateController) this.f19666b).lambda$pushPollToTranslate$26((TranslateController.PendingPollTranslation) this.d, this.f19667c, tLObject, tL_error);
                return;
            case 1:
                ((TranslateController) this.f19666b).lambda$pushRichMessageToTranslate$29((TranslateController.PendingRichTranslation) this.d, this.f19667c, tLObject, tL_error);
                return;
            case 2:
                ((MediaDataController) this.f19666b).lambda$loadPinnedMessageInternal$165(this.f19667c, (TLRPC.TL_messages_getMessages) this.d, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f19666b).lambda$updateTimerProc$154(this.f19667c, (TLRPC.TL_messages_getMessagesViews) this.d, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f19666b).lambda$reloadMentionsCountForChannel$220((TLRPC.InputPeer) this.d, this.f19667c, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f19666b).lambda$getGroupCall$62(this.f19667c, (Runnable) this.d, tLObject, tL_error);
                return;
            case 6:
                ((MessagesController) this.f19666b).lambda$getSponsoredMessages$445(this.f19667c, (MessagesController.SponsoredMessagesInfo) this.d, tLObject, tL_error);
                return;
            case 7:
                ((MessagesController) this.f19666b).lambda$loadUnknownChannel$331(this.f19667c, (TLRPC.TL_channel) this.d, tLObject, tL_error);
                return;
            case 8:
                ((MessagesController) this.f19666b).lambda$setChatReactions$476(this.f19667c, (TLRPC.TL_messages_setChatAvailableReactions) this.d, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19666b).lambda$checkLastDialogMessage$226((TLRPC.Dialog) this.d, this.f19667c, tLObject, tL_error);
                return;
        }
    }

    public al(BaseController baseController, Object obj, long j10, int i10) {
        this.f19665a = i10;
        this.f19666b = baseController;
        this.d = obj;
        this.f19667c = j10;
    }
}
