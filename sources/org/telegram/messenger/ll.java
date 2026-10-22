package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18916a;
    public final BaseController f18917b;
    public final Object f18918c;
    public final Object d;
    public final Object e;
    public final Object f18919f;
    public final Object f18920g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18916a = i10;
        this.f18917b = baseController;
        this.f18918c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18919f = obj4;
        this.f18920g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18916a) {
            case 0:
                ((TranslateController) this.f18917b).lambda$translateStory$38((TL_stories.StoryItem) this.f18918c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18919f, (TLRPC.TL_textWithEntities) this.f18920g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18917b).lambda$convertToGigaGroup$269((Context) this.f18918c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18919f, (TLRPC.TL_channels_convertToGigagroup) this.f18920g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18917b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18918c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18919f, (MessageObject) this.f18920g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18916a = 2;
        this.f18917b = secretChatHelper;
        this.f18918c = decryptedMessage;
        this.e = encryptedChat;
        this.f18919f = message;
        this.f18920g = messageObject;
        this.d = str;
    }
}
