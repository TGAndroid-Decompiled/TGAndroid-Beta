package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements RequestDelegate {
    public final int f20901a;
    public final BaseController f20902b;
    public final Object f20903c;
    public final Object d;
    public final Object e;
    public final Object f20904f;
    public final Object f20905g;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f20901a = i10;
        this.f20902b = baseController;
        this.f20903c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20904f = obj4;
        this.f20905g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20901a) {
            case 0:
                ((TranslateController) this.f20902b).lambda$translateStory$38((TL_stories.StoryItem) this.f20903c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f20904f, (TLRPC.TL_textWithEntities) this.f20905g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20902b).lambda$convertToGigaGroup$269((Context) this.f20903c, (org.telegram.ui.ActionBar.e2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.r2) this.f20904f, (TLRPC.TL_channels_convertToGigagroup) this.f20905g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f20902b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f20903c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f20904f, (MessageObject) this.f20905g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f20901a = 2;
        this.f20902b = secretChatHelper;
        this.f20903c = decryptedMessage;
        this.e = encryptedChat;
        this.f20904f = message;
        this.f20905g = messageObject;
        this.d = str;
    }
}
