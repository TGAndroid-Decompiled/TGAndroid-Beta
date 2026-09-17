package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f16815a;
    public final BaseController f16816b;
    public final Object f16817c;
    public final Object d;
    public final Object e;
    public final Object f16818f;
    public final Object f16819g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16815a = i10;
        this.f16816b = baseController;
        this.f16817c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16818f = obj4;
        this.f16819g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16815a) {
            case 0:
                ((TranslateController) this.f16816b).lambda$translateStory$38((TL_stories.StoryItem) this.f16817c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16818f, (TLRPC.TL_textWithEntities) this.f16819g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16816b).lambda$convertToGigaGroup$270((Context) this.f16817c, (org.telegram.ui.ActionBar.c2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.o2) this.f16818f, (TLRPC.TL_channels_convertToGigagroup) this.f16819g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16816b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16817c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16818f, (MessageObject) this.f16819g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16815a = 2;
        this.f16816b = secretChatHelper;
        this.f16817c = decryptedMessage;
        this.e = encryptedChat;
        this.f16818f = message;
        this.f16819g = messageObject;
        this.d = str;
    }
}
