package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18521a;
    public final BaseController f18522b;
    public final Object f18523c;
    public final Object d;
    public final Object f18524e;
    public final Object f18525f;
    public final Object f18526g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18521a = i10;
        this.f18522b = baseController;
        this.f18523c = obj;
        this.d = obj2;
        this.f18524e = obj3;
        this.f18525f = obj4;
        this.f18526g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18521a) {
            case 0:
                ((TranslateController) this.f18522b).lambda$translateStory$38((TL_stories.StoryItem) this.f18523c, (String) this.d, (TranslateController.StoryKey) this.f18524e, (Runnable) this.f18525f, (TLRPC.TL_textWithEntities) this.f18526g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18522b).lambda$convertToGigaGroup$270((Context) this.f18523c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18524e, (org.telegram.ui.ActionBar.n2) this.f18525f, (TLRPC.TL_channels_convertToGigagroup) this.f18526g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18522b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18523c, (TLRPC.EncryptedChat) this.f18524e, (TLRPC.Message) this.f18525f, (MessageObject) this.f18526g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18521a = 2;
        this.f18522b = secretChatHelper;
        this.f18523c = decryptedMessage;
        this.f18524e = encryptedChat;
        this.f18525f = message;
        this.f18526g = messageObject;
        this.d = str;
    }
}
