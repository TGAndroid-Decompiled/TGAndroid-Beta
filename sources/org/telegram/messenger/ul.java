package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ul implements RequestDelegate {
    public final int f16541a;
    public final BaseController f16542b;
    public final Object f16543c;
    public final Object d;
    public final Object e;
    public final Object f16544f;
    public final Object f16545g;

    public ul(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16541a = i10;
        this.f16542b = baseController;
        this.f16543c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16544f = obj4;
        this.f16545g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16541a) {
            case 0:
                ((TranslateController) this.f16542b).lambda$translateStory$38((TL_stories.StoryItem) this.f16543c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16544f, (TLRPC.TL_textWithEntities) this.f16545g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16542b).lambda$convertToGigaGroup$270((Context) this.f16543c, (org.telegram.ui.ActionBar.d2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.p2) this.f16544f, (TLRPC.TL_channels_convertToGigagroup) this.f16545g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16542b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16543c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16544f, (MessageObject) this.f16545g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ul(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16541a = 2;
        this.f16542b = secretChatHelper;
        this.f16543c = decryptedMessage;
        this.e = encryptedChat;
        this.f16544f = message;
        this.f16545g = messageObject;
        this.d = str;
    }
}
