package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements RequestDelegate {
    public final int f18398a = 1;
    public final long f18399b;
    public final String f18400c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18401f;
    public final Object f18402g;
    public final Object h;

    public fl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18399b = j10;
        this.f18400c = str;
        this.d = runnable;
        this.f18401f = n2Var;
        this.f18402g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18398a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18401f, this.f18400c, (TranslateController.MessageKey) this.f18402g, this.d, this.f18399b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18399b, this.f18400c, this.d, (org.telegram.ui.ActionBar.n2) this.f18401f, (TLRPC.TL_channels_updateUsername) this.f18402g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18401f, (TLRPC.FileLocation) this.f18402g, (TLRPC.FileLocation) this.h, this.f18400c, this.f18399b, this.d, tLObject, tL_error);
                return;
        }
    }

    public fl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18401f = tL_inputChatPhoto;
        this.f18402g = fileLocation;
        this.h = fileLocation2;
        this.f18400c = str;
        this.f18399b = j10;
        this.d = runnable;
    }

    public fl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18401f = messageObject;
        this.f18400c = str;
        this.f18402g = messageKey;
        this.d = runnable;
        this.f18399b = j10;
        this.h = tL_textWithEntities;
    }
}
