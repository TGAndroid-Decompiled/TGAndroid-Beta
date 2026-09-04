package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f18421a;
    public final BaseController f18422b;
    public final Object f18423c;
    public final Object d;
    public final Object f18424e;
    public final Object f18425f;
    public final Object f18426g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18421a = i10;
        this.f18422b = baseController;
        this.f18423c = obj;
        this.d = obj2;
        this.f18424e = obj3;
        this.f18425f = obj4;
        this.f18426g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18421a) {
            case 0:
                ((TranslateController) this.f18422b).lambda$translateStory$38((TL_stories.StoryItem) this.f18423c, (String) this.d, (TranslateController.StoryKey) this.f18424e, (Runnable) this.f18425f, (TLRPC.TL_textWithEntities) this.f18426g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18422b).lambda$convertToGigaGroup$270((Context) this.f18423c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18424e, (org.telegram.ui.ActionBar.n2) this.f18425f, (TLRPC.TL_channels_convertToGigagroup) this.f18426g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18422b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18423c, (TLRPC.EncryptedChat) this.f18424e, (TLRPC.Message) this.f18425f, (MessageObject) this.f18426g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18421a = 2;
        this.f18422b = secretChatHelper;
        this.f18423c = decryptedMessage;
        this.f18424e = encryptedChat;
        this.f18425f = message;
        this.f18426g = messageObject;
        this.d = str;
    }
}
