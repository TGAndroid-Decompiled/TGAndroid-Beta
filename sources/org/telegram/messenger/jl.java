package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f16755a = 1;
    public final long f16756b;
    public final String f16757c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16758f;
    public final Object f16759g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16756b = j3;
        this.f16757c = str;
        this.d = runnable;
        this.f16758f = m2Var;
        this.f16759g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16755a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16758f, this.f16757c, (TranslateController.MessageKey) this.f16759g, this.d, this.f16756b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16756b, this.f16757c, this.d, (org.telegram.ui.ActionBar.m2) this.f16758f, (TLRPC.TL_channels_updateUsername) this.f16759g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16758f, (TLRPC.FileLocation) this.f16759g, (TLRPC.FileLocation) this.h, this.f16757c, this.f16756b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16758f = tL_inputChatPhoto;
        this.f16759g = fileLocation;
        this.h = fileLocation2;
        this.f16757c = str;
        this.f16756b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16758f = messageObject;
        this.f16757c = str;
        this.f16759g = messageKey;
        this.d = runnable;
        this.f16756b = j3;
        this.h = tL_textWithEntities;
    }
}
