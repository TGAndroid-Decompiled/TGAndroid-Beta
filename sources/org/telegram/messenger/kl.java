package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements RequestDelegate {
    public final int f18830a;
    public final BaseController f18831b;
    public final Object f18832c;
    public final Object d;
    public final Object e;
    public final Object f18833f;
    public final Object f18834g;

    public kl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18830a = i10;
        this.f18831b = baseController;
        this.f18832c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18833f = obj4;
        this.f18834g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18830a) {
            case 0:
                ((TranslateController) this.f18831b).lambda$translateStory$38((TL_stories.StoryItem) this.f18832c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18833f, (TLRPC.TL_textWithEntities) this.f18834g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18831b).lambda$convertToGigaGroup$269((Context) this.f18832c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18833f, (TLRPC.TL_channels_convertToGigagroup) this.f18834g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18831b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18832c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18833f, (MessageObject) this.f18834g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18830a = 2;
        this.f18831b = secretChatHelper;
        this.f18832c = decryptedMessage;
        this.e = encryptedChat;
        this.f18833f = message;
        this.f18834g = messageObject;
        this.d = str;
    }
}
