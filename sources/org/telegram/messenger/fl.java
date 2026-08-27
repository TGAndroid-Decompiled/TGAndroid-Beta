package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class fl implements RequestDelegate {

    public final int f20310a = 1;

    public final long f20311b;

    public final String f20312c;
    public final Runnable d;

    public final BaseController f20313e;

    public final Object f20314f;

    public final Object f20315g;
    public final Object h;

    public fl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f20313e = messagesController;
        this.f20311b = j10;
        this.f20312c = str;
        this.d = runnable;
        this.f20314f = n2Var;
        this.f20315g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20310a) {
            case 0:
                ((TranslateController) this.f20313e).lambda$translatePhoto$46((MessageObject) this.f20314f, this.f20312c, (TranslateController.MessageKey) this.f20315g, this.d, this.f20311b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f20313e).lambda$updateChannelUserName$292(this.f20311b, this.f20312c, this.d, (org.telegram.ui.ActionBar.n2) this.f20314f, (TLRPC.TL_channels_updateUsername) this.f20315g, (Runnable) this.h, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f20313e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f20314f, (TLRPC.FileLocation) this.f20315g, (TLRPC.FileLocation) this.h, this.f20312c, this.f20311b, this.d, tLObject, tL_error);
                break;
        }
    }

    public fl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f20313e = messagesController;
        this.f20314f = tL_inputChatPhoto;
        this.f20315g = fileLocation;
        this.h = fileLocation2;
        this.f20312c = str;
        this.f20311b = j10;
        this.d = runnable;
    }

    public fl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f20313e = translateController;
        this.f20314f = messageObject;
        this.f20312c = str;
        this.f20315g = messageKey;
        this.d = runnable;
        this.f20311b = j10;
        this.h = tL_textWithEntities;
    }
}
