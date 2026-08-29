package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il implements RequestDelegate {
    public final int f20607a = 1;
    public final long f20608b;
    public final String f20609c;
    public final Runnable d;
    public final BaseController f20610e;
    public final Object f20611f;
    public final Object f20612g;
    public final Object h;

    public il(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f20610e = messagesController;
        this.f20608b = j10;
        this.f20609c = str;
        this.d = runnable;
        this.f20611f = o2Var;
        this.f20612g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20607a) {
            case 0:
                ((TranslateController) this.f20610e).lambda$translatePhoto$46((MessageObject) this.f20611f, this.f20609c, (TranslateController.MessageKey) this.f20612g, this.d, this.f20608b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20610e).lambda$updateChannelUserName$292(this.f20608b, this.f20609c, this.d, (org.telegram.ui.ActionBar.o2) this.f20611f, (TLRPC.TL_channels_updateUsername) this.f20612g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f20610e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f20611f, (TLRPC.FileLocation) this.f20612g, (TLRPC.FileLocation) this.h, this.f20609c, this.f20608b, this.d, tLObject, tL_error);
                return;
        }
    }

    public il(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.f20610e = messagesController;
        this.f20611f = tL_inputChatPhoto;
        this.f20612g = fileLocation;
        this.h = fileLocation2;
        this.f20609c = str;
        this.f20608b = j10;
        this.d = runnable;
    }

    public il(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f20610e = translateController;
        this.f20611f = messageObject;
        this.f20609c = str;
        this.f20612g = messageKey;
        this.d = runnable;
        this.f20608b = j10;
        this.h = tL_textWithEntities;
    }
}
