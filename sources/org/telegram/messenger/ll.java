package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ll implements RequestDelegate {
    public final int f20614a = 1;
    public final long f20615b;
    public final String f20616c;
    public final Runnable d;
    public final BaseController e;
    public final Object f20617f;
    public final Object f20618g;
    public final Object h;

    public ll(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f20615b = j10;
        this.f20616c = str;
        this.d = runnable;
        this.f20617f = r2Var;
        this.f20618g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20614a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f20617f, this.f20616c, (TranslateController.MessageKey) this.f20618g, this.d, this.f20615b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f20615b, this.f20616c, this.d, (org.telegram.ui.ActionBar.r2) this.f20617f, (TLRPC.TL_channels_updateUsername) this.f20618g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$320((TLRPC.TL_inputChatPhoto) this.f20617f, (TLRPC.FileLocation) this.f20618g, (TLRPC.FileLocation) this.h, this.f20616c, this.f20615b, this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f20617f = tL_inputChatPhoto;
        this.f20618g = fileLocation;
        this.h = fileLocation2;
        this.f20616c = str;
        this.f20615b = j10;
        this.d = runnable;
    }

    public ll(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f20617f = messageObject;
        this.f20616c = str;
        this.f20618g = messageKey;
        this.d = runnable;
        this.f20615b = j10;
        this.h = tL_textWithEntities;
    }
}
