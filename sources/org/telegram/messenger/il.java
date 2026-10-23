package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class il implements RequestDelegate {
    public final int f18657a = 1;
    public final long f18658b;
    public final String f18659c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18660f;
    public final Object f18661g;
    public final Object h;

    public il(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18658b = j10;
        this.f18659c = str;
        this.d = runnable;
        this.f18660f = n2Var;
        this.f18661g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18657a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18660f, this.f18659c, (TranslateController.MessageKey) this.f18661g, this.d, this.f18658b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18658b, this.f18659c, this.d, (org.telegram.ui.ActionBar.n2) this.f18660f, (TLRPC.TL_channels_updateUsername) this.f18661g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18660f, (TLRPC.FileLocation) this.f18661g, (TLRPC.FileLocation) this.h, this.f18659c, this.f18658b, this.d, tLObject, tL_error);
                return;
        }
    }

    public il(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18660f = tL_inputChatPhoto;
        this.f18661g = fileLocation;
        this.h = fileLocation2;
        this.f18659c = str;
        this.f18658b = j10;
        this.d = runnable;
    }

    public il(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18660f = messageObject;
        this.f18659c = str;
        this.f18661g = messageKey;
        this.d = runnable;
        this.f18658b = j10;
        this.h = tL_textWithEntities;
    }
}
