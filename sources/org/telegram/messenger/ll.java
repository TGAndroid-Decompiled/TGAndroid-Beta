package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18371a;
    public final BaseController f18372b;
    public final Object f18373c;
    public final Object d;
    public final Object f18374e;
    public final Object f18375f;
    public final Object f18376g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18371a = i10;
        this.f18372b = baseController;
        this.f18373c = obj;
        this.d = obj2;
        this.f18374e = obj3;
        this.f18375f = obj4;
        this.f18376g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18371a) {
            case 0:
                ((TranslateController) this.f18372b).lambda$translateStory$38((TL_stories.StoryItem) this.f18373c, (String) this.d, (TranslateController.StoryKey) this.f18374e, (Runnable) this.f18375f, (TLRPC.TL_textWithEntities) this.f18376g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18372b).lambda$convertToGigaGroup$270((Context) this.f18373c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18374e, (org.telegram.ui.ActionBar.n2) this.f18375f, (TLRPC.TL_channels_convertToGigagroup) this.f18376g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18372b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18373c, (TLRPC.EncryptedChat) this.f18374e, (TLRPC.Message) this.f18375f, (MessageObject) this.f18376g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18371a = 2;
        this.f18372b = secretChatHelper;
        this.f18373c = decryptedMessage;
        this.f18374e = encryptedChat;
        this.f18375f = message;
        this.f18376g = messageObject;
        this.d = str;
    }
}
