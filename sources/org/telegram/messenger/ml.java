package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f16801a;
    public final BaseController f16802b;
    public final Object f16803c;
    public final Object d;
    public final Object e;
    public final Object f16804f;
    public final Object f16805g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16801a = i10;
        this.f16802b = baseController;
        this.f16803c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16804f = obj4;
        this.f16805g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16801a) {
            case 0:
                ((TranslateController) this.f16802b).lambda$translateStory$38((TL_stories.StoryItem) this.f16803c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16804f, (TLRPC.TL_textWithEntities) this.f16805g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16802b).lambda$convertToGigaGroup$270((Context) this.f16803c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f16804f, (TLRPC.TL_channels_convertToGigagroup) this.f16805g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16802b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16803c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16804f, (MessageObject) this.f16805g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16801a = 2;
        this.f16802b = secretChatHelper;
        this.f16803c = decryptedMessage;
        this.e = encryptedChat;
        this.f16804f = message;
        this.f16805g = messageObject;
        this.d = str;
    }
}
