package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hl implements RequestDelegate {
    public final int f18568a = 1;
    public final long f18569b;
    public final String f18570c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18571f;
    public final Object f18572g;
    public final Object h;

    public hl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18569b = j10;
        this.f18570c = str;
        this.d = runnable;
        this.f18571f = n2Var;
        this.f18572g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18568a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18571f, this.f18570c, (TranslateController.MessageKey) this.f18572g, this.d, this.f18569b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18569b, this.f18570c, this.d, (org.telegram.ui.ActionBar.n2) this.f18571f, (TLRPC.TL_channels_updateUsername) this.f18572g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18571f, (TLRPC.FileLocation) this.f18572g, (TLRPC.FileLocation) this.h, this.f18570c, this.f18569b, this.d, tLObject, tL_error);
                return;
        }
    }

    public hl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18571f = tL_inputChatPhoto;
        this.f18572g = fileLocation;
        this.h = fileLocation2;
        this.f18570c = str;
        this.f18569b = j10;
        this.d = runnable;
    }

    public hl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18571f = messageObject;
        this.f18570c = str;
        this.f18572g = messageKey;
        this.d = runnable;
        this.f18569b = j10;
        this.h = tL_textWithEntities;
    }
}
