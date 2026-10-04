package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18517a;
    public final BaseController f18518b;
    public final Object f18519c;
    public final Object d;
    public final Object f18520e;
    public final Object f18521f;
    public final Object f18522g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18517a = i10;
        this.f18518b = baseController;
        this.f18519c = obj;
        this.d = obj2;
        this.f18520e = obj3;
        this.f18521f = obj4;
        this.f18522g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18517a) {
            case 0:
                ((TranslateController) this.f18518b).lambda$translateStory$38((TL_stories.StoryItem) this.f18519c, (String) this.d, (TranslateController.StoryKey) this.f18520e, (Runnable) this.f18521f, (TLRPC.TL_textWithEntities) this.f18522g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18518b).lambda$convertToGigaGroup$270((Context) this.f18519c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18520e, (org.telegram.ui.ActionBar.n2) this.f18521f, (TLRPC.TL_channels_convertToGigagroup) this.f18522g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18518b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18519c, (TLRPC.EncryptedChat) this.f18520e, (TLRPC.Message) this.f18521f, (MessageObject) this.f18522g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18517a = 2;
        this.f18518b = secretChatHelper;
        this.f18519c = decryptedMessage;
        this.f18520e = encryptedChat;
        this.f18521f = message;
        this.f18522g = messageObject;
        this.d = str;
    }
}
