package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements RequestDelegate {
    public final int f18725a;
    public final BaseController f18726b;
    public final Object f18727c;
    public final Object d;
    public final Object e;
    public final Object f18728f;
    public final Object f18729g;

    public jl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18725a = i10;
        this.f18726b = baseController;
        this.f18727c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18728f = obj4;
        this.f18729g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18725a) {
            case 0:
                ((TranslateController) this.f18726b).lambda$translateStory$38((TL_stories.StoryItem) this.f18727c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18728f, (TLRPC.TL_textWithEntities) this.f18729g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18726b).lambda$convertToGigaGroup$269((Context) this.f18727c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18728f, (TLRPC.TL_channels_convertToGigagroup) this.f18729g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18726b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18727c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18728f, (MessageObject) this.f18729g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18725a = 2;
        this.f18726b = secretChatHelper;
        this.f18727c = decryptedMessage;
        this.e = encryptedChat;
        this.f18728f = message;
        this.f18729g = messageObject;
        this.d = str;
    }
}
