package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il implements RequestDelegate {
    public final int f18702a = 1;
    public final long f18703b;
    public final String f18704c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18705f;
    public final Object f18706g;
    public final Object h;

    public il(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18703b = j10;
        this.f18704c = str;
        this.d = runnable;
        this.f18705f = o2Var;
        this.f18706g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18702a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18705f, this.f18704c, (TranslateController.MessageKey) this.f18706g, this.d, this.f18703b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18703b, this.f18704c, this.d, (org.telegram.ui.ActionBar.o2) this.f18705f, (TLRPC.TL_channels_updateUsername) this.f18706g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18705f, (TLRPC.FileLocation) this.f18706g, (TLRPC.FileLocation) this.h, this.f18704c, this.f18703b, this.d, tLObject, tL_error);
                return;
        }
    }

    public il(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18705f = tL_inputChatPhoto;
        this.f18706g = fileLocation;
        this.h = fileLocation2;
        this.f18704c = str;
        this.f18703b = j10;
        this.d = runnable;
    }

    public il(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18705f = messageObject;
        this.f18704c = str;
        this.f18706g = messageKey;
        this.d = runnable;
        this.f18703b = j10;
        this.h = tL_textWithEntities;
    }
}
