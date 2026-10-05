package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18522a;
    public final BaseController f18523b;
    public final Object f18524c;
    public final Object d;
    public final Object f18525e;
    public final Object f18526f;
    public final Object f18527g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18522a = i10;
        this.f18523b = baseController;
        this.f18524c = obj;
        this.d = obj2;
        this.f18525e = obj3;
        this.f18526f = obj4;
        this.f18527g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18522a) {
            case 0:
                ((TranslateController) this.f18523b).lambda$translateStory$38((TL_stories.StoryItem) this.f18524c, (String) this.d, (TranslateController.StoryKey) this.f18525e, (Runnable) this.f18526f, (TLRPC.TL_textWithEntities) this.f18527g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18523b).lambda$convertToGigaGroup$270((Context) this.f18524c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18525e, (org.telegram.ui.ActionBar.n2) this.f18526f, (TLRPC.TL_channels_convertToGigagroup) this.f18527g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18523b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18524c, (TLRPC.EncryptedChat) this.f18525e, (TLRPC.Message) this.f18526f, (MessageObject) this.f18527g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18522a = 2;
        this.f18523b = secretChatHelper;
        this.f18524c = decryptedMessage;
        this.f18525e = encryptedChat;
        this.f18526f = message;
        this.f18527g = messageObject;
        this.d = str;
    }
}
