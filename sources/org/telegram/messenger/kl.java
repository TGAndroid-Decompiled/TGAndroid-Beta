package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl implements RequestDelegate {
    public final int f16616a = 1;
    public final long f16617b;
    public final String f16618c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16619f;
    public final Object f16620g;
    public final Object h;

    public kl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16617b = j3;
        this.f16618c = str;
        this.d = runnable;
        this.f16619f = n2Var;
        this.f16620g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16616a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16619f, this.f16618c, (TranslateController.MessageKey) this.f16620g, this.d, this.f16617b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16617b, this.f16618c, this.d, (org.telegram.ui.ActionBar.n2) this.f16619f, (TLRPC.TL_channels_updateUsername) this.f16620g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16619f, (TLRPC.FileLocation) this.f16620g, (TLRPC.FileLocation) this.h, this.f16618c, this.f16617b, this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16619f = tL_inputChatPhoto;
        this.f16620g = fileLocation;
        this.h = fileLocation2;
        this.f16618c = str;
        this.f16617b = j3;
        this.d = runnable;
    }

    public kl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16619f = messageObject;
        this.f16618c = str;
        this.f16620g = messageKey;
        this.d = runnable;
        this.f16617b = j3;
        this.h = tL_textWithEntities;
    }
}
