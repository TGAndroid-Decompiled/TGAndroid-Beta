package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hl implements RequestDelegate {
    public final int f18565a = 1;
    public final long f18566b;
    public final String f18567c;
    public final Runnable d;
    public final BaseController e;
    public final Object f18568f;
    public final Object f18569g;
    public final Object h;

    public hl(MessagesController messagesController, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.e = messagesController;
        this.f18566b = j10;
        this.f18567c = str;
        this.d = runnable;
        this.f18568f = n2Var;
        this.f18569g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18565a) {
            case 0:
                ((TranslateController) this.e).lambda$translatePhoto$46((MessageObject) this.f18568f, this.f18567c, (TranslateController.MessageKey) this.f18569g, this.d, this.f18566b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.e).lambda$updateChannelUserName$291(this.f18566b, this.f18567c, this.d, (org.telegram.ui.ActionBar.n2) this.f18568f, (TLRPC.TL_channels_updateUsername) this.f18569g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18568f, (TLRPC.FileLocation) this.f18569g, (TLRPC.FileLocation) this.h, this.f18567c, this.f18566b, this.d, tLObject, tL_error);
                return;
        }
    }

    public hl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.e = messagesController;
        this.f18568f = tL_inputChatPhoto;
        this.f18569g = fileLocation;
        this.h = fileLocation2;
        this.f18567c = str;
        this.f18566b = j10;
        this.d = runnable;
    }

    public hl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.e = translateController;
        this.f18568f = messageObject;
        this.f18567c = str;
        this.f18569g = messageKey;
        this.d = runnable;
        this.f18566b = j10;
        this.h = tL_textWithEntities;
    }
}
