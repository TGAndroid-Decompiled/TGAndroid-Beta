package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f16773a = 1;
    public final long f16774b;
    public final String f16775c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16776f;
    public final Object f16777g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16774b = j3;
        this.f16775c = str;
        this.d = runnable;
        this.f16776f = m2Var;
        this.f16777g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16773a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16776f, this.f16775c, (TranslateController.MessageKey) this.f16777g, this.d, this.f16774b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16774b, this.f16775c, this.d, (org.telegram.ui.ActionBar.m2) this.f16776f, (TLRPC.TL_channels_updateUsername) this.f16777g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16776f, (TLRPC.FileLocation) this.f16777g, (TLRPC.FileLocation) this.h, this.f16775c, this.f16774b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16776f = tL_inputChatPhoto;
        this.f16777g = fileLocation;
        this.h = fileLocation2;
        this.f16775c = str;
        this.f16774b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16776f = messageObject;
        this.f16775c = str;
        this.f16777g = messageKey;
        this.d = runnable;
        this.f16774b = j3;
        this.h = tL_textWithEntities;
    }
}
