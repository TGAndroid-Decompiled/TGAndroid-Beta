package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18344a;
    public final BaseController f18345b;
    public final Object f18346c;
    public final Object d;
    public final Object f18347e;
    public final Object f18348f;
    public final Object f18349g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18344a = i10;
        this.f18345b = baseController;
        this.f18346c = obj;
        this.d = obj2;
        this.f18347e = obj3;
        this.f18348f = obj4;
        this.f18349g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18344a) {
            case 0:
                ((TranslateController) this.f18345b).lambda$translateStory$38((TL_stories.StoryItem) this.f18346c, (String) this.d, (TranslateController.StoryKey) this.f18347e, (Runnable) this.f18348f, (TLRPC.TL_textWithEntities) this.f18349g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18345b).lambda$convertToGigaGroup$270((Context) this.f18346c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18347e, (org.telegram.ui.ActionBar.n2) this.f18348f, (TLRPC.TL_channels_convertToGigagroup) this.f18349g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18345b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18346c, (TLRPC.EncryptedChat) this.f18347e, (TLRPC.Message) this.f18348f, (MessageObject) this.f18349g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18344a = 2;
        this.f18345b = secretChatHelper;
        this.f18346c = decryptedMessage;
        this.f18347e = encryptedChat;
        this.f18348f = message;
        this.f18349g = messageObject;
        this.d = str;
    }
}
