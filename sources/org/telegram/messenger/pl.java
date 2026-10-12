package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pl implements RequestDelegate {
    public final int f18615a = 1;
    public final long f18616b;
    public final String f18617c;
    public final Runnable d;
    public final BaseController f18618e;
    public final Object f18619f;
    public final Object f18620g;
    public final Object h;

    public pl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18618e = messagesController;
        this.f18616b = j3;
        this.f18617c = str;
        this.d = runnable;
        this.f18619f = m2Var;
        this.f18620g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18615a) {
            case 0:
                ((TranslateController) this.f18618e).lambda$translatePhoto$46((MessageObject) this.f18619f, this.f18617c, (TranslateController.MessageKey) this.f18620g, this.d, this.f18616b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18618e).lambda$updateChannelUserName$291(this.f18616b, this.f18617c, this.d, (org.telegram.ui.ActionBar.m2) this.f18619f, (TLRPC.TL_channels_updateUsername) this.f18620g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18618e).lambda$changeChatAvatar$318((TLRPC.TL_inputChatPhoto) this.f18619f, (TLRPC.FileLocation) this.f18620g, (TLRPC.FileLocation) this.h, this.f18617c, this.f18616b, this.d, tLObject, tL_error);
                return;
        }
    }

    public pl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18618e = messagesController;
        this.f18619f = tL_inputChatPhoto;
        this.f18620g = fileLocation;
        this.h = fileLocation2;
        this.f18617c = str;
        this.f18616b = j3;
        this.d = runnable;
    }

    public pl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18618e = translateController;
        this.f18619f = messageObject;
        this.f18617c = str;
        this.f18620g = messageKey;
        this.d = runnable;
        this.f18616b = j3;
        this.h = tL_textWithEntities;
    }
}
