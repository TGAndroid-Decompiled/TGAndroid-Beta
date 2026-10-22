package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18727a = 1;
    public final long f18728b;
    public final String f18729c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18730f;
    public final Object f18731g;
    public final Object h;

    public jl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18728b = j10;
        this.f18729c = str;
        this.d = runnable;
        this.f18730f = n2Var;
        this.f18731g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18727a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18730f, this.f18729c, (TranslateController.MessageKey) this.f18731g, this.d, this.f18728b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18728b, this.f18729c, this.d, (org.telegram.ui.ActionBar.n2) this.f18730f, (TLRPC.TL_channels_updateUsername) this.f18731g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18730f, (TLRPC.FileLocation) this.f18731g, (TLRPC.FileLocation) this.h, this.f18729c, this.f18728b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18730f = tL_inputChatPhoto;
        this.f18731g = fileLocation;
        this.h = fileLocation2;
        this.f18729c = str;
        this.f18728b = j10;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18730f = messageObject;
        this.f18729c = str;
        this.f18731g = messageKey;
        this.d = runnable;
        this.f18728b = j10;
        this.h = tL_textWithEntities;
    }
}
