package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18337a = 1;
    public final long f18338b;
    public final String f18339c;
    public final Runnable d;
    public final BaseController f18340e;
    public final Object f18341f;
    public final Object f18342g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18340e = messagesController;
        this.f18338b = j3;
        this.f18339c = str;
        this.d = runnable;
        this.f18341f = m2Var;
        this.f18342g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18337a) {
            case 0:
                ((TranslateController) this.f18340e).lambda$translatePhoto$46((MessageObject) this.f18341f, this.f18339c, (TranslateController.MessageKey) this.f18342g, this.d, this.f18338b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18340e).lambda$updateChannelUserName$291(this.f18338b, this.f18339c, this.d, (org.telegram.ui.ActionBar.m2) this.f18341f, (TLRPC.TL_channels_updateUsername) this.f18342g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18340e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18341f, (TLRPC.FileLocation) this.f18342g, (TLRPC.FileLocation) this.h, this.f18339c, this.f18338b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18340e = messagesController;
        this.f18341f = tL_inputChatPhoto;
        this.f18342g = fileLocation;
        this.h = fileLocation2;
        this.f18339c = str;
        this.f18338b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18340e = translateController;
        this.f18341f = messageObject;
        this.f18339c = str;
        this.f18342g = messageKey;
        this.d = runnable;
        this.f18338b = j3;
        this.h = tL_textWithEntities;
    }
}
