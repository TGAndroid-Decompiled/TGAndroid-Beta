package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18137a = 1;
    public final long f18138b;
    public final String f18139c;
    public final Runnable d;
    public final BaseController f18140e;
    public final Object f18141f;
    public final Object f18142g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18140e = messagesController;
        this.f18138b = j3;
        this.f18139c = str;
        this.d = runnable;
        this.f18141f = n2Var;
        this.f18142g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18137a) {
            case 0:
                ((TranslateController) this.f18140e).lambda$translatePhoto$46((MessageObject) this.f18141f, this.f18139c, (TranslateController.MessageKey) this.f18142g, this.d, this.f18138b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18140e).lambda$updateChannelUserName$292(this.f18138b, this.f18139c, this.d, (org.telegram.ui.ActionBar.n2) this.f18141f, (TLRPC.TL_channels_updateUsername) this.f18142g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18140e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f18141f, (TLRPC.FileLocation) this.f18142g, (TLRPC.FileLocation) this.h, this.f18139c, this.f18138b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18140e = messagesController;
        this.f18141f = tL_inputChatPhoto;
        this.f18142g = fileLocation;
        this.h = fileLocation2;
        this.f18139c = str;
        this.f18138b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18140e = translateController;
        this.f18141f = messageObject;
        this.f18139c = str;
        this.f18142g = messageKey;
        this.d = runnable;
        this.f18138b = j3;
        this.h = tL_textWithEntities;
    }
}
