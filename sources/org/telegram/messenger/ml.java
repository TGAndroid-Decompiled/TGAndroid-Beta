package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements RequestDelegate {
    public final int f17901a = 1;
    public final long f17902b;
    public final String f17903c;
    public final Runnable d;
    public final BaseController e;
    public final Object f17904f;
    public final Object f17905g;
    public final Object h;

    public ml(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f17902b = j10;
        this.f17903c = str;
        this.d = runnable;
        this.f17904f = m2Var;
        this.f17905g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17901a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f17904f, this.f17903c, (TranslateController.MessageKey) this.f17905g, this.d, this.f17902b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f17902b, this.f17903c, this.d, (org.telegram.ui.ActionBar.m2) this.f17904f, (TLRPC.TL_channels_updateUsername) this.f17905g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f17904f, (TLRPC.FileLocation) this.f17905g, (TLRPC.FileLocation) this.h, this.f17903c, this.f17902b, this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f17904f = tL_inputChatPhoto;
        this.f17905g = fileLocation;
        this.h = fileLocation2;
        this.f17903c = str;
        this.f17902b = j10;
        this.d = runnable;
    }

    public ml(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f17904f = messageObject;
        this.f17903c = str;
        this.f17905g = messageKey;
        this.d = runnable;
        this.f17902b = j10;
        this.h = tL_textWithEntities;
    }
}
