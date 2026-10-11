package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18301a = 1;
    public final long f18302b;
    public final String f18303c;
    public final Runnable d;
    public final BaseController f18304e;
    public final Object f18305f;
    public final Object f18306g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18304e = messagesController;
        this.f18302b = j3;
        this.f18303c = str;
        this.d = runnable;
        this.f18305f = m2Var;
        this.f18306g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18301a) {
            case 0:
                ((TranslateController) this.f18304e).lambda$translatePhoto$46((MessageObject) this.f18305f, this.f18303c, (TranslateController.MessageKey) this.f18306g, this.d, this.f18302b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18304e).lambda$updateChannelUserName$291(this.f18302b, this.f18303c, this.d, (org.telegram.ui.ActionBar.m2) this.f18305f, (TLRPC.TL_channels_updateUsername) this.f18306g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18304e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18305f, (TLRPC.FileLocation) this.f18306g, (TLRPC.FileLocation) this.h, this.f18303c, this.f18302b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18304e = messagesController;
        this.f18305f = tL_inputChatPhoto;
        this.f18306g = fileLocation;
        this.h = fileLocation2;
        this.f18303c = str;
        this.f18302b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18304e = translateController;
        this.f18305f = messageObject;
        this.f18303c = str;
        this.f18306g = messageKey;
        this.d = runnable;
        this.f18302b = j3;
        this.h = tL_textWithEntities;
    }
}
