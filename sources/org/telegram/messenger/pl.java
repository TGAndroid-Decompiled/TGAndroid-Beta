package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl implements RequestDelegate {
    public final int f18616a = 1;
    public final long f18617b;
    public final String f18618c;
    public final Runnable d;
    public final BaseController f18619e;
    public final Object f18620f;
    public final Object f18621g;
    public final Object h;

    public pl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18619e = messagesController;
        this.f18617b = j3;
        this.f18618c = str;
        this.d = runnable;
        this.f18620f = m2Var;
        this.f18621g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18616a) {
            case 0:
                ((TranslateController) this.f18619e).lambda$translatePhoto$46((MessageObject) this.f18620f, this.f18618c, (TranslateController.MessageKey) this.f18621g, this.d, this.f18617b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18619e).lambda$updateChannelUserName$291(this.f18617b, this.f18618c, this.d, (org.telegram.ui.ActionBar.m2) this.f18620f, (TLRPC.TL_channels_updateUsername) this.f18621g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18619e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18620f, (TLRPC.FileLocation) this.f18621g, (TLRPC.FileLocation) this.h, this.f18618c, this.f18617b, this.d, tLObject, tL_error);
                return;
        }
    }

    public pl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18619e = messagesController;
        this.f18620f = tL_inputChatPhoto;
        this.f18621g = fileLocation;
        this.h = fileLocation2;
        this.f18618c = str;
        this.f18617b = j3;
        this.d = runnable;
    }

    public pl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18619e = translateController;
        this.f18620f = messageObject;
        this.f18618c = str;
        this.f18621g = messageKey;
        this.d = runnable;
        this.f18617b = j3;
        this.h = tL_textWithEntities;
    }
}
