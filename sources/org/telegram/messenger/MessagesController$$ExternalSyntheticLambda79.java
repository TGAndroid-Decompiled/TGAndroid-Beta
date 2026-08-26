package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class MessagesController$$ExternalSyntheticLambda79 implements RequestDelegate {
    public final int $r8$classId = 2;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final String f$4;
    public final long f$5;
    public final Runnable f$6;

    public MessagesController$$ExternalSyntheticLambda79(MessagesController messagesController, long j, String str, Runnable runnable, BaseFragment baseFragment, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f$0 = messagesController;
        this.f$5 = j;
        this.f$4 = str;
        this.f$6 = runnable;
        this.f$1 = baseFragment;
        this.f$2 = tL_channels_updateUsername;
        this.f$3 = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f$1, (TLRPC.FileLocation) this.f$2, (TLRPC.FileLocation) this.f$3, this.f$4, this.f$5, this.f$6, tLObject, tL_error);
                break;
            case 1:
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f$3;
                ((TranslateController) this.f$0).lambda$translatePhoto$46((MessageObject) this.f$1, this.f$4, (TranslateController.MessageKey) this.f$2, this.f$6, this.f$5, tL_textWithEntities, tLObject, tL_error);
                break;
            default:
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.f$2;
                ((MessagesController) this.f$0).lambda$updateChannelUserName$292(this.f$5, this.f$4, this.f$6, (BaseFragment) this.f$1, tL_channels_updateUsername, (Runnable) this.f$3, tLObject, tL_error);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda79(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j, Runnable runnable) {
        this.f$0 = messagesController;
        this.f$1 = tL_inputChatPhoto;
        this.f$2 = fileLocation;
        this.f$3 = fileLocation2;
        this.f$4 = str;
        this.f$5 = j;
        this.f$6 = runnable;
    }

    public MessagesController$$ExternalSyntheticLambda79(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$4 = str;
        this.f$2 = messageKey;
        this.f$6 = runnable;
        this.f$5 = j;
        this.f$3 = tL_textWithEntities;
    }
}
