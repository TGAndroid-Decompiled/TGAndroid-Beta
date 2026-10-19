package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gl implements RequestDelegate {
    public final int f18477a = 1;
    public final long f18478b;
    public final String f18479c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18480f;
    public final Object f18481g;
    public final Object h;

    public gl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18478b = j10;
        this.f18479c = str;
        this.d = runnable;
        this.f18480f = n2Var;
        this.f18481g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18477a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18480f, this.f18479c, (TranslateController.MessageKey) this.f18481g, this.d, this.f18478b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18478b, this.f18479c, this.d, (org.telegram.ui.ActionBar.n2) this.f18480f, (TLRPC.TL_channels_updateUsername) this.f18481g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18480f, (TLRPC.FileLocation) this.f18481g, (TLRPC.FileLocation) this.h, this.f18479c, this.f18478b, this.d, tLObject, tL_error);
                return;
        }
    }

    public gl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18480f = tL_inputChatPhoto;
        this.f18481g = fileLocation;
        this.h = fileLocation2;
        this.f18479c = str;
        this.f18478b = j10;
        this.d = runnable;
    }

    public gl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18480f = messageObject;
        this.f18479c = str;
        this.f18481g = messageKey;
        this.d = runnable;
        this.f18478b = j10;
        this.h = tL_textWithEntities;
    }
}
