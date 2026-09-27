package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f16767a = 1;
    public final long f16768b;
    public final String f16769c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16770f;
    public final Object f16771g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16768b = j3;
        this.f16769c = str;
        this.d = runnable;
        this.f16770f = o2Var;
        this.f16771g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16767a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16770f, this.f16769c, (TranslateController.MessageKey) this.f16771g, this.d, this.f16768b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16768b, this.f16769c, this.d, (org.telegram.ui.ActionBar.o2) this.f16770f, (TLRPC.TL_channels_updateUsername) this.f16771g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16770f, (TLRPC.FileLocation) this.f16771g, (TLRPC.FileLocation) this.h, this.f16769c, this.f16768b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16770f = tL_inputChatPhoto;
        this.f16771g = fileLocation;
        this.h = fileLocation2;
        this.f16769c = str;
        this.f16768b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16770f = messageObject;
        this.f16769c = str;
        this.f16771g = messageKey;
        this.d = runnable;
        this.f16768b = j3;
        this.h = tL_textWithEntities;
    }
}
