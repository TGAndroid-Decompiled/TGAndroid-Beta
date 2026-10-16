package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nl implements RequestDelegate {
    public final int f17674a = 1;
    public final long f17675b;
    public final String f17676c;
    public final Runnable d;
    public final BaseController e;
    public final Object f17677f;
    public final Object f17678g;
    public final Object h;

    public nl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f17675b = j10;
        this.f17676c = str;
        this.d = runnable;
        this.f17677f = m2Var;
        this.f17678g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17674a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f17677f, this.f17676c, (TranslateController.MessageKey) this.f17678g, this.d, this.f17675b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f17675b, this.f17676c, this.d, (org.telegram.ui.ActionBar.m2) this.f17677f, (TLRPC.TL_channels_updateUsername) this.f17678g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f17677f, (TLRPC.FileLocation) this.f17678g, (TLRPC.FileLocation) this.h, this.f17676c, this.f17675b, this.d, tLObject, tL_error);
                return;
        }
    }

    public nl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f17677f = tL_inputChatPhoto;
        this.f17678g = fileLocation;
        this.h = fileLocation2;
        this.f17676c = str;
        this.f17675b = j10;
        this.d = runnable;
    }

    public nl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f17677f = messageObject;
        this.f17676c = str;
        this.f17678g = messageKey;
        this.d = runnable;
        this.f17675b = j10;
        this.h = tL_textWithEntities;
    }
}
