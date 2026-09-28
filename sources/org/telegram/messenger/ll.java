package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f16967a;
    public final BaseController f16968b;
    public final Object f16969c;
    public final Object d;
    public final Object e;
    public final Object f16970f;
    public final Object f16971g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16967a = i10;
        this.f16968b = baseController;
        this.f16969c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16970f = obj4;
        this.f16971g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16967a) {
            case 0:
                ((TranslateController) this.f16968b).lambda$translateStory$38((TL_stories.StoryItem) this.f16969c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16970f, (TLRPC.TL_textWithEntities) this.f16971g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16968b).lambda$convertToGigaGroup$270((Context) this.f16969c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.m2) this.f16970f, (TLRPC.TL_channels_convertToGigagroup) this.f16971g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16968b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16969c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16970f, (MessageObject) this.f16971g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16967a = 2;
        this.f16968b = secretChatHelper;
        this.f16969c = decryptedMessage;
        this.e = encryptedChat;
        this.f16970f = message;
        this.f16971g = messageObject;
        this.d = str;
    }
}
