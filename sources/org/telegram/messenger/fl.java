package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f18400a = 1;
    public final long f18401b;
    public final String f18402c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18403f;
    public final Object f18404g;
    public final Object h;

    public fl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18401b = j10;
        this.f18402c = str;
        this.d = runnable;
        this.f18403f = n2Var;
        this.f18404g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18400a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18403f, this.f18402c, (TranslateController.MessageKey) this.f18404g, this.d, this.f18401b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18401b, this.f18402c, this.d, (org.telegram.ui.ActionBar.n2) this.f18403f, (TLRPC.TL_channels_updateUsername) this.f18404g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18403f, (TLRPC.FileLocation) this.f18404g, (TLRPC.FileLocation) this.h, this.f18402c, this.f18401b, this.d, tLObject, tL_error);
                return;
        }
    }

    public fl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18403f = tL_inputChatPhoto;
        this.f18404g = fileLocation;
        this.h = fileLocation2;
        this.f18402c = str;
        this.f18401b = j10;
        this.d = runnable;
    }

    public fl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18403f = messageObject;
        this.f18402c = str;
        this.f18404g = messageKey;
        this.d = runnable;
        this.f18401b = j10;
        this.h = tL_textWithEntities;
    }
}
