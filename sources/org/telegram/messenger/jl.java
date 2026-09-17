package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jl implements RequestDelegate {
    public final int f18164a = 1;
    public final long f18165b;
    public final String f18166c;
    public final Runnable d;
    public final BaseController f18167e;
    public final Object f18168f;
    public final Object f18169g;
    public final Object h;

    public jl(MessagesController messagesController, long j3, String str, Runnable runnable, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.f18167e = messagesController;
        this.f18165b = j3;
        this.f18166c = str;
        this.d = runnable;
        this.f18168f = n2Var;
        this.f18169g = tL_channels_updateUsername;
        this.h = runnable2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18164a) {
            case 0:
                ((TranslateController) this.f18167e).lambda$translatePhoto$46((MessageObject) this.f18168f, this.f18166c, (TranslateController.MessageKey) this.f18169g, this.d, this.f18165b, (TLRPC.TL_textWithEntities) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18167e).lambda$updateChannelUserName$292(this.f18165b, this.f18166c, this.d, (org.telegram.ui.ActionBar.n2) this.f18168f, (TLRPC.TL_channels_updateUsername) this.f18169g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.f18167e).lambda$changeChatAvatar$319((TLRPC.TL_inputChatPhoto) this.f18168f, (TLRPC.FileLocation) this.f18169g, (TLRPC.FileLocation) this.h, this.f18166c, this.f18165b, this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(MessagesController messagesController, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j3, Runnable runnable) {
        this.f18167e = messagesController;
        this.f18168f = tL_inputChatPhoto;
        this.f18169g = fileLocation;
        this.h = fileLocation2;
        this.f18166c = str;
        this.f18165b = j3;
        this.d = runnable;
    }

    public jl(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j3, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18167e = translateController;
        this.f18168f = messageObject;
        this.f18166c = str;
        this.f18169g = messageKey;
        this.d = runnable;
        this.f18165b = j3;
        this.h = tL_textWithEntities;
    }
}
