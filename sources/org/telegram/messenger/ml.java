package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ml implements RequestDelegate {
    public final int f19401a = 1;
    public final long f19402b;
    public final String f19403c;
    public final Runnable d;
    public final BaseController f19404e;
    public final Object f19405f;
    public final Object f19406g;
    public final Object h;

    public ml(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f19404e = messagesController;
        this.f19402b = j10;
        this.f19403c = str;
        this.d = runnable;
        this.f19405f = p2Var;
        this.f19406g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19401a) {
            case 0:
                ((TranslateController) this.f19404e).lambda$translatePhoto$46((MessageObject) this.f19405f, this.f19403c, (TranslateController.MessageKey) this.f19406g, this.d, this.f19402b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19404e).lambda$updateChannelUserName$292(this.f19402b, this.f19403c, this.d, (org.telegram.ui.ActionBar.p2) this.f19405f, (TLRPC.TL_channels_updateUsername) this.f19406g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f19404e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f19405f, (TLRPC.FileLocation) this.f19406g, (TLRPC.FileLocation) this.h, this.f19403c, this.f19402b, this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f19404e = messagesController;
        this.f19405f = tL_inputChatPhoto;
        this.f19406g = fileLocation;
        this.h = fileLocation2;
        this.f19403c = str;
        this.f19402b = j10;
        this.d = runnable;
    }

    public ml(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19404e = translateController;
        this.f19405f = messageObject;
        this.f19403c = str;
        this.f19406g = messageKey;
        this.d = runnable;
        this.f19402b = j10;
        this.h = tL_textWithEntities;
    }
}
