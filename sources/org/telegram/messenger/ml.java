package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f18448a;
    public final BaseController f18449b;
    public final Object f18450c;
    public final Object d;
    public final Object f18451e;
    public final Object f18452f;
    public final Object f18453g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18448a = i10;
        this.f18449b = baseController;
        this.f18450c = obj;
        this.d = obj2;
        this.f18451e = obj3;
        this.f18452f = obj4;
        this.f18453g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18448a) {
            case 0:
                ((TranslateController) this.f18449b).lambda$translateStory$38((TL_stories.StoryItem) this.f18450c, (String) this.d, (TranslateController.StoryKey) this.f18451e, (Runnable) this.f18452f, (TLRPC.TL_textWithEntities) this.f18453g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18449b).lambda$convertToGigaGroup$270((Context) this.f18450c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18451e, (org.telegram.ui.ActionBar.n2) this.f18452f, (TLRPC.TL_channels_convertToGigagroup) this.f18453g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18449b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18450c, (TLRPC.EncryptedChat) this.f18451e, (TLRPC.Message) this.f18452f, (MessageObject) this.f18453g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18448a = 2;
        this.f18449b = secretChatHelper;
        this.f18450c = decryptedMessage;
        this.f18451e = encryptedChat;
        this.f18452f = message;
        this.f18453g = messageObject;
        this.d = str;
    }
}
