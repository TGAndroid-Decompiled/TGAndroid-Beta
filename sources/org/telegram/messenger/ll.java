package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18520a;
    public final BaseController f18521b;
    public final Object f18522c;
    public final Object d;
    public final Object f18523e;
    public final Object f18524f;
    public final Object f18525g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18520a = i10;
        this.f18521b = baseController;
        this.f18522c = obj;
        this.d = obj2;
        this.f18523e = obj3;
        this.f18524f = obj4;
        this.f18525g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18520a) {
            case 0:
                ((TranslateController) this.f18521b).lambda$translateStory$38((TL_stories.StoryItem) this.f18522c, (String) this.d, (TranslateController.StoryKey) this.f18523e, (Runnable) this.f18524f, (TLRPC.TL_textWithEntities) this.f18525g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18521b).lambda$convertToGigaGroup$270((Context) this.f18522c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18523e, (org.telegram.ui.ActionBar.n2) this.f18524f, (TLRPC.TL_channels_convertToGigagroup) this.f18525g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18521b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18522c, (TLRPC.EncryptedChat) this.f18523e, (TLRPC.Message) this.f18524f, (MessageObject) this.f18525g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18520a = 2;
        this.f18521b = secretChatHelper;
        this.f18522c = decryptedMessage;
        this.f18523e = encryptedChat;
        this.f18524f = message;
        this.f18525g = messageObject;
        this.d = str;
    }
}
