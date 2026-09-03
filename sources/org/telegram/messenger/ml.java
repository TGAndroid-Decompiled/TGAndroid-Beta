package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements RequestDelegate {
    public final int f19403a = 1;
    public final long f19404b;
    public final String f19405c;
    public final Runnable d;
    public final BaseController f19406e;
    public final Object f19407f;
    public final Object f19408g;
    public final Object h;

    public ml(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f19406e = messagesController;
        this.f19404b = j10;
        this.f19405c = str;
        this.d = runnable;
        this.f19407f = p2Var;
        this.f19408g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19403a) {
            case 0:
                ((TranslateController) this.f19406e).lambda$translatePhoto$46((MessageObject) this.f19407f, this.f19405c, (TranslateController.MessageKey) this.f19408g, this.d, this.f19404b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19406e).lambda$updateChannelUserName$292(this.f19404b, this.f19405c, this.d, (org.telegram.ui.ActionBar.p2) this.f19407f, (TLRPC.TL_channels_updateUsername) this.f19408g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19406e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f19407f, (TLRPC.FileLocation) this.f19408g, (TLRPC.FileLocation) this.h, this.f19405c, this.f19404b, this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f19406e = messagesController;
        this.f19407f = tL_inputChatPhoto;
        this.f19408g = fileLocation;
        this.h = fileLocation2;
        this.f19405c = str;
        this.f19404b = j10;
        this.d = runnable;
    }

    public ml(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19406e = translateController;
        this.f19407f = messageObject;
        this.f19405c = str;
        this.f19408g = messageKey;
        this.d = runnable;
        this.f19404b = j10;
        this.h = tL_textWithEntities;
    }
}
