package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements RequestDelegate {
    public final int f18061a;
    public final BaseController f18062b;
    public final Object f18063c;
    public final Object d;
    public final Object e;
    public final Object f18064f;
    public final Object f18065g;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18061a = i10;
        this.f18062b = baseController;
        this.f18063c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18064f = obj4;
        this.f18065g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18061a) {
            case 0:
                ((TranslateController) this.f18062b).lambda$translateStory$38((TL_stories.StoryItem) this.f18063c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18064f, (TLRPC.TL_textWithEntities) this.f18065g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18062b).lambda$convertToGigaGroup$270((Context) this.f18063c, (org.telegram.ui.ActionBar.d2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.p2) this.f18064f, (TLRPC.TL_channels_convertToGigagroup) this.f18065g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18062b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18063c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18064f, (MessageObject) this.f18065g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18061a = 2;
        this.f18062b = secretChatHelper;
        this.f18063c = decryptedMessage;
        this.e = encryptedChat;
        this.f18064f = message;
        this.f18065g = messageObject;
        this.d = str;
    }
}
