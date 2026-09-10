package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sl implements RequestDelegate {
    public final int f16352a = 1;
    public final long f16353b;
    public final String f16354c;
    public final Runnable d;
    public final BaseController e;
    public final Object f16355f;
    public final Object f16356g;
    public final Object h;

    public sl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f16353b = j3;
        this.f16354c = str;
        this.d = runnable;
        this.f16355f = p2Var;
        this.f16356g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16352a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f16355f, this.f16354c, (TranslateController.MessageKey) this.f16356g, this.d, this.f16353b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$292(this.f16353b, this.f16354c, this.d, (org.telegram.ui.ActionBar.p2) this.f16355f, (TLRPC.TL_channels_updateUsername) this.f16356g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f16355f, (TLRPC.FileLocation) this.f16356g, (TLRPC.FileLocation) this.h, this.f16354c, this.f16353b, this.d, tLObject, tL_error);
                return;
        }
    }

    public sl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.e = messagesController;
        this.f16355f = tL_inputChatPhoto;
        this.f16356g = fileLocation;
        this.h = fileLocation2;
        this.f16354c = str;
        this.f16353b = j3;
        this.d = runnable;
    }

    public sl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f16355f = messageObject;
        this.f16354c = str;
        this.f16356g = messageKey;
        this.d = runnable;
        this.f16353b = j3;
        this.h = tL_textWithEntities;
    }
}
