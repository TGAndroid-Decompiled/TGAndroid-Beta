package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18299a = 1;
    public final long f18300b;
    public final String f18301c;
    public final Runnable d;
    public final BaseController f18302e;
    public final Object f18303f;
    public final Object f18304g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18302e = messagesController;
        this.f18300b = j3;
        this.f18301c = str;
        this.d = runnable;
        this.f18303f = n2Var;
        this.f18304g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18299a) {
            case 0:
                ((TranslateController) this.f18302e).lambda$translatePhoto$46((MessageObject) this.f18303f, this.f18301c, (TranslateController.MessageKey) this.f18304g, this.d, this.f18300b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18302e).lambda$updateChannelUserName$292(this.f18300b, this.f18301c, this.d, (org.telegram.ui.ActionBar.n2) this.f18303f, (TLRPC.TL_channels_updateUsername) this.f18304g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18302e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f18303f, (TLRPC.FileLocation) this.f18304g, (TLRPC.FileLocation) this.h, this.f18301c, this.f18300b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18302e = messagesController;
        this.f18303f = tL_inputChatPhoto;
        this.f18304g = fileLocation;
        this.h = fileLocation2;
        this.f18301c = str;
        this.f18300b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18302e = translateController;
        this.f18303f = messageObject;
        this.f18301c = str;
        this.f18304g = messageKey;
        this.d = runnable;
        this.f18300b = j3;
        this.h = tL_textWithEntities;
    }
}
