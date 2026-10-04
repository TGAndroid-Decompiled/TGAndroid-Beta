package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18303a = 1;
    public final long f18304b;
    public final String f18305c;
    public final Runnable d;
    public final BaseController f18306e;
    public final Object f18307f;
    public final Object f18308g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18306e = messagesController;
        this.f18304b = j3;
        this.f18305c = str;
        this.d = runnable;
        this.f18307f = n2Var;
        this.f18308g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18303a) {
            case 0:
                ((TranslateController) this.f18306e).lambda$translatePhoto$46((MessageObject) this.f18307f, this.f18305c, (TranslateController.MessageKey) this.f18308g, this.d, this.f18304b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18306e).lambda$updateChannelUserName$292(this.f18304b, this.f18305c, this.d, (org.telegram.ui.ActionBar.n2) this.f18307f, (TLRPC.TL_channels_updateUsername) this.f18308g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18306e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f18307f, (TLRPC.FileLocation) this.f18308g, (TLRPC.FileLocation) this.h, this.f18305c, this.f18304b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18306e = messagesController;
        this.f18307f = tL_inputChatPhoto;
        this.f18308g = fileLocation;
        this.h = fileLocation2;
        this.f18305c = str;
        this.f18304b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18306e = translateController;
        this.f18307f = messageObject;
        this.f18305c = str;
        this.f18308g = messageKey;
        this.d = runnable;
        this.f18304b = j3;
        this.h = tL_textWithEntities;
    }
}
