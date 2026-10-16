package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements RequestDelegate {
    public final int f17840a;
    public final BaseController f17841b;
    public final Object f17842c;
    public final Object d;
    public final Object e;
    public final Object f17843f;
    public final Object f17844g;

    public pl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f17840a = i10;
        this.f17841b = baseController;
        this.f17842c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17843f = obj4;
        this.f17844g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17840a) {
            case 0:
                ((TranslateController) this.f17841b).lambda$translateStory$38((TL_stories.StoryItem) this.f17842c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f17843f, (TLRPC.TL_textWithEntities) this.f17844g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17841b).lambda$convertToGigaGroup$269((Context) this.f17842c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.m2) this.f17843f, (TLRPC.TL_channels_convertToGigagroup) this.f17844g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f17841b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f17842c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f17843f, (MessageObject) this.f17844g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f17840a = 2;
        this.f17841b = secretChatHelper;
        this.f17842c = decryptedMessage;
        this.e = encryptedChat;
        this.f17843f = message;
        this.f17844g = messageObject;
        this.d = str;
    }
}
