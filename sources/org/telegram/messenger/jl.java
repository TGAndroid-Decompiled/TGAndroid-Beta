package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements RequestDelegate {
    public final int f18727a;
    public final BaseController f18728b;
    public final Object f18729c;
    public final Object d;
    public final Object e;
    public final Object f18730f;
    public final Object f18731g;

    public jl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18727a = i10;
        this.f18728b = baseController;
        this.f18729c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18730f = obj4;
        this.f18731g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18727a) {
            case 0:
                ((TranslateController) this.f18728b).lambda$translateStory$38((TL_stories.StoryItem) this.f18729c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18730f, (TLRPC.TL_textWithEntities) this.f18731g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18728b).lambda$convertToGigaGroup$269((Context) this.f18729c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18730f, (TLRPC.TL_channels_convertToGigagroup) this.f18731g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18728b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18729c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18730f, (MessageObject) this.f18731g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18727a = 2;
        this.f18728b = secretChatHelper;
        this.f18729c = decryptedMessage;
        this.e = encryptedChat;
        this.f18730f = message;
        this.f18731g = messageObject;
        this.d = str;
    }
}
