package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl implements RequestDelegate {
    public final int f16842a = 1;
    public final long f16843b;
    public final String f16844c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16845f;
    public final Object f16846g;
    public final Object h;

    public kl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16843b = j3;
        this.f16844c = str;
        this.d = runnable;
        this.f16845f = n2Var;
        this.f16846g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16842a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16845f, this.f16844c, (TranslateController.MessageKey) this.f16846g, this.d, this.f16843b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16843b, this.f16844c, this.d, (org.telegram.ui.ActionBar.n2) this.f16845f, (TLRPC.TL_channels_updateUsername) this.f16846g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16845f, (TLRPC.FileLocation) this.f16846g, (TLRPC.FileLocation) this.h, this.f16844c, this.f16843b, this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16845f = tL_inputChatPhoto;
        this.f16846g = fileLocation;
        this.h = fileLocation2;
        this.f16844c = str;
        this.f16843b = j3;
        this.d = runnable;
    }

    public kl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16845f = messageObject;
        this.f16844c = str;
        this.f16846g = messageKey;
        this.d = runnable;
        this.f16843b = j3;
        this.h = tL_textWithEntities;
    }
}
