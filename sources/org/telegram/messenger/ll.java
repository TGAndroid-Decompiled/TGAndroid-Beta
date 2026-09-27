package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f16956a;
    public final BaseController f16957b;
    public final Object f16958c;
    public final Object d;
    public final Object e;
    public final Object f16959f;
    public final Object f16960g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16956a = i10;
        this.f16957b = baseController;
        this.f16958c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16959f = obj4;
        this.f16960g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16956a) {
            case 0:
                ((TranslateController) this.f16957b).lambda$translateStory$38((TL_stories.StoryItem) this.f16958c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16959f, (TLRPC.TL_textWithEntities) this.f16960g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16957b).lambda$convertToGigaGroup$270((Context) this.f16958c, (org.telegram.ui.ActionBar.c2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.o2) this.f16959f, (TLRPC.TL_channels_convertToGigagroup) this.f16960g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16957b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16958c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16959f, (MessageObject) this.f16960g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16956a = 2;
        this.f16957b = secretChatHelper;
        this.f16958c = decryptedMessage;
        this.e = encryptedChat;
        this.f16959f = message;
        this.f16960g = messageObject;
        this.d = str;
    }
}
