package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f16770a = 1;
    public final long f16771b;
    public final String f16772c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16773f;
    public final Object f16774g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16771b = j3;
        this.f16772c = str;
        this.d = runnable;
        this.f16773f = m2Var;
        this.f16774g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16770a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16773f, this.f16772c, (TranslateController.MessageKey) this.f16774g, this.d, this.f16771b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16771b, this.f16772c, this.d, (org.telegram.ui.ActionBar.m2) this.f16773f, (TLRPC.TL_channels_updateUsername) this.f16774g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16773f, (TLRPC.FileLocation) this.f16774g, (TLRPC.FileLocation) this.h, this.f16772c, this.f16771b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16773f = tL_inputChatPhoto;
        this.f16774g = fileLocation;
        this.h = fileLocation2;
        this.f16772c = str;
        this.f16771b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16773f = messageObject;
        this.f16772c = str;
        this.f16774g = messageKey;
        this.d = runnable;
        this.f16771b = j3;
        this.h = tL_textWithEntities;
    }
}
