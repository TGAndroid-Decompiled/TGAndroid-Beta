package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements RequestDelegate {
    public final int f17855a = 1;
    public final long f17856b;
    public final String f17857c;
    public final Runnable d;
    public final BaseController e;
    public final Object f17858f;
    public final Object f17859g;
    public final Object h;

    public ml(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f17856b = j10;
        this.f17857c = str;
        this.d = runnable;
        this.f17858f = p2Var;
        this.f17859g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17855a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f17858f, this.f17857c, (TranslateController.MessageKey) this.f17859g, this.d, this.f17856b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f17856b, this.f17857c, this.d, (org.telegram.ui.ActionBar.p2) this.f17858f, (TLRPC.TL_channels_updateUsername) this.f17859g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f17858f, (TLRPC.FileLocation) this.f17859g, (TLRPC.FileLocation) this.h, this.f17857c, this.f17856b, this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f17858f = tL_inputChatPhoto;
        this.f17859g = fileLocation;
        this.h = fileLocation2;
        this.f17857c = str;
        this.f17856b = j10;
        this.d = runnable;
    }

    public ml(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f17858f = messageObject;
        this.f17857c = str;
        this.f17859g = messageKey;
        this.d = runnable;
        this.f17856b = j10;
        this.h = tL_textWithEntities;
    }
}
