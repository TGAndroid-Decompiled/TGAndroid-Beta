package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al implements RequestDelegate {
    public final int f19777a = 1;
    public final long f19778b;
    public final String f19779c;
    public final Runnable d;
    public final BaseController f19780e;
    public final Object f19781f;
    public final Object f19782g;
    public final Object h;

    public al(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f19780e = messagesController;
        this.f19778b = j10;
        this.f19779c = str;
        this.d = runnable;
        this.f19781f = o2Var;
        this.f19782g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19777a) {
            case 0:
                ((TranslateController) this.f19780e).lambda$translatePhoto$46((MessageObject) this.f19781f, this.f19779c, (TranslateController.MessageKey) this.f19782g, this.d, this.f19778b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19780e).lambda$updateChannelUserName$292(this.f19778b, this.f19779c, this.d, (org.telegram.ui.ActionBar.o2) this.f19781f, (TLRPC.TL_channels_updateUsername) this.f19782g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19780e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f19781f, (TLRPC.FileLocation) this.f19782g, (TLRPC.FileLocation) this.h, this.f19779c, this.f19778b, this.d, tLObject, tL_error);
                return;
        }
    }

    public al(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f19780e = messagesController;
        this.f19781f = tL_inputChatPhoto;
        this.f19782g = fileLocation;
        this.h = fileLocation2;
        this.f19779c = str;
        this.f19778b = j10;
        this.d = runnable;
    }

    public al(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19780e = translateController;
        this.f19781f = messageObject;
        this.f19779c = str;
        this.f19782g = messageKey;
        this.d = runnable;
        this.f19778b = j10;
        this.h = tL_textWithEntities;
    }
}
