package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl implements RequestDelegate {
    public final int f18236a = 1;
    public final long f18237b;
    public final String f18238c;
    public final Runnable d;
    public final BaseController f18239e;
    public final Object f18240f;
    public final Object f18241g;
    public final Object h;

    public kl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18239e = messagesController;
        this.f18237b = j3;
        this.f18238c = str;
        this.d = runnable;
        this.f18240f = n2Var;
        this.f18241g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18236a) {
            case 0:
                ((TranslateController) this.f18239e).lambda$translatePhoto$46((MessageObject) this.f18240f, this.f18238c, (TranslateController.MessageKey) this.f18241g, this.d, this.f18237b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18239e).lambda$updateChannelUserName$292(this.f18237b, this.f18238c, this.d, (org.telegram.ui.ActionBar.n2) this.f18240f, (TLRPC.TL_channels_updateUsername) this.f18241g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18239e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f18240f, (TLRPC.FileLocation) this.f18241g, (TLRPC.FileLocation) this.h, this.f18238c, this.f18237b, this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18239e = messagesController;
        this.f18240f = tL_inputChatPhoto;
        this.f18241g = fileLocation;
        this.h = fileLocation2;
        this.f18238c = str;
        this.f18237b = j3;
        this.d = runnable;
    }

    public kl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18239e = translateController;
        this.f18240f = messageObject;
        this.f18238c = str;
        this.f18241g = messageKey;
        this.d = runnable;
        this.f18237b = j3;
        this.h = tL_textWithEntities;
    }
}
