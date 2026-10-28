package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements RequestDelegate {
    public final int f20710a = 1;
    public final long f20711b;
    public final String f20712c;
    public final Runnable d;
    public final BaseController e;
    public final Object f20713f;
    public final Object f20714g;
    public final Object h;

    public ml(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f20711b = j10;
        this.f20712c = str;
        this.d = runnable;
        this.f20713f = r2Var;
        this.f20714g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20710a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f20713f, this.f20712c, (TranslateController.MessageKey) this.f20714g, this.d, this.f20711b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f20711b, this.f20712c, this.d, (org.telegram.ui.ActionBar.r2) this.f20713f, (TLRPC.TL_channels_updateUsername) this.f20714g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$320((TLRPC.TL_inputChatPhoto) this.f20713f, (TLRPC.FileLocation) this.f20714g, (TLRPC.FileLocation) this.h, this.f20712c, this.f20711b, this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f20713f = tL_inputChatPhoto;
        this.f20714g = fileLocation;
        this.h = fileLocation2;
        this.f20712c = str;
        this.f20711b = j10;
        this.d = runnable;
    }

    public ml(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f20713f = messageObject;
        this.f20712c = str;
        this.f20714g = messageKey;
        this.d = runnable;
        this.f20711b = j10;
        this.h = tL_textWithEntities;
    }
}
