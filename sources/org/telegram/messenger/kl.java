package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kl implements RequestDelegate {
    public final int f18209a = 1;
    public final long f18210b;
    public final String f18211c;
    public final Runnable d;
    public final BaseController f18212e;
    public final Object f18213f;
    public final Object f18214g;
    public final Object h;

    public kl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18212e = messagesController;
        this.f18210b = j3;
        this.f18211c = str;
        this.d = runnable;
        this.f18213f = n2Var;
        this.f18214g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18209a) {
            case 0:
                ((TranslateController) this.f18212e).lambda$translatePhoto$46((MessageObject) this.f18213f, this.f18211c, (TranslateController.MessageKey) this.f18214g, this.d, this.f18210b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18212e).lambda$updateChannelUserName$292(this.f18210b, this.f18211c, this.d, (org.telegram.ui.ActionBar.n2) this.f18213f, (TLRPC.TL_channels_updateUsername) this.f18214g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18212e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f18213f, (TLRPC.FileLocation) this.f18214g, (TLRPC.FileLocation) this.h, this.f18211c, this.f18210b, this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18212e = messagesController;
        this.f18213f = tL_inputChatPhoto;
        this.f18214g = fileLocation;
        this.h = fileLocation2;
        this.f18211c = str;
        this.f18210b = j3;
        this.d = runnable;
    }

    public kl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18212e = translateController;
        this.f18213f = messageObject;
        this.f18211c = str;
        this.f18214g = messageKey;
        this.d = runnable;
        this.f18210b = j3;
        this.h = tL_textWithEntities;
    }
}
